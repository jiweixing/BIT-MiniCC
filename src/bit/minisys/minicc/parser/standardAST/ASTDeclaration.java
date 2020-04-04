package bit.minisys.minicc.parser.standardAST;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("Declaration")
public class ASTDeclaration extends ASTNode{
	
	public  List<ASTToken> specifiers;
	public  List<ASTInitList> initLists;

	public ASTDeclaration() {
		super("Declaration");
	}
	
	public ASTDeclaration(List<ASTToken> specList, List<ASTInitList> initList) {
		super("Declaration");
		this.specifiers = specList;
		this.initLists = initList;
	}

}
