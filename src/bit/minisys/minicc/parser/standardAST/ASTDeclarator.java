package bit.minisys.minicc.parser.standardAST;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;

@JsonTypeName("Declarator")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME,include = As.PROPERTY,property = "type")
@JsonSubTypes({
	@JsonSubTypes.Type(value = ASTArrayDeclarator.class,name = "ArrayDeclarator"),
	@JsonSubTypes.Type(value = ASTVariableDeclarator.class,name = "VariableDeclarator"),
	@JsonSubTypes.Type(value = ASTFunctionDeclarator.class,name="FunctionDeclarator"),
})
public abstract class ASTDeclarator extends ASTNode{
	public ASTDeclarator(String type) {
		super(type);
	}
}
