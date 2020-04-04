package bit.minisys.minicc.parser.standardAST;

import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("IntegerConstant")
public class ASTIntegerConstant extends ASTExpression{
	public Integer value;
	public Integer tokenId;
	
	public ASTIntegerConstant() {
		super("IntegerConstant");
	}
	public ASTIntegerConstant(Integer value,Integer tokenId) {
		super("IntegerConstant");
		this.value = value;
		this.tokenId = tokenId;
	}
}
