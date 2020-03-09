package bit.minisys.minicc.standardAST;

import org.antlr.v4.runtime.tree.Tree;

import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("MemberAccess")
public class ASTMemberAccess extends ASTExpression{

	public ASTToken op;
	public ASTExpression master;
	public ASTIdentifier member;
	public ASTMemberAccess() {
	}
	public ASTMemberAccess(ASTExpression master, ASTToken op, ASTIdentifier member) {
		this.master = master;
		this.op = op;
		this.member = member;
	}
	
	@Override
	public Tree getChild(int arg0) {
		if(arg0 == 0) return this.op;
		else if(arg0 == 1) return this.master;
		else if(arg0 == 2) return this.member;
		else return null;
	}

	@Override
	public int getChildCount() {
		return 3;
	}
	
}
