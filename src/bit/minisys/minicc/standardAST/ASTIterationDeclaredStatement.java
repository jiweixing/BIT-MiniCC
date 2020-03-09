package bit.minisys.minicc.standardAST;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.antlr.v4.runtime.tree.Tree;

import com.fasterxml.jackson.annotation.JsonTypeName;
@JsonTypeName("IterationDeclaredStatement")
public class ASTIterationDeclaredStatement extends ASTStatement{

	public ASTDeclaration init;
	public List<ASTExpression> cond;
	public List<ASTExpression> step;
	public ASTStatement stat;
	
	public ASTIterationDeclaredStatement() {
		this.cond = new ArrayList<ASTExpression>();
		this.step = new ArrayList<ASTExpression>();
		
	}
	public ASTIterationDeclaredStatement(ASTDeclaration init,List<ASTExpression> cond,List<ASTExpression> step,ASTStatement stat) {
		this.init = init;
		this.cond = cond;
		this.step = step;
		this.stat = stat;
	}

	@Override
	public Tree getChild(int arg0) {
		if(arg0 == 0) return this.init;
		else if(arg0 == 1) return this.cond.get(0);
		else if(arg0 == 2) return this.step.get(0);
		else if(arg0 == 3) return this.stat;
		else return null;
	}

	@Override
	public int getChildCount() {
		return 4;
	}

}
