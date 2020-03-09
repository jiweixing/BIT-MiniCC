package bit.minisys.minicc.standardAST;

import com.fasterxml.jackson.annotation.JsonTypeName;


@JsonTypeName("Identifier")
public class ASTIdentifier extends ASTExpression{
	public  String value;
	public  Integer tokenId;

	public ASTIdentifier() {
	}
	
	public ASTIdentifier(String value,Integer tokenId) {
		this.value = value;
		this.tokenId = tokenId;
	}
}
