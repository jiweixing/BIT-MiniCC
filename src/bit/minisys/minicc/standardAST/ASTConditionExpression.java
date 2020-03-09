package bit.minisys.minicc.standardAST;

import java.util.LinkedList;

import org.antlr.v4.runtime.tree.Tree;

import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("ConditionExpression")
public class ASTConditionExpression extends ASTExpression{
	
	public  ASTExpression condExpr;
	public  LinkedList<ASTExpression> trueExpr;
	public  ASTExpression falseExpr;
	
	public ASTConditionExpression() {
	}
	
	public ASTConditionExpression(ASTExpression cond,LinkedList<ASTExpression> trueExpr, ASTExpression falseExpr) {
		this.condExpr = cond;
		this.trueExpr = trueExpr;
		this.falseExpr = falseExpr;
	}

	@Override
	public Tree getChild(int arg0) {
		if(arg0 == 0) return this.condExpr;
		else if(arg0 == 1) return this.trueExpr.get(0);
		else if(arg0 == 2) return this.falseExpr;
		else return null;
	}

	@Override
	public int getChildCount() {
		return 3;
	}
}
