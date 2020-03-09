package bit.minisys.minicc.standardAST;

import org.antlr.v4.runtime.tree.Tree;

import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("LabeledStatement")
public class ASTLabeledStatement extends ASTStatement{

	public ASTIdentifier label;
	public ASTStatement stat;
	
	public ASTLabeledStatement() {

	}
	public ASTLabeledStatement(ASTIdentifier label, ASTStatement stat) {
		this.label = label;
		this.stat = stat;
	}
	
	@Override
	public Tree getChild(int arg0) {
		if(arg0 == 0) return this.label;
		else if(arg0 == 1) return this.stat;
		else return null;
	}

	@Override
	public int getChildCount() {
		return 2;
	}
}
