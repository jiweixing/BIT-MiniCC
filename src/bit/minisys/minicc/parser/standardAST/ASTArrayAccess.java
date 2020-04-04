package bit.minisys.minicc.parser.standardAST;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonTypeName;


@JsonTypeName("ArrayAccess")
public class ASTArrayAccess extends ASTExpression{
	
	public  ASTExpression arrayName;
	public  List<ASTExpression> elements;
	
	public ASTArrayAccess() {
		super("ArrayAccess");
	}
	public ASTArrayAccess(ASTExpression arrayname, List<ASTExpression> element) {
		super("ArrayAccess");
		this.arrayName = arrayname;
		this.elements = element;
	}


}
