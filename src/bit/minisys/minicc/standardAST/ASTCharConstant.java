package bit.minisys.minicc.standardAST;

import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("CharConstant")
public class ASTCharConstant extends ASTExpression{
	public  Character value;
	public  Integer tokenId;
	public ASTCharConstant() {
	}
	public ASTCharConstant(Character value,Integer tokenId) {
		this.value = value;
		this.tokenId = tokenId;
	}
}
