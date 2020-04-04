package bit.minisys.minicc.parser.standardAST;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonTypeName;


@JsonTypeName("FunctionCall")
public class ASTFunctionCall extends ASTExpression{

	public ASTExpression funcname;
	public List<ASTExpression> argList;
	
	public ASTFunctionCall() {
		super("FunctionCall");
	}
	public ASTFunctionCall(ASTExpression name, List<ASTExpression> args) {
		super("FunctionCall");
		this.funcname = name;
		this.argList = args;
	}

}
