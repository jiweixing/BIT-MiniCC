package bit.minisys.minicc.pp;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;

public class ObjectMacro 
{
	public 		String 	name;
	protected 	String 	expansion;
	protected	boolean	shouldExpand;
	protected	CppTree	cppAST;
	
	static HashSet<String> noExpand=new HashSet<String>();

	
	public ObjectMacro(String name, String expansion) 
	{
		this.name = name;
		this.expansion = expansion;
		this.shouldExpand = false;
		if(expansion.equals(" ") || expansion.equals(""))
		{
			shouldExpand = false;
		}
		else if (expansion == null)
		{
			shouldExpand = false;
			expansion = " ";
		}
		else
		{
			shouldExpand = true;
		}
	}

    public String getSignature() 
	{
        return name;
    }
    
    public String  getName()
	{
        return name;
    }
    public String toString() 
	{
        return new String( name );
    }

    public String getExpansion() 
	{
		String retStr  = expansion;
//		if(shouldExpand&&!noExpand.contains(name))
		if(shouldExpand)
		{
//			noExpand.add(name);
			try
			{
//				System.out.println("obj"+noExpand);
//				System.out.println("OBJECT EXPA : " + expansion);	
				CppLexer mLexer = new CppLexer(new ANTLRStringStream(expansion));
				TokenRewriteStream mtokens = new TokenRewriteStream(mLexer);
				mtokens.LT(1);
				

//                for(int i=0; i<mtokens.size()-1;i++)
//                {
//                    Token t = mtokens.get(i);
//                    System.out.println("Token: "+t.toString()+t.getType());
//                }

				CppParser mParser = new CppParser(mtokens);
				CppParser.text_line_return mret = mParser.text_line();
//				System.out.println("tree: "+((Tree)mret.tree).toStringTree());
				CommonTreeNodeStream mnodes = new CommonTreeNodeStream((Tree)mret.tree);
				cppAST = new CppTree(mnodes);
			 	retStr = new String(cppAST.text_line(true,false)); 
			}
			catch (Exception ex)
			{
				System.out.println("getExpansion : [" + expansion + "]:"+ ex);
			}
//			noExpand.remove(name);
		}
		return retStr;
	}

    public int getExpandedValue() 
	{
		int ret=0;
		if(shouldExpand)
		{
			try
			{
			
				CppLexer mLexer = new CppLexer(new ANTLRStringStream("#exec_macro_expression " + expansion ));
				TokenRewriteStream mtokens = new TokenRewriteStream(mLexer);
				mtokens.LT(1);

				CppParser mParser = new CppParser(mtokens);
				CppParser.macroExecution_return mret = mParser.macroExecution();

				CommonTreeNodeStream mnodes = new CommonTreeNodeStream((Tree)mret.tree);
				cppAST = new CppTree(mnodes);
			 	ret = cppAST.macroExecution(); 
			}
			catch (Exception ex)
			{
				System.out.println("getExpandedValue : " + expansion + ":"+ ex);
			}
		}
		else
		{
			return  1;
		}
		return ret;
	}
}
