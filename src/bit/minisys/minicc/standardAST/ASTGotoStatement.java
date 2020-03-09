package bit.minisys.minicc.standardAST;

import org.antlr.v4.runtime.tree.Tree;

import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("GotoStatement")
public class ASTGotoStatement extends ASTStatement{


	public ASTIdentifier label;
	public Integer tokenId;
	
	public ASTGotoStatement() {
	}
	
	public ASTGotoStatement(ASTIdentifier label,Integer tokenId) {
		this.label = label;
		this.tokenId = tokenId;
	}

	@Override
	public Tree getChild(int arg0) {
		if(arg0 == 0) return this.label;
		else return null;
	}

	@Override
	public int getChildCount() {
		return 1;
	}
}
