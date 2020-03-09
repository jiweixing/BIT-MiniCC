package bit.minisys.minicc.standardAST;

import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("IntegerConstant")
public class ASTIntegerConstant extends ASTExpression{
	public Integer value;
	public Integer tokenId;
	
	public ASTIntegerConstant() {

	}
	public ASTIntegerConstant(Integer value,Integer tokenId) {
		this.value = value;
		this.tokenId = tokenId;
	}
}
