tree grammar CppTree;
options
{
	backtrack=true;
	tokenVocab=Cpp;
	ASTLabelType=CommonTree;
}
scope Macros { Map	 defines; }
@header
{
	package bit.minisys.minicc.pp;

	import java.io.File;
	import java.util.Set;
	import java.lang.*;
	import java.util.HashSet;
	import java.util.Arrays;
}

@members
{
	protected String fileName;
	protected int	 lineNo=0;
	static String [] includeSearchPaths  = 
  { "/usr/local/include", 
    "/usr/lib/gcc/i386-redhat-linux/4.0.0/include",
    "/usr/include/linux/stddef.h",
   "/usr/include" };
   
   //#define A A B后遇到A时会先试图展开A B，在此之前禁止A的展开，A将被避免无限递归地替换为A B
   static HashSet<String> notExpand=new HashSet<String>();
   
   static boolean printLineSource=true;

	class 	ExpressionReturn
	{
		int	   value;
		String text;
	}

	class	MacroParameter
	{
		int		type;
		String	text;
	}

	public	 CppTree(TreeNodeStream input,String filename) 
	{
   		this(input);
		this.fileName = filename; 
	}

    protected static final String ONE = "1";

    // static global stack for macro definitions and macro call params..		
	public static Stack Macrox_stack = new Stack();
	
    boolean isMacroDefined(String name) 
	{ 
        for (int i = Macrox_stack.size()-1; i>=0; i--) {
            Macros_scope scope = (Macros_scope)Macrox_stack.get(i);
            if ( scope.defines.containsKey(name) ) 
			{
                return true;
            }       
        }       
        return false;
    }

    Object getMacroObject(String name) 
	{ 
        for (int i = Macrox_stack.size()-1; i>=0; i--) {
            Macros_scope scope = (Macros_scope)Macrox_stack.get(i);
            if ( scope.defines.containsKey(name) ) 
			{
					return(scope.defines.get(name));
            }       
        }       
        return null;
	}

    void putMacroObject(String name,Object Macro) 
	{ 
        Macros_scope scope = (Macros_scope)Macrox_stack.get(0);
        if ( scope.defines.containsKey(name) ) 
		{
			System.err.println("MACRO OBJECT " + name + "redefined ");
        }       
		scope.defines.put(name,Macro);
	}

    void removeMacroObject(String name) 
	{ 
        Macros_scope scope = (Macros_scope)Macrox_stack.get(0);
        if (!scope.defines.containsKey(name) ) 
		{
			System.err.println("REMOVE  undefined " + name );
        }       
		scope.defines.remove(name);
	}

	void putMacroParameter(String name,Object parameter)
	{
		((Macros_scope)Macrox_stack.peek()).defines.put(name, parameter); 
	}

	public int Mod(int a, int b)
	{
		int c;
		if(a<b) return a;
		c = (a/b);
		return (a - (c*b));
	}

// Functions form cdt..
    protected  String removedEscapedNewline(String macro_text)
	{
		int start, len;
		char text[] = macro_text.toCharArray();

		start = 0;
		len   = text.length;

        if (CharArrayUtils.indexOf('\n', text, start, start + len) == -1)
            return new String(text);

        char[] result = new char[len];
        Arrays.fill(result, ' ');
        int counter = 0;
        for (int i = start; i < start + len; ++i) {
            if (text[i] == '\\' && i + 1 < text.length && text[i + 1] == '\n')
                ++i;
            else if (text[i] == '\\' && i + 1 < text.length
                    && text[i + 1] == '\r' && i + 2 < text.length
                    && text[i + 2] == '\n')
                i += 2;
            else
                result[counter++] = text[i];
        }
        return new String(CharArrayUtils.trim(result));
    }

    protected String removeComment(String macro_text) 
	{ 
		char[] text = macro_text.toCharArray();
        char[] result = new char[text.length];

        Arrays.fill(result, ' ');
        int resultCount = 0;
        for (int i = 0; i < text.length; ++i) {
			if (text[i] == '/' && (i+1 <text.length) && text[i+1] == '/')
			{
				break;	// Line Comment;
			}
            if (text[i] == '/' && (i + 1 < text.length) && text[i + 1] == '*') {
                i += 2;
                while (i < text.length
                        && !(text[i] == '*' && i + 1 < text.length && text[i + 1] == '/'))
                    ++i;
                ++i;
            } else
                result[resultCount++] = text[i];

        }
        return new String(CharArrayUtils.trim(result));
	}
	final static public String trim(String text) 
	{
            if (text == null) return null;
			char[] chars =text.toCharArray();
    
            int start = 0, length = chars.length, end = length - 1;
            while (start < length && (chars[start] == ' '||chars[start]== '\t')) {
            	start++;
            }
            while (end >= start && (chars[end] == ' '||chars[end]== '\t')) {
                end--;
            }
			if (end <start)  return new String("");

            if( end != length - 1||start!=0) {
                return new String(CharArrayUtils.subarray(chars, start, end + 1));
            }
            return new String(chars);
	}
	
	String expandFilename(String filename)
	{
		File sourceFile = new File(this.fileName);
		File currentDirectory = sourceFile.getParentFile();
		String absolutePath = currentDirectory.getAbsolutePath();
		
		if(filename.startsWith("<"))
		{
			filename = filename.substring(1,filename.length()-1);
			
			if(!filename.startsWith("/"))
			{
				for (int i = 0; i < includeSearchPaths.length; ++i)
				{
					try
					{
						String path = new File(includeSearchPaths[i]).getCanonicalPath();
						File incFile = new File(path,filename);
						if (incFile.exists())
						{
							filename  = incFile.getCanonicalPath();
						}
					}
					catch (Exception  e)
					{}
				}
			}
			else
			{
				System.err.println("filename can't start with \'/\'");
			}
		}
		else//文件名以"开头
		{
			filename = filename.substring(1,filename.length()-1);
			if(!filename.startsWith("/"))
			{
				try {
					File incFile = new File(absolutePath,filename);
					if (incFile.exists())
					{
						filename  = incFile.getCanonicalPath();
					}
				} catch (Exception  e) 
				{}
			}
			else
			{
				System.err.println("filename can't start with \'/\'");
			}
		}
		return filename;
	}

	void predefineMacro(String name,String text)
	{
		if(!isMacroDefined(name))
		{
			ObjectMacro objMac = new ObjectMacro(name,text);
			putMacroObject(name,objMac);
		}
	}
}

