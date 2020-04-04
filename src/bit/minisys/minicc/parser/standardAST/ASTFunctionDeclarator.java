package bit.minisys.minicc.parser.standardAST;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("FunctionDeclarator")
public class ASTFunctionDeclarator extends ASTDeclarator{
	public ASTDeclarator declarator;
	public List<ASTParamsDeclarator> params;
	
	public ASTFunctionDeclarator() {
		super("FunctionDeclarator");
		this.params = new ArrayList<ASTParamsDeclarator>();
	}
	public ASTFunctionDeclarator(ASTDeclarator declarator,List<ASTParamsDeclarator> paramsDeclarators) {
		super("FunctionDeclarator");
		this.declarator = declarator;
		this.params = paramsDeclarators;
	}


}
