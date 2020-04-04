package bit.minisys.minicc.parser.standardAST;

import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("ArrayDeclarator")
public class ASTArrayDeclarator extends ASTDeclarator{
	public ASTDeclarator declarator;
	public ASTExpression expr;
	
	
	public ASTArrayDeclarator() {
		super("ArrayDeclarator");
	}
	public ASTArrayDeclarator(ASTDeclarator declarator, ASTExpression expressions )
	{
		super("ArrayDeclarator");
		this.declarator = declarator;
		this.expr = expressions;
	}

}
