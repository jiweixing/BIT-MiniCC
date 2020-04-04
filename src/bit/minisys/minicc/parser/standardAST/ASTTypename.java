package bit.minisys.minicc.parser.standardAST;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("Typename")
public class ASTTypename extends ASTNode{
	public List<ASTToken> specfiers;
	public ASTDeclarator declarator;
	
	public ASTTypename() {
		super("Typename");
	}
	public ASTTypename(List<ASTToken> specList, ASTDeclarator absDeclarator) {
		super("Typename");
		this.specfiers = specList;
		this.declarator = absDeclarator;
	}

}
