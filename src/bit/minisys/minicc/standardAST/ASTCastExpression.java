package bit.minisys.minicc.standardAST;

import org.antlr.v4.runtime.tree.Tree;

import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("CastExpression")
public class ASTCastExpression extends ASTExpression{
	
	public ASTTypename typename;
	public ASTExpression expr;
	
	public ASTCastExpression() {
	}
	public ASTCastExpression(ASTTypename typename, ASTExpression expr) {
		this.typename = typename;
		this.expr = expr;
	}
	
	@Override
	public Tree getChild(int arg0) {
		if(arg0 == 0) return this.typename;
		else if(arg0 == 1) return this.expr;
		else return null;
	}

	@Override
	public int getChildCount() {
		return 2;
	}

}
