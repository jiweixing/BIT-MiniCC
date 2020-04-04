package bit.minisys.minicc.parser.standardAST;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("InitList")
public class ASTInitList extends ASTNode{
	public ASTDeclarator declarator;
	public List<ASTExpression> exprs;
	
	public ASTInitList() {
		super("InitList");
	}
	
	public ASTInitList(ASTDeclarator declarator, List<ASTExpression> exprs) {
		super("InitList");
		this.declarator = declarator;
		this.exprs = exprs;
	}
}
