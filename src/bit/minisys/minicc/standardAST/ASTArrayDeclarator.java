package bit.minisys.minicc.standardAST;

import org.antlr.v4.runtime.tree.Tree;

import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("ArrayDeclarator")
public class ASTArrayDeclarator extends ASTDeclarator{
	public ASTDeclarator declarator;
	public ASTExpression expr;
	
	public ASTArrayDeclarator() {
		
	}
	public ASTArrayDeclarator(ASTDeclarator declarator, ASTExpression expressions )
	{
		this.declarator = declarator;
		this.expr = expressions;
	}

	@Override
	public Tree getChild(int arg0) {
		return arg0 == 0 ? this.declarator : this.expr;
	}

	@Override
	public int getChildCount() {
		return 2;
	}
}
