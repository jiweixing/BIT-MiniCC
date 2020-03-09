package bit.minisys.minicc.standardAST;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.tree.Tree;

import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("ParamsDeclarator")
public class ASTParamsDeclarator extends ASTNode{
	public List<ASTToken> specfiers;
	public ASTDeclarator declarator;
	
	public ASTParamsDeclarator() {
		this.specfiers = new ArrayList<ASTToken>();
	}
	public ASTParamsDeclarator(List<ASTToken> specList, ASTDeclarator declarator) {
		this.specfiers = specList;
		this.declarator = declarator;
	}

	@Override
	public Tree getChild(int arg0) {
		if(arg0 == 0) return this.specfiers.get(0);
		else if(arg0 == 1) return this.declarator;
		else return null;
	}

	@Override
	public int getChildCount() {
		return 2;
	}
}