preprocess		
@init 
{
	Macrox_stack.push(new Macros_scope());
	((Macros_scope)Macrox_stack.peek()).defines = new HashMap();
	
	java.text.SimpleDateFormat dateformatter= new java.text.SimpleDateFormat("yyyy-MM-dd");
	java.text.SimpleDateFormat timeformatter= new java.text.SimpleDateFormat("HH:mm:ss");
	java.util.Date date=new java.util.Date(System.currentTimeMillis());
	predefineMacro("__DATE__","\""+dateformatter.format(date)+"\"");
	predefineMacro("__TIME__","\""+timeformatter.format(date)+"\"");
	
	File sourceFile = new File(this.fileName);
	predefineMacro("__FILE__","\""+sourceFile.getName()+"\"");
}
		: 	procLine[true]+
			{
				Macrox_stack.pop();
			}
		;

procLine [boolean condition]		
		:	
		( 	fileInclusion			[condition]
		|	macroDefine				[condition]
		|	macroUndef				[condition]
		|	conditionalCompilation	[condition]
		|	lineControl				[condition]
		|	diagnostics				[condition]		
		|	macroExecution
 		|   txt=text_line           [condition,true]   
		) ? e=End { if (condition == true&&printLineSource==true) System.out.println("	// line	" + e.getLine() + " " + fileName);else System.out.println(); }
		;

fileInclusion	[ boolean condition]
@init { String filename="";	}
	 	:	
		(	^(INCLUDE str=STRING_LITERAL) 		{	filename=expandFilename(str.toString());	}
		|	^(INCLUDE lib=LIB_FILE) 		{	filename=expandFilename(lib.toString());	}
		|	^(INCLUDE id=IDENTIFIER)
			{
				if(isMacroDefined(id.toString()))
				{
					Object expObject = getMacroObject(id.toString());
					if(expObject instanceof ObjectMacro)
					{
						//从宏中展开文件名，形如"test.h"
						filename = ((ObjectMacro)expObject).getExpansion();
						filename=expandFilename(filename);
					}
				}
				else
				{
					filename  = id.toString();
				}
			}
		|	^(INCLUDE (src=source_text[true]{filename += src;})+)	{	filename=expandFilename(filename);	}
		)
		{ 	
			if(condition == true)
			{
				try
				{
					CppLexer iLexer = new CppLexer(new ANTLRFileStream(filename));
					TokenRewriteStream itokens = new TokenRewriteStream(iLexer);
					itokens.LT(1);
					
					CppParser iParser = new CppParser(itokens);
					CppParser.preprocess_return iret = iParser.preprocess();

					CommonTreeNodeStream inodes = new CommonTreeNodeStream((Tree)iret.tree);
					CppTree iwalker = new CppTree(inodes,filename);
					iwalker.preprocess();
				}
				catch (Exception ex)
				{
					System.err.println(ex);
				}
			}
		}
		;

