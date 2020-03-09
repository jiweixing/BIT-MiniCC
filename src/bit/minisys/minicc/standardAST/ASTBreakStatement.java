package bit.minisys.minicc.standardAST;

import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("BreakStatement")
public class ASTBreakStatement extends ASTStatement{
	
	public Integer tokenId;
	public ASTBreakStatement() {

	}
	public ASTBreakStatement(Integer tokenId) {
		this.tokenId = tokenId;
	}

}
