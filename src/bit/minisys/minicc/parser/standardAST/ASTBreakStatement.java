package bit.minisys.minicc.parser.standardAST;

import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("BreakStatement")
public class ASTBreakStatement extends ASTStatement{
	
	public ASTBreakStatement() {
		super("BreakStatement");
	}

}
