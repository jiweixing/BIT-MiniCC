package bit.minisys.minicc.parser.standardAST;

import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("CharConstant")
public class ASTCharConstant extends ASTExpression{
	public  Character value;
	public  Integer tokenId;
	public ASTCharConstant() {
		super("CharConstant");
	}
	public ASTCharConstant(Character value,Integer tokenId) {
		super("CharConstant");
		this.value = value;
		this.tokenId = tokenId;
	}
}