macroDefine		[boolean condition]
@init 
{ 
	String	macro_text	=	null; 
	List 	params		=	new ArrayList();
}
	 	:	^(MAC_FUNCTION_OBJECT id=IDENTIFIER	m=macroText)
			{
				if(condition == true)
				{
					FunctionMacro fncMac = new FunctionMacro(id.toString(),m.toString());
					putMacroObject(id.toString(),fncMac);
				}
			}
		|	^(MAC_FUNCTION	id=IDENTIFIER  ( p=macroParam {params.add(p);	})+ m=macroText)
			{
				if(condition == true)
				{
					FunctionMacro fncMac = new FunctionMacro(id.toString(),params,m.toString());
					putMacroObject(id.toString(),fncMac);
				}
			}
		|	^(MAC_OBJECT	id=IDENTIFIER		m=macroText)
			{
				if(condition == true)
				{
					ObjectMacro objMac = new ObjectMacro($id.toString(),m.toString());
					putMacroObject(id.toString(),objMac);
				}
			}
		;

macroParam	returns  [MacroParameter param]
@init {param = new MacroParameter();}
		:	^(ELLIPSIS i=IDENTIFIER)
			{
				param.type = EXP_ARGS;
				param.text = i.getText();
			}
		|	e=ELLIPSIS		
			{
				param.type = ELLIPSIS;
				param.text = new String("__VA_ARGS__");
			}
		|	i=IDENTIFIER	
			{
				param.type = IDENTIFIER;
				param.text = i.getText();
			}
		;

macroText returns [String mtext]
@init { mtext = new String("");	}
		:	^(MACRO_DEFINE (src=source_text[false]
			{
					mtext += src; 
			}
			)+)
			{
      			mtext  = removedEscapedNewline(mtext);
				mtext  = trim(mtext);
			}
		|	{$mtext = new String(" ");}
		;


macroUndef	[boolean condition]
		:	^(UNDEF	mac=IDENTIFIER)
			{
				if(condition == true)
				{
					removeMacroObject(mac.toString());
				}
			}
		;

conditionalCompilation  [boolean condition]
@init {	
		boolean ifMatched=false;
		boolean subCondition=false;
	  }
		:	^(IF 
	    	(	a=expression 
				{	
					if(ifMatched == true ) subCondition = false;
					else subCondition = ((a != 0 ) ? true: false);  
					if(subCondition == true) ifMatched =true; 
				}
				statement[condition && subCondition ]
			)+ 	  
			(ELSE statement[condition  && (!ifMatched)])?)
		;	

lineControl  [boolean condition] 	
@init
{
	String  file=null;
}
		:	^(	LINE	n=DECIMAL_LITERAL	
				(	s=STRING_LITERAL	{ file = s.toString();	}
				|						{ file = null; }
				)
			) 
			{
				if(condition == true)
				{
					if(file == null) System.out.println("LINE : "+$n.toString());
					else 			 System.out.println("LINE : "+$n.toString()  +" FILE: "+ file);
				}
			}
		;

diagnostics 	[boolean condition]
	 	:	s=WARNING 	{ if(condition)	{	 System.out.println("warning: " + s);	} }
		|	s=ERROR 	{ if(condition)	{	 System.out.println("error: " +  s);	} }
		|	s=PRAGMA 	{ if(condition)	{	 System.out.println(s);	} }
		;

text_line[boolean condition,boolean out] returns [String text]
@init { text = new String("");	}
		:	^(TEXT_LINE (src=source_text[true]
			{
				if(condition == true) 
				{ 	
					text += src; 
				 	if(out) {	System.out.print(src);	} 		
				}
			}
			)+)
		;

statement[boolean condition] 		
		:	procLine[condition]+ 
		;

source_text[boolean expand]	returns [String stext]
@int { stext ="";}
		:	
		(   m=macroExpansion[expand]	{ stext = m;	}
		|   m=primarySource[expand]		{ stext = m;	}
		|	m=concatenate[expand]		{ stext = m;	}
		|   t=SEMICOLON			{ stext = t.getText();	}
		|   t=COMMA   			{ stext = t.getText();	}
		|   t=RPAREN  			{ stext = t.getText();	}
		|   t=LPAREN  			{ stext = t.getText();	}
		|   t=STRING_OP 		{ stext = "#_#_" + t.getText();	}
		|   t=WS  				{ stext = t.getText();	}
		|	TEXT_GROUP			{ stext = "()";			}
		|   t=TEXT_END			
			{ 	if(expand)
				{	
					stext = t.getText(); ++lineNo;	
				}
				else	stext ="";
			}
		|	^(TEXT_GROUP lst=macArgs[expand])
			{
				
				stext = "(";
			    for (int i=0; i<lst.size(); i++)
				{
					ExpressionReturn exp = (ExpressionReturn)lst.get(i);
					stext  += exp.text;
					if( i != lst.size()-1) stext += ",";
				}
				stext += ")";
			}
		|   ^(STRINGIFICATION  m=primarySource[expand])
			{ stext = "\"" + m + "\"";} // make String function to handle Escape sequence...

		)
		;

