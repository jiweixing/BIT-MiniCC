package bit.minisys.minicc.parser.standardAST;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("Program")
public class ASTProgram extends ASTNode{
	
	public List<ASTNode> items; 
	
	public ASTProgram() {
		super("Program");
		this.items = new ArrayList<ASTNode>();
	}
	
	public ASTProgram(List<ASTNode> items) {
		super("Program");
		this.items = items;
	}

}
