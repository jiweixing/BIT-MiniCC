package bit.minisys.minicc.standardAST;

import org.antlr.v4.runtime.tree.Tree;

import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("UnaryExpression")
public class ASTUnaryExpression extends ASTExpression{
	public ASTToken op;
	public ASTExpression expr;
	
	public ASTUnaryExpression() {

	}
	public ASTUnaryExpression(ASTToken op,ASTExpression expr) {
		this.op = op;
		this.expr = expr;
	}
	
	@Override
	public Tree getChild(int arg0) {
		if(arg0 == 0) return this.op;
		else if(arg0 == 1) return this.expr;
		else return null;
	}

	@Override
	public int getChildCount() {
		return 2;
	}
}
