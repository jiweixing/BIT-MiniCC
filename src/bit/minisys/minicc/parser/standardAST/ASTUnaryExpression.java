package bit.minisys.minicc.parser.standardAST;

import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("UnaryExpression")
public class ASTUnaryExpression extends ASTExpression{
	public ASTToken op;
	public ASTExpression expr;
	
	public ASTUnaryExpression() {
		super("UnaryExpression");
	}
	public ASTUnaryExpression(ASTToken op,ASTExpression expr) {
		super("UnaryExpression");
		this.op = op;
		this.expr = expr;
	}
}
