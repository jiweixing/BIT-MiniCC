package bit.minisys.minicc.standardAST;

import org.antlr.v4.runtime.tree.Tree;

import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("PostfixExpression")
public class ASTPostfixExpression extends ASTExpression{

	public ASTExpression expr;
	public ASTToken op;
	
	public ASTPostfixExpression() {
		
	}
	public ASTPostfixExpression(ASTExpression expr,ASTToken op){
		this.expr = expr;
		this.op = op;
	}
	
	@Override
	public Tree getChild(int arg0) {
		if(arg0 == 0) return this.expr;
		else if(arg0 == 1) return this.op;
		else return null;
	}

	@Override
	public int getChildCount() {
		return 2;
	}
}
