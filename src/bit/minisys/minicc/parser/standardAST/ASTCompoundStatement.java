package bit.minisys.minicc.parser.standardAST;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("CompoundStatement")
public class ASTCompoundStatement extends ASTStatement{
	public  List<ASTNode> blockItems;
	
	public ASTCompoundStatement() {
		super("CompoundStatement");
		this.blockItems = new ArrayList<ASTNode>();
	}
	public ASTCompoundStatement(List<ASTNode> items) {
		super("CompoundStatement");
		this.blockItems = items;
	}

}
