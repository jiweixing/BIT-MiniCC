package bit.minisys.minicc.codegen;


import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import bit.minisys.minicc.parser.MiniCCParser;
import bit.minisys.minicc.symbol.SymbolEntry;
import bit.minisys.minicc.symbol.SymbolEntryFunc;
import bit.minisys.minicc.symbol.SymbolEntryType;
import bit.minisys.minicc.symbol.SymbolTable;
import bit.minisys.minicc.tree.TreeNode;
import bit.minisys.minicc.tree.TreeNodeType;
import bit.minisys.minicc.tree.graphic.GraphicTree;
import bit.minisys.minicc.tree.graphic.TreeViewer;
import bit.minisys.minicc.util.MiniCCUtil;


/*	stack frame layout
 * 							
 * content			|	offset		|	description
 *  ra				|	0			|	return address			<------------- $fP(low address)
 *  fp				|	4			|	caller fp
 *  a0				|	8			|	argument 1	
 *  a1				|	12			|	argument 2
 *  a2				|	16			|	argument 3
 *  a3				|	20			|	argument 4
 *  s0				|	24			|	saved register 0
 *  s1				|	28			|	saved register 1
 *  s2				|	32			|	saved register 2
 *  s3				|	36			|	saved register 3
 *  s4				|	40			|	saved register 4
 *  s5				|	44			|	saved register 5
 *  s6				|	48			|	saved register 6
 *  s7				|	52			|	saved register 7
 *	t0				|	56			| 	temp  register 0  
 *  ...
 *  pad here
 *  (argn)
 *  ...
 *  (arg3)
 * 	(arg2)
 *  (arg1)
 *  (arg0)														<-------------   $SP(high address)
 */

public class MiniCCMIPSCodeGen implements IMiniCCCodeGen{
	
	private int stackFrameSize = 0;
	HashMap<Integer, TreeNode> usedRegs;
	MIPS mips;
	public MiniCCMIPSCodeGen(){
		this.mips = new MIPS();
		this.usedRegs = new HashMap<Integer, TreeNode>();
	}
	
	
	public void run(String iFile, String oFile) throws IOException, ParserConfigurationException, SAXException{
		// 1. rebuild the tree
		TreeNode root = MiniCCParser.getAst();
		
		// 2. allocate register for each variable
		this.allocReg(root);
		
		//3. calculate the stack frame size
		this.calculateFrameSize(root);
		
		// 4. generate code
		this.genCode(iFile, oFile, root);

		System.out.println("7. Code generate finished!");
	}
	
	public void genCode(String iFile, String oFile, TreeNode root){
		String code = "";
		
		// 1. generate header
		code += this.genHeader(iFile);
		
		// 2. generate data section
		code += "\t.data\n";
		
		// 3. generate text section
		code += this.genData(root);
		code += "\t.text\n";
		
		// 4. generate init code
		code += this.genInitCode();
		
		// 5. generate built in functions: input and output
		code += this.genBuiltInFuncs(root);
		
		// 6. generate user code
		code += this.genCode(root, null, null);
		
		// 7. output the code to file
		System.out.println(code);
		MiniCCUtil.createAndWriteFile(oFile, code);
		
		
	}
	
	private void calculateFrameSize(TreeNode root) {
		//TreeNodeType type = root.getType();
		//if(type == TreeNodeType.TNT_FUNC_DEF){
			int totalFrameSize = 0;
			totalFrameSize += 4;							//ra
			totalFrameSize += 4;							//fp
			totalFrameSize += 4 * 4;						//arguments
			totalFrameSize += 8 * 4;						//temps
			totalFrameSize += 16 * 4;
			totalFrameSize += 4 * 4;						//arguments				
			
			this.stackFrameSize = totalFrameSize;
		//}
	}

	public String genHeader(String iFile){
		String code = "";
		
		code += "\n";
		code += "# Code generated from MiniCCompiler at \n";
		code += "# input file:" + iFile + "\n";
		code += "# Please do not change this file! \n";
		code += "\n";
		
		return code;
	}
	
	public String genDataSection(){
		String code = "";
		
		code += "\t.data\n\n";
		
		return code;
	}
	
	public String genInitCode(){
		String code = "";
		
		code += "__init:\n";
		code += "\t# setup the stack\n";
		code += "\tlui $sp, 0x8000\n";
		code += "\taddi $sp, $sp, 0x0000\n";
		code += "\taddiu $sp, $sp, -1024\n";
		code += "\n";
		
		code += "\t# redirect to main function\n";
		code += "\tjal __main\n";
		code += "\n";
		
		code += "\t# make system call to terminate the program\n";
		code += "\tli $v0, 10\n";
		code += "\tsyscall\n";
		code += "\n";
		
		return code;
	}
	
