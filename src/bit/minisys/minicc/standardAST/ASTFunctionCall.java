package bit.minisys.minicc.standardAST;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.tree.Tree;

import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("FunctionCall")
public class ASTFunctionCall extends ASTExpression{

	public ASTExpression funcname;
	public List<ASTExpression> argList;
	
	public ASTFunctionCall() {
		this.argList = new ArrayList<ASTExpression>();
	}
	public ASTFunctionCall(ASTExpression name, List<ASTExpression> args) {
		this.funcname = name;
		this.argList = args;
	}

	@Override
	public Tree getChild(int arg0) {
		if(arg0 == 0) return this.funcname;
		else if(arg0 <= argList.size()) return argList.get(arg0 - 1);
		else return null;
	}

	@Override
	public int getChildCount() {
		return this.argList.size() + 1;
	}
}