concatenate[boolean expand] returns [String stext]
@init { stext = "";	int i=0;	}
		:	
		^(CONCATENATE 
			(a=primarySource[expand]	
			{ 
				if(expand == false)
				{ 
					if(i==0) stext = a;
					else stext = stext + " ## " +  a;
					i++;
				}
				else {if(!a.equals(" ")) stext += a; }
			}	
			)+
		)
		;

primarySource[boolean expand] returns [String stext]
@int { stext ="";}
		:   c=constant[false] 	{ stext = c.text;		}
		|   t=COPERATOR			{ stext = t.getText();	}
		|	t=CKEYWORD			{ stext = t.getText();	}
		|   t=SIZEOF 			{ stext = t.getText();	}
		|   t=SHARP 			{ stext = t.getText();	}
		|   t=LIB_FILE 			{ stext = t.getText();	}
		|   ^(SHARPSHARP  id=IDENTIFIER)
			{
				if(expand)
				{
					if(isMacroDefined(id.toString()))
               		{
						Object expObject = getMacroObject(id.toString());
	
						if( expObject instanceof ExpressionReturn)
						{
							stext  = ((ExpressionReturn)expObject).text;
							if(stext.equals("__VA_ARGS__")) stext = "__VA_ARGS_EMPTY__";
						}
						else
						{
							System.err.println("Not Expected Argument Type : " + id.toString());
							stext  = "##" + id.toString() ;
						}
					}
					else
					{
							stext  = "##" + id.toString() ;
					}
				}
				else
				{
					stext = "##" + id.toString() ; // make String function to handle Escape sequence...
				}
			}
		|   id=IDENTIFIER  	
			{	if(expand)
				{
					if(isMacroDefined(id.toString())&&!notExpand.contains(id.toString()))
               		{
               			notExpand.add(id.toString());
						Object expObject = getMacroObject(id.toString());
						if(expObject instanceof ObjectMacro)
						{
   	                    	stext = ((ObjectMacro)expObject).getExpansion();
						}
						else if( expObject instanceof ExpressionReturn)
						{
							stext  = ((ExpressionReturn)expObject).text;
						}
						else if( expObject instanceof FunctionMacro)
						{
							stext  = id.toString() ;
						}
						else
						{
							stext  = id.toString() ;
						}
						notExpand.remove(id.toString());
					}
					else
					{
						stext = id.toString();
					}
				}
				else
				{
						stext = id.toString();
				}
			}
		;

