package bit.minisys.minicc.parser.standardAST;

import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("StringConstant")
public class ASTStringConstant extends ASTExpression{
	public String value;
	public Integer tokenId;
	public ASTStringConstant() {
		super("StringConstant");
	}
	public ASTStringConstant(String value,Integer tokenId) {
		super("StringConstant");
		this.value = value;
		this.tokenId = tokenId;
	}
}
