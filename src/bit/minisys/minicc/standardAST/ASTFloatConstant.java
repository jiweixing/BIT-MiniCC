package bit.minisys.minicc.standardAST;

import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("FloatConstant")
public class ASTFloatConstant extends ASTExpression{
	public Double value;
	public Integer tokenId;
	
	public ASTFloatConstant() {
	}
	public ASTFloatConstant(Double value,Integer tokenId) {
		this.value = value;
		this.tokenId = tokenId;
	}
}