macroExpansion[boolean expand]	returns	[String r]
		: 	^(EXPAND id=IDENTIFIER	)
			{
				if(expand)
				{
					if(isMacroDefined(id.toString())&&!notExpand.contains(id.toString()))
					{
						notExpand.add(id.toString());
						Object expObject = getMacroObject(id.toString());
						if(expObject instanceof FunctionMacro)
						{
							Macrox_stack.push(new Macros_scope());
							((Macros_scope)Macrox_stack.peek()).defines = new HashMap();

							FunctionMacro expMacro = (FunctionMacro)expObject;
							if(expMacro.haveArgs())
							{
								MacroParameter	parm;
								List formalArgs = expMacro.getArgList();
								int	argSize	= formalArgs.size();
								parm=(MacroParameter)formalArgs.get(argSize-1);
								ExpressionReturn variadics = new ExpressionReturn();
								variadics.text = "__VA_ARGS__";

								if( argSize == 1 && (parm.type == ELLIPSIS || parm.type == EXP_ARGS))
								{
									putMacroParameter(((parm.type == ELLIPSIS)? "__VA_ARGS__":parm.text), variadics); 
									r = expMacro.getExpansion();
								}
								else if(parm.type == IDENTIFIER)//未传入参数，如#define q(x) x后使用q()，此时认为参数为""
								{
									variadics.text = "";
									putMacroParameter(((parm.type == ELLIPSIS)? "__VA_ARGS__":parm.text), variadics);
									r = expMacro.getExpansion();
								}
								else
								{
									System.err.println("Not Exist Parameter List");
									r = id.toString() + "()";
								}
							}
							else
							{
								r = expMacro.getExpansion();	
							}
							Macrox_stack.pop();
						}
						else if(expObject instanceof ObjectMacro)
						{
							r = ((ObjectMacro)expObject).getExpansion() + "()";
						}
						notExpand.remove(id.toString());
					}
					else
					{
						r  = id.toString() + "()";
					}
				}
				else
				{
					r  = id.toString() + "()";
				}
			}
		|	^(EXPAND id=IDENTIFIER	lst=macArgs[expand])
			{
				if(expand)
				{
					if(isMacroDefined(id.toString())&&!notExpand.contains(id.toString()))
					{
						notExpand.add(id.toString());
						Object expObject = getMacroObject(id.toString());
						if(expObject instanceof FunctionMacro)
						{
							Macrox_stack.push(new Macros_scope());
							((Macros_scope)Macrox_stack.peek()).defines = new HashMap();


							FunctionMacro expMacro = (FunctionMacro)expObject;
							if(expMacro.haveArgs())
							{

								MacroParameter	parm;
								List formalArgs = expMacro.getArgList();
								int	argSize	= formalArgs.size();
								int lstSize = lst.size();

							 	parm=(MacroParameter)formalArgs.get(argSize-1);
								if(parm.type == ELLIPSIS || parm.type == EXP_ARGS)
								{
							 		ExpressionReturn	variadics  = new ExpressionReturn();
									variadics.text = "";

									if(argSize == 1)
									{
										for(int i = 0; i<lstSize; i++)
										{
											variadics.text += ((ExpressionReturn)lst.get(i)).text;
											if( i != lstSize-1) variadics.text += ",";
										}
										putMacroParameter(((parm.type == ELLIPSIS)? "__VA_ARGS__":parm.text), variadics); 
										r = expMacro.getExpansion();
									}
									else
									{
										if(lstSize < argSize -1)
										{
											System.err.println("Function Macro Call Not Defined:"+id.toString());	
											r  = id.toString()+"(";
											for (int i=0; i<lstSize; i++)
											{
												ExpressionReturn exp = (ExpressionReturn)lst.get(i);
												r  += exp.text;
												if( i != lstSize-1) r += ",";
											}
											r += ")";
										}
										else
										{
											if(lstSize ==  argSize -1)
											{
												for (int i=0; i<lstSize; i++)
												{
													putMacroObject(((MacroParameter)formalArgs.get(i)).text, lst.get(i)); 
												}
												variadics.text = "__VA_ARGS__";
											}
											else
											{
												for (int i=0; i<argSize-1; i++)
												{
													putMacroParameter(((MacroParameter)formalArgs.get(i)).text, lst.get(i)); 
												}
												for(int i = argSize-1; i<lstSize; i++)
												{
													variadics.text += ((ExpressionReturn)lst.get(i)).text;
													if( i != lstSize-1) variadics.text += ",";
												}
											}
											putMacroParameter(((parm.type == ELLIPSIS)? "__VA_ARGS__":parm.text), variadics); 
											r = expMacro.getExpansion();	
										}
									}
								}
								else
								{
										if(formalArgs.size() != lst.size())
										{
											System.err.println("// error: macro \"" + id.toString()
															  +"\" passed " + lst.size()+ " arguments, but takes just " 
															  +formalArgs.size()); 
											r = id.toString();
										}
										else
										{
											for (int i=0; i<formalArgs.size(); i++)
											{
												putMacroParameter(((MacroParameter)formalArgs.get(i)).text, lst.get(i)); 
											}
											r = expMacro.getExpansion();
											r=trim(r);	
										}
								}
							}
							else
							{
								System.err.println("// error: macro \"" + id.toString()
												 + "\" passed " + lst.size()+ " arguments, but takes just 0 " );
								r = id.toString();
							}
							Macrox_stack.pop();
						}
						else if(expObject instanceof ObjectMacro)
						{
							r = ((ObjectMacro)expObject).getExpansion()+"(";
							for (int i=0; i<lst.size(); i++)
							{
								ExpressionReturn exp = (ExpressionReturn)lst.get(i);
								r  += exp.text;
								if( i != lst.size()-1) r += ",";
							}
							r += ")";
						}
						else
						{	
							System.err.println("Function Macro Call Not Defined:"+id.toString());	
							r  = id.toString()+"(";
							for (int i=0; i<lst.size(); i++)
							{
								ExpressionReturn exp = (ExpressionReturn)lst.get(i);
								r  += exp.text;
								if( i != lst.size()-1) r += ",";
							}
							r += ")";
	
						}
						notExpand.remove(id.toString());
					}
					else
					{
						int	argSize	= lst.size();

						r  = id.toString()+"(";
					    for (int i=0; i<argSize; i++)
						{
							ExpressionReturn exp = (ExpressionReturn)lst.get(i);
							if(!exp.text.equals("__VA_ARGS__")) r  += exp.text;
							if(i==argSize-2)
							{
								ExpressionReturn lastExp = (ExpressionReturn)lst.get(lst.size()-1);
								if(lastExp.text.equals("__VA_ARGS_EMPTY__")) 
									break;
							}

							if( i != argSize-1) r += ",";
						}
						r += ")";
					}
				}
				else
				{
					r  = id.toString()+"(";
				    for (int i=0; i<lst.size(); i++)
					{
						ExpressionReturn exp = (ExpressionReturn)lst.get(i);
						r  += exp.text;
						if( i != lst.size()-1) r += ",";
					}
					r += ")";
				}
			}
		;

