package bit.minisys.minicc.standardAST;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.tree.Tree;

import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("FunctionDefine")
public class ASTFunctionDefine extends ASTNode{

	public List<ASTToken> specifiers;
	public ASTDeclarator declarator;
	public ASTCompoundStatement body;
	public ASTFunctionDefine() {
		super();
		this.specifiers = new ArrayList<ASTToken>();
	}
	public ASTFunctionDefine(List<ASTToken> specList, ASTDeclarator declarator, ASTCompoundStatement bodyStatement) {
		this.specifiers = specList;
		this.declarator = declarator;
		this.body = bodyStatement;
	}

	@Override
	public Tree getChild(int arg0) {
		if(arg0 == 0) return this.specifiers.get(0);
		else if(arg0 == 1) return this.declarator;
		else if(arg0 == 2) return this.body;
		else return null;
	}

	@Override
	public int getChildCount() {
		return 3;
	}
}
