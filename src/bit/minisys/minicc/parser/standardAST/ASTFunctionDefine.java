package bit.minisys.minicc.parser.standardAST;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("FunctionDefine")
public class ASTFunctionDefine extends ASTNode{

	public List<ASTToken> specifiers;
	public ASTDeclarator declarator;
	public ASTCompoundStatement body;
	
	public ASTFunctionDefine() {
		super("FunctionDefine");
		this.specifiers = new ArrayList<ASTToken>();
	}
	public ASTFunctionDefine(List<ASTToken> specList, ASTDeclarator declarator, ASTCompoundStatement bodyStatement) {
		super("FunctionDefine");
		this.specifiers = specList;
		this.declarator = declarator;
		this.body = bodyStatement;
	}

}
