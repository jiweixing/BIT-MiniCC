package bit.minisys.minicc.standardAST;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.tree.Tree;

import com.fasterxml.jackson.annotation.JsonTypeName;
@JsonTypeName("InitList")
public class ASTInitList extends ASTNode{
	public ASTDeclarator declarator;
	public List<ASTExpression> exprs;
	
	public ASTInitList() {
		this.exprs = new ArrayList<ASTExpression>();
	}
	
	public ASTInitList(ASTDeclarator d, List<ASTExpression> e) {
		this.declarator = d;
		this.exprs = e;
	}
	
	@Override
	public Tree getChild(int arg0) {
		if(arg0 == 0) return this.declarator;
		else if(arg0 == 1) return this.exprs.get(0);
		else return null;
	}

	@Override
	public int getChildCount() {
		return 2;
	}

}
