package bit.minisys.minicc.standardAST;

import java.util.ArrayList;

import org.antlr.v4.runtime.tree.Tree;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME,include = As.PROPERTY,property = "type",visible = false)
@JsonSubTypes({
	@JsonSubTypes.Type(value = ASTProgram.class,name = "Program"),
	@JsonSubTypes.Type(value = ASTExpression.class,name = "Expression"),
	@JsonSubTypes.Type(value = ASTStatement.class,name = "Statement"),
	@JsonSubTypes.Type(value = ASTFunctionDefine.class,name="FunctionDefine"),
	@JsonSubTypes.Type(value = ASTDeclaration.class,name = "Declaration"),
	@JsonSubTypes.Type(value = ASTToken.class,name = "Token"),
	@JsonSubTypes.Type(value = ASTTypename.class,name = "Typename"),
	@JsonSubTypes.Type(value = ASTDeclarator.class,name = "Declarator"),
	@JsonSubTypes.Type(value = ASTParamsDeclarator.class,name = "ParamsDeclarator"),
	@JsonSubTypes.Type(value = ASTInitList.class,name = "InitList"),
	
})
public class ASTNode implements Tree{
	private ArrayList<ASTNode> childList = new ArrayList<ASTNode>();
	private ASTNode parent = null;
	
	@Override
	public Tree getChild(int arg0) {
		if(arg0 < this.childList.size()) {
			return this.childList.get(arg0);
		}else {
			return null;
		}
	}

	@Override
	public int getChildCount() {
		//System.out.println(this.toStringTree());
		return this.childList.size();
	}

	@Override
	public Tree getParent() {
		return this.parent;
	}

	public void setParent(ASTNode parent) {
		this.parent = parent;
	}
	
	@Override
	public Object getPayload() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toStringTree() {
		// TODO Auto-generated method stub
		String str = this.getClass().getName();
		str = str.replace("bit.minisys.minicc.standardAST.", "");
		str = str.replace("AST", "");
		return str;
	}
	
}
