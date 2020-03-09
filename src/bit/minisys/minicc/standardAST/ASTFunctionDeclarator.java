package bit.minisys.minicc.standardAST;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.tree.Tree;

import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("FunctionDeclarator")
public class ASTFunctionDeclarator extends ASTDeclarator{
	public ASTDeclarator declarator;
	public List<ASTParamsDeclarator> params;
	public List<ASTIdentifier> identifiers;
	
	public ASTFunctionDeclarator() {
		this.params = new ArrayList<ASTParamsDeclarator>();
		this.identifiers = new ArrayList<ASTIdentifier>();
	}
	public ASTFunctionDeclarator(ASTDeclarator declarator,List<ASTParamsDeclarator> paramsDeclarators,List<ASTIdentifier> idenLists) {
		this.declarator = declarator;
		this.params = paramsDeclarators;
		this.identifiers = idenLists;
	}

	@Override
	public Tree getChild(int arg0) {
		if(arg0 == 0) return this.declarator;
		else if(arg0 == 1) return this.params.get(0);
		else if(arg0 == 2) return this.identifiers.get(0);
		else return null;
	}

	@Override
	public int getChildCount() {
		return 3;
	}

}
