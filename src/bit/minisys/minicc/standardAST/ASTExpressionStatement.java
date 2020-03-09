package bit.minisys.minicc.standardAST;

import java.util.List;

import org.antlr.v4.runtime.tree.Tree;

import com.fasterxml.jackson.annotation.JsonTypeName;
@JsonTypeName("ExpressionStatement")
public class ASTExpressionStatement extends ASTStatement{

	public List<ASTExpression> exprs;
	public ASTExpressionStatement() {
	}
	
	public ASTExpressionStatement(List<ASTExpression> exprs) {
		this.exprs = exprs;
	}

	@Override
	public Tree getChild(int arg0) {
		if(arg0 < this.exprs.size()) {
			return this.exprs.get(arg0);
		}else {
			return null;
		}
	}

	@Override
	public int getChildCount() {
		return this.exprs.size();
	}
}
