package bit.minisys.minicc.standardAST;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.tree.Tree;

import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("ArrayAccess")
public class ASTArrayAccess extends ASTExpression{

	public  ASTExpression arrayName;
	public  List<ASTExpression> elements;
	
	public ASTArrayAccess() {
		this.elements = new ArrayList<ASTExpression>();
	}
	public ASTArrayAccess(ASTExpression arrayname, List<ASTExpression> element) {
		this.arrayName = arrayname;
		this.elements = element;
	}

	@Override
	public Tree getChild(int arg0) {
		return arg0 == 0 ? this.arrayName : this.elements.get(0);
	}

	@Override
	public int getChildCount() {
		return 2;
	}
}
