package bit.minisys.minicc.pp;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*
;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;

public class FunctionMacro 
{
	public 		String 	name;
	protected 	String 	expansion;

	protected	boolean	haveArgs;
	protected	boolean	shouldExpand;
	protected	List	macArgs;

	protected	CppTree	cppAST;
	
	static HashSet<String> noExpand=new HashSet<String>();

    protected static final String ONE = "1";
	
	public FunctionMacro(String name, String expansion) 
	{
		this.name = name;
		this.expansion = expansion;
		this.haveArgs 	  = false;
		this.shouldExpand = false;

		if(expansion.equals(" ")||expansion.equals(""))
		{
			shouldExpand = false;
		}
		else if(expansion == null)
		{
			shouldExpand = false;
			expansion = " ";
		}
		else
		{
			shouldExpand = true;
		}
	}

	public FunctionMacro(String name, List args, String expansion) 
	{
		this.name = name;
		this.expansion = expansion;
		this.macArgs	  = args;
		this.haveArgs 	  = true;

		if(expansion.equals(" ")||expansion.equals(""))
		{
			shouldExpand = false;
		}
		else if(expansion == null)
		{
			shouldExpand = false;
			expansion = " ";
		}
		else
		{
			shouldExpand = true;
		}
	}

	public List getArgList()
	{
		return macArgs;
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

	public boolean haveArgs()
	{
		return haveArgs; 
	}

    public String getExpansion() 
	{
		String retStr  = expansion;
		//if(shouldExpand&&!noExpand.contains(name))
		if(shouldExpand)
		{
			//noExpand.add(name);
//			System.out.println("fun"+noExpand);
//			System.out.println("Func expansion : [" + expansion+"]");	
			try
			{
				CppLexer mLexer = new CppLexer(new ANTLRStringStream(expansion +"\n"));
				TokenRewriteStream mtokens = new TokenRewriteStream(mLexer);
				mtokens.LT(1);

				CppParser mParser = new CppParser(mtokens);
				CppParser.text_line_return mret = mParser.text_line();

				CommonTreeNodeStream mnodes = new CommonTreeNodeStream((Tree)mret.tree);
//				System.out.println("MACRO tree: "+((Tree)mret.tree).toStringTree());
				cppAST = new CppTree(mnodes);
			 	retStr = new String(cppAST.text_line(true,false)); 

			}
			catch (Exception ex)
			{
				System.out.println("getExpansion : " + expansion + ":"  + ex);
			}
			//noExpand.remove(name);
		}
		return retStr;
	}

    public int getExpandedValue() 
	{
		int ret=0;	
		if(shouldExpand)
		{
//			System.out.println("expansion : " + expansion);	
			try
			{
				CppLexer mLexer = new CppLexer(new ANTLRStringStream("#exec_macro_expression " + expansion ));
				TokenRewriteStream mtokens = new TokenRewriteStream(mLexer);
				mtokens.LT(1);

				CppParser mParser = new CppParser(mtokens);
				CppParser.macroExecution_return mret = mParser.macroExecution();

//				System.out.println("MACRO tree: "+((Tree)mret.tree).toStringTree());

				CommonTreeNodeStream mnodes = new CommonTreeNodeStream((Tree)mret.tree);
				cppAST = new CppTree(mnodes);
			 	ret = cppAST.macroExecution(); 
//				System.out.println("EXEC MACRO RESULT : " + ret);

			}
			catch (Exception ex)
			{
				System.out.println(" getExpandedValue :"+  expansion + ":"  + ex);
			}
		}
		else
		{
			 return 1;
		}
		return ret;
	}

}