macArgs[boolean expand]	returns	[List r]
@init	
{ 	
	r = new ArrayList();
}
		:	^(EXP_ARGS	(a=mArg[expand]
			{ 
				ExpressionReturn arg = new ExpressionReturn();
				arg.text = a;
				r.add(arg); 
			}
			)+)
		;

mArg[boolean expand]	returns [String r]
@init { r = new String(""); }
		:	^(EXP_ARG	(a=source_text[expand]	{ r += a; }	)+) 
		|	EXP_ARG
			{	r = " ";	}

		;

macroExecution returns [int r]
		:	^(EXEC_MACRO a=expression)	{ r = a; }
		;

expression	returns [int r]
@init {r = 0;}
		:	^(EXPR a=expr)				{ r = a; }
		|	^(EXPR_DEF	id=IDENTIFIER)	{ r = isMacroDefined(id.toString()) ? 1: 0 ; }
		|	^(EXPR_NDEF id= IDENTIFIER) { r = isMacroDefined(id.toString()) ? 0: 1 ; }
		;

expr	returns	[int r]
@init { r = 0; }
		:	
		(	a=assignmentExpression
		|	a=conditionalExpression
		|	a=logicalOrExpression
		|	a=logicalAndExpression
		|	a=inclusiveOrExpression
		|	a=exclusiveOrExpression
		|	a=andExpression
		|	a=equalityExpression
		|	a=relationalExpression
		|	a=shiftExpression
		|	a=additiveExpression
		|	a=multiplicativeExpression
		|	a=unaryExpression
		|	a=postfixExpression
		|	a=primaryExpression
		)
		{ 	r = a; }
		;

assignmentExpression returns [int r]
@init {r = 0;}
		: 	^(o=ASSIGNEQUAL       a=expr	b=expr)	{  r = a;		  }
		|   ^(o=TIMESEQUAL        a=expr	b=expr)	{  a *= b;	r = a;}
		|   ^(o=DIVIDEEQUAL       a=expr	b=expr)	{  a /= b;	r = a;}
		|   ^(o=PLUSEQUAL         a=expr	b=expr)	{  a += b;	r = a;}
		|   ^(o=MINUSEQUAL        a=expr	b=expr)	{  a -= b;	r = a;}
		|   ^(o=SHIFTLEFTEQUAL    a=expr	b=expr)	{  a <<= b;	r = a;}
		|   ^(o=SHIFTRIGHTEQUAL   a=expr	b=expr)	{  a >>= b;	r = a;}
		|   ^(o=BITWISEANDEQUAL   a=expr	b=expr)	{  a &= b;	r = a;}
		|   ^(o=BITWISEXOREQUAL   a=expr	b=expr)	{  a ^= b;	r = a;}
		|   ^(o=BITWISEOREQUAL    a=expr	b=expr)	{  a |= b;	r = a;}
		|   ^(o=MODEQUAL          a=expr	b=expr)	{  a =Mod(a,b);	r = a;}
		;

conditionalExpression returns [int r]
@init {r = 0;}
		:	^( QUESTIONMARK a=expr b=expr COLON c=expr )	{ r = ((a!=0) ?	b:c); }	
		;

logicalOrExpression returns [int r]
@init {r = 0;}
		:	^( o=OR	a=expr b=expr )		{ r = ((a!=0||b!=0)	? 1:0); }	
		;
	
logicalAndExpression returns [int r]
@init {r = 0;}
		:	^( o=AND a=expr b=expr )	{ r = (((a!=0)&&(b!=0))	? 1:0); }
		;

inclusiveOrExpression returns [int r]
@init {r = 0;}
		:	^( o=BITWISEOR a=expr b=expr )	{ r = a|b; }	
		;

exclusiveOrExpression returns [int r]
@init {r = 0;}
		:	^( o=BITWISERXOR a=expr b=expr )	{ r = a^b; }
		;

andExpression returns [int r]
@init {r = 0;}
		:	^( o=AMPERSAND a=expr b=expr )	{ r = a&b; }
		;

