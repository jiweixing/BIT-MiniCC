package bit.minisys.minicc.standardAST;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.antlr.v4.runtime.tree.Tree;

import com.fasterxml.jackson.annotation.JsonTypeName;
@JsonTypeName("ReturnStatement")
public class ASTReturnStatement extends ASTStatement{

	public List<ASTExpression> expr;
	
	public ASTReturnStatement() {
		this.expr = new ArrayList<ASTExpression>();
	}
	public ASTReturnStatement(List<ASTExpression> expr) {
		this.expr = expr;
	}

	@Override
	public Tree getChild(int arg0) {
		if(arg0 == 0) return this.expr.get(0);
		else return null;
	}

	@Override
	public int getChildCount() {
		return 1;
	}
}
