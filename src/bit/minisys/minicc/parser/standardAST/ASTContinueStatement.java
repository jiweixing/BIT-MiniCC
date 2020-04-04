package bit.minisys.minicc.parser.standardAST;

import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("ContinueStatement")
public class ASTContinueStatement extends ASTStatement{
	public ASTContinueStatement() {
		super("ContinueStatement");
	}

}
