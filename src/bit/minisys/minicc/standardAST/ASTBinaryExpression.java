package bit.minisys.minicc.standardAST;

import org.antlr.v4.runtime.tree.Tree;

import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("BinaryExpression")
public class ASTBinaryExpression extends ASTExpression{

	public ASTToken op;
	public ASTExpression expr1;
	public ASTExpression expr2;
	
	public ASTBinaryExpression() {
	}
	
	public ASTBinaryExpression(ASTToken op,ASTExpression e1,ASTExpression e2) {
		this.op = op;
		this.expr1 = e1;
		this.expr2 = e2;
	}
	
	@Override
	public Tree getChild(int arg0) {
		if(arg0 == 0) return this.expr1;
		else if(arg0 == 1) return this.op;
		else if(arg0 == 2) return this.expr2;
		else return null;
	}

	@Override
	public int getChildCount() {
		return 3;
	}
}
