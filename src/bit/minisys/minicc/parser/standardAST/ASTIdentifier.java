package bit.minisys.minicc.parser.standardAST;

import com.fasterxml.jackson.annotation.JsonTypeName;


@JsonTypeName("Identifier")
public class ASTIdentifier extends ASTExpression{
	public  String value;
	public  Integer tokenId;
	public ASTIdentifier() {
		super("Identifier");
	}
	
	public ASTIdentifier(String value,Integer tokenId) {
		super("Identifier");
		this.value = value;
		this.tokenId = tokenId;
	}
}