	private Set<String> builtInFuncs = new HashSet<String>();
	public String genBuiltInFuncs(TreeNode root){
		String code = "";
		if(root.getType() == TreeNodeType.TNT_FUNC_CALL || root.getName().equals("functionCall")){
			TreeNode f = root.getByIndex(0);
			if(f.getName().indexOf("MARS_SCANF_I") >= 0 && !builtInFuncs.contains("MARS_SCANF_I")){
				code += "\n";
				code += "__MARS_SCANF_I:\n";
				code += "\tli $v0, 5\n";
				code += "\tsyscall\n";
				code += "\tmove $t0, $v0\n";
				code += "\tjr $ra\n";
				code += "\n";
				builtInFuncs.add("MARS_SCANF_I");
			}else if(f.getName().indexOf("MARS_PRINTF_I") >= 0 && !builtInFuncs.contains("MARS_PRINTF_I")){
				//string addr is in $a0
				code += "\n";
				code += "__MARS_PRINTF_I:\n";
				code += "\tli $v0, 1\n";
				code += "\tsyscall\n";
				code += "\tjr $ra\n";
				code += "\n";
				builtInFuncs.add("MARS_PRINTF_I");
			}
		}
		for(TreeNode c: root.getChildren()){
			code += genBuiltInFuncs(c);
		}
		
		return code;
	}
	
	int labelID = 0;
	public void genLabel(TreeNode root){
		TreeNodeType type = root.getType();
		if(type == TreeNodeType.TNT_SEL_STMT_IF){
			root.setLabelID(labelID++);
		}else if(type == TreeNodeType.TNT_SEL_STMT_SWITCH){
			root.setLabelID(labelID++);
		}//else if(type)
	}
	
	public String genTextSection(){
		String code = "";
		
		code += "\t.text\n\n";
		
		code += genInitCode();
		
		code += "\n";
		
		return code;
	}
	
	public String genData(TreeNode root){
		String code = "";
		if(root.getType() == TreeNodeType.TNT_ICONST){
			code += "\t" + root.getName() + ":\t.word" + root.getName();
		}else if(root.getType() == TreeNodeType.TNT_FCONST){
			code += "\t" + root.getName() + ":\t.word" + root.getName();
		}else if(root.getType() == TreeNodeType.TNT_SCONST){
			code += "\t" + root.getName() + ":\t.word" + root.getName();
		}else if(root.getType() == TreeNodeType.TNT_CCONST){
			code += "\t" + root.getName() + ":\t.byte" + root.getName();
		}
		
		for(TreeNode c: root.getChildren()){
			code += genData(c);
		}
		return code;
	}
	