equalityExpression	returns [int r]
@init {r = 0;}
		:	^(o=NOTEQUAL a=expr b=expr )	{ r = ((a !=  b) ?	1:0); }	
		|	^(o=EQUAL 	 a=expr b=expr )	{ r = ((a ==  b) ?	1:0); }	
		;

relationalExpression	returns [int r]
@init {r = 0;}
		:	^(o=LESSTHAN	 			a=expr b=expr )	{ r = ((a <  b) ? 1:0); }	
       	|   ^(o=GREATERTHAN	 			a=expr b=expr )	{ r = ((a >  b) ? 1:0); }	
       	|   ^(o=LESSTHANOREQUALTO 		a=expr b=expr )	{ r = ((a <= b) ? 1:0); }	
       	|   ^(o=GREATERTHANOREQUALTO	a=expr b=expr )	{ r = ((a >= b) ? 1:0); }	
    	;

shiftExpression 	returns [int r]
@init {r = 0;}
		:	^(o=SHIFTLEFT   a=expr b=expr )	{ r = a<<b; }	
		|   ^(o=SHIFTRIGHT  a=expr b=expr )	{ r = a>>b; }	
    	;

additiveExpression returns [int r]
@init {r = 0;}
		:	^(o=PLUS	a=expr b=expr )	{ r = a+b; }	
    	|   ^(o=MINUS 	a=expr b=expr )	{ r = a-b; }
    	;

multiplicativeExpression	returns [int r]
@init {r = 0;}
		:	^(o=STAR		a=expr b=expr)	{  r = a*b; }
    	|   ^(o=DIVIDE  	a=expr b=expr)	{  r = a/b; }
		|   ^(o=MOD 		a=expr b=expr)	{  r = Mod(a,b); }
		;

unaryExpression 	returns[int r]
@init {r = 0; }
		:	^(o=PLUSPLUS 	a=expr)			{ r = ++a; }
		|	^(o=MINUSMINUS 	a=expr)			{ r = --a; }
		|	^(o=REFERANCE	a=expr)			{ r =1;	   }
		|	^(o=POINTER_AT	a=expr)			{ r =1;    }
		|	^(o=UNARY_MINUS	a=expr)			{ r = +a;  }
		|	^(o=UNARY_PLUS 	a=expr)			{ r = -a;  }
		|	^(SIZEOF 		a=expr)			{ r = 1;   }
		|	^(SIZEOF_TYPE	b=IDENTIFIER)	{ r = 1;   }
		|	^(o=NOT			a=expr)			{ r = ((a!=0) ?	0:1); }
		|	^(o=TILDE		a=expr)			{ r = ((a!=0) ?	0:1); }
		|	^(o=TYPECAST 	b=IDENTIFIER a=expr ) { r = 1; }
		|	^(DEFINED 		b=IDENTIFIER)	{ r = isMacroDefined(b.toString()) ? 1: 0 ; }
		;

postfixExpression	returns [int r]
@init {r = 0;}
		:	^(POST_INC 	a=expr					)	{  r = a++; }
    	|   ^(POST_DEC	a=expr					)	{  r = a--; }
		|	^(POINTERTO a=expr  i=IDENTIFIER 	)	{  r = 1; 	}
		|	^(POINTER 	a=expr  i=IDENTIFIER 	)	{  r = 1; 	}
		|	^(DOT 		a=expr  i=IDENTIFIER  	)	{  r = 1; 	}
		|	^(INDEX_OP 	a=expr  b=expr			)	{  r = 1; 	}
		;

