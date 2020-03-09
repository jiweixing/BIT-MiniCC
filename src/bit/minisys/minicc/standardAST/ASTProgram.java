package bit.minisys.minicc.standardAST;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.tree.Tree;

import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("Program")
public class ASTProgram extends ASTNode{
	
	public List<ASTNode> funcList; 
	
	public ASTProgram() {
		super();
		this.funcList = new ArrayList<ASTNode>();
	}
	
	public ASTProgram(List<ASTNode> items) {
		this.funcList = items;
	}

	@Override
	public Tree getChild(int arg0) {
		if(arg0 < this.funcList.size()) {
			return this.funcList.get(arg0);
		}else {
			return null;
		}
	}

	@Override
	public int getChildCount() {
		return this.funcList.size();
	}
}
