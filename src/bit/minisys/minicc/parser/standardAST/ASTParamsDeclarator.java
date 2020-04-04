package bit.minisys.minicc.parser.standardAST;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("ParamsDeclarator")
public class ASTParamsDeclarator extends ASTNode{
	public List<ASTToken> specfiers;
	public ASTDeclarator declarator;
	
	public ASTParamsDeclarator() {
		super("ParamsDeclarator");
		this.specfiers = new ArrayList<ASTToken>();
	}
	public ASTParamsDeclarator(List<ASTToken> specList, ASTDeclarator declarator) {
		super("ParamsDeclarator");
		this.specfiers = specList;
		this.declarator = declarator;
	}
}
