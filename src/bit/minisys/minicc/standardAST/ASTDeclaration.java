package bit.minisys.minicc.standardAST;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.tree.Tree;

import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("Declaration")
public class ASTDeclaration extends ASTNode{
	
	public  List<ASTToken> specifiers;
	public  List<ASTInitList> initLists;

	public ASTDeclaration() {
		this.specifiers =  new ArrayList<ASTToken>();
		this.initLists = new ArrayList<ASTInitList>();
	}
	
	public ASTDeclaration(List<ASTToken> specList, List<ASTInitList> initList) {
		this.specifiers = specList;
		this.initLists = initList;
	}
	
	@Override
	public Tree getChild(int arg0) {
		if(arg0 < this.specifiers.size()) {
			return this.specifiers.get(arg0);
		}else if(arg0 >= this.specifiers.size() && arg0 - this.specifiers.size() < this.initLists.size()) {
			return this.initLists.get(arg0 - this.specifiers.size());
		}else return null;
	}

	@Override
	public int getChildCount() {
		return this.specifiers.size() + this.initLists.size();
	}

}
