package bit.minisys.minicc.standardAST;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.tree.Tree;

import com.fasterxml.jackson.annotation.JsonTypeName;
@JsonTypeName("SelectionStatement")
public class ASTSelectionStatement extends ASTStatement{
	
	public List<ASTExpression> cond;
	public ASTStatement then;
	public ASTStatement otherwise;
	
	public ASTSelectionStatement() {
		this.cond = new ArrayList<ASTExpression>();
	}
	public ASTSelectionStatement(List<ASTExpression> cond,ASTStatement then,ASTStatement otherwise) {
		this.cond = cond;
		this.then = then;
		this.otherwise = otherwise;
	}

	@Override
	public Tree getChild(int arg0) {
		if(arg0 == 0) return this.cond.get(0);
		else if(arg0 == 1) return this.then;
		else if(arg0 == 2) return this.otherwise;
		else return null;
	}

	@Override
	public int getChildCount() {
		return 3;
	}
}
