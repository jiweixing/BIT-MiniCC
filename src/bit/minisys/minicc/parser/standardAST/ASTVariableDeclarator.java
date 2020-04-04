package bit.minisys.minicc.parser.standardAST;

import org.antlr.v4.runtime.tree.Tree;

import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("VariableDeclarator")
public class ASTVariableDeclarator extends ASTDeclarator{
	public ASTIdentifier identifier;
	
	public  ASTVariableDeclarator() {
		super("VariableDeclarator");
	}
	
	public  ASTVariableDeclarator(ASTIdentifier declarator) {
		super("VariableDeclarator");
		this.identifier = declarator;
	}
}
