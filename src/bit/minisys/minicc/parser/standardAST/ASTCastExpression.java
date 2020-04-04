package bit.minisys.minicc.parser.standardAST;

import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("CastExpression")
public class ASTCastExpression extends ASTExpression{
	
	public ASTTypename typename;
	public ASTExpression expr;
	
	public ASTCastExpression() {
		super("CastExpression");
	}
	public ASTCastExpression(ASTTypename typename, ASTExpression expr) {
		super("CastExpression");
		this.typename = typename;
		this.expr = expr;
	}

}
