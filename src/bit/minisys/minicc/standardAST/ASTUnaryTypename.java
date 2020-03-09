package bit.minisys.minicc.standardAST;

import org.antlr.v4.runtime.tree.Tree;

import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("UnaryTypename")
public class ASTUnaryTypename extends ASTExpression{
	
	public ASTToken op;
	public ASTTypename typename;
	
	public ASTUnaryTypename() {

	}
	
	public ASTUnaryTypename(ASTToken op,ASTTypename typename) {
		this.op = op;
		this.typename = typename;
	}
	
	@Override
	public Tree getChild(int arg0) {
		if(arg0 == 0) return this.op;
		else if(arg0 == 1) return this.typename;
		else return null;
	}

	@Override
	public int getChildCount() {
		return 2;
	}
}
