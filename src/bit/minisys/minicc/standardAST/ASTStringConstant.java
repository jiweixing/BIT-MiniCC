package bit.minisys.minicc.standardAST;

import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("StringConstant")
public class ASTStringConstant extends ASTExpression{
	public String value;
	public Integer tokenId;
	public ASTStringConstant() {
		
	}
	public ASTStringConstant(String value,Integer tokenId) {
		this.value = value;
		this.tokenId = tokenId;
	}
}
