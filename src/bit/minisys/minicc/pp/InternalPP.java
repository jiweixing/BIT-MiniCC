package bit.minisys.minicc.pp;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

import bit.minisys.minicc.MiniCCCfg;
import bit.minisys.minicc.internal.util.MiniCCUtil;

public class InternalPP implements IMiniCCPreProcessor {
	private boolean printProcess=false;
	private PrintStream nullPrintStream;
	private int cacheSize=1000000;
	
	public InternalPP() {
		this.nullPrintStream = new PrintStream(new OutputStream() {
			@Override
			public void write(int b) throws IOException {
			}
		});
	}


	public String run(String iFile) throws Exception {
		System.out.println("InternalPP Processing...");
		String str = "";
		
		ByteArrayOutputStream baoStream = new ByteArrayOutputStream(this.cacheSize);
		PrintStream cacheStream = new PrintStream(baoStream);
		PrintStream oldStream = System.out;
		
		if(!this.printProcess) {
			//重定向输出流来避免打印中间过程
			System.setOut(this.nullPrintStream);
		}
		
		//将文件通过CppLexer识别为token流
		CppLexer lexer = new CppLexer(new ANTLRFileStream(iFile));
		TokenRewriteStream tokens = new TokenRewriteStream(lexer);
		
		//原样输出token流，如果识别正确，输出应与输入文件相同（除#include外）
		System.out.println("----------------------SCAN");
		System.out.println(tokens);
		
		//逐行输出token流，包含每个token的编号、位置及类型信息（尖括号内，定义在类CppLexer中）
		System.out.println("----------------------TOKENS SIZE="+tokens.size());
		for(int i=0; i<tokens.size()-1;i++)
		{
			Token t = tokens.get(i);
			System.out.println(t.toString());
		}
		
		//将token流使用CppParser识别为语法树
		CppParser parser = new CppParser(tokens);
		CppParser.preprocess_return ret = parser.preprocess();
		
		//以括号表示输出语法树
		System.out.println("----------------------LINE EXPR");
		System.out.println(((Tree)ret.tree).toStringTree());
		
		//以凹入表示输出语法树
		System.out.println("----------------------TREE EXPR");
		CommonTree root_0 = (CommonTree)ret.tree;
		printTree(root_0,0);
		
		//遍历树进行预处理，输出结果
		System.out.println("----------------------RESULT");
		System.setOut(cacheStream);//重定向输出流来保存walker打印的预处理结果
		CommonTreeNodeStream nodes = new CommonTreeNodeStream((Tree)ret.tree);
		//是否在行尾添加注释说明行号及源文件（仅部分行会显示）
		CppTree.printLineSource=false;
		CppTree walker = new CppTree(nodes,iFile);
		walker.preprocess();
		
		System.setOut(oldStream);
		str=baoStream.toString();
		String oFile = MiniCCUtil.removeAllExt(iFile) + MiniCCCfg.MINICC_PP_OUTPUT_EXT;
		MiniCCUtil.createAndWriteFile(oFile, str);
		
		return oFile;
	}
	public static void printTree(CommonTree t, int indent) 
	{
		if ( t != null ) 
		{
			StringBuffer sb = new StringBuffer(indent);
			for ( int i = 0; i < indent; i++ )
				sb = sb.append("   ");

			for ( int i = 0; i < t.getChildCount(); i++ ) 
			{ 
				System.out.println(sb.toString() + t.getChild(i).toString());
				printTree((CommonTree)t.getChild(i), indent+1);
			}
		}
	}}
