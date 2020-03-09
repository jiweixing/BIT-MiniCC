package bit.minisys.minicc.standardAST;


import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("Token")
public class ASTToken extends ASTNode{
	
	public  String value;
	public  Integer tokenId;
	public ASTToken() {
		super();
	}
	
	public ASTToken(String value,Integer tokenId) {
		this.value = value;
		this.tokenId = tokenId;
	}

}
