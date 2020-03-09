package bit.minisys.minicc.standardAST;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.tree.Tree;

import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("CompoundStatement")
public class ASTCompoundStatement extends ASTStatement{
	public  List<ASTNode> blockItems; 
	public ASTCompoundStatement() {
		this.blockItems = new ArrayList<ASTNode>();
	}
	public ASTCompoundStatement(List<ASTNode> items) {
		this.blockItems = items;
	}

	@Override
	public Tree getChild(int arg0) {
		if(arg0 < this.blockItems.size()) {
			return this.blockItems.get(arg0);
		}else {
			return null;
		}
	}

	@Override
	public int getChildCount() {
		return this.blockItems.size();
	}
}
