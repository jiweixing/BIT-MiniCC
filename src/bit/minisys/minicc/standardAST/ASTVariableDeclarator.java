package bit.minisys.minicc.standardAST;

import org.antlr.v4.runtime.tree.Tree;

import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("VariableDeclarator")
public class ASTVariableDeclarator extends ASTDeclarator{
	public ASTIdentifier identifier;
	
	public  ASTVariableDeclarator() {
	
	}
	
	public  ASTVariableDeclarator(ASTIdentifier declarator) {
		this.identifier = declarator;
	}

	@Override
	public Tree getChild(int arg0) {
		if(arg0 == 0) return this.identifier;
		else return null;
	}

	@Override
	public int getChildCount() {
		return 1;
	}
}