	public String genCode(TreeNode root, SymbolTable st, SymbolEntryFunc sef){
		String code = "";
		int frameOffset = 0;
		boolean genNext = false;
		TreeNodeType type = root.getType();

		if(type == TreeNodeType.TNT_CMPL_UNIT){
			st = root.getSymbolTable();
			genNext = true;
		}else if(type == TreeNodeType.TNT_FUNC_DEF){

			String name = root.getByIndex(1).getName();
			code += "__" + name + ":\n";
			st = root.getSymbolTable();
			
			//allocate stack frame
			code += "\n";
			code += "\t# allocate stack frame for the callee\n";
			code += "\taddiu $fp, $sp, 0\n";
			code += "\taddiu $sp, $sp, -" + this.stackFrameSize + "\n"; 
			
			genNext = true;
		}else if(type == TreeNodeType.TNT_FUNC_CALL || root.getName().equals("functionCall")  ){
			//save ra
			code += "\tsw $ra, 0($fp)\n";
			code += "\n";
			
			//save $a0-a4
			code += "\tsw $a0, 8($fp)\n";
			code += "\tsw $a1, 12($fp)\n";
			code += "\tsw $a2, 16($fp)\n";
			code += "\tsw $a3, 20($fp)\n";
			code += "\n";
			
			frameOffset = -4;
			//generate code for parameter evaluation and passing
			for(int i = 1; i < root.getChildren().size(); i++){
				TreeNode arg = root.getByIndex(i);
				code += genCode(arg, st, sef);
				
				if(i <= 4){
					code += "\tmove $a" + (i-1) + ", $" + arg.getRegNum() + "\n";
				}else{
					code += "\tsw $" + arg.getRegNum() + ", " + frameOffset + "($sp)\n";
					frameOffset -= 4;
				}
			}
			code += "\n";
			
			String func = root.getByIndex(0).getName();// + LexicalAnalyzer.getValue(root.getByIndex(0).getTokenIndex());
			code += "\tjal __" + func + "\n";
			code += "\n";
			
			//restore ra
			code += "\tlw $ra, 0($fp)\n";
			code += "\n";
			
			//restore $a0-a4
			code += "\tlw $a0, 8($sp)\n";
			frameOffset -= 4;
			code += "\tlw $a1, 12($sp)\n";
			frameOffset -= 4;
			code += "\tlw $a2, 16($sp)\n";
			frameOffset -= 4;
			code += "\tlw $a3, 20($sp)\n";
			code += "\n";
			
		}else if(type == TreeNodeType.TNT_ICONST){
			code += "\tli " + this.mips.getRegName(root.getRegNum()) + ", ";
			String value = "" + root.getName();
			code += value + "\n";
		}else if(type == TreeNodeType.TNT_ASNMT_EXP){
			TreeNode left = root.getByIndex(0);
			TreeNode right = root.getByIndex(2);
			//evaluation right
			code += genCode(root.getByIndex(2), st, sef);
			//generate 
			if(left.getRegNum() != right.getRegNum()){
				code += "\tmove " + this.mips.getRegName(left.getRegNum()) + ", " + this.mips.getRegName(right.getRegNum()) + "\n";
			}
		}else if(type == TreeNodeType.TNT_ADD_EXP){
			TreeNode op1 = root.getByIndex(0);
			TreeNode op2 = root.getByIndex(2);
			
			String opc = "";
			String reg1 = "";
			String reg2 = "";
			String reg3 = "";
			
			//Çó²Ù×÷Êý
			code += genCode(op1, st, sef);
			code += genCode(op2, st, sef);
			
			reg1 = this.mips.getRegName(root.getRegNum());
			if(op1.getType() == TreeNodeType.TNT_CONST && op2.getType() == TreeNodeType.TNT_CONST){
				code += "\taddi " + reg1 + ", $zero, " + op1.getName() + "\n"; 
				reg2 = reg1;
				
			}else if(op1.getType() == TreeNodeType.TNT_CONST){
				reg2 = this.mips.getRegName(op2.getRegNum());
				reg3 = op1.getName();
			}else if(op2.getType() == TreeNodeType.TNT_CONST){
				reg2 = this.mips.getRegName(op1.getRegNum());
				reg3 = op2.getName();
			}else{
				reg2 = this.mips.getRegName(op1.getRegNum());
				reg3 = this.mips.getRegName(op2.getRegNum());
			}
			
			if(op1.getType() == TreeNodeType.TNT_CONST || op2.getType() == TreeNodeType.TNT_CONST){
				if(root.getByIndex(1).getName().equals("+")){
					code += "\taddi ";
				}else if(root.getByIndex(1).getName().equals("-")){
					code += "\tsubi ";
				} 
			}else{
				if(root.getByIndex(1).getName().equals("+")){
					code += "\tadd ";
				}else if(root.getByIndex(1).getName().equals("-")){
					code += "\tsub ";
				}
			}

			if(type == TreeNodeType.TNT_ADD_EXP){
				code += reg1 + ", " + reg2 + ", " + reg3 + "\n";
			}
		}else if(type == TreeNodeType.TNT_JMP_STMT){
			TreeNode expr = root.getByIndex(1);
			code += genCode(expr, st, sef);
			if(expr.getChildren().size() == 1 && expr.getByIndex(0).getType() == TreeNodeType.TNT_CONST){
				code += "\taddi $v0, $v0, " + expr.getByIndex(0).getName() + "\n";
			}else{
				code += "\tmove $v0, " + this.mips.getRegName(expr.getRegNum()) + "\n";
			}
		}else{
			genNext = true;
		}
		
		if(genNext){
			for(TreeNode c: root.getChildren()){
				code += genCode(c, st, sef);
			}
		}
		
		if(root.getType() == TreeNodeType.TNT_FUNC_DEF){
			//deallocate stack frame
			code += "\taddiu $sp, $fp, 0\n";
			code += "\taddiu $fp, $fp, -" + this.stackFrameSize + "\n";
			code += "\tjr $ra\n";
			code += "\t\n\t\n";
		}
		
		return code;
	}

	/*
	 * https://en.wikipedia.org/wiki/Sethi%E2%80%93Ullman_algorithm
	 * http://lambda.uta.edu/cse5317/fall02/notes/node40.html
	 */

	public void allocReg(TreeNode root)  {

		new RegAlloc().algo(root);
        GraphicTree gRoot = new GraphicTree(root);
        TreeViewer viewer = new TreeViewer(gRoot);
        viewer.open();
	}
}