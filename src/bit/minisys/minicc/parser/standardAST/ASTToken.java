package bit.minisys.minicc.parser.standardAST;

import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("Token")
public class ASTToken extends ASTNode{
	
	public  String value;
	public  Integer tokenId;
	public ASTToken() {
		super("Token");
	}
	
	public ASTToken(String value,Integer tokenId) {
		super("Token");
		this.value = value;
		this.tokenId = tokenId;
	}
	
}
