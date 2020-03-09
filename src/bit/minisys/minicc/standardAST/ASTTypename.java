package bit.minisys.minicc.standardAST;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.tree.Tree;

import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("Typename")
public class ASTTypename extends ASTNode{
	public List<ASTToken> specfiers;
	public ASTDeclarator declarator;
	
	public ASTTypename() {
		this.specfiers = new ArrayList<ASTToken>();
	}
	public ASTTypename(List<ASTToken> specList, ASTDeclarator absDeclarator) {
		this.specfiers = specList;
		this.declarator = absDeclarator;
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