primaryExpression returns [int r]
@init {r = 0;}
		:	c=constant[true]		{ r = c.value; }
    	|   ^(EXPR_GROUP b=expr) 	{ r = b; 	   }
	 	|	id=IDENTIFIER
	 		{
				if(isMacroDefined(id.toString()))
				{
					Object expObject = getMacroObject(id.toString());
					if(expObject instanceof ObjectMacro)
					{
						r = ((ObjectMacro)expObject).getExpandedValue();	
					}
					else if( expObject instanceof ExpressionReturn)
					{
						r = ((ExpressionReturn)expObject).value;
					}
					else if( expObject instanceof FunctionMacro)
					{
						r = 0;
					}
				}
				else
				{
						r = 0;	
				}
 			}
		| 	^(METHOD_CALL id=IDENTIFIER	)
			{
				if(isMacroDefined(id.toString()))
				{
					Object expObject = getMacroObject(id.toString());
					if(expObject instanceof FunctionMacro)
					{
						FunctionMacro expMacro = (FunctionMacro)expObject;
						if(expMacro.haveArgs())
						{
							r = 0;
							System.err.println("Not Exist Parameter List");
						}
						else
						{
							r = expMacro.getExpandedValue();	
						}
					}
					else if(expObject instanceof ObjectMacro)
					{
						r = ((ObjectMacro)expObject).getExpandedValue();	
					}
				}
				else
				{
					 r = 0;
				}
			}
		|	^(METHOD_CALL id=IDENTIFIER	lst=argList)
			{
				if(isMacroDefined(id.toString()))
				{
					Object expObject = getMacroObject(id.toString());

					if(expObject instanceof FunctionMacro)
					{
						Macrox_stack.push(new Macros_scope());
						((Macros_scope)Macrox_stack.peek()).defines = new HashMap();

						FunctionMacro expMacro = (FunctionMacro)expObject;
						if(expMacro.haveArgs())
						{
							List formalArgs = expMacro.getArgList();
							if(formalArgs.size() != lst.size())
							{
								r = 0;
								System.err.println(" error: macro \"" + id.toString()
												 + "\" passed " + lst.size()+ " arguments, but takes just " 
												 + formalArgs.size());
							}
							else
							{
								for (int i=0; i<formalArgs.size(); i++)
								{
									putMacroParameter(((MacroParameter)formalArgs.get(i)).text, lst.get(i)); 
								}
								r = expMacro.getExpandedValue();	
							}
						}
						else
						{
							r = 0;
							System.err.println(" error: macro \"" + id.toString()
											 + "\" passed " + lst.size()+ " arguments, but takes just 0" );
						}
						Macrox_stack.pop();
					}
					else
					{
						System.err.println("Function Macro Call Not Defined:"+id.toString());
					}
				}
				else
				{
					r = 0;
				}
			}
		;

argList  returns [List r]
@init	{ 	
			r = new ArrayList();
		}
		:	^(ARGS	(a=expr 
			{ 
				ExpressionReturn arg = new ExpressionReturn();
				arg.value = a;
				r.add(arg); 
			}
			)+)
		;

constant[boolean eval]	returns	[ExpressionReturn r]
@init {r = new ExpressionReturn();}
		:	c=HEX_LITERAL		
			{ 
				if(eval)
				{
					String decString = c.toString();
					if(c.toString().endsWith("ul") || c.toString().endsWith("UL"))
					{
						decString = c.toString().substring(0,c.toString().length()-2);				
					}
					else if( c.toString().endsWith("u") || c.toString().endsWith("U") ||
					 		 c.toString().endsWith("l") || c.toString().endsWith("L") )
					{
						decString = c.toString().substring(0,c.toString().length()-1);				
					} 
					r.value = Long.decode(decString).intValue();
				}
				else { r.text = c.toString(); } }

		|   c=OCTAL_LITERAL 
			{
				if(eval)
				{
					String decString = c.toString();
					if(c.toString().endsWith("ul") || c.toString().endsWith("UL"))
					{
						decString = c.toString().substring(0,c.toString().length()-2);				
					}
					else if( c.toString().endsWith("u") || c.toString().endsWith("U") ||
					 		 c.toString().endsWith("l") || c.toString().endsWith("L") )
					{
						decString = c.toString().substring(0,c.toString().length()-1);				
					} 
					r.value = Long.decode(decString).intValue();
				}
				else { r.text = c.toString(); } 
			}
		|   c=DECIMAL_LITERAL 
			{ 	if(eval) 
				{ 
					String decString = c.toString();
					if(c.toString().endsWith("ul") || c.toString().endsWith("UL"))
					{
						decString = c.toString().substring(0,c.toString().length()-2);				
					}
					else if( c.toString().endsWith("u") || c.toString().endsWith("U") ||
					 		 c.toString().endsWith("l") || c.toString().endsWith("L") )
					{
						decString = c.toString().substring(0,c.toString().length()-1);				
					} 
					r.value = (new Integer(decString.toString())).intValue(); 
				} 
				else 
				{ r.text = c.toString(); } 
			}
		|   c=FLOATING_POINT_LITERAL 
			{ 	if(eval) 
				{ 
					r.value = (new Float(c.toString())).intValue(); 
				} 
				else 
				{ r.text = c.toString(); } 
			}
		|	c=CHARACTER_LITERAL	
			{ 
				if(eval) 
				{
               		String cs = c.toString();
	           		char d = cs.charAt(1);
               		Character Ch = new Character(d);
               		r.value  = Ch.charValue();
				}
				else 
				{ 
					r.text = c.toString(); 
				} 
			}
		|   c=STRING_LITERAL 
			{ 
				if(eval) r.value	= (new Integer(c.toString())).intValue(); 
				else  	 r.text		=  c.toString();
			}
		;
