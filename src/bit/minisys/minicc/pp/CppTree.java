// $ANTLR 3.5.2 CppTree.g 2022-04-24 22:14:20

	package bit.minisys.minicc.pp;

	import java.io.File;
	import java.util.Set;
	import java.lang.*;
	import java.util.HashSet;
	import java.util.Arrays;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings("all")
public class CppTree extends TreeParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AMPERSAND", "AND", "ARGS", "ASSIGNEQUAL", 
		"AT", "BITWISEANDEQUAL", "BITWISEOR", "BITWISEOREQUAL", "BITWISEXOR", 
		"BITWISEXOREQUAL", "BS", "CHARACTER_LITERAL", "CKEYWORD", "COLON", "COMMA", 
		"COMMENT", "CONCATENATE", "COPERATOR", "DECIMAL_LITERAL", "DEFINE", "DEFINED", 
		"DIRECTIVE", "DIVIDE", "DIVIDEEQUAL", "DOT", "DOTMBR", "ELIF", "ELLIPSIS", 
		"ELSE", "ENDIF", "EQUAL", "ERROR", "ESCAPED_NEWLINE", "EXEC_MACRO", "EXPAND", 
		"EXPR", "EXPR_DEF", "EXPR_GROUP", "EXPR_NDEF", "EXP_ARG", "EXP_ARGS", 
		"End", "EscapeSequence", "Exponent", "FLOATING_POINT_LITERAL", "FloatTypeSuffix", 
		"GREATERTHAN", "GREATERTHANOREQUALTO", "HEX_LITERAL", "HexDigit", "IDENTIFIER", 
		"IF", "IFDEF", "IFNDEF", "INCLUDE", "INDEX_OP", "IntegerTypeSuffix", "LCURLY", 
		"LESSTHAN", "LESSTHANOREQUALTO", "LETTER", "LIB_FILE", "LINE", "LINE_COMMENT", 
		"LPAREN", "LSQUARE", "MACRO_DEFINE", "MACRO_TEXT", "MAC_FUNCTION", "MAC_FUNCTION_OBJECT", 
		"MAC_OBJECT", "METHOD_CALL", "MINUS", "MINUSEQUAL", "MINUSMINUS", "MOD", 
		"MODEQUAL", "NOT", "NOTEQUAL", "OCTAL_LITERAL", "OR", "OctalEscape", "PLUS", 
		"PLUSEQUAL", "PLUSPLUS", "POINTER", "POINTERTO", "POINTERTOMBR", "POINTER_AT", 
		"POST_DEC", "POST_INC", "PRAGMA", "QUESTIONMARK", "RCURLY", "REFERANCE", 
		"RPAREN", "RSQUARE", "SCOPE", "SEMICOLON", "SHARP", "SHARPSHARP", "SHIFTLEFT", 
		"SHIFTLEFTEQUAL", "SHIFTRIGHT", "SHIFTRIGHTEQUAL", "SIZEOF", "SIZEOF_TYPE", 
		"STAR", "STRINGIFICATION", "STRING_LITERAL", "STRING_OP", "TEXT_END", 
		"TEXT_GROUP", "TEXT_LINE", "TILDE", "TIMESEQUAL", "TYPECAST", "UNARY_MINUS", 
		"UNARY_PLUS", "UNDEF", "UnicodeEscape", "WARNING", "WS", "BITWISERXOR"
	};
	public static final int EOF=-1;
	public static final int AMPERSAND=4;
	public static final int AND=5;
	public static final int ARGS=6;
	public static final int ASSIGNEQUAL=7;
	public static final int AT=8;
	public static final int BITWISEANDEQUAL=9;
	public static final int BITWISEOR=10;
	public static final int BITWISEOREQUAL=11;
	public static final int BITWISEXOR=12;
	public static final int BITWISEXOREQUAL=13;
	public static final int BS=14;
	public static final int CHARACTER_LITERAL=15;
	public static final int CKEYWORD=16;
	public static final int COLON=17;
	public static final int COMMA=18;
	public static final int COMMENT=19;
	public static final int CONCATENATE=20;
	public static final int COPERATOR=21;
	public static final int DECIMAL_LITERAL=22;
	public static final int DEFINE=23;
	public static final int DEFINED=24;
	public static final int DIRECTIVE=25;
	public static final int DIVIDE=26;
	public static final int DIVIDEEQUAL=27;
	public static final int DOT=28;
	public static final int DOTMBR=29;
	public static final int ELIF=30;
	public static final int ELLIPSIS=31;
	public static final int ELSE=32;
	public static final int ENDIF=33;
	public static final int EQUAL=34;
	public static final int ERROR=35;
	public static final int ESCAPED_NEWLINE=36;
	public static final int EXEC_MACRO=37;
	public static final int EXPAND=38;
	public static final int EXPR=39;
	public static final int EXPR_DEF=40;
	public static final int EXPR_GROUP=41;
	public static final int EXPR_NDEF=42;
	public static final int EXP_ARG=43;
	public static final int EXP_ARGS=44;
	public static final int End=45;
	public static final int EscapeSequence=46;
	public static final int Exponent=47;
	public static final int FLOATING_POINT_LITERAL=48;
	public static final int FloatTypeSuffix=49;
	public static final int GREATERTHAN=50;
	public static final int GREATERTHANOREQUALTO=51;
	public static final int HEX_LITERAL=52;
	public static final int HexDigit=53;
	public static final int IDENTIFIER=54;
	public static final int IF=55;
	public static final int IFDEF=56;
	public static final int IFNDEF=57;
	public static final int INCLUDE=58;
	public static final int INDEX_OP=59;
	public static final int IntegerTypeSuffix=60;
	public static final int LCURLY=61;
	public static final int LESSTHAN=62;
	public static final int LESSTHANOREQUALTO=63;
	public static final int LETTER=64;
	public static final int LIB_FILE=65;
	public static final int LINE=66;
	public static final int LINE_COMMENT=67;
	public static final int LPAREN=68;
	public static final int LSQUARE=69;
	public static final int MACRO_DEFINE=70;
	public static final int MACRO_TEXT=71;
	public static final int MAC_FUNCTION=72;
	public static final int MAC_FUNCTION_OBJECT=73;
	public static final int MAC_OBJECT=74;
	public static final int METHOD_CALL=75;
	public static final int MINUS=76;
	public static final int MINUSEQUAL=77;
	public static final int MINUSMINUS=78;
	public static final int MOD=79;
	public static final int MODEQUAL=80;
	public static final int NOT=81;
	public static final int NOTEQUAL=82;
	public static final int OCTAL_LITERAL=83;
	public static final int OR=84;
	public static final int OctalEscape=85;
	public static final int PLUS=86;
	public static final int PLUSEQUAL=87;
	public static final int PLUSPLUS=88;
	public static final int POINTER=89;
	public static final int POINTERTO=90;
	public static final int POINTERTOMBR=91;
	public static final int POINTER_AT=92;
	public static final int POST_DEC=93;
	public static final int POST_INC=94;
	public static final int PRAGMA=95;
	public static final int QUESTIONMARK=96;
	public static final int RCURLY=97;
	public static final int REFERANCE=98;
	public static final int RPAREN=99;
	public static final int RSQUARE=100;
	public static final int SCOPE=101;
	public static final int SEMICOLON=102;
	public static final int SHARP=103;
	public static final int SHARPSHARP=104;
	public static final int SHIFTLEFT=105;
	public static final int SHIFTLEFTEQUAL=106;
	public static final int SHIFTRIGHT=107;
	public static final int SHIFTRIGHTEQUAL=108;
	public static final int SIZEOF=109;
	public static final int SIZEOF_TYPE=110;
	public static final int STAR=111;
	public static final int STRINGIFICATION=112;
	public static final int STRING_LITERAL=113;
	public static final int STRING_OP=114;
	public static final int TEXT_END=115;
	public static final int TEXT_GROUP=116;
	public static final int TEXT_LINE=117;
	public static final int TILDE=118;
	public static final int TIMESEQUAL=119;
	public static final int TYPECAST=120;
	public static final int UNARY_MINUS=121;
	public static final int UNARY_PLUS=122;
	public static final int UNDEF=123;
	public static final int UnicodeEscape=124;
	public static final int WARNING=125;
	public static final int WS=126;
	public static final int BITWISERXOR=127;

	// delegates
	public TreeParser[] getDelegates() {
		return new TreeParser[] {};
	}

	// delegators

	protected static class Macros_scope {
		Map	 defines;
	}
	protected Stack<Macros_scope> Macros_stack = new Stack<Macros_scope>();


	public CppTree(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public CppTree(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return CppTree.tokenNames; }
	@Override public String getGrammarFileName() { return "CppTree.g"; }


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



	// $ANTLR start "preprocess"
	// CppTree.g:251:1: preprocess : ( procLine[true] )+ ;
	public final void preprocess() throws RecognitionException {

			Macrox_stack.push(new Macros_scope());
			((Macros_scope)Macrox_stack.peek()).defines = new HashMap();
			
			java.text.SimpleDateFormat dateformatter= new java.text.SimpleDateFormat("yyyy-MM-dd");
			java.text.SimpleDateFormat timeformatter= new java.text.SimpleDateFormat("HH:mm:ss");
			java.util.Date date=new java.util.Date(System.currentTimeMillis());
			predefineMacro("__DATE__","\""+dateformatter.format(date)+"\"");
			predefineMacro("__TIME__","\""+timeformatter.format(date)+"\"");
			
			File sourceFile = new File(this.fileName);
			predefineMacro("__FILE__","\""+sourceFile.getName()+"\"");

		try {
			// CppTree.g:266:3: ( ( procLine[true] )+ )
			// CppTree.g:266:6: ( procLine[true] )+
			{
			// CppTree.g:266:6: ( procLine[true] )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==ERROR||LA1_0==EXEC_MACRO||LA1_0==End||LA1_0==IF||LA1_0==INCLUDE||LA1_0==LINE||(LA1_0 >= MAC_FUNCTION && LA1_0 <= MAC_OBJECT)||LA1_0==PRAGMA||LA1_0==TEXT_LINE||LA1_0==UNDEF||LA1_0==WARNING) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// CppTree.g:266:6: procLine[true]
					{
					pushFollow(FOLLOW_procLine_in_preprocess62);
					procLine(true);
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			if ( state.backtracking==0 ) {
							Macrox_stack.pop();
						}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "preprocess"



	// $ANTLR start "procLine"
	// CppTree.g:272:1: procLine[boolean condition] : ( fileInclusion[condition] | macroDefine[condition] | macroUndef[condition] | conditionalCompilation[condition] | lineControl[condition] | diagnostics[condition] | macroExecution |txt= text_line[condition,true] )? e= End ;
	public final void procLine(boolean condition) throws RecognitionException {
		CommonTree e=null;
		String txt =null;

		try {
			// CppTree.g:273:3: ( ( fileInclusion[condition] | macroDefine[condition] | macroUndef[condition] | conditionalCompilation[condition] | lineControl[condition] | diagnostics[condition] | macroExecution |txt= text_line[condition,true] )? e= End )
			// CppTree.g:274:3: ( fileInclusion[condition] | macroDefine[condition] | macroUndef[condition] | conditionalCompilation[condition] | lineControl[condition] | diagnostics[condition] | macroExecution |txt= text_line[condition,true] )? e= End
			{
			// CppTree.g:274:3: ( fileInclusion[condition] | macroDefine[condition] | macroUndef[condition] | conditionalCompilation[condition] | lineControl[condition] | diagnostics[condition] | macroExecution |txt= text_line[condition,true] )?
			int alt2=9;
			switch ( input.LA(1) ) {
				case INCLUDE:
					{
					alt2=1;
					}
					break;
				case MAC_FUNCTION:
				case MAC_FUNCTION_OBJECT:
				case MAC_OBJECT:
					{
					alt2=2;
					}
					break;
				case UNDEF:
					{
					alt2=3;
					}
					break;
				case IF:
					{
					alt2=4;
					}
					break;
				case LINE:
					{
					alt2=5;
					}
					break;
				case ERROR:
				case PRAGMA:
				case WARNING:
					{
					alt2=6;
					}
					break;
				case EXEC_MACRO:
					{
					alt2=7;
					}
					break;
				case TEXT_LINE:
					{
					alt2=8;
					}
					break;
			}
			switch (alt2) {
				case 1 :
					// CppTree.g:274:6: fileInclusion[condition]
					{
					pushFollow(FOLLOW_fileInclusion_in_procLine92);
					fileInclusion(condition);
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// CppTree.g:275:5: macroDefine[condition]
					{
					pushFollow(FOLLOW_macroDefine_in_procLine102);
					macroDefine(condition);
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// CppTree.g:276:5: macroUndef[condition]
					{
					pushFollow(FOLLOW_macroUndef_in_procLine113);
					macroUndef(condition);
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					// CppTree.g:277:5: conditionalCompilation[condition]
					{
					pushFollow(FOLLOW_conditionalCompilation_in_procLine124);
					conditionalCompilation(condition);
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 5 :
					// CppTree.g:278:5: lineControl[condition]
					{
					pushFollow(FOLLOW_lineControl_in_procLine132);
					lineControl(condition);
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 6 :
					// CppTree.g:279:5: diagnostics[condition]
					{
					pushFollow(FOLLOW_diagnostics_in_procLine143);
					diagnostics(condition);
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 7 :
					// CppTree.g:280:5: macroExecution
					{
					pushFollow(FOLLOW_macroExecution_in_procLine156);
					macroExecution();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 8 :
					// CppTree.g:281:8: txt= text_line[condition,true]
					{
					pushFollow(FOLLOW_text_line_in_procLine167);
					txt=text_line(condition, true);
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			e=(CommonTree)match(input,End,FOLLOW_End_in_procLine192); if (state.failed) return;
			if ( state.backtracking==0 ) { if (condition == true&&printLineSource==true) System.out.println("	// line	" + e.getLine() + " " + fileName);else System.out.println(); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "procLine"



	// $ANTLR start "fileInclusion"
	// CppTree.g:285:1: fileInclusion[ boolean condition] : ( ^( INCLUDE str= STRING_LITERAL ) | ^( INCLUDE lib= LIB_FILE ) | ^( INCLUDE id= IDENTIFIER ) | ^( INCLUDE (src= source_text[true] )+ ) ) ;
	public final void fileInclusion(boolean condition) throws RecognitionException {
		CommonTree str=null;
		CommonTree lib=null;
		CommonTree id=null;
		String src =null;

		 String filename="";	
		try {
			// CppTree.g:287:4: ( ( ^( INCLUDE str= STRING_LITERAL ) | ^( INCLUDE lib= LIB_FILE ) | ^( INCLUDE id= IDENTIFIER ) | ^( INCLUDE (src= source_text[true] )+ ) ) )
			// CppTree.g:288:3: ( ^( INCLUDE str= STRING_LITERAL ) | ^( INCLUDE lib= LIB_FILE ) | ^( INCLUDE id= IDENTIFIER ) | ^( INCLUDE (src= source_text[true] )+ ) )
			{
			// CppTree.g:288:3: ( ^( INCLUDE str= STRING_LITERAL ) | ^( INCLUDE lib= LIB_FILE ) | ^( INCLUDE id= IDENTIFIER ) | ^( INCLUDE (src= source_text[true] )+ ) )
			int alt4=4;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==INCLUDE) ) {
				int LA4_1 = input.LA(2);
				if ( (LA4_1==DOWN) ) {
					switch ( input.LA(3) ) {
					case STRING_LITERAL:
						{
						int LA4_3 = input.LA(4);
						if ( (LA4_3==UP) ) {
							int LA4_7 = input.LA(5);
							if ( (synpred10_CppTree()) ) {
								alt4=1;
							}
							else if ( (true) ) {
								alt4=4;
							}

						}
						else if ( ((LA4_3 >= CHARACTER_LITERAL && LA4_3 <= CKEYWORD)||LA4_3==COMMA||(LA4_3 >= CONCATENATE && LA4_3 <= DECIMAL_LITERAL)||LA4_3==EXPAND||LA4_3==FLOATING_POINT_LITERAL||LA4_3==HEX_LITERAL||LA4_3==IDENTIFIER||LA4_3==LIB_FILE||LA4_3==LPAREN||LA4_3==OCTAL_LITERAL||LA4_3==RPAREN||(LA4_3 >= SEMICOLON && LA4_3 <= SHARPSHARP)||LA4_3==SIZEOF||(LA4_3 >= STRINGIFICATION && LA4_3 <= TEXT_GROUP)||LA4_3==WS) ) {
							alt4=4;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 4, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case LIB_FILE:
						{
						int LA4_4 = input.LA(4);
						if ( (LA4_4==UP) ) {
							int LA4_8 = input.LA(5);
							if ( (synpred11_CppTree()) ) {
								alt4=2;
							}
							else if ( (true) ) {
								alt4=4;
							}

						}
						else if ( ((LA4_4 >= CHARACTER_LITERAL && LA4_4 <= CKEYWORD)||LA4_4==COMMA||(LA4_4 >= CONCATENATE && LA4_4 <= DECIMAL_LITERAL)||LA4_4==EXPAND||LA4_4==FLOATING_POINT_LITERAL||LA4_4==HEX_LITERAL||LA4_4==IDENTIFIER||LA4_4==LIB_FILE||LA4_4==LPAREN||LA4_4==OCTAL_LITERAL||LA4_4==RPAREN||(LA4_4 >= SEMICOLON && LA4_4 <= SHARPSHARP)||LA4_4==SIZEOF||(LA4_4 >= STRINGIFICATION && LA4_4 <= TEXT_GROUP)||LA4_4==WS) ) {
							alt4=4;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 4, 4, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case IDENTIFIER:
						{
						int LA4_5 = input.LA(4);
						if ( (LA4_5==UP) ) {
							int LA4_9 = input.LA(5);
							if ( (synpred12_CppTree()) ) {
								alt4=3;
							}
							else if ( (true) ) {
								alt4=4;
							}

						}
						else if ( ((LA4_5 >= CHARACTER_LITERAL && LA4_5 <= CKEYWORD)||LA4_5==COMMA||(LA4_5 >= CONCATENATE && LA4_5 <= DECIMAL_LITERAL)||LA4_5==EXPAND||LA4_5==FLOATING_POINT_LITERAL||LA4_5==HEX_LITERAL||LA4_5==IDENTIFIER||LA4_5==LIB_FILE||LA4_5==LPAREN||LA4_5==OCTAL_LITERAL||LA4_5==RPAREN||(LA4_5 >= SEMICOLON && LA4_5 <= SHARPSHARP)||LA4_5==SIZEOF||(LA4_5 >= STRINGIFICATION && LA4_5 <= TEXT_GROUP)||LA4_5==WS) ) {
							alt4=4;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 4, 5, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case CHARACTER_LITERAL:
					case CKEYWORD:
					case COMMA:
					case CONCATENATE:
					case COPERATOR:
					case DECIMAL_LITERAL:
					case EXPAND:
					case FLOATING_POINT_LITERAL:
					case HEX_LITERAL:
					case LPAREN:
					case OCTAL_LITERAL:
					case RPAREN:
					case SEMICOLON:
					case SHARP:
					case SHARPSHARP:
					case SIZEOF:
					case STRINGIFICATION:
					case STRING_OP:
					case TEXT_END:
					case TEXT_GROUP:
					case WS:
						{
						alt4=4;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 4, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// CppTree.g:288:5: ^( INCLUDE str= STRING_LITERAL )
					{
					match(input,INCLUDE,FOLLOW_INCLUDE_in_fileInclusion221); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					str=(CommonTree)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_fileInclusion225); if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					if ( state.backtracking==0 ) {	filename=expandFilename(str.toString());	}
					}
					break;
				case 2 :
					// CppTree.g:289:5: ^( INCLUDE lib= LIB_FILE )
					{
					match(input,INCLUDE,FOLLOW_INCLUDE_in_fileInclusion237); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					lib=(CommonTree)match(input,LIB_FILE,FOLLOW_LIB_FILE_in_fileInclusion241); if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					if ( state.backtracking==0 ) {	filename=expandFilename(lib.toString());	}
					}
					break;
				case 3 :
					// CppTree.g:290:5: ^( INCLUDE id= IDENTIFIER )
					{
					match(input,INCLUDE,FOLLOW_INCLUDE_in_fileInclusion253); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_fileInclusion257); if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					if ( state.backtracking==0 ) {
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
					}
					break;
				case 4 :
					// CppTree.g:307:5: ^( INCLUDE (src= source_text[true] )+ )
					{
					match(input,INCLUDE,FOLLOW_INCLUDE_in_fileInclusion270); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					// CppTree.g:307:15: (src= source_text[true] )+
					int cnt3=0;
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( ((LA3_0 >= CHARACTER_LITERAL && LA3_0 <= CKEYWORD)||LA3_0==COMMA||(LA3_0 >= CONCATENATE && LA3_0 <= DECIMAL_LITERAL)||LA3_0==EXPAND||LA3_0==FLOATING_POINT_LITERAL||LA3_0==HEX_LITERAL||LA3_0==IDENTIFIER||LA3_0==LIB_FILE||LA3_0==LPAREN||LA3_0==OCTAL_LITERAL||LA3_0==RPAREN||(LA3_0 >= SEMICOLON && LA3_0 <= SHARPSHARP)||LA3_0==SIZEOF||(LA3_0 >= STRINGIFICATION && LA3_0 <= TEXT_GROUP)||LA3_0==WS) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// CppTree.g:307:16: src= source_text[true]
							{
							pushFollow(FOLLOW_source_text_in_fileInclusion275);
							src=source_text(true);
							state._fsp--;
							if (state.failed) return;
							if ( state.backtracking==0 ) {filename += src;}
							}
							break;

						default :
							if ( cnt3 >= 1 ) break loop3;
							if (state.backtracking>0) {state.failed=true; return;}
							EarlyExitException eee = new EarlyExitException(3, input);
							throw eee;
						}
						cnt3++;
					}

					match(input, Token.UP, null); if (state.failed) return;

					if ( state.backtracking==0 ) {	filename=expandFilename(filename);	}
					}
					break;

			}

			if ( state.backtracking==0 ) { 	
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
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "fileInclusion"



	// $ANTLR start "macroDefine"
	// CppTree.g:333:1: macroDefine[boolean condition] : ( ^( MAC_FUNCTION_OBJECT id= IDENTIFIER m= macroText ) | ^( MAC_FUNCTION id= IDENTIFIER (p= macroParam )+ m= macroText ) | ^( MAC_OBJECT id= IDENTIFIER m= macroText ) );
	public final void macroDefine(boolean condition) throws RecognitionException {
		CommonTree id=null;
		String m =null;
		MacroParameter p =null;

		 
			String	macro_text	=	null; 
			List 	params		=	new ArrayList();

		try {
			// CppTree.g:339:4: ( ^( MAC_FUNCTION_OBJECT id= IDENTIFIER m= macroText ) | ^( MAC_FUNCTION id= IDENTIFIER (p= macroParam )+ m= macroText ) | ^( MAC_OBJECT id= IDENTIFIER m= macroText ) )
			int alt6=3;
			switch ( input.LA(1) ) {
			case MAC_FUNCTION_OBJECT:
				{
				alt6=1;
				}
				break;
			case MAC_FUNCTION:
				{
				alt6=2;
				}
				break;
			case MAC_OBJECT:
				{
				alt6=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// CppTree.g:339:6: ^( MAC_FUNCTION_OBJECT id= IDENTIFIER m= macroText )
					{
					match(input,MAC_FUNCTION_OBJECT,FOLLOW_MAC_FUNCTION_OBJECT_in_macroDefine314); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_macroDefine318); if (state.failed) return;
					pushFollow(FOLLOW_macroText_in_macroDefine322);
					m=macroText();
					state._fsp--;
					if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					if ( state.backtracking==0 ) {
									if(condition == true)
									{
										FunctionMacro fncMac = new FunctionMacro(id.toString(),m.toString());
										putMacroObject(id.toString(),fncMac);
									}
								}
					}
					break;
				case 2 :
					// CppTree.g:347:5: ^( MAC_FUNCTION id= IDENTIFIER (p= macroParam )+ m= macroText )
					{
					match(input,MAC_FUNCTION,FOLLOW_MAC_FUNCTION_in_macroDefine335); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_macroDefine339); if (state.failed) return;
					// CppTree.g:347:35: (p= macroParam )+
					int cnt5=0;
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( (LA5_0==ELLIPSIS||LA5_0==IDENTIFIER) ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// CppTree.g:347:37: p= macroParam
							{
							pushFollow(FOLLOW_macroParam_in_macroDefine346);
							p=macroParam();
							state._fsp--;
							if (state.failed) return;
							if ( state.backtracking==0 ) {params.add(p);	}
							}
							break;

						default :
							if ( cnt5 >= 1 ) break loop5;
							if (state.backtracking>0) {state.failed=true; return;}
							EarlyExitException eee = new EarlyExitException(5, input);
							throw eee;
						}
						cnt5++;
					}

					pushFollow(FOLLOW_macroText_in_macroDefine354);
					m=macroText();
					state._fsp--;
					if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					if ( state.backtracking==0 ) {
									if(condition == true)
									{
										FunctionMacro fncMac = new FunctionMacro(id.toString(),params,m.toString());
										putMacroObject(id.toString(),fncMac);
									}
								}
					}
					break;
				case 3 :
					// CppTree.g:355:5: ^( MAC_OBJECT id= IDENTIFIER m= macroText )
					{
					match(input,MAC_OBJECT,FOLLOW_MAC_OBJECT_in_macroDefine367); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_macroDefine371); if (state.failed) return;
					pushFollow(FOLLOW_macroText_in_macroDefine376);
					m=macroText();
					state._fsp--;
					if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					if ( state.backtracking==0 ) {
									if(condition == true)
									{
										ObjectMacro objMac = new ObjectMacro(id.toString(),m.toString());
										putMacroObject(id.toString(),objMac);
									}
								}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "macroDefine"



	// $ANTLR start "macroParam"
	// CppTree.g:365:1: macroParam returns [MacroParameter param] : ( ^( ELLIPSIS i= IDENTIFIER ) |e= ELLIPSIS |i= IDENTIFIER );
	public final MacroParameter macroParam() throws RecognitionException {
		MacroParameter param = null;


		CommonTree i=null;
		CommonTree e=null;

		param = new MacroParameter();
		try {
			// CppTree.g:367:3: ( ^( ELLIPSIS i= IDENTIFIER ) |e= ELLIPSIS |i= IDENTIFIER )
			int alt7=3;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==ELLIPSIS) ) {
				int LA7_1 = input.LA(2);
				if ( (LA7_1==DOWN) ) {
					alt7=1;
				}
				else if ( (LA7_1==EOF||LA7_1==UP||LA7_1==ELLIPSIS||LA7_1==IDENTIFIER||LA7_1==MACRO_DEFINE) ) {
					alt7=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return param;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 7, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA7_0==IDENTIFIER) ) {
				alt7=3;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return param;}
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// CppTree.g:367:5: ^( ELLIPSIS i= IDENTIFIER )
					{
					match(input,ELLIPSIS,FOLLOW_ELLIPSIS_in_macroParam406); if (state.failed) return param;
					match(input, Token.DOWN, null); if (state.failed) return param;
					i=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_macroParam410); if (state.failed) return param;
					match(input, Token.UP, null); if (state.failed) return param;

					if ( state.backtracking==0 ) {
									param.type = EXP_ARGS;
									param.text = i.getText();
								}
					}
					break;
				case 2 :
					// CppTree.g:372:5: e= ELLIPSIS
					{
					e=(CommonTree)match(input,ELLIPSIS,FOLLOW_ELLIPSIS_in_macroParam424); if (state.failed) return param;
					if ( state.backtracking==0 ) {
									param.type = ELLIPSIS;
									param.text = new String("__VA_ARGS__");
								}
					}
					break;
				case 3 :
					// CppTree.g:377:5: i= IDENTIFIER
					{
					i=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_macroParam439); if (state.failed) return param;
					if ( state.backtracking==0 ) {
									param.type = IDENTIFIER;
									param.text = i.getText();
								}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return param;
	}
	// $ANTLR end "macroParam"



	// $ANTLR start "macroText"
	// CppTree.g:384:1: macroText returns [String mtext] : ( ^( MACRO_DEFINE (src= source_text[false] )+ ) |);
	public final String macroText() throws RecognitionException {
		String mtext = null;


		String src =null;

		 mtext = new String("");	
		try {
			// CppTree.g:386:3: ( ^( MACRO_DEFINE (src= source_text[false] )+ ) |)
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==MACRO_DEFINE) ) {
				alt9=1;
			}
			else if ( (LA9_0==UP) ) {
				alt9=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return mtext;}
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// CppTree.g:386:5: ^( MACRO_DEFINE (src= source_text[false] )+ )
					{
					match(input,MACRO_DEFINE,FOLLOW_MACRO_DEFINE_in_macroText468); if (state.failed) return mtext;
					match(input, Token.DOWN, null); if (state.failed) return mtext;
					// CppTree.g:386:20: (src= source_text[false] )+
					int cnt8=0;
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( ((LA8_0 >= CHARACTER_LITERAL && LA8_0 <= CKEYWORD)||LA8_0==COMMA||(LA8_0 >= CONCATENATE && LA8_0 <= DECIMAL_LITERAL)||LA8_0==EXPAND||LA8_0==FLOATING_POINT_LITERAL||LA8_0==HEX_LITERAL||LA8_0==IDENTIFIER||LA8_0==LIB_FILE||LA8_0==LPAREN||LA8_0==OCTAL_LITERAL||LA8_0==RPAREN||(LA8_0 >= SEMICOLON && LA8_0 <= SHARPSHARP)||LA8_0==SIZEOF||(LA8_0 >= STRINGIFICATION && LA8_0 <= TEXT_GROUP)||LA8_0==WS) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// CppTree.g:386:21: src= source_text[false]
							{
							pushFollow(FOLLOW_source_text_in_macroText473);
							src=source_text(false);
							state._fsp--;
							if (state.failed) return mtext;
							if ( state.backtracking==0 ) {
												mtext += src; 
										}
							}
							break;

						default :
							if ( cnt8 >= 1 ) break loop8;
							if (state.backtracking>0) {state.failed=true; return mtext;}
							EarlyExitException eee = new EarlyExitException(8, input);
							throw eee;
						}
						cnt8++;
					}

					match(input, Token.UP, null); if (state.failed) return mtext;

					if ( state.backtracking==0 ) {
					      			mtext  = removedEscapedNewline(mtext);
									mtext  = trim(mtext);
								}
					}
					break;
				case 2 :
					// CppTree.g:395:5: 
					{
					if ( state.backtracking==0 ) {mtext = new String(" ");}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return mtext;
	}
	// $ANTLR end "macroText"



	// $ANTLR start "macroUndef"
	// CppTree.g:399:1: macroUndef[boolean condition] : ^( UNDEF mac= IDENTIFIER ) ;
	public final void macroUndef(boolean condition) throws RecognitionException {
		CommonTree mac=null;

		try {
			// CppTree.g:400:3: ( ^( UNDEF mac= IDENTIFIER ) )
			// CppTree.g:400:5: ^( UNDEF mac= IDENTIFIER )
			{
			match(input,UNDEF,FOLLOW_UNDEF_in_macroUndef514); if (state.failed) return;
			match(input, Token.DOWN, null); if (state.failed) return;
			mac=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_macroUndef518); if (state.failed) return;
			match(input, Token.UP, null); if (state.failed) return;

			if ( state.backtracking==0 ) {
							if(condition == true)
							{
								removeMacroObject(mac.toString());
							}
						}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "macroUndef"



	// $ANTLR start "conditionalCompilation"
	// CppTree.g:409:1: conditionalCompilation[boolean condition] : ^( IF (a= expression statement[condition && subCondition ] )+ ( ELSE statement[condition && (!ifMatched)] )? ) ;
	public final void conditionalCompilation(boolean condition) throws RecognitionException {
		int a =0;

			
				boolean ifMatched=false;
				boolean subCondition=false;
			  
		try {
			// CppTree.g:414:3: ( ^( IF (a= expression statement[condition && subCondition ] )+ ( ELSE statement[condition && (!ifMatched)] )? ) )
			// CppTree.g:414:5: ^( IF (a= expression statement[condition && subCondition ] )+ ( ELSE statement[condition && (!ifMatched)] )? )
			{
			match(input,IF,FOLLOW_IF_in_conditionalCompilation546); if (state.failed) return;
			match(input, Token.DOWN, null); if (state.failed) return;
			// CppTree.g:415:7: (a= expression statement[condition && subCondition ] )+
			int cnt10=0;
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( ((LA10_0 >= EXPR && LA10_0 <= EXPR_DEF)||LA10_0==EXPR_NDEF) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// CppTree.g:415:9: a= expression statement[condition && subCondition ]
					{
					pushFollow(FOLLOW_expression_in_conditionalCompilation559);
					a=expression();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) {	
										if(ifMatched == true ) subCondition = false;
										else subCondition = ((a != 0 ) ? true: false);  
										if(subCondition == true) ifMatched =true; 
									}
					pushFollow(FOLLOW_statement_in_conditionalCompilation572);
					statement(condition && subCondition);
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					if ( cnt10 >= 1 ) break loop10;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(10, input);
					throw eee;
				}
				cnt10++;
			}

			// CppTree.g:423:4: ( ELSE statement[condition && (!ifMatched)] )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==ELSE) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// CppTree.g:423:5: ELSE statement[condition && (!ifMatched)]
					{
					match(input,ELSE,FOLLOW_ELSE_in_conditionalCompilation589); if (state.failed) return;
					pushFollow(FOLLOW_statement_in_conditionalCompilation591);
					statement(condition  && (!ifMatched));
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			match(input, Token.UP, null); if (state.failed) return;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "conditionalCompilation"



	// $ANTLR start "lineControl"
	// CppTree.g:426:1: lineControl[boolean condition] : ^( LINE n= DECIMAL_LITERAL (s= STRING_LITERAL |) ) ;
	public final void lineControl(boolean condition) throws RecognitionException {
		CommonTree n=null;
		CommonTree s=null;


			String  file=null;

		try {
			// CppTree.g:431:3: ( ^( LINE n= DECIMAL_LITERAL (s= STRING_LITERAL |) ) )
			// CppTree.g:431:5: ^( LINE n= DECIMAL_LITERAL (s= STRING_LITERAL |) )
			{
			match(input,LINE,FOLLOW_LINE_in_lineControl621); if (state.failed) return;
			match(input, Token.DOWN, null); if (state.failed) return;
			n=(CommonTree)match(input,DECIMAL_LITERAL,FOLLOW_DECIMAL_LITERAL_in_lineControl625); if (state.failed) return;
			// CppTree.g:432:5: (s= STRING_LITERAL |)
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==STRING_LITERAL) ) {
				alt12=1;
			}
			else if ( (LA12_0==UP) ) {
				alt12=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}

			switch (alt12) {
				case 1 :
					// CppTree.g:432:7: s= STRING_LITERAL
					{
					s=(CommonTree)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_lineControl636); if (state.failed) return;
					if ( state.backtracking==0 ) { file = s.toString();	}
					}
					break;
				case 2 :
					// CppTree.g:433:12: 
					{
					if ( state.backtracking==0 ) { file = null; }
					}
					break;

			}

			match(input, Token.UP, null); if (state.failed) return;

			if ( state.backtracking==0 ) {
							if(condition == true)
							{
								if(file == null) System.out.println("LINE : "+n.toString());
								else 			 System.out.println("LINE : "+n.toString()  +" FILE: "+ file);
							}
						}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "lineControl"



	// $ANTLR start "diagnostics"
	// CppTree.g:445:1: diagnostics[boolean condition] : (s= WARNING |s= ERROR |s= PRAGMA );
	public final void diagnostics(boolean condition) throws RecognitionException {
		CommonTree s=null;

		try {
			// CppTree.g:446:4: (s= WARNING |s= ERROR |s= PRAGMA )
			int alt13=3;
			switch ( input.LA(1) ) {
			case WARNING:
				{
				alt13=1;
				}
				break;
			case ERROR:
				{
				alt13=2;
				}
				break;
			case PRAGMA:
				{
				alt13=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}
			switch (alt13) {
				case 1 :
					// CppTree.g:446:6: s= WARNING
					{
					s=(CommonTree)match(input,WARNING,FOLLOW_WARNING_in_diagnostics687); if (state.failed) return;
					if ( state.backtracking==0 ) { if(condition)	{	 System.out.println("warning: " + s);	} }
					}
					break;
				case 2 :
					// CppTree.g:447:5: s= ERROR
					{
					s=(CommonTree)match(input,ERROR,FOLLOW_ERROR_in_diagnostics698); if (state.failed) return;
					if ( state.backtracking==0 ) { if(condition)	{	 System.out.println("error: " +  s);	} }
					}
					break;
				case 3 :
					// CppTree.g:448:5: s= PRAGMA
					{
					s=(CommonTree)match(input,PRAGMA,FOLLOW_PRAGMA_in_diagnostics709); if (state.failed) return;
					if ( state.backtracking==0 ) { if(condition)	{	 System.out.println(s);	} }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "diagnostics"



	// $ANTLR start "text_line"
	// CppTree.g:451:1: text_line[boolean condition,boolean out] returns [String text] : ^( TEXT_LINE (src= source_text[true] )+ ) ;
	public final String text_line(boolean condition, boolean out) throws RecognitionException {
		String text = null;


		String src =null;

		 text = new String("");	
		try {
			// CppTree.g:453:3: ( ^( TEXT_LINE (src= source_text[true] )+ ) )
			// CppTree.g:453:5: ^( TEXT_LINE (src= source_text[true] )+ )
			{
			match(input,TEXT_LINE,FOLLOW_TEXT_LINE_in_text_line736); if (state.failed) return text;
			match(input, Token.DOWN, null); if (state.failed) return text;
			// CppTree.g:453:17: (src= source_text[true] )+
			int cnt14=0;
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( ((LA14_0 >= CHARACTER_LITERAL && LA14_0 <= CKEYWORD)||LA14_0==COMMA||(LA14_0 >= CONCATENATE && LA14_0 <= DECIMAL_LITERAL)||LA14_0==EXPAND||LA14_0==FLOATING_POINT_LITERAL||LA14_0==HEX_LITERAL||LA14_0==IDENTIFIER||LA14_0==LIB_FILE||LA14_0==LPAREN||LA14_0==OCTAL_LITERAL||LA14_0==RPAREN||(LA14_0 >= SEMICOLON && LA14_0 <= SHARPSHARP)||LA14_0==SIZEOF||(LA14_0 >= STRINGIFICATION && LA14_0 <= TEXT_GROUP)||LA14_0==WS) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// CppTree.g:453:18: src= source_text[true]
					{
					pushFollow(FOLLOW_source_text_in_text_line741);
					src=source_text(true);
					state._fsp--;
					if (state.failed) return text;
					if ( state.backtracking==0 ) {
									if(condition == true) 
									{ 	
										text += src; 
									 	if(out) {	System.out.print(src);	} 		
									}
								}
					}
					break;

				default :
					if ( cnt14 >= 1 ) break loop14;
					if (state.backtracking>0) {state.failed=true; return text;}
					EarlyExitException eee = new EarlyExitException(14, input);
					throw eee;
				}
				cnt14++;
			}

			match(input, Token.UP, null); if (state.failed) return text;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return text;
	}
	// $ANTLR end "text_line"



	// $ANTLR start "statement"
	// CppTree.g:464:1: statement[boolean condition] : ( procLine[condition] )+ ;
	public final void statement(boolean condition) throws RecognitionException {
		try {
			// CppTree.g:465:3: ( ( procLine[condition] )+ )
			// CppTree.g:465:5: ( procLine[condition] )+
			{
			// CppTree.g:465:5: ( procLine[condition] )+
			int cnt15=0;
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==ERROR||LA15_0==EXEC_MACRO||LA15_0==End||LA15_0==IF||LA15_0==INCLUDE||LA15_0==LINE||(LA15_0 >= MAC_FUNCTION && LA15_0 <= MAC_OBJECT)||LA15_0==PRAGMA||LA15_0==TEXT_LINE||LA15_0==UNDEF||LA15_0==WARNING) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// CppTree.g:465:5: procLine[condition]
					{
					pushFollow(FOLLOW_procLine_in_statement771);
					procLine(condition);
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					if ( cnt15 >= 1 ) break loop15;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(15, input);
					throw eee;
				}
				cnt15++;
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "statement"



	// $ANTLR start "source_text"
	// CppTree.g:468:1: source_text[boolean expand] returns [String stext] : (m= macroExpansion[expand] |m= primarySource[expand] |m= concatenate[expand] |t= SEMICOLON |t= COMMA |t= RPAREN |t= LPAREN |t= STRING_OP |t= WS | TEXT_GROUP |t= TEXT_END | ^( TEXT_GROUP lst= macArgs[expand] ) | ^( STRINGIFICATION m= primarySource[expand] ) ) ;
	public final String source_text(boolean expand) throws RecognitionException {
		String stext = null;


		CommonTree t=null;
		String m =null;
		List lst =null;

		try {
			// CppTree.g:470:3: ( (m= macroExpansion[expand] |m= primarySource[expand] |m= concatenate[expand] |t= SEMICOLON |t= COMMA |t= RPAREN |t= LPAREN |t= STRING_OP |t= WS | TEXT_GROUP |t= TEXT_END | ^( TEXT_GROUP lst= macArgs[expand] ) | ^( STRINGIFICATION m= primarySource[expand] ) ) )
			// CppTree.g:471:3: (m= macroExpansion[expand] |m= primarySource[expand] |m= concatenate[expand] |t= SEMICOLON |t= COMMA |t= RPAREN |t= LPAREN |t= STRING_OP |t= WS | TEXT_GROUP |t= TEXT_END | ^( TEXT_GROUP lst= macArgs[expand] ) | ^( STRINGIFICATION m= primarySource[expand] ) )
			{
			// CppTree.g:471:3: (m= macroExpansion[expand] |m= primarySource[expand] |m= concatenate[expand] |t= SEMICOLON |t= COMMA |t= RPAREN |t= LPAREN |t= STRING_OP |t= WS | TEXT_GROUP |t= TEXT_END | ^( TEXT_GROUP lst= macArgs[expand] ) | ^( STRINGIFICATION m= primarySource[expand] ) )
			int alt16=13;
			switch ( input.LA(1) ) {
			case EXPAND:
				{
				alt16=1;
				}
				break;
			case CHARACTER_LITERAL:
			case CKEYWORD:
			case COPERATOR:
			case DECIMAL_LITERAL:
			case FLOATING_POINT_LITERAL:
			case HEX_LITERAL:
			case IDENTIFIER:
			case LIB_FILE:
			case OCTAL_LITERAL:
			case SHARP:
			case SHARPSHARP:
			case SIZEOF:
			case STRING_LITERAL:
				{
				alt16=2;
				}
				break;
			case CONCATENATE:
				{
				alt16=3;
				}
				break;
			case SEMICOLON:
				{
				alt16=4;
				}
				break;
			case COMMA:
				{
				alt16=5;
				}
				break;
			case RPAREN:
				{
				alt16=6;
				}
				break;
			case LPAREN:
				{
				alt16=7;
				}
				break;
			case STRING_OP:
				{
				alt16=8;
				}
				break;
			case WS:
				{
				alt16=9;
				}
				break;
			case TEXT_GROUP:
				{
				int LA16_10 = input.LA(2);
				if ( (LA16_10==DOWN) ) {
					alt16=12;
				}
				else if ( (LA16_10==EOF||LA16_10==UP||(LA16_10 >= CHARACTER_LITERAL && LA16_10 <= CKEYWORD)||LA16_10==COMMA||(LA16_10 >= CONCATENATE && LA16_10 <= DECIMAL_LITERAL)||LA16_10==EXPAND||LA16_10==FLOATING_POINT_LITERAL||LA16_10==HEX_LITERAL||LA16_10==IDENTIFIER||LA16_10==LIB_FILE||LA16_10==LPAREN||LA16_10==OCTAL_LITERAL||LA16_10==RPAREN||(LA16_10 >= SEMICOLON && LA16_10 <= SHARPSHARP)||LA16_10==SIZEOF||(LA16_10 >= STRINGIFICATION && LA16_10 <= TEXT_GROUP)||LA16_10==WS) ) {
					alt16=10;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return stext;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 16, 10, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case TEXT_END:
				{
				alt16=11;
				}
				break;
			case STRINGIFICATION:
				{
				alt16=13;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return stext;}
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}
			switch (alt16) {
				case 1 :
					// CppTree.g:471:7: m= macroExpansion[expand]
					{
					pushFollow(FOLLOW_macroExpansion_in_source_text806);
					m=macroExpansion(expand);
					state._fsp--;
					if (state.failed) return stext;
					if ( state.backtracking==0 ) { stext = m;	}
					}
					break;
				case 2 :
					// CppTree.g:472:7: m= primarySource[expand]
					{
					pushFollow(FOLLOW_primarySource_in_source_text819);
					m=primarySource(expand);
					state._fsp--;
					if (state.failed) return stext;
					if ( state.backtracking==0 ) { stext = m;	}
					}
					break;
				case 3 :
					// CppTree.g:473:5: m= concatenate[expand]
					{
					pushFollow(FOLLOW_concatenate_in_source_text831);
					m=concatenate(expand);
					state._fsp--;
					if (state.failed) return stext;
					if ( state.backtracking==0 ) { stext = m;	}
					}
					break;
				case 4 :
					// CppTree.g:474:7: t= SEMICOLON
					{
					t=(CommonTree)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_source_text845); if (state.failed) return stext;
					if ( state.backtracking==0 ) { stext = t.getText();	}
					}
					break;
				case 5 :
					// CppTree.g:475:7: t= COMMA
					{
					t=(CommonTree)match(input,COMMA,FOLLOW_COMMA_in_source_text859); if (state.failed) return stext;
					if ( state.backtracking==0 ) { stext = t.getText();	}
					}
					break;
				case 6 :
					// CppTree.g:476:7: t= RPAREN
					{
					t=(CommonTree)match(input,RPAREN,FOLLOW_RPAREN_in_source_text876); if (state.failed) return stext;
					if ( state.backtracking==0 ) { stext = t.getText();	}
					}
					break;
				case 7 :
					// CppTree.g:477:7: t= LPAREN
					{
					t=(CommonTree)match(input,LPAREN,FOLLOW_LPAREN_in_source_text892); if (state.failed) return stext;
					if ( state.backtracking==0 ) { stext = t.getText();	}
					}
					break;
				case 8 :
					// CppTree.g:478:7: t= STRING_OP
					{
					t=(CommonTree)match(input,STRING_OP,FOLLOW_STRING_OP_in_source_text908); if (state.failed) return stext;
					if ( state.backtracking==0 ) { stext = "#_#_" + t.getText();	}
					}
					break;
				case 9 :
					// CppTree.g:479:7: t= WS
					{
					t=(CommonTree)match(input,WS,FOLLOW_WS_in_source_text922); if (state.failed) return stext;
					if ( state.backtracking==0 ) { stext = t.getText();	}
					}
					break;
				case 10 :
					// CppTree.g:480:5: TEXT_GROUP
					{
					match(input,TEXT_GROUP,FOLLOW_TEXT_GROUP_in_source_text935); if (state.failed) return stext;
					if ( state.backtracking==0 ) { stext = "()";			}
					}
					break;
				case 11 :
					// CppTree.g:481:7: t= TEXT_END
					{
					t=(CommonTree)match(input,TEXT_END,FOLLOW_TEXT_END_in_source_text949); if (state.failed) return stext;
					if ( state.backtracking==0 ) { 	if(expand)
									{	
										stext = t.getText(); ++lineNo;	
									}
									else	stext ="";
								}
					}
					break;
				case 12 :
					// CppTree.g:488:5: ^( TEXT_GROUP lst= macArgs[expand] )
					{
					match(input,TEXT_GROUP,FOLLOW_TEXT_GROUP_in_source_text964); if (state.failed) return stext;
					match(input, Token.DOWN, null); if (state.failed) return stext;
					pushFollow(FOLLOW_macArgs_in_source_text968);
					lst=macArgs(expand);
					state._fsp--;
					if (state.failed) return stext;
					match(input, Token.UP, null); if (state.failed) return stext;

					if ( state.backtracking==0 ) {
									
									stext = "(";
								    for (int i=0; i<lst.size(); i++)
									{
										ExpressionReturn exp = (ExpressionReturn)lst.get(i);
										stext  += exp.text;
										if( i != lst.size()-1) stext += ",";
									}
									stext += ")";
								}
					}
					break;
				case 13 :
					// CppTree.g:500:7: ^( STRINGIFICATION m= primarySource[expand] )
					{
					match(input,STRINGIFICATION,FOLLOW_STRINGIFICATION_in_source_text984); if (state.failed) return stext;
					match(input, Token.DOWN, null); if (state.failed) return stext;
					pushFollow(FOLLOW_primarySource_in_source_text989);
					m=primarySource(expand);
					state._fsp--;
					if (state.failed) return stext;
					match(input, Token.UP, null); if (state.failed) return stext;

					if ( state.backtracking==0 ) { stext = "\"" + m + "\"";}
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stext;
	}
	// $ANTLR end "source_text"



	// $ANTLR start "concatenate"
	// CppTree.g:506:1: concatenate[boolean expand] returns [String stext] : ^( CONCATENATE (a= primarySource[expand] )+ ) ;
	public final String concatenate(boolean expand) throws RecognitionException {
		String stext = null;


		String a =null;

		 stext = "";	int i=0;	
		try {
			// CppTree.g:508:3: ( ^( CONCATENATE (a= primarySource[expand] )+ ) )
			// CppTree.g:509:3: ^( CONCATENATE (a= primarySource[expand] )+ )
			{
			match(input,CONCATENATE,FOLLOW_CONCATENATE_in_concatenate1029); if (state.failed) return stext;
			match(input, Token.DOWN, null); if (state.failed) return stext;
			// CppTree.g:510:4: (a= primarySource[expand] )+
			int cnt17=0;
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( ((LA17_0 >= CHARACTER_LITERAL && LA17_0 <= CKEYWORD)||(LA17_0 >= COPERATOR && LA17_0 <= DECIMAL_LITERAL)||LA17_0==FLOATING_POINT_LITERAL||LA17_0==HEX_LITERAL||LA17_0==IDENTIFIER||LA17_0==LIB_FILE||LA17_0==OCTAL_LITERAL||(LA17_0 >= SHARP && LA17_0 <= SHARPSHARP)||LA17_0==SIZEOF||LA17_0==STRING_LITERAL) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// CppTree.g:510:5: a= primarySource[expand]
					{
					pushFollow(FOLLOW_primarySource_in_concatenate1038);
					a=primarySource(expand);
					state._fsp--;
					if (state.failed) return stext;
					if ( state.backtracking==0 ) { 
									if(expand == false)
									{ 
										if(i==0) stext = a;
										else stext = stext + " ## " +  a;
										i++;
									}
									else {if(!a.equals(" ")) stext += a; }
								}
					}
					break;

				default :
					if ( cnt17 >= 1 ) break loop17;
					if (state.backtracking>0) {state.failed=true; return stext;}
					EarlyExitException eee = new EarlyExitException(17, input);
					throw eee;
				}
				cnt17++;
			}

			match(input, Token.UP, null); if (state.failed) return stext;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stext;
	}
	// $ANTLR end "concatenate"



	// $ANTLR start "primarySource"
	// CppTree.g:524:1: primarySource[boolean expand] returns [String stext] : (c= constant[false] |t= COPERATOR |t= CKEYWORD |t= SIZEOF |t= SHARP |t= LIB_FILE | ^( SHARPSHARP id= IDENTIFIER ) |id= IDENTIFIER );
	public final String primarySource(boolean expand) throws RecognitionException {
		String stext = null;


		CommonTree t=null;
		CommonTree id=null;
		ExpressionReturn c =null;

		try {
			// CppTree.g:526:3: (c= constant[false] |t= COPERATOR |t= CKEYWORD |t= SIZEOF |t= SHARP |t= LIB_FILE | ^( SHARPSHARP id= IDENTIFIER ) |id= IDENTIFIER )
			int alt18=8;
			switch ( input.LA(1) ) {
			case CHARACTER_LITERAL:
			case DECIMAL_LITERAL:
			case FLOATING_POINT_LITERAL:
			case HEX_LITERAL:
			case OCTAL_LITERAL:
			case STRING_LITERAL:
				{
				alt18=1;
				}
				break;
			case COPERATOR:
				{
				alt18=2;
				}
				break;
			case CKEYWORD:
				{
				alt18=3;
				}
				break;
			case SIZEOF:
				{
				alt18=4;
				}
				break;
			case SHARP:
				{
				alt18=5;
				}
				break;
			case LIB_FILE:
				{
				alt18=6;
				}
				break;
			case SHARPSHARP:
				{
				alt18=7;
				}
				break;
			case IDENTIFIER:
				{
				alt18=8;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return stext;}
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}
			switch (alt18) {
				case 1 :
					// CppTree.g:526:7: c= constant[false]
					{
					pushFollow(FOLLOW_constant_in_primarySource1083);
					c=constant(false);
					state._fsp--;
					if (state.failed) return stext;
					if ( state.backtracking==0 ) { stext = c.text;		}
					}
					break;
				case 2 :
					// CppTree.g:527:7: t= COPERATOR
					{
					t=(CommonTree)match(input,COPERATOR,FOLLOW_COPERATOR_in_primarySource1097); if (state.failed) return stext;
					if ( state.backtracking==0 ) { stext = t.getText();	}
					}
					break;
				case 3 :
					// CppTree.g:528:5: t= CKEYWORD
					{
					t=(CommonTree)match(input,CKEYWORD,FOLLOW_CKEYWORD_in_primarySource1109); if (state.failed) return stext;
					if ( state.backtracking==0 ) { stext = t.getText();	}
					}
					break;
				case 4 :
					// CppTree.g:529:7: t= SIZEOF
					{
					t=(CommonTree)match(input,SIZEOF,FOLLOW_SIZEOF_in_primarySource1123); if (state.failed) return stext;
					if ( state.backtracking==0 ) { stext = t.getText();	}
					}
					break;
				case 5 :
					// CppTree.g:530:7: t= SHARP
					{
					t=(CommonTree)match(input,SHARP,FOLLOW_SHARP_in_primarySource1138); if (state.failed) return stext;
					if ( state.backtracking==0 ) { stext = t.getText();	}
					}
					break;
				case 6 :
					// CppTree.g:531:7: t= LIB_FILE
					{
					t=(CommonTree)match(input,LIB_FILE,FOLLOW_LIB_FILE_in_primarySource1153); if (state.failed) return stext;
					if ( state.backtracking==0 ) { stext = t.getText();	}
					}
					break;
				case 7 :
					// CppTree.g:532:7: ^( SHARPSHARP id= IDENTIFIER )
					{
					match(input,SHARPSHARP,FOLLOW_SHARPSHARP_in_primarySource1167); if (state.failed) return stext;
					match(input, Token.DOWN, null); if (state.failed) return stext;
					id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_primarySource1172); if (state.failed) return stext;
					match(input, Token.UP, null); if (state.failed) return stext;

					if ( state.backtracking==0 ) {
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
					}
					break;
				case 8 :
					// CppTree.g:561:7: id= IDENTIFIER
					{
					id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_primarySource1188); if (state.failed) return stext;
					if ( state.backtracking==0 ) {	if(expand)
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
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stext;
	}
	// $ANTLR end "primarySource"



	// $ANTLR start "macroExpansion"
	// CppTree.g:598:1: macroExpansion[boolean expand] returns [String r] : ( ^( EXPAND id= IDENTIFIER ) | ^( EXPAND id= IDENTIFIER lst= macArgs[expand] ) );
	public final String macroExpansion(boolean expand) throws RecognitionException {
		String r = null;


		CommonTree id=null;
		List lst =null;

		try {
			// CppTree.g:599:3: ( ^( EXPAND id= IDENTIFIER ) | ^( EXPAND id= IDENTIFIER lst= macArgs[expand] ) )
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==EXPAND) ) {
				int LA19_1 = input.LA(2);
				if ( (LA19_1==DOWN) ) {
					int LA19_2 = input.LA(3);
					if ( (LA19_2==IDENTIFIER) ) {
						int LA19_3 = input.LA(4);
						if ( (LA19_3==UP) ) {
							alt19=1;
						}
						else if ( (LA19_3==EXP_ARGS) ) {
							alt19=2;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return r;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 19, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						if (state.backtracking>0) {state.failed=true; return r;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 19, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return r;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 19, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return r;}
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}

			switch (alt19) {
				case 1 :
					// CppTree.g:599:6: ^( EXPAND id= IDENTIFIER )
					{
					match(input,EXPAND,FOLLOW_EXPAND_in_macroExpansion1216); if (state.failed) return r;
					match(input, Token.DOWN, null); if (state.failed) return r;
					id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_macroExpansion1220); if (state.failed) return r;
					match(input, Token.UP, null); if (state.failed) return r;

					if ( state.backtracking==0 ) {
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
					}
					break;
				case 2 :
					// CppTree.g:661:5: ^( EXPAND id= IDENTIFIER lst= macArgs[expand] )
					{
					match(input,EXPAND,FOLLOW_EXPAND_in_macroExpansion1234); if (state.failed) return r;
					match(input, Token.DOWN, null); if (state.failed) return r;
					id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_macroExpansion1238); if (state.failed) return r;
					pushFollow(FOLLOW_macArgs_in_macroExpansion1242);
					lst=macArgs(expand);
					state._fsp--;
					if (state.failed) return r;
					match(input, Token.UP, null); if (state.failed) return r;

					if ( state.backtracking==0 ) {
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
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return r;
	}
	// $ANTLR end "macroExpansion"



	// $ANTLR start "macArgs"
	// CppTree.g:830:1: macArgs[boolean expand] returns [List r] : ^( EXP_ARGS (a= mArg[expand] )+ ) ;
	public final List macArgs(boolean expand) throws RecognitionException {
		List r = null;


		String a =null;

		 	
			r = new ArrayList();

		try {
			// CppTree.g:835:3: ( ^( EXP_ARGS (a= mArg[expand] )+ ) )
			// CppTree.g:835:5: ^( EXP_ARGS (a= mArg[expand] )+ )
			{
			match(input,EXP_ARGS,FOLLOW_EXP_ARGS_in_macArgs1274); if (state.failed) return r;
			match(input, Token.DOWN, null); if (state.failed) return r;
			// CppTree.g:835:16: (a= mArg[expand] )+
			int cnt20=0;
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==EXP_ARG) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// CppTree.g:835:17: a= mArg[expand]
					{
					pushFollow(FOLLOW_mArg_in_macArgs1279);
					a=mArg(expand);
					state._fsp--;
					if (state.failed) return r;
					if ( state.backtracking==0 ) { 
									ExpressionReturn arg = new ExpressionReturn();
									arg.text = a;
									r.add(arg); 
								}
					}
					break;

				default :
					if ( cnt20 >= 1 ) break loop20;
					if (state.backtracking>0) {state.failed=true; return r;}
					EarlyExitException eee = new EarlyExitException(20, input);
					throw eee;
				}
				cnt20++;
			}

			match(input, Token.UP, null); if (state.failed) return r;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return r;
	}
	// $ANTLR end "macArgs"



	// $ANTLR start "mArg"
	// CppTree.g:844:1: mArg[boolean expand] returns [String r] : ( ^( EXP_ARG (a= source_text[expand] )+ ) | EXP_ARG );
	public final String mArg(boolean expand) throws RecognitionException {
		String r = null;


		String a =null;

		 r = new String(""); 
		try {
			// CppTree.g:846:3: ( ^( EXP_ARG (a= source_text[expand] )+ ) | EXP_ARG )
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==EXP_ARG) ) {
				int LA22_1 = input.LA(2);
				if ( (LA22_1==DOWN) ) {
					alt22=1;
				}
				else if ( (LA22_1==EOF||LA22_1==UP||LA22_1==EXP_ARG) ) {
					alt22=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return r;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 22, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return r;}
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}

			switch (alt22) {
				case 1 :
					// CppTree.g:846:5: ^( EXP_ARG (a= source_text[expand] )+ )
					{
					match(input,EXP_ARG,FOLLOW_EXP_ARG_in_mArg1316); if (state.failed) return r;
					match(input, Token.DOWN, null); if (state.failed) return r;
					// CppTree.g:846:15: (a= source_text[expand] )+
					int cnt21=0;
					loop21:
					while (true) {
						int alt21=2;
						int LA21_0 = input.LA(1);
						if ( ((LA21_0 >= CHARACTER_LITERAL && LA21_0 <= CKEYWORD)||LA21_0==COMMA||(LA21_0 >= CONCATENATE && LA21_0 <= DECIMAL_LITERAL)||LA21_0==EXPAND||LA21_0==FLOATING_POINT_LITERAL||LA21_0==HEX_LITERAL||LA21_0==IDENTIFIER||LA21_0==LIB_FILE||LA21_0==LPAREN||LA21_0==OCTAL_LITERAL||LA21_0==RPAREN||(LA21_0 >= SEMICOLON && LA21_0 <= SHARPSHARP)||LA21_0==SIZEOF||(LA21_0 >= STRINGIFICATION && LA21_0 <= TEXT_GROUP)||LA21_0==WS) ) {
							alt21=1;
						}

						switch (alt21) {
						case 1 :
							// CppTree.g:846:16: a= source_text[expand]
							{
							pushFollow(FOLLOW_source_text_in_mArg1321);
							a=source_text(expand);
							state._fsp--;
							if (state.failed) return r;
							if ( state.backtracking==0 ) { r += a; }
							}
							break;

						default :
							if ( cnt21 >= 1 ) break loop21;
							if (state.backtracking>0) {state.failed=true; return r;}
							EarlyExitException eee = new EarlyExitException(21, input);
							throw eee;
						}
						cnt21++;
					}

					match(input, Token.UP, null); if (state.failed) return r;

					}
					break;
				case 2 :
					// CppTree.g:847:5: EXP_ARG
					{
					match(input,EXP_ARG,FOLLOW_EXP_ARG_in_mArg1335); if (state.failed) return r;
					if ( state.backtracking==0 ) {	r = " ";	}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return r;
	}
	// $ANTLR end "mArg"



	// $ANTLR start "macroExecution"
	// CppTree.g:852:1: macroExecution returns [int r] : ^( EXEC_MACRO a= expression ) ;
	public final int macroExecution() throws RecognitionException {
		int r = 0;


		int a =0;

		try {
			// CppTree.g:853:3: ( ^( EXEC_MACRO a= expression ) )
			// CppTree.g:853:5: ^( EXEC_MACRO a= expression )
			{
			match(input,EXEC_MACRO,FOLLOW_EXEC_MACRO_in_macroExecution1359); if (state.failed) return r;
			match(input, Token.DOWN, null); if (state.failed) return r;
			pushFollow(FOLLOW_expression_in_macroExecution1363);
			a=expression();
			state._fsp--;
			if (state.failed) return r;
			match(input, Token.UP, null); if (state.failed) return r;

			if ( state.backtracking==0 ) { r = a; }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return r;
	}
	// $ANTLR end "macroExecution"



	// $ANTLR start "expression"
	// CppTree.g:856:1: expression returns [int r] : ( ^( EXPR a= expr ) | ^( EXPR_DEF id= IDENTIFIER ) | ^( EXPR_NDEF id= IDENTIFIER ) );
	public final int expression() throws RecognitionException {
		int r = 0;


		CommonTree id=null;
		int a =0;

		r = 0;
		try {
			// CppTree.g:858:3: ( ^( EXPR a= expr ) | ^( EXPR_DEF id= IDENTIFIER ) | ^( EXPR_NDEF id= IDENTIFIER ) )
			int alt23=3;
			switch ( input.LA(1) ) {
			case EXPR:
				{
				alt23=1;
				}
				break;
			case EXPR_DEF:
				{
				alt23=2;
				}
				break;
			case EXPR_NDEF:
				{
				alt23=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return r;}
				NoViableAltException nvae =
					new NoViableAltException("", 23, 0, input);
				throw nvae;
			}
			switch (alt23) {
				case 1 :
					// CppTree.g:858:5: ^( EXPR a= expr )
					{
					match(input,EXPR,FOLLOW_EXPR_in_expression1389); if (state.failed) return r;
					match(input, Token.DOWN, null); if (state.failed) return r;
					pushFollow(FOLLOW_expr_in_expression1393);
					a=expr();
					state._fsp--;
					if (state.failed) return r;
					match(input, Token.UP, null); if (state.failed) return r;

					if ( state.backtracking==0 ) { r = a; }
					}
					break;
				case 2 :
					// CppTree.g:859:5: ^( EXPR_DEF id= IDENTIFIER )
					{
					match(input,EXPR_DEF,FOLLOW_EXPR_DEF_in_expression1406); if (state.failed) return r;
					match(input, Token.DOWN, null); if (state.failed) return r;
					id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_expression1410); if (state.failed) return r;
					match(input, Token.UP, null); if (state.failed) return r;

					if ( state.backtracking==0 ) { r = isMacroDefined(id.toString()) ? 1: 0 ; }
					}
					break;
				case 3 :
					// CppTree.g:860:5: ^( EXPR_NDEF id= IDENTIFIER )
					{
					match(input,EXPR_NDEF,FOLLOW_EXPR_NDEF_in_expression1420); if (state.failed) return r;
					match(input, Token.DOWN, null); if (state.failed) return r;
					id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_expression1425); if (state.failed) return r;
					match(input, Token.UP, null); if (state.failed) return r;

					if ( state.backtracking==0 ) { r = isMacroDefined(id.toString()) ? 0: 1 ; }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return r;
	}
	// $ANTLR end "expression"



	// $ANTLR start "expr"
	// CppTree.g:863:1: expr returns [int r] : (a= assignmentExpression |a= conditionalExpression |a= logicalOrExpression |a= logicalAndExpression |a= inclusiveOrExpression |a= exclusiveOrExpression |a= andExpression |a= equalityExpression |a= relationalExpression |a= shiftExpression |a= additiveExpression |a= multiplicativeExpression |a= unaryExpression |a= postfixExpression |a= primaryExpression ) ;
	public final int expr() throws RecognitionException {
		int r = 0;


		int a =0;

		 r = 0; 
		try {
			// CppTree.g:865:3: ( (a= assignmentExpression |a= conditionalExpression |a= logicalOrExpression |a= logicalAndExpression |a= inclusiveOrExpression |a= exclusiveOrExpression |a= andExpression |a= equalityExpression |a= relationalExpression |a= shiftExpression |a= additiveExpression |a= multiplicativeExpression |a= unaryExpression |a= postfixExpression |a= primaryExpression ) )
			// CppTree.g:866:3: (a= assignmentExpression |a= conditionalExpression |a= logicalOrExpression |a= logicalAndExpression |a= inclusiveOrExpression |a= exclusiveOrExpression |a= andExpression |a= equalityExpression |a= relationalExpression |a= shiftExpression |a= additiveExpression |a= multiplicativeExpression |a= unaryExpression |a= postfixExpression |a= primaryExpression )
			{
			// CppTree.g:866:3: (a= assignmentExpression |a= conditionalExpression |a= logicalOrExpression |a= logicalAndExpression |a= inclusiveOrExpression |a= exclusiveOrExpression |a= andExpression |a= equalityExpression |a= relationalExpression |a= shiftExpression |a= additiveExpression |a= multiplicativeExpression |a= unaryExpression |a= postfixExpression |a= primaryExpression )
			int alt24=15;
			switch ( input.LA(1) ) {
			case ASSIGNEQUAL:
			case BITWISEANDEQUAL:
			case BITWISEOREQUAL:
			case BITWISEXOREQUAL:
			case DIVIDEEQUAL:
			case MINUSEQUAL:
			case MODEQUAL:
			case PLUSEQUAL:
			case SHIFTLEFTEQUAL:
			case SHIFTRIGHTEQUAL:
			case TIMESEQUAL:
				{
				alt24=1;
				}
				break;
			case QUESTIONMARK:
				{
				alt24=2;
				}
				break;
			case OR:
				{
				alt24=3;
				}
				break;
			case AND:
				{
				alt24=4;
				}
				break;
			case BITWISEOR:
				{
				alt24=5;
				}
				break;
			case BITWISERXOR:
				{
				alt24=6;
				}
				break;
			case AMPERSAND:
				{
				alt24=7;
				}
				break;
			case EQUAL:
			case NOTEQUAL:
				{
				alt24=8;
				}
				break;
			case GREATERTHAN:
			case GREATERTHANOREQUALTO:
			case LESSTHAN:
			case LESSTHANOREQUALTO:
				{
				alt24=9;
				}
				break;
			case SHIFTLEFT:
			case SHIFTRIGHT:
				{
				alt24=10;
				}
				break;
			case MINUS:
			case PLUS:
				{
				alt24=11;
				}
				break;
			case DIVIDE:
			case MOD:
			case STAR:
				{
				alt24=12;
				}
				break;
			case DEFINED:
			case MINUSMINUS:
			case NOT:
			case PLUSPLUS:
			case POINTER_AT:
			case REFERANCE:
			case SIZEOF:
			case SIZEOF_TYPE:
			case TILDE:
			case TYPECAST:
			case UNARY_MINUS:
			case UNARY_PLUS:
				{
				alt24=13;
				}
				break;
			case DOT:
			case INDEX_OP:
			case POINTER:
			case POINTERTO:
			case POST_DEC:
			case POST_INC:
				{
				alt24=14;
				}
				break;
			case CHARACTER_LITERAL:
			case DECIMAL_LITERAL:
			case EXPR_GROUP:
			case FLOATING_POINT_LITERAL:
			case HEX_LITERAL:
			case IDENTIFIER:
			case METHOD_CALL:
			case OCTAL_LITERAL:
			case STRING_LITERAL:
				{
				alt24=15;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return r;}
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				throw nvae;
			}
			switch (alt24) {
				case 1 :
					// CppTree.g:866:5: a= assignmentExpression
					{
					pushFollow(FOLLOW_assignmentExpression_in_expr1457);
					a=assignmentExpression();
					state._fsp--;
					if (state.failed) return r;
					}
					break;
				case 2 :
					// CppTree.g:867:5: a= conditionalExpression
					{
					pushFollow(FOLLOW_conditionalExpression_in_expr1465);
					a=conditionalExpression();
					state._fsp--;
					if (state.failed) return r;
					}
					break;
				case 3 :
					// CppTree.g:868:5: a= logicalOrExpression
					{
					pushFollow(FOLLOW_logicalOrExpression_in_expr1473);
					a=logicalOrExpression();
					state._fsp--;
					if (state.failed) return r;
					}
					break;
				case 4 :
					// CppTree.g:869:5: a= logicalAndExpression
					{
					pushFollow(FOLLOW_logicalAndExpression_in_expr1481);
					a=logicalAndExpression();
					state._fsp--;
					if (state.failed) return r;
					}
					break;
				case 5 :
					// CppTree.g:870:5: a= inclusiveOrExpression
					{
					pushFollow(FOLLOW_inclusiveOrExpression_in_expr1489);
					a=inclusiveOrExpression();
					state._fsp--;
					if (state.failed) return r;
					}
					break;
				case 6 :
					// CppTree.g:871:5: a= exclusiveOrExpression
					{
					pushFollow(FOLLOW_exclusiveOrExpression_in_expr1497);
					a=exclusiveOrExpression();
					state._fsp--;
					if (state.failed) return r;
					}
					break;
				case 7 :
					// CppTree.g:872:5: a= andExpression
					{
					pushFollow(FOLLOW_andExpression_in_expr1505);
					a=andExpression();
					state._fsp--;
					if (state.failed) return r;
					}
					break;
				case 8 :
					// CppTree.g:873:5: a= equalityExpression
					{
					pushFollow(FOLLOW_equalityExpression_in_expr1513);
					a=equalityExpression();
					state._fsp--;
					if (state.failed) return r;
					}
					break;
				case 9 :
					// CppTree.g:874:5: a= relationalExpression
					{
					pushFollow(FOLLOW_relationalExpression_in_expr1521);
					a=relationalExpression();
					state._fsp--;
					if (state.failed) return r;
					}
					break;
				case 10 :
					// CppTree.g:875:5: a= shiftExpression
					{
					pushFollow(FOLLOW_shiftExpression_in_expr1529);
					a=shiftExpression();
					state._fsp--;
					if (state.failed) return r;
					}
					break;
				case 11 :
					// CppTree.g:876:5: a= additiveExpression
					{
					pushFollow(FOLLOW_additiveExpression_in_expr1537);
					a=additiveExpression();
					state._fsp--;
					if (state.failed) return r;
					}
					break;
				case 12 :
					// CppTree.g:877:5: a= multiplicativeExpression
					{
					pushFollow(FOLLOW_multiplicativeExpression_in_expr1545);
					a=multiplicativeExpression();
					state._fsp--;
					if (state.failed) return r;
					}
					break;
				case 13 :
					// CppTree.g:878:5: a= unaryExpression
					{
					pushFollow(FOLLOW_unaryExpression_in_expr1553);
					a=unaryExpression();
					state._fsp--;
					if (state.failed) return r;
					}
					break;
				case 14 :
					// CppTree.g:879:5: a= postfixExpression
					{
					pushFollow(FOLLOW_postfixExpression_in_expr1561);
					a=postfixExpression();
					state._fsp--;
					if (state.failed) return r;
					}
					break;
				case 15 :
					// CppTree.g:880:5: a= primaryExpression
					{
					pushFollow(FOLLOW_primaryExpression_in_expr1569);
					a=primaryExpression();
					state._fsp--;
					if (state.failed) return r;
					}
					break;

			}

			if ( state.backtracking==0 ) { 	r = a; }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return r;
	}
	// $ANTLR end "expr"



	// $ANTLR start "assignmentExpression"
	// CppTree.g:885:1: assignmentExpression returns [int r] : ( ^(o= ASSIGNEQUAL a= expr b= expr ) | ^(o= TIMESEQUAL a= expr b= expr ) | ^(o= DIVIDEEQUAL a= expr b= expr ) | ^(o= PLUSEQUAL a= expr b= expr ) | ^(o= MINUSEQUAL a= expr b= expr ) | ^(o= SHIFTLEFTEQUAL a= expr b= expr ) | ^(o= SHIFTRIGHTEQUAL a= expr b= expr ) | ^(o= BITWISEANDEQUAL a= expr b= expr ) | ^(o= BITWISEXOREQUAL a= expr b= expr ) | ^(o= BITWISEOREQUAL a= expr b= expr ) | ^(o= MODEQUAL a= expr b= expr ) );
	public final int assignmentExpression() throws RecognitionException {
		int r = 0;


		CommonTree o=null;
		int a =0;
		int b =0;

		r = 0;
		try {
			// CppTree.g:887:3: ( ^(o= ASSIGNEQUAL a= expr b= expr ) | ^(o= TIMESEQUAL a= expr b= expr ) | ^(o= DIVIDEEQUAL a= expr b= expr ) | ^(o= PLUSEQUAL a= expr b= expr ) | ^(o= MINUSEQUAL a= expr b= expr ) | ^(o= SHIFTLEFTEQUAL a= expr b= expr ) | ^(o= SHIFTRIGHTEQUAL a= expr b= expr ) | ^(o= BITWISEANDEQUAL a= expr b= expr ) | ^(o= BITWISEXOREQUAL a= expr b= expr ) | ^(o= BITWISEOREQUAL a= expr b= expr ) | ^(o= MODEQUAL a= expr b= expr ) )
			int alt25=11;
			switch ( input.LA(1) ) {
			case ASSIGNEQUAL:
				{
				alt25=1;
				}
				break;
			case TIMESEQUAL:
				{
				alt25=2;
				}
				break;
			case DIVIDEEQUAL:
				{
				alt25=3;
				}
				break;
			case PLUSEQUAL:
				{
				alt25=4;
				}
				break;
			case MINUSEQUAL:
				{
				alt25=5;
				}
				break;
			case SHIFTLEFTEQUAL:
				{
				alt25=6;
				}
				break;
			case SHIFTRIGHTEQUAL:
				{
				alt25=7;
				}
				break;
			case BITWISEANDEQUAL:
				{
				alt25=8;
				}
				break;
			case BITWISEXOREQUAL:
				{
				alt25=9;
				}
				break;
			case BITWISEOREQUAL:
				{
				alt25=10;
				}
				break;
			case MODEQUAL:
				{
				alt25=11;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return r;}
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				throw nvae;
			}
			switch (alt25) {
				case 1 :
					// CppTree.g:887:6: ^(o= ASSIGNEQUAL a= expr b= expr )
					{
					o=(CommonTree)match(input,ASSIGNEQUAL,FOLLOW_ASSIGNEQUAL_in_assignmentExpression1603); if (state.failed) return r;
					match(input, Token.DOWN, null); if (state.failed) return r;
					pushFollow(FOLLOW_expr_in_assignmentExpression1613);
					a=expr();
					state._fsp--;
					if (state.failed) return r;
					pushFollow(FOLLOW_expr_in_assignmentExpression1617);
					b=expr();
					state._fsp--;
					if (state.failed) return r;
					match(input, Token.UP, null); if (state.failed) return r;

					if ( state.backtracking==0 ) {  r = a;		  }
					}
					break;
				case 2 :
					// CppTree.g:888:7: ^(o= TIMESEQUAL a= expr b= expr )
					{
					o=(CommonTree)match(input,TIMESEQUAL,FOLLOW_TIMESEQUAL_in_assignmentExpression1631); if (state.failed) return r;
					match(input, Token.DOWN, null); if (state.failed) return r;
					pushFollow(FOLLOW_expr_in_assignmentExpression1642);
					a=expr();
					state._fsp--;
					if (state.failed) return r;
					pushFollow(FOLLOW_expr_in_assignmentExpression1646);
					b=expr();
					state._fsp--;
					if (state.failed) return r;
					match(input, Token.UP, null); if (state.failed) return r;

					if ( state.backtracking==0 ) {  a *= b;	r = a;}
					}
					break;
				case 3 :
					// CppTree.g:889:7: ^(o= DIVIDEEQUAL a= expr b= expr )
					{
					o=(CommonTree)match(input,DIVIDEEQUAL,FOLLOW_DIVIDEEQUAL_in_assignmentExpression1660); if (state.failed) return r;
					match(input, Token.DOWN, null); if (state.failed) return r;
					pushFollow(FOLLOW_expr_in_assignmentExpression1670);
					a=expr();
					state._fsp--;
					if (state.failed) return r;
					pushFollow(FOLLOW_expr_in_assignmentExpression1674);
					b=expr();
					state._fsp--;
					if (state.failed) return r;
					match(input, Token.UP, null); if (state.failed) return r;

					if ( state.backtracking==0 ) {  a /= b;	r = a;}
					}
					break;
				case 4 :
					// CppTree.g:890:7: ^(o= PLUSEQUAL a= expr b= expr )
					{
					o=(CommonTree)match(input,PLUSEQUAL,FOLLOW_PLUSEQUAL_in_assignmentExpression1688); if (state.failed) return r;
					match(input, Token.DOWN, null); if (state.failed) return r;
					pushFollow(FOLLOW_expr_in_assignmentExpression1700);
					a=expr();
					state._fsp--;
					if (state.failed) return r;
					pushFollow(FOLLOW_expr_in_assignmentExpression1704);
					b=expr();
					state._fsp--;
					if (state.failed) return r;
					match(input, Token.UP, null); if (state.failed) return r;

					if ( state.backtracking==0 ) {  a += b;	r = a;}
					}
					break;
				case 5 :
					// CppTree.g:891:7: ^(o= MINUSEQUAL a= expr b= expr )
					{
					o=(CommonTree)match(input,MINUSEQUAL,FOLLOW_MINUSEQUAL_in_assignmentExpression1718); if (state.failed) return r;
					match(input, Token.DOWN, null); if (state.failed) return r;
					pushFollow(FOLLOW_expr_in_assignmentExpression1729);
					a=expr();
					state._fsp--;
					if (state.failed) return r;
					pushFollow(FOLLOW_expr_in_assignmentExpression1733);
					b=expr();
					state._fsp--;
					if (state.failed) return r;
					match(input, Token.UP, null); if (state.failed) return r;

					if ( state.backtracking==0 ) {  a -= b;	r = a;}
					}
					break;
				case 6 :
					// CppTree.g:892:7: ^(o= SHIFTLEFTEQUAL a= expr b= expr )
					{
					o=(CommonTree)match(input,SHIFTLEFTEQUAL,FOLLOW_SHIFTLEFTEQUAL_in_assignmentExpression1747); if (state.failed) return r;
					match(input, Token.DOWN, null); if (state.failed) return r;
					pushFollow(FOLLOW_expr_in_assignmentExpression1754);
					a=expr();
					state._fsp--;
					if (state.failed) return r;
					pushFollow(FOLLOW_expr_in_assignmentExpression1758);
					b=expr();
					state._fsp--;
					if (state.failed) return r;
					match(input, Token.UP, null); if (state.failed) return r;

					if ( state.backtracking==0 ) {  a <<= b;	r = a;}
					}
					break;
				case 7 :
					// CppTree.g:893:7: ^(o= SHIFTRIGHTEQUAL a= expr b= expr )
					{
					o=(CommonTree)match(input,SHIFTRIGHTEQUAL,FOLLOW_SHIFTRIGHTEQUAL_in_assignmentExpression1772); if (state.failed) return r;
					match(input, Token.DOWN, null); if (state.failed) return r;
					pushFollow(FOLLOW_expr_in_assignmentExpression1778);
					a=expr();
					state._fsp--;
					if (state.failed) return r;
					pushFollow(FOLLOW_expr_in_assignmentExpression1782);
					b=expr();
					state._fsp--;
					if (state.failed) return r;
					match(input, Token.UP, null); if (state.failed) return r;

					if ( state.backtracking==0 ) {  a >>= b;	r = a;}
					}
					break;
				case 8 :
					// CppTree.g:894:7: ^(o= BITWISEANDEQUAL a= expr b= expr )
					{
					o=(CommonTree)match(input,BITWISEANDEQUAL,FOLLOW_BITWISEANDEQUAL_in_assignmentExpression1796); if (state.failed) return r;
					match(input, Token.DOWN, null); if (state.failed) return r;
					pushFollow(FOLLOW_expr_in_assignmentExpression1802);
					a=expr();
					state._fsp--;
					if (state.failed) return r;
					pushFollow(FOLLOW_expr_in_assignmentExpression1806);
					b=expr();
					state._fsp--;
					if (state.failed) return r;
					match(input, Token.UP, null); if (state.failed) return r;

					if ( state.backtracking==0 ) {  a &= b;	r = a;}
					}
					break;
				case 9 :
					// CppTree.g:895:7: ^(o= BITWISEXOREQUAL a= expr b= expr )
					{
					o=(CommonTree)match(input,BITWISEXOREQUAL,FOLLOW_BITWISEXOREQUAL_in_assignmentExpression1820); if (state.failed) return r;
					match(input, Token.DOWN, null); if (state.failed) return r;
					pushFollow(FOLLOW_expr_in_assignmentExpression1826);
					a=expr();
					state._fsp--;
					if (state.failed) return r;
					pushFollow(FOLLOW_expr_in_assignmentExpression1830);
					b=expr();
					state._fsp--;
					if (state.failed) return r;
					match(input, Token.UP, null); if (state.failed) return r;

					if ( state.backtracking==0 ) {  a ^= b;	r = a;}
					}
					break;
				case 10 :
					// CppTree.g:896:7: ^(o= BITWISEOREQUAL a= expr b= expr )
					{
					o=(CommonTree)match(input,BITWISEOREQUAL,FOLLOW_BITWISEOREQUAL_in_assignmentExpression1844); if (state.failed) return r;
					match(input, Token.DOWN, null); if (state.failed) return r;
					pushFollow(FOLLOW_expr_in_assignmentExpression1851);
					a=expr();
					state._fsp--;
					if (state.failed) return r;
					pushFollow(FOLLOW_expr_in_assignmentExpression1855);
					b=expr();
					state._fsp--;
					if (state.failed) return r;
					match(input, Token.UP, null); if (state.failed) return r;

					if ( state.backtracking==0 ) {  a |= b;	r = a;}
					}
					break;
				case 11 :
					// CppTree.g:897:7: ^(o= MODEQUAL a= expr b= expr )
					{
					o=(CommonTree)match(input,MODEQUAL,FOLLOW_MODEQUAL_in_assignmentExpression1869); if (state.failed) return r;
					match(input, Token.DOWN, null); if (state.failed) return r;
					pushFollow(FOLLOW_expr_in_assignmentExpression1882);
					a=expr();
					state._fsp--;
					if (state.failed) return r;
					pushFollow(FOLLOW_expr_in_assignmentExpression1886);
					b=expr();
					state._fsp--;
					if (state.failed) return r;
					match(input, Token.UP, null); if (state.failed) return r;

					if ( state.backtracking==0 ) {  a =Mod(a,b);	r = a;}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return r;
	}
	// $ANTLR end "assignmentExpression"



	// $ANTLR start "conditionalExpression"
	// CppTree.g:900:1: conditionalExpression returns [int r] : ^( QUESTIONMARK a= expr b= expr COLON c= expr ) ;
	public final int conditionalExpression() throws RecognitionException {
		int r = 0;


		int a =0;
		int b =0;
		int c =0;

		r = 0;
		try {
			// CppTree.g:902:3: ( ^( QUESTIONMARK a= expr b= expr COLON c= expr ) )
			// CppTree.g:902:5: ^( QUESTIONMARK a= expr b= expr COLON c= expr )
			{
			match(input,QUESTIONMARK,FOLLOW_QUESTIONMARK_in_conditionalExpression1913); if (state.failed) return r;
			match(input, Token.DOWN, null); if (state.failed) return r;
			pushFollow(FOLLOW_expr_in_conditionalExpression1917);
			a=expr();
			state._fsp--;
			if (state.failed) return r;
			pushFollow(FOLLOW_expr_in_conditionalExpression1921);
			b=expr();
			state._fsp--;
			if (state.failed) return r;
			match(input,COLON,FOLLOW_COLON_in_conditionalExpression1923); if (state.failed) return r;
			pushFollow(FOLLOW_expr_in_conditionalExpression1927);
			c=expr();
			state._fsp--;
			if (state.failed) return r;
			match(input, Token.UP, null); if (state.failed) return r;

			if ( state.backtracking==0 ) { r = ((a!=0) ?	b:c); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return r;
	}
	// $ANTLR end "conditionalExpression"



	// $ANTLR start "logicalOrExpression"
	// CppTree.g:905:1: logicalOrExpression returns [int r] : ^(o= OR a= expr b= expr ) ;
	public final int logicalOrExpression() throws RecognitionException {
		int r = 0;


		CommonTree o=null;
		int a =0;
		int b =0;

		r = 0;
		try {
			// CppTree.g:907:3: ( ^(o= OR a= expr b= expr ) )
			// CppTree.g:907:5: ^(o= OR a= expr b= expr )
			{
			o=(CommonTree)match(input,OR,FOLLOW_OR_in_logicalOrExpression1958); if (state.failed) return r;
			match(input, Token.DOWN, null); if (state.failed) return r;
			pushFollow(FOLLOW_expr_in_logicalOrExpression1962);
			a=expr();
			state._fsp--;
			if (state.failed) return r;
			pushFollow(FOLLOW_expr_in_logicalOrExpression1966);
			b=expr();
			state._fsp--;
			if (state.failed) return r;
			match(input, Token.UP, null); if (state.failed) return r;

			if ( state.backtracking==0 ) { r = ((a!=0||b!=0)	? 1:0); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return r;
	}
	// $ANTLR end "logicalOrExpression"



	// $ANTLR start "logicalAndExpression"
	// CppTree.g:910:1: logicalAndExpression returns [int r] : ^(o= AND a= expr b= expr ) ;
	public final int logicalAndExpression() throws RecognitionException {
		int r = 0;


		CommonTree o=null;
		int a =0;
		int b =0;

		r = 0;
		try {
			// CppTree.g:912:3: ( ^(o= AND a= expr b= expr ) )
			// CppTree.g:912:5: ^(o= AND a= expr b= expr )
			{
			o=(CommonTree)match(input,AND,FOLLOW_AND_in_logicalAndExpression1999); if (state.failed) return r;
			match(input, Token.DOWN, null); if (state.failed) return r;
			pushFollow(FOLLOW_expr_in_logicalAndExpression2003);
			a=expr();
			state._fsp--;
			if (state.failed) return r;
			pushFollow(FOLLOW_expr_in_logicalAndExpression2007);
			b=expr();
			state._fsp--;
			if (state.failed) return r;
			match(input, Token.UP, null); if (state.failed) return r;

			if ( state.backtracking==0 ) { r = (((a!=0)&&(b!=0))	? 1:0); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return r;
	}
	// $ANTLR end "logicalAndExpression"



	// $ANTLR start "inclusiveOrExpression"
	// CppTree.g:915:1: inclusiveOrExpression returns [int r] : ^(o= BITWISEOR a= expr b= expr ) ;
	public final int inclusiveOrExpression() throws RecognitionException {
		int r = 0;


		CommonTree o=null;
		int a =0;
		int b =0;

		r = 0;
		try {
			// CppTree.g:917:3: ( ^(o= BITWISEOR a= expr b= expr ) )
			// CppTree.g:917:5: ^(o= BITWISEOR a= expr b= expr )
			{
			o=(CommonTree)match(input,BITWISEOR,FOLLOW_BITWISEOR_in_inclusiveOrExpression2037); if (state.failed) return r;
			match(input, Token.DOWN, null); if (state.failed) return r;
			pushFollow(FOLLOW_expr_in_inclusiveOrExpression2041);
			a=expr();
			state._fsp--;
			if (state.failed) return r;
			pushFollow(FOLLOW_expr_in_inclusiveOrExpression2045);
			b=expr();
			state._fsp--;
			if (state.failed) return r;
			match(input, Token.UP, null); if (state.failed) return r;

			if ( state.backtracking==0 ) { r = a|b; }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return r;
	}
	// $ANTLR end "inclusiveOrExpression"



	// $ANTLR start "exclusiveOrExpression"
	// CppTree.g:920:1: exclusiveOrExpression returns [int r] : ^(o= BITWISERXOR a= expr b= expr ) ;
	public final int exclusiveOrExpression() throws RecognitionException {
		int r = 0;


		CommonTree o=null;
		int a =0;
		int b =0;

		r = 0;
		try {
			// CppTree.g:922:3: ( ^(o= BITWISERXOR a= expr b= expr ) )
			// CppTree.g:922:5: ^(o= BITWISERXOR a= expr b= expr )
			{
			o=(CommonTree)match(input,BITWISERXOR,FOLLOW_BITWISERXOR_in_exclusiveOrExpression2076); if (state.failed) return r;
			match(input, Token.DOWN, null); if (state.failed) return r;
			pushFollow(FOLLOW_expr_in_exclusiveOrExpression2080);
			a=expr();
			state._fsp--;
			if (state.failed) return r;
			pushFollow(FOLLOW_expr_in_exclusiveOrExpression2084);
			b=expr();
			state._fsp--;
			if (state.failed) return r;
			match(input, Token.UP, null); if (state.failed) return r;

			if ( state.backtracking==0 ) { r = a^b; }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return r;
	}
	// $ANTLR end "exclusiveOrExpression"



	// $ANTLR start "andExpression"
	// CppTree.g:925:1: andExpression returns [int r] : ^(o= AMPERSAND a= expr b= expr ) ;
	public final int andExpression() throws RecognitionException {
		int r = 0;


		CommonTree o=null;
		int a =0;
		int b =0;

		r = 0;
		try {
			// CppTree.g:927:3: ( ^(o= AMPERSAND a= expr b= expr ) )
			// CppTree.g:927:5: ^(o= AMPERSAND a= expr b= expr )
			{
			o=(CommonTree)match(input,AMPERSAND,FOLLOW_AMPERSAND_in_andExpression2114); if (state.failed) return r;
			match(input, Token.DOWN, null); if (state.failed) return r;
			pushFollow(FOLLOW_expr_in_andExpression2118);
			a=expr();
			state._fsp--;
			if (state.failed) return r;
			pushFollow(FOLLOW_expr_in_andExpression2122);
			b=expr();
			state._fsp--;
			if (state.failed) return r;
			match(input, Token.UP, null); if (state.failed) return r;

			if ( state.backtracking==0 ) { r = a&b; }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return r;
	}
	// $ANTLR end "andExpression"



	// $ANTLR start "equalityExpression"
	// CppTree.g:930:1: equalityExpression returns [int r] : ( ^(o= NOTEQUAL a= expr b= expr ) | ^(o= EQUAL a= expr b= expr ) );
	public final int equalityExpression() throws RecognitionException {
		int r = 0;


		CommonTree o=null;
		int a =0;
		int b =0;

		r = 0;
		try {
			// CppTree.g:932:3: ( ^(o= NOTEQUAL a= expr b= expr ) | ^(o= EQUAL a= expr b= expr ) )
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==NOTEQUAL) ) {
				alt26=1;
			}
			else if ( (LA26_0==EQUAL) ) {
				alt26=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return r;}
				NoViableAltException nvae =
					new NoViableAltException("", 26, 0, input);
				throw nvae;
			}

			switch (alt26) {
				case 1 :
					// CppTree.g:932:5: ^(o= NOTEQUAL a= expr b= expr )
					{
					o=(CommonTree)match(input,NOTEQUAL,FOLLOW_NOTEQUAL_in_equalityExpression2151); if (state.failed) return r;
					match(input, Token.DOWN, null); if (state.failed) return r;
					pushFollow(FOLLOW_expr_in_equalityExpression2155);
					a=expr();
					state._fsp--;
					if (state.failed) return r;
					pushFollow(FOLLOW_expr_in_equalityExpression2159);
					b=expr();
					state._fsp--;
					if (state.failed) return r;
					match(input, Token.UP, null); if (state.failed) return r;

					if ( state.backtracking==0 ) { r = ((a !=  b) ?	1:0); }
					}
					break;
				case 2 :
					// CppTree.g:933:5: ^(o= EQUAL a= expr b= expr )
					{
					o=(CommonTree)match(input,EQUAL,FOLLOW_EQUAL_in_equalityExpression2173); if (state.failed) return r;
					match(input, Token.DOWN, null); if (state.failed) return r;
					pushFollow(FOLLOW_expr_in_equalityExpression2179);
					a=expr();
					state._fsp--;
					if (state.failed) return r;
					pushFollow(FOLLOW_expr_in_equalityExpression2183);
					b=expr();
					state._fsp--;
					if (state.failed) return r;
					match(input, Token.UP, null); if (state.failed) return r;

					if ( state.backtracking==0 ) { r = ((a ==  b) ?	1:0); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return r;
	}
	// $ANTLR end "equalityExpression"



	// $ANTLR start "relationalExpression"
	// CppTree.g:936:1: relationalExpression returns [int r] : ( ^(o= LESSTHAN a= expr b= expr ) | ^(o= GREATERTHAN a= expr b= expr ) | ^(o= LESSTHANOREQUALTO a= expr b= expr ) | ^(o= GREATERTHANOREQUALTO a= expr b= expr ) );
	public final int relationalExpression() throws RecognitionException {
		int r = 0;


		CommonTree o=null;
		int a =0;
		int b =0;

		r = 0;
		try {
			// CppTree.g:938:3: ( ^(o= LESSTHAN a= expr b= expr ) | ^(o= GREATERTHAN a= expr b= expr ) | ^(o= LESSTHANOREQUALTO a= expr b= expr ) | ^(o= GREATERTHANOREQUALTO a= expr b= expr ) )
			int alt27=4;
			switch ( input.LA(1) ) {
			case LESSTHAN:
				{
				alt27=1;
				}
				break;
			case GREATERTHAN:
				{
				alt27=2;
				}
				break;
			case LESSTHANOREQUALTO:
				{
				alt27=3;
				}
				break;
			case GREATERTHANOREQUALTO:
				{
				alt27=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return r;}
				NoViableAltException nvae =
					new NoViableAltException("", 27, 0, input);
				throw nvae;
			}
			switch (alt27) {
				case 1 :
					// CppTree.g:938:5: ^(o= LESSTHAN a= expr b= expr )
					{
					o=(CommonTree)match(input,LESSTHAN,FOLLOW_LESSTHAN_in_relationalExpression2213); if (state.failed) return r;
					match(input, Token.DOWN, null); if (state.failed) return r;
					pushFollow(FOLLOW_expr_in_relationalExpression2221);
					a=expr();
					state._fsp--;
					if (state.failed) return r;
					pushFollow(FOLLOW_expr_in_relationalExpression2225);
					b=expr();
					state._fsp--;
					if (state.failed) return r;
					match(input, Token.UP, null); if (state.failed) return r;

					if ( state.backtracking==0 ) { r = ((a <  b) ? 1:0); }
					}
					break;
				case 2 :
					// CppTree.g:939:13: ^(o= GREATERTHAN a= expr b= expr )
					{
					o=(CommonTree)match(input,GREATERTHAN,FOLLOW_GREATERTHAN_in_relationalExpression2247); if (state.failed) return r;
					match(input, Token.DOWN, null); if (state.failed) return r;
					pushFollow(FOLLOW_expr_in_relationalExpression2255);
					a=expr();
					state._fsp--;
					if (state.failed) return r;
					pushFollow(FOLLOW_expr_in_relationalExpression2259);
					b=expr();
					state._fsp--;
					if (state.failed) return r;
					match(input, Token.UP, null); if (state.failed) return r;

					if ( state.backtracking==0 ) { r = ((a >  b) ? 1:0); }
					}
					break;
				case 3 :
					// CppTree.g:940:13: ^(o= LESSTHANOREQUALTO a= expr b= expr )
					{
					o=(CommonTree)match(input,LESSTHANOREQUALTO,FOLLOW_LESSTHANOREQUALTO_in_relationalExpression2281); if (state.failed) return r;
					match(input, Token.DOWN, null); if (state.failed) return r;
					pushFollow(FOLLOW_expr_in_relationalExpression2287);
					a=expr();
					state._fsp--;
					if (state.failed) return r;
					pushFollow(FOLLOW_expr_in_relationalExpression2291);
					b=expr();
					state._fsp--;
					if (state.failed) return r;
					match(input, Token.UP, null); if (state.failed) return r;

					if ( state.backtracking==0 ) { r = ((a <= b) ? 1:0); }
					}
					break;
				case 4 :
					// CppTree.g:941:13: ^(o= GREATERTHANOREQUALTO a= expr b= expr )
					{
					o=(CommonTree)match(input,GREATERTHANOREQUALTO,FOLLOW_GREATERTHANOREQUALTO_in_relationalExpression2313); if (state.failed) return r;
					match(input, Token.DOWN, null); if (state.failed) return r;
					pushFollow(FOLLOW_expr_in_relationalExpression2317);
					a=expr();
					state._fsp--;
					if (state.failed) return r;
					pushFollow(FOLLOW_expr_in_relationalExpression2321);
					b=expr();
					state._fsp--;
					if (state.failed) return r;
					match(input, Token.UP, null); if (state.failed) return r;

					if ( state.backtracking==0 ) { r = ((a >= b) ? 1:0); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return r;
	}
	// $ANTLR end "relationalExpression"



	// $ANTLR start "shiftExpression"
	// CppTree.g:944:1: shiftExpression returns [int r] : ( ^(o= SHIFTLEFT a= expr b= expr ) | ^(o= SHIFTRIGHT a= expr b= expr ) );
	public final int shiftExpression() throws RecognitionException {
		int r = 0;


		CommonTree o=null;
		int a =0;
		int b =0;

		r = 0;
		try {
			// CppTree.g:946:3: ( ^(o= SHIFTLEFT a= expr b= expr ) | ^(o= SHIFTRIGHT a= expr b= expr ) )
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==SHIFTLEFT) ) {
				alt28=1;
			}
			else if ( (LA28_0==SHIFTRIGHT) ) {
				alt28=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return r;}
				NoViableAltException nvae =
					new NoViableAltException("", 28, 0, input);
				throw nvae;
			}

			switch (alt28) {
				case 1 :
					// CppTree.g:946:5: ^(o= SHIFTLEFT a= expr b= expr )
					{
					o=(CommonTree)match(input,SHIFTLEFT,FOLLOW_SHIFTLEFT_in_shiftExpression2355); if (state.failed) return r;
					match(input, Token.DOWN, null); if (state.failed) return r;
					pushFollow(FOLLOW_expr_in_shiftExpression2361);
					a=expr();
					state._fsp--;
					if (state.failed) return r;
					pushFollow(FOLLOW_expr_in_shiftExpression2365);
					b=expr();
					state._fsp--;
					if (state.failed) return r;
					match(input, Token.UP, null); if (state.failed) return r;

					if ( state.backtracking==0 ) { r = a<<b; }
					}
					break;
				case 2 :
					// CppTree.g:947:7: ^(o= SHIFTRIGHT a= expr b= expr )
					{
					o=(CommonTree)match(input,SHIFTRIGHT,FOLLOW_SHIFTRIGHT_in_shiftExpression2381); if (state.failed) return r;
					match(input, Token.DOWN, null); if (state.failed) return r;
					pushFollow(FOLLOW_expr_in_shiftExpression2386);
					a=expr();
					state._fsp--;
					if (state.failed) return r;
					pushFollow(FOLLOW_expr_in_shiftExpression2390);
					b=expr();
					state._fsp--;
					if (state.failed) return r;
					match(input, Token.UP, null); if (state.failed) return r;

					if ( state.backtracking==0 ) { r = a>>b; }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return r;
	}
	// $ANTLR end "shiftExpression"



	// $ANTLR start "additiveExpression"
	// CppTree.g:950:1: additiveExpression returns [int r] : ( ^(o= PLUS a= expr b= expr ) | ^(o= MINUS a= expr b= expr ) );
	public final int additiveExpression() throws RecognitionException {
		int r = 0;


		CommonTree o=null;
		int a =0;
		int b =0;

		r = 0;
		try {
			// CppTree.g:952:3: ( ^(o= PLUS a= expr b= expr ) | ^(o= MINUS a= expr b= expr ) )
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==PLUS) ) {
				alt29=1;
			}
			else if ( (LA29_0==MINUS) ) {
				alt29=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return r;}
				NoViableAltException nvae =
					new NoViableAltException("", 29, 0, input);
				throw nvae;
			}

			switch (alt29) {
				case 1 :
					// CppTree.g:952:5: ^(o= PLUS a= expr b= expr )
					{
					o=(CommonTree)match(input,PLUS,FOLLOW_PLUS_in_additiveExpression2423); if (state.failed) return r;
					match(input, Token.DOWN, null); if (state.failed) return r;
					pushFollow(FOLLOW_expr_in_additiveExpression2427);
					a=expr();
					state._fsp--;
					if (state.failed) return r;
					pushFollow(FOLLOW_expr_in_additiveExpression2431);
					b=expr();
					state._fsp--;
					if (state.failed) return r;
					match(input, Token.UP, null); if (state.failed) return r;

					if ( state.backtracking==0 ) { r = a+b; }
					}
					break;
				case 2 :
					// CppTree.g:953:10: ^(o= MINUS a= expr b= expr )
					{
					o=(CommonTree)match(input,MINUS,FOLLOW_MINUS_in_additiveExpression2450); if (state.failed) return r;
					match(input, Token.DOWN, null); if (state.failed) return r;
					pushFollow(FOLLOW_expr_in_additiveExpression2455);
					a=expr();
					state._fsp--;
					if (state.failed) return r;
					pushFollow(FOLLOW_expr_in_additiveExpression2459);
					b=expr();
					state._fsp--;
					if (state.failed) return r;
					match(input, Token.UP, null); if (state.failed) return r;

					if ( state.backtracking==0 ) { r = a-b; }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return r;
	}
	// $ANTLR end "additiveExpression"



	// $ANTLR start "multiplicativeExpression"
	// CppTree.g:956:1: multiplicativeExpression returns [int r] : ( ^(o= STAR a= expr b= expr ) | ^(o= DIVIDE a= expr b= expr ) | ^(o= MOD a= expr b= expr ) );
	public final int multiplicativeExpression() throws RecognitionException {
		int r = 0;


		CommonTree o=null;
		int a =0;
		int b =0;

		r = 0;
		try {
			// CppTree.g:958:3: ( ^(o= STAR a= expr b= expr ) | ^(o= DIVIDE a= expr b= expr ) | ^(o= MOD a= expr b= expr ) )
			int alt30=3;
			switch ( input.LA(1) ) {
			case STAR:
				{
				alt30=1;
				}
				break;
			case DIVIDE:
				{
				alt30=2;
				}
				break;
			case MOD:
				{
				alt30=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return r;}
				NoViableAltException nvae =
					new NoViableAltException("", 30, 0, input);
				throw nvae;
			}
			switch (alt30) {
				case 1 :
					// CppTree.g:958:5: ^(o= STAR a= expr b= expr )
					{
					o=(CommonTree)match(input,STAR,FOLLOW_STAR_in_multiplicativeExpression2491); if (state.failed) return r;
					match(input, Token.DOWN, null); if (state.failed) return r;
					pushFollow(FOLLOW_expr_in_multiplicativeExpression2496);
					a=expr();
					state._fsp--;
					if (state.failed) return r;
					pushFollow(FOLLOW_expr_in_multiplicativeExpression2500);
					b=expr();
					state._fsp--;
					if (state.failed) return r;
					match(input, Token.UP, null); if (state.failed) return r;

					if ( state.backtracking==0 ) {  r = a*b; }
					}
					break;
				case 2 :
					// CppTree.g:959:10: ^(o= DIVIDE a= expr b= expr )
					{
					o=(CommonTree)match(input,DIVIDE,FOLLOW_DIVIDE_in_multiplicativeExpression2517); if (state.failed) return r;
					match(input, Token.DOWN, null); if (state.failed) return r;
					pushFollow(FOLLOW_expr_in_multiplicativeExpression2523);
					a=expr();
					state._fsp--;
					if (state.failed) return r;
					pushFollow(FOLLOW_expr_in_multiplicativeExpression2527);
					b=expr();
					state._fsp--;
					if (state.failed) return r;
					match(input, Token.UP, null); if (state.failed) return r;

					if ( state.backtracking==0 ) {  r = a/b; }
					}
					break;
				case 3 :
					// CppTree.g:960:7: ^(o= MOD a= expr b= expr )
					{
					o=(CommonTree)match(input,MOD,FOLLOW_MOD_in_multiplicativeExpression2541); if (state.failed) return r;
					match(input, Token.DOWN, null); if (state.failed) return r;
					pushFollow(FOLLOW_expr_in_multiplicativeExpression2547);
					a=expr();
					state._fsp--;
					if (state.failed) return r;
					pushFollow(FOLLOW_expr_in_multiplicativeExpression2551);
					b=expr();
					state._fsp--;
					if (state.failed) return r;
					match(input, Token.UP, null); if (state.failed) return r;

					if ( state.backtracking==0 ) {  r = Mod(a,b); }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return r;
	}
	// $ANTLR end "multiplicativeExpression"



	// $ANTLR start "unaryExpression"
	// CppTree.g:963:1: unaryExpression returns [int r] : ( ^(o= PLUSPLUS a= expr ) | ^(o= MINUSMINUS a= expr ) | ^(o= REFERANCE a= expr ) | ^(o= POINTER_AT a= expr ) | ^(o= UNARY_MINUS a= expr ) | ^(o= UNARY_PLUS a= expr ) | ^( SIZEOF a= expr ) | ^( SIZEOF_TYPE b= IDENTIFIER ) | ^(o= NOT a= expr ) | ^(o= TILDE a= expr ) | ^(o= TYPECAST b= IDENTIFIER a= expr ) | ^( DEFINED b= IDENTIFIER ) );
	public final int unaryExpression() throws RecognitionException {
		int r = 0;


		CommonTree o=null;
		CommonTree b=null;
		int a =0;

		r = 0; 
		try {
			// CppTree.g:965:3: ( ^(o= PLUSPLUS a= expr ) | ^(o= MINUSMINUS a= expr ) | ^(o= REFERANCE a= expr ) | ^(o= POINTER_AT a= expr ) | ^(o= UNARY_MINUS a= expr ) | ^(o= UNARY_PLUS a= expr ) | ^( SIZEOF a= expr ) | ^( SIZEOF_TYPE b= IDENTIFIER ) | ^(o= NOT a= expr ) | ^(o= TILDE a= expr ) | ^(o= TYPECAST b= IDENTIFIER a= expr ) | ^( DEFINED b= IDENTIFIER ) )
			int alt31=12;
			switch ( input.LA(1) ) {
			case PLUSPLUS:
				{
				alt31=1;
				}
				break;
			case MINUSMINUS:
				{
				alt31=2;
				}
				break;
			case REFERANCE:
				{
				alt31=3;
				}
				break;
			case POINTER_AT:
				{
				alt31=4;
				}
				break;
			case UNARY_MINUS:
				{
				alt31=5;
				}
				break;
			case UNARY_PLUS:
				{
				alt31=6;
				}
				break;
			case SIZEOF:
				{
				alt31=7;
				}
				break;
			case SIZEOF_TYPE:
				{
				alt31=8;
				}
				break;
			case NOT:
				{
				alt31=9;
				}
				break;
			case TILDE:
				{
				alt31=10;
				}
				break;
			case TYPECAST:
				{
				alt31=11;
				}
				break;
			case DEFINED:
				{
				alt31=12;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return r;}
				NoViableAltException nvae =
					new NoViableAltException("", 31, 0, input);
				throw nvae;
			}
			switch (alt31) {
				case 1 :
					// CppTree.g:965:5: ^(o= PLUSPLUS a= expr )
					{
					o=(CommonTree)match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_unaryExpression2579); if (state.failed) return r;
					match(input, Token.DOWN, null); if (state.failed) return r;
					pushFollow(FOLLOW_expr_in_unaryExpression2584);
					a=expr();
					state._fsp--;
					if (state.failed) return r;
					match(input, Token.UP, null); if (state.failed) return r;

					if ( state.backtracking==0 ) { r = ++a; }
					}
					break;
				case 2 :
					// CppTree.g:966:5: ^(o= MINUSMINUS a= expr )
					{
					o=(CommonTree)match(input,MINUSMINUS,FOLLOW_MINUSMINUS_in_unaryExpression2598); if (state.failed) return r;
					match(input, Token.DOWN, null); if (state.failed) return r;
					pushFollow(FOLLOW_expr_in_unaryExpression2603);
					a=expr();
					state._fsp--;
					if (state.failed) return r;
					match(input, Token.UP, null); if (state.failed) return r;

					if ( state.backtracking==0 ) { r = --a; }
					}
					break;
				case 3 :
					// CppTree.g:967:5: ^(o= REFERANCE a= expr )
					{
					o=(CommonTree)match(input,REFERANCE,FOLLOW_REFERANCE_in_unaryExpression2617); if (state.failed) return r;
					match(input, Token.DOWN, null); if (state.failed) return r;
					pushFollow(FOLLOW_expr_in_unaryExpression2621);
					a=expr();
					state._fsp--;
					if (state.failed) return r;
					match(input, Token.UP, null); if (state.failed) return r;

					if ( state.backtracking==0 ) { r =1;	   }
					}
					break;
				case 4 :
					// CppTree.g:968:5: ^(o= POINTER_AT a= expr )
					{
					o=(CommonTree)match(input,POINTER_AT,FOLLOW_POINTER_AT_in_unaryExpression2635); if (state.failed) return r;
					match(input, Token.DOWN, null); if (state.failed) return r;
					pushFollow(FOLLOW_expr_in_unaryExpression2639);
					a=expr();
					state._fsp--;
					if (state.failed) return r;
					match(input, Token.UP, null); if (state.failed) return r;

					if ( state.backtracking==0 ) { r =1;    }
					}
					break;
				case 5 :
					// CppTree.g:969:5: ^(o= UNARY_MINUS a= expr )
					{
					o=(CommonTree)match(input,UNARY_MINUS,FOLLOW_UNARY_MINUS_in_unaryExpression2653); if (state.failed) return r;
					match(input, Token.DOWN, null); if (state.failed) return r;
					pushFollow(FOLLOW_expr_in_unaryExpression2657);
					a=expr();
					state._fsp--;
					if (state.failed) return r;
					match(input, Token.UP, null); if (state.failed) return r;

					if ( state.backtracking==0 ) { r = +a;  }
					}
					break;
				case 6 :
					// CppTree.g:970:5: ^(o= UNARY_PLUS a= expr )
					{
					o=(CommonTree)match(input,UNARY_PLUS,FOLLOW_UNARY_PLUS_in_unaryExpression2671); if (state.failed) return r;
					match(input, Token.DOWN, null); if (state.failed) return r;
					pushFollow(FOLLOW_expr_in_unaryExpression2676);
					a=expr();
					state._fsp--;
					if (state.failed) return r;
					match(input, Token.UP, null); if (state.failed) return r;

					if ( state.backtracking==0 ) { r = -a;  }
					}
					break;
				case 7 :
					// CppTree.g:971:5: ^( SIZEOF a= expr )
					{
					match(input,SIZEOF,FOLLOW_SIZEOF_in_unaryExpression2688); if (state.failed) return r;
					match(input, Token.DOWN, null); if (state.failed) return r;
					pushFollow(FOLLOW_expr_in_unaryExpression2694);
					a=expr();
					state._fsp--;
					if (state.failed) return r;
					match(input, Token.UP, null); if (state.failed) return r;

					if ( state.backtracking==0 ) { r = 1;   }
					}
					break;
				case 8 :
					// CppTree.g:972:5: ^( SIZEOF_TYPE b= IDENTIFIER )
					{
					match(input,SIZEOF_TYPE,FOLLOW_SIZEOF_TYPE_in_unaryExpression2706); if (state.failed) return r;
					match(input, Token.DOWN, null); if (state.failed) return r;
					b=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_unaryExpression2710); if (state.failed) return r;
					match(input, Token.UP, null); if (state.failed) return r;

					if ( state.backtracking==0 ) { r = 1;   }
					}
					break;
				case 9 :
					// CppTree.g:973:5: ^(o= NOT a= expr )
					{
					o=(CommonTree)match(input,NOT,FOLLOW_NOT_in_unaryExpression2722); if (state.failed) return r;
					match(input, Token.DOWN, null); if (state.failed) return r;
					pushFollow(FOLLOW_expr_in_unaryExpression2728);
					a=expr();
					state._fsp--;
					if (state.failed) return r;
					match(input, Token.UP, null); if (state.failed) return r;

					if ( state.backtracking==0 ) { r = ((a!=0) ?	0:1); }
					}
					break;
				case 10 :
					// CppTree.g:974:5: ^(o= TILDE a= expr )
					{
					o=(CommonTree)match(input,TILDE,FOLLOW_TILDE_in_unaryExpression2742); if (state.failed) return r;
					match(input, Token.DOWN, null); if (state.failed) return r;
					pushFollow(FOLLOW_expr_in_unaryExpression2747);
					a=expr();
					state._fsp--;
					if (state.failed) return r;
					match(input, Token.UP, null); if (state.failed) return r;

					if ( state.backtracking==0 ) { r = ((a!=0) ?	0:1); }
					}
					break;
				case 11 :
					// CppTree.g:975:5: ^(o= TYPECAST b= IDENTIFIER a= expr )
					{
					o=(CommonTree)match(input,TYPECAST,FOLLOW_TYPECAST_in_unaryExpression2761); if (state.failed) return r;
					match(input, Token.DOWN, null); if (state.failed) return r;
					b=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_unaryExpression2766); if (state.failed) return r;
					pushFollow(FOLLOW_expr_in_unaryExpression2770);
					a=expr();
					state._fsp--;
					if (state.failed) return r;
					match(input, Token.UP, null); if (state.failed) return r;

					if ( state.backtracking==0 ) { r = 1; }
					}
					break;
				case 12 :
					// CppTree.g:976:5: ^( DEFINED b= IDENTIFIER )
					{
					match(input,DEFINED,FOLLOW_DEFINED_in_unaryExpression2781); if (state.failed) return r;
					match(input, Token.DOWN, null); if (state.failed) return r;
					b=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_unaryExpression2787); if (state.failed) return r;
					match(input, Token.UP, null); if (state.failed) return r;

					if ( state.backtracking==0 ) { r = isMacroDefined(b.toString()) ? 1: 0 ; }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return r;
	}
	// $ANTLR end "unaryExpression"



	// $ANTLR start "postfixExpression"
	// CppTree.g:979:1: postfixExpression returns [int r] : ( ^( POST_INC a= expr ) | ^( POST_DEC a= expr ) | ^( POINTERTO a= expr i= IDENTIFIER ) | ^( POINTER a= expr i= IDENTIFIER ) | ^( DOT a= expr i= IDENTIFIER ) | ^( INDEX_OP a= expr b= expr ) );
	public final int postfixExpression() throws RecognitionException {
		int r = 0;


		CommonTree i=null;
		int a =0;
		int b =0;

		r = 0;
		try {
			// CppTree.g:981:3: ( ^( POST_INC a= expr ) | ^( POST_DEC a= expr ) | ^( POINTERTO a= expr i= IDENTIFIER ) | ^( POINTER a= expr i= IDENTIFIER ) | ^( DOT a= expr i= IDENTIFIER ) | ^( INDEX_OP a= expr b= expr ) )
			int alt32=6;
			switch ( input.LA(1) ) {
			case POST_INC:
				{
				alt32=1;
				}
				break;
			case POST_DEC:
				{
				alt32=2;
				}
				break;
			case POINTERTO:
				{
				alt32=3;
				}
				break;
			case POINTER:
				{
				alt32=4;
				}
				break;
			case DOT:
				{
				alt32=5;
				}
				break;
			case INDEX_OP:
				{
				alt32=6;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return r;}
				NoViableAltException nvae =
					new NoViableAltException("", 32, 0, input);
				throw nvae;
			}
			switch (alt32) {
				case 1 :
					// CppTree.g:981:5: ^( POST_INC a= expr )
					{
					match(input,POST_INC,FOLLOW_POST_INC_in_postfixExpression2813); if (state.failed) return r;
					match(input, Token.DOWN, null); if (state.failed) return r;
					pushFollow(FOLLOW_expr_in_postfixExpression2818);
					a=expr();
					state._fsp--;
					if (state.failed) return r;
					match(input, Token.UP, null); if (state.failed) return r;

					if ( state.backtracking==0 ) {  r = a++; }
					}
					break;
				case 2 :
					// CppTree.g:982:10: ^( POST_DEC a= expr )
					{
					match(input,POST_DEC,FOLLOW_POST_DEC_in_postfixExpression2838); if (state.failed) return r;
					match(input, Token.DOWN, null); if (state.failed) return r;
					pushFollow(FOLLOW_expr_in_postfixExpression2842);
					a=expr();
					state._fsp--;
					if (state.failed) return r;
					match(input, Token.UP, null); if (state.failed) return r;

					if ( state.backtracking==0 ) {  r = a--; }
					}
					break;
				case 3 :
					// CppTree.g:983:5: ^( POINTERTO a= expr i= IDENTIFIER )
					{
					match(input,POINTERTO,FOLLOW_POINTERTO_in_postfixExpression2857); if (state.failed) return r;
					match(input, Token.DOWN, null); if (state.failed) return r;
					pushFollow(FOLLOW_expr_in_postfixExpression2861);
					a=expr();
					state._fsp--;
					if (state.failed) return r;
					i=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_postfixExpression2866); if (state.failed) return r;
					match(input, Token.UP, null); if (state.failed) return r;

					if ( state.backtracking==0 ) {  r = 1; 	}
					}
					break;
				case 4 :
					// CppTree.g:984:5: ^( POINTER a= expr i= IDENTIFIER )
					{
					match(input,POINTER,FOLLOW_POINTER_in_postfixExpression2878); if (state.failed) return r;
					match(input, Token.DOWN, null); if (state.failed) return r;
					pushFollow(FOLLOW_expr_in_postfixExpression2883);
					a=expr();
					state._fsp--;
					if (state.failed) return r;
					i=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_postfixExpression2888); if (state.failed) return r;
					match(input, Token.UP, null); if (state.failed) return r;

					if ( state.backtracking==0 ) {  r = 1; 	}
					}
					break;
				case 5 :
					// CppTree.g:985:5: ^( DOT a= expr i= IDENTIFIER )
					{
					match(input,DOT,FOLLOW_DOT_in_postfixExpression2900); if (state.failed) return r;
					match(input, Token.DOWN, null); if (state.failed) return r;
					pushFollow(FOLLOW_expr_in_postfixExpression2906);
					a=expr();
					state._fsp--;
					if (state.failed) return r;
					i=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_postfixExpression2911); if (state.failed) return r;
					match(input, Token.UP, null); if (state.failed) return r;

					if ( state.backtracking==0 ) {  r = 1; 	}
					}
					break;
				case 6 :
					// CppTree.g:986:5: ^( INDEX_OP a= expr b= expr )
					{
					match(input,INDEX_OP,FOLLOW_INDEX_OP_in_postfixExpression2924); if (state.failed) return r;
					match(input, Token.DOWN, null); if (state.failed) return r;
					pushFollow(FOLLOW_expr_in_postfixExpression2929);
					a=expr();
					state._fsp--;
					if (state.failed) return r;
					pushFollow(FOLLOW_expr_in_postfixExpression2934);
					b=expr();
					state._fsp--;
					if (state.failed) return r;
					match(input, Token.UP, null); if (state.failed) return r;

					if ( state.backtracking==0 ) {  r = 1; 	}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return r;
	}
	// $ANTLR end "postfixExpression"



	// $ANTLR start "primaryExpression"
	// CppTree.g:989:1: primaryExpression returns [int r] : (c= constant[true] | ^( EXPR_GROUP b= expr ) |id= IDENTIFIER | ^( METHOD_CALL id= IDENTIFIER ) | ^( METHOD_CALL id= IDENTIFIER lst= argList ) );
	public final int primaryExpression() throws RecognitionException {
		int r = 0;


		CommonTree id=null;
		ExpressionReturn c =null;
		int b =0;
		List lst =null;

		r = 0;
		try {
			// CppTree.g:991:3: (c= constant[true] | ^( EXPR_GROUP b= expr ) |id= IDENTIFIER | ^( METHOD_CALL id= IDENTIFIER ) | ^( METHOD_CALL id= IDENTIFIER lst= argList ) )
			int alt33=5;
			switch ( input.LA(1) ) {
			case CHARACTER_LITERAL:
			case DECIMAL_LITERAL:
			case FLOATING_POINT_LITERAL:
			case HEX_LITERAL:
			case OCTAL_LITERAL:
			case STRING_LITERAL:
				{
				alt33=1;
				}
				break;
			case EXPR_GROUP:
				{
				alt33=2;
				}
				break;
			case IDENTIFIER:
				{
				alt33=3;
				}
				break;
			case METHOD_CALL:
				{
				int LA33_4 = input.LA(2);
				if ( (LA33_4==DOWN) ) {
					int LA33_5 = input.LA(3);
					if ( (LA33_5==IDENTIFIER) ) {
						int LA33_6 = input.LA(4);
						if ( (LA33_6==UP) ) {
							alt33=4;
						}
						else if ( (LA33_6==ARGS) ) {
							alt33=5;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return r;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 33, 6, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						if (state.backtracking>0) {state.failed=true; return r;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 33, 5, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return r;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 33, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return r;}
				NoViableAltException nvae =
					new NoViableAltException("", 33, 0, input);
				throw nvae;
			}
			switch (alt33) {
				case 1 :
					// CppTree.g:991:5: c= constant[true]
					{
					pushFollow(FOLLOW_constant_in_primaryExpression2964);
					c=constant(true);
					state._fsp--;
					if (state.failed) return r;
					if ( state.backtracking==0 ) { r = c.value; }
					}
					break;
				case 2 :
					// CppTree.g:992:10: ^( EXPR_GROUP b= expr )
					{
					match(input,EXPR_GROUP,FOLLOW_EXPR_GROUP_in_primaryExpression2980); if (state.failed) return r;
					match(input, Token.DOWN, null); if (state.failed) return r;
					pushFollow(FOLLOW_expr_in_primaryExpression2984);
					b=expr();
					state._fsp--;
					if (state.failed) return r;
					match(input, Token.UP, null); if (state.failed) return r;

					if ( state.backtracking==0 ) { r = b; 	   }
					}
					break;
				case 3 :
					// CppTree.g:993:6: id= IDENTIFIER
					{
					id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_primaryExpression2997); if (state.failed) return r;
					if ( state.backtracking==0 ) {
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
					}
					break;
				case 4 :
					// CppTree.g:1016:6: ^( METHOD_CALL id= IDENTIFIER )
					{
					match(input,METHOD_CALL,FOLLOW_METHOD_CALL_in_primaryExpression3011); if (state.failed) return r;
					match(input, Token.DOWN, null); if (state.failed) return r;
					id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_primaryExpression3015); if (state.failed) return r;
					match(input, Token.UP, null); if (state.failed) return r;

					if ( state.backtracking==0 ) {
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
					}
					break;
				case 5 :
					// CppTree.g:1044:5: ^( METHOD_CALL id= IDENTIFIER lst= argList )
					{
					match(input,METHOD_CALL,FOLLOW_METHOD_CALL_in_primaryExpression3029); if (state.failed) return r;
					match(input, Token.DOWN, null); if (state.failed) return r;
					id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_primaryExpression3033); if (state.failed) return r;
					pushFollow(FOLLOW_argList_in_primaryExpression3037);
					lst=argList();
					state._fsp--;
					if (state.failed) return r;
					match(input, Token.UP, null); if (state.failed) return r;

					if ( state.backtracking==0 ) {
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
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return r;
	}
	// $ANTLR end "primaryExpression"



	// $ANTLR start "argList"
	// CppTree.g:1095:1: argList returns [List r] : ^( ARGS (a= expr )+ ) ;
	public final List argList() throws RecognitionException {
		List r = null;


		int a =0;

		 	
					r = new ArrayList();
				
		try {
			// CppTree.g:1099:3: ( ^( ARGS (a= expr )+ ) )
			// CppTree.g:1099:5: ^( ARGS (a= expr )+ )
			{
			match(input,ARGS,FOLLOW_ARGS_in_argList3067); if (state.failed) return r;
			match(input, Token.DOWN, null); if (state.failed) return r;
			// CppTree.g:1099:12: (a= expr )+
			int cnt34=0;
			loop34:
			while (true) {
				int alt34=2;
				int LA34_0 = input.LA(1);
				if ( ((LA34_0 >= AMPERSAND && LA34_0 <= AND)||LA34_0==ASSIGNEQUAL||(LA34_0 >= BITWISEANDEQUAL && LA34_0 <= BITWISEOREQUAL)||LA34_0==BITWISEXOREQUAL||LA34_0==CHARACTER_LITERAL||LA34_0==DECIMAL_LITERAL||LA34_0==DEFINED||(LA34_0 >= DIVIDE && LA34_0 <= DOT)||LA34_0==EQUAL||LA34_0==EXPR_GROUP||LA34_0==FLOATING_POINT_LITERAL||(LA34_0 >= GREATERTHAN && LA34_0 <= HEX_LITERAL)||LA34_0==IDENTIFIER||LA34_0==INDEX_OP||(LA34_0 >= LESSTHAN && LA34_0 <= LESSTHANOREQUALTO)||(LA34_0 >= METHOD_CALL && LA34_0 <= OR)||(LA34_0 >= PLUS && LA34_0 <= POINTERTO)||(LA34_0 >= POINTER_AT && LA34_0 <= POST_INC)||LA34_0==QUESTIONMARK||LA34_0==REFERANCE||(LA34_0 >= SHIFTLEFT && LA34_0 <= STAR)||LA34_0==STRING_LITERAL||(LA34_0 >= TILDE && LA34_0 <= UNARY_PLUS)||LA34_0==BITWISERXOR) ) {
					alt34=1;
				}

				switch (alt34) {
				case 1 :
					// CppTree.g:1099:13: a= expr
					{
					pushFollow(FOLLOW_expr_in_argList3072);
					a=expr();
					state._fsp--;
					if (state.failed) return r;
					if ( state.backtracking==0 ) { 
									ExpressionReturn arg = new ExpressionReturn();
									arg.value = a;
									r.add(arg); 
								}
					}
					break;

				default :
					if ( cnt34 >= 1 ) break loop34;
					if (state.backtracking>0) {state.failed=true; return r;}
					EarlyExitException eee = new EarlyExitException(34, input);
					throw eee;
				}
				cnt34++;
			}

			match(input, Token.UP, null); if (state.failed) return r;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return r;
	}
	// $ANTLR end "argList"



	// $ANTLR start "constant"
	// CppTree.g:1108:1: constant[boolean eval] returns [ExpressionReturn r] : (c= HEX_LITERAL |c= OCTAL_LITERAL |c= DECIMAL_LITERAL |c= FLOATING_POINT_LITERAL |c= CHARACTER_LITERAL |c= STRING_LITERAL );
	public final ExpressionReturn constant(boolean eval) throws RecognitionException {
		ExpressionReturn r = null;


		CommonTree c=null;

		r = new ExpressionReturn();
		try {
			// CppTree.g:1110:3: (c= HEX_LITERAL |c= OCTAL_LITERAL |c= DECIMAL_LITERAL |c= FLOATING_POINT_LITERAL |c= CHARACTER_LITERAL |c= STRING_LITERAL )
			int alt35=6;
			switch ( input.LA(1) ) {
			case HEX_LITERAL:
				{
				alt35=1;
				}
				break;
			case OCTAL_LITERAL:
				{
				alt35=2;
				}
				break;
			case DECIMAL_LITERAL:
				{
				alt35=3;
				}
				break;
			case FLOATING_POINT_LITERAL:
				{
				alt35=4;
				}
				break;
			case CHARACTER_LITERAL:
				{
				alt35=5;
				}
				break;
			case STRING_LITERAL:
				{
				alt35=6;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return r;}
				NoViableAltException nvae =
					new NoViableAltException("", 35, 0, input);
				throw nvae;
			}
			switch (alt35) {
				case 1 :
					// CppTree.g:1110:5: c= HEX_LITERAL
					{
					c=(CommonTree)match(input,HEX_LITERAL,FOLLOW_HEX_LITERAL_in_constant3110); if (state.failed) return r;
					if ( state.backtracking==0 ) { 
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
					}
					break;
				case 2 :
					// CppTree.g:1128:7: c= OCTAL_LITERAL
					{
					c=(CommonTree)match(input,OCTAL_LITERAL,FOLLOW_OCTAL_LITERAL_in_constant3128); if (state.failed) return r;
					if ( state.backtracking==0 ) {
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
					}
					break;
				case 3 :
					// CppTree.g:1146:7: c= DECIMAL_LITERAL
					{
					c=(CommonTree)match(input,DECIMAL_LITERAL,FOLLOW_DECIMAL_LITERAL_in_constant3144); if (state.failed) return r;
					if ( state.backtracking==0 ) { 	if(eval) 
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
					}
					break;
				case 4 :
					// CppTree.g:1164:7: c= FLOATING_POINT_LITERAL
					{
					c=(CommonTree)match(input,FLOATING_POINT_LITERAL,FOLLOW_FLOATING_POINT_LITERAL_in_constant3160); if (state.failed) return r;
					if ( state.backtracking==0 ) { 	if(eval) 
									{ 
										r.value = (new Float(c.toString())).intValue(); 
									} 
									else 
									{ r.text = c.toString(); } 
								}
					}
					break;
				case 5 :
					// CppTree.g:1172:5: c= CHARACTER_LITERAL
					{
					c=(CommonTree)match(input,CHARACTER_LITERAL,FOLLOW_CHARACTER_LITERAL_in_constant3174); if (state.failed) return r;
					if ( state.backtracking==0 ) { 
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
					}
					break;
				case 6 :
					// CppTree.g:1186:7: c= STRING_LITERAL
					{
					c=(CommonTree)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_constant3190); if (state.failed) return r;
					if ( state.backtracking==0 ) { 
									if(eval) r.value	= (new Integer(c.toString())).intValue(); 
									else  	 r.text		=  c.toString();
								}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return r;
	}
	// $ANTLR end "constant"

	// $ANTLR start synpred10_CppTree
	public final void synpred10_CppTree_fragment() throws RecognitionException {
		CommonTree str=null;

		// CppTree.g:288:5: ( ^( INCLUDE str= STRING_LITERAL ) )
		// CppTree.g:288:5: ^( INCLUDE str= STRING_LITERAL )
		{
		match(input,INCLUDE,FOLLOW_INCLUDE_in_synpred10_CppTree221); if (state.failed) return;
		match(input, Token.DOWN, null); if (state.failed) return;
		str=(CommonTree)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_synpred10_CppTree225); if (state.failed) return;
		match(input, Token.UP, null); if (state.failed) return;

		}

	}
	// $ANTLR end synpred10_CppTree

	// $ANTLR start synpred11_CppTree
	public final void synpred11_CppTree_fragment() throws RecognitionException {
		CommonTree lib=null;

		// CppTree.g:289:5: ( ^( INCLUDE lib= LIB_FILE ) )
		// CppTree.g:289:5: ^( INCLUDE lib= LIB_FILE )
		{
		match(input,INCLUDE,FOLLOW_INCLUDE_in_synpred11_CppTree237); if (state.failed) return;
		match(input, Token.DOWN, null); if (state.failed) return;
		lib=(CommonTree)match(input,LIB_FILE,FOLLOW_LIB_FILE_in_synpred11_CppTree241); if (state.failed) return;
		match(input, Token.UP, null); if (state.failed) return;

		}

	}
	// $ANTLR end synpred11_CppTree

	// $ANTLR start synpred12_CppTree
	public final void synpred12_CppTree_fragment() throws RecognitionException {
		CommonTree id=null;

		// CppTree.g:290:5: ( ^( INCLUDE id= IDENTIFIER ) )
		// CppTree.g:290:5: ^( INCLUDE id= IDENTIFIER )
		{
		match(input,INCLUDE,FOLLOW_INCLUDE_in_synpred12_CppTree253); if (state.failed) return;
		match(input, Token.DOWN, null); if (state.failed) return;
		id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_synpred12_CppTree257); if (state.failed) return;
		match(input, Token.UP, null); if (state.failed) return;

		}

	}
	// $ANTLR end synpred12_CppTree

	// Delegated rules

	public final boolean synpred10_CppTree() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred10_CppTree_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred11_CppTree() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred11_CppTree_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred12_CppTree() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred12_CppTree_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}



	public static final BitSet FOLLOW_procLine_in_preprocess62 = new BitSet(new long[]{0x0480202800000002L,0x2820000080000704L});
	public static final BitSet FOLLOW_fileInclusion_in_procLine92 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_macroDefine_in_procLine102 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_macroUndef_in_procLine113 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_conditionalCompilation_in_procLine124 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_lineControl_in_procLine132 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_diagnostics_in_procLine143 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_macroExecution_in_procLine156 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_text_line_in_procLine167 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_End_in_procLine192 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INCLUDE_in_fileInclusion221 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_fileInclusion225 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INCLUDE_in_fileInclusion237 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LIB_FILE_in_fileInclusion241 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INCLUDE_in_fileInclusion253 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_fileInclusion257 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INCLUDE_in_fileInclusion270 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_source_text_in_fileInclusion275 = new BitSet(new long[]{0x0051004000758008L,0x401F21C800080012L});
	public static final BitSet FOLLOW_MAC_FUNCTION_OBJECT_in_macroDefine314 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_macroDefine318 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000040L});
	public static final BitSet FOLLOW_macroText_in_macroDefine322 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MAC_FUNCTION_in_macroDefine335 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_macroDefine339 = new BitSet(new long[]{0x0040000080000000L});
	public static final BitSet FOLLOW_macroParam_in_macroDefine346 = new BitSet(new long[]{0x0040000080000008L,0x0000000000000040L});
	public static final BitSet FOLLOW_macroText_in_macroDefine354 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MAC_OBJECT_in_macroDefine367 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_macroDefine371 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000040L});
	public static final BitSet FOLLOW_macroText_in_macroDefine376 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ELLIPSIS_in_macroParam406 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_macroParam410 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ELLIPSIS_in_macroParam424 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_macroParam439 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MACRO_DEFINE_in_macroText468 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_source_text_in_macroText473 = new BitSet(new long[]{0x0051004000758008L,0x401F21C800080012L});
	public static final BitSet FOLLOW_UNDEF_in_macroUndef514 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_macroUndef518 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IF_in_conditionalCompilation546 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_conditionalCompilation559 = new BitSet(new long[]{0x0480202800000000L,0x2820000080000704L});
	public static final BitSet FOLLOW_statement_in_conditionalCompilation572 = new BitSet(new long[]{0x0000058100000008L});
	public static final BitSet FOLLOW_ELSE_in_conditionalCompilation589 = new BitSet(new long[]{0x0480202800000000L,0x2820000080000704L});
	public static final BitSet FOLLOW_statement_in_conditionalCompilation591 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LINE_in_lineControl621 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_DECIMAL_LITERAL_in_lineControl625 = new BitSet(new long[]{0x0000000000000008L,0x0002000000000000L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_lineControl636 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_WARNING_in_diagnostics687 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ERROR_in_diagnostics698 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRAGMA_in_diagnostics709 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEXT_LINE_in_text_line736 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_source_text_in_text_line741 = new BitSet(new long[]{0x0051004000758008L,0x401F21C800080012L});
	public static final BitSet FOLLOW_procLine_in_statement771 = new BitSet(new long[]{0x0480202800000002L,0x2820000080000704L});
	public static final BitSet FOLLOW_macroExpansion_in_source_text806 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primarySource_in_source_text819 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_concatenate_in_source_text831 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEMICOLON_in_source_text845 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMA_in_source_text859 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RPAREN_in_source_text876 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_source_text892 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_OP_in_source_text908 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WS_in_source_text922 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEXT_GROUP_in_source_text935 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEXT_END_in_source_text949 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEXT_GROUP_in_source_text964 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_macArgs_in_source_text968 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_STRINGIFICATION_in_source_text984 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_primarySource_in_source_text989 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_CONCATENATE_in_concatenate1029 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_primarySource_in_concatenate1038 = new BitSet(new long[]{0x0051000000618008L,0x0002218000080002L});
	public static final BitSet FOLLOW_constant_in_primarySource1083 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COPERATOR_in_primarySource1097 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CKEYWORD_in_primarySource1109 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SIZEOF_in_primarySource1123 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SHARP_in_primarySource1138 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LIB_FILE_in_primarySource1153 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SHARPSHARP_in_primarySource1167 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_primarySource1172 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IDENTIFIER_in_primarySource1188 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EXPAND_in_macroExpansion1216 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_macroExpansion1220 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EXPAND_in_macroExpansion1234 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_macroExpansion1238 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_macArgs_in_macroExpansion1242 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EXP_ARGS_in_macArgs1274 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_mArg_in_macArgs1279 = new BitSet(new long[]{0x0000080000000008L});
	public static final BitSet FOLLOW_EXP_ARG_in_mArg1316 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_source_text_in_mArg1321 = new BitSet(new long[]{0x0051004000758008L,0x401F21C800080012L});
	public static final BitSet FOLLOW_EXP_ARG_in_mArg1335 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EXEC_MACRO_in_macroExecution1359 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_macroExecution1363 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EXPR_in_expression1389 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expression1393 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EXPR_DEF_in_expression1406 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_expression1410 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EXPR_NDEF_in_expression1420 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_expression1425 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_assignmentExpression_in_expr1457 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditionalExpression_in_expr1465 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logicalOrExpression_in_expr1473 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logicalAndExpression_in_expr1481 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inclusiveOrExpression_in_expr1489 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exclusiveOrExpression_in_expr1497 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_andExpression_in_expr1505 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_equalityExpression_in_expr1513 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_relationalExpression_in_expr1521 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_shiftExpression_in_expr1529 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_additiveExpression_in_expr1537 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multiplicativeExpression_in_expr1545 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unaryExpression_in_expr1553 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postfixExpression_in_expr1561 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primaryExpression_in_expr1569 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASSIGNEQUAL_in_assignmentExpression1603 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_assignmentExpression1613 = new BitSet(new long[]{0xC85D02041D40AEB0L,0x87C2FE0577DFF800L});
	public static final BitSet FOLLOW_expr_in_assignmentExpression1617 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TIMESEQUAL_in_assignmentExpression1631 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_assignmentExpression1642 = new BitSet(new long[]{0xC85D02041D40AEB0L,0x87C2FE0577DFF800L});
	public static final BitSet FOLLOW_expr_in_assignmentExpression1646 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DIVIDEEQUAL_in_assignmentExpression1660 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_assignmentExpression1670 = new BitSet(new long[]{0xC85D02041D40AEB0L,0x87C2FE0577DFF800L});
	public static final BitSet FOLLOW_expr_in_assignmentExpression1674 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PLUSEQUAL_in_assignmentExpression1688 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_assignmentExpression1700 = new BitSet(new long[]{0xC85D02041D40AEB0L,0x87C2FE0577DFF800L});
	public static final BitSet FOLLOW_expr_in_assignmentExpression1704 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MINUSEQUAL_in_assignmentExpression1718 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_assignmentExpression1729 = new BitSet(new long[]{0xC85D02041D40AEB0L,0x87C2FE0577DFF800L});
	public static final BitSet FOLLOW_expr_in_assignmentExpression1733 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SHIFTLEFTEQUAL_in_assignmentExpression1747 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_assignmentExpression1754 = new BitSet(new long[]{0xC85D02041D40AEB0L,0x87C2FE0577DFF800L});
	public static final BitSet FOLLOW_expr_in_assignmentExpression1758 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SHIFTRIGHTEQUAL_in_assignmentExpression1772 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_assignmentExpression1778 = new BitSet(new long[]{0xC85D02041D40AEB0L,0x87C2FE0577DFF800L});
	public static final BitSet FOLLOW_expr_in_assignmentExpression1782 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BITWISEANDEQUAL_in_assignmentExpression1796 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_assignmentExpression1802 = new BitSet(new long[]{0xC85D02041D40AEB0L,0x87C2FE0577DFF800L});
	public static final BitSet FOLLOW_expr_in_assignmentExpression1806 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BITWISEXOREQUAL_in_assignmentExpression1820 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_assignmentExpression1826 = new BitSet(new long[]{0xC85D02041D40AEB0L,0x87C2FE0577DFF800L});
	public static final BitSet FOLLOW_expr_in_assignmentExpression1830 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BITWISEOREQUAL_in_assignmentExpression1844 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_assignmentExpression1851 = new BitSet(new long[]{0xC85D02041D40AEB0L,0x87C2FE0577DFF800L});
	public static final BitSet FOLLOW_expr_in_assignmentExpression1855 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MODEQUAL_in_assignmentExpression1869 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_assignmentExpression1882 = new BitSet(new long[]{0xC85D02041D40AEB0L,0x87C2FE0577DFF800L});
	public static final BitSet FOLLOW_expr_in_assignmentExpression1886 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_QUESTIONMARK_in_conditionalExpression1913 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_conditionalExpression1917 = new BitSet(new long[]{0xC85D02041D40AEB0L,0x87C2FE0577DFF800L});
	public static final BitSet FOLLOW_expr_in_conditionalExpression1921 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_COLON_in_conditionalExpression1923 = new BitSet(new long[]{0xC85D02041D40AEB0L,0x87C2FE0577DFF800L});
	public static final BitSet FOLLOW_expr_in_conditionalExpression1927 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OR_in_logicalOrExpression1958 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_logicalOrExpression1962 = new BitSet(new long[]{0xC85D02041D40AEB0L,0x87C2FE0577DFF800L});
	public static final BitSet FOLLOW_expr_in_logicalOrExpression1966 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_AND_in_logicalAndExpression1999 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_logicalAndExpression2003 = new BitSet(new long[]{0xC85D02041D40AEB0L,0x87C2FE0577DFF800L});
	public static final BitSet FOLLOW_expr_in_logicalAndExpression2007 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BITWISEOR_in_inclusiveOrExpression2037 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_inclusiveOrExpression2041 = new BitSet(new long[]{0xC85D02041D40AEB0L,0x87C2FE0577DFF800L});
	public static final BitSet FOLLOW_expr_in_inclusiveOrExpression2045 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BITWISERXOR_in_exclusiveOrExpression2076 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_exclusiveOrExpression2080 = new BitSet(new long[]{0xC85D02041D40AEB0L,0x87C2FE0577DFF800L});
	public static final BitSet FOLLOW_expr_in_exclusiveOrExpression2084 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_AMPERSAND_in_andExpression2114 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_andExpression2118 = new BitSet(new long[]{0xC85D02041D40AEB0L,0x87C2FE0577DFF800L});
	public static final BitSet FOLLOW_expr_in_andExpression2122 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NOTEQUAL_in_equalityExpression2151 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_equalityExpression2155 = new BitSet(new long[]{0xC85D02041D40AEB0L,0x87C2FE0577DFF800L});
	public static final BitSet FOLLOW_expr_in_equalityExpression2159 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EQUAL_in_equalityExpression2173 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_equalityExpression2179 = new BitSet(new long[]{0xC85D02041D40AEB0L,0x87C2FE0577DFF800L});
	public static final BitSet FOLLOW_expr_in_equalityExpression2183 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LESSTHAN_in_relationalExpression2213 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_relationalExpression2221 = new BitSet(new long[]{0xC85D02041D40AEB0L,0x87C2FE0577DFF800L});
	public static final BitSet FOLLOW_expr_in_relationalExpression2225 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GREATERTHAN_in_relationalExpression2247 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_relationalExpression2255 = new BitSet(new long[]{0xC85D02041D40AEB0L,0x87C2FE0577DFF800L});
	public static final BitSet FOLLOW_expr_in_relationalExpression2259 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LESSTHANOREQUALTO_in_relationalExpression2281 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_relationalExpression2287 = new BitSet(new long[]{0xC85D02041D40AEB0L,0x87C2FE0577DFF800L});
	public static final BitSet FOLLOW_expr_in_relationalExpression2291 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GREATERTHANOREQUALTO_in_relationalExpression2313 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_relationalExpression2317 = new BitSet(new long[]{0xC85D02041D40AEB0L,0x87C2FE0577DFF800L});
	public static final BitSet FOLLOW_expr_in_relationalExpression2321 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SHIFTLEFT_in_shiftExpression2355 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_shiftExpression2361 = new BitSet(new long[]{0xC85D02041D40AEB0L,0x87C2FE0577DFF800L});
	public static final BitSet FOLLOW_expr_in_shiftExpression2365 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SHIFTRIGHT_in_shiftExpression2381 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_shiftExpression2386 = new BitSet(new long[]{0xC85D02041D40AEB0L,0x87C2FE0577DFF800L});
	public static final BitSet FOLLOW_expr_in_shiftExpression2390 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PLUS_in_additiveExpression2423 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_additiveExpression2427 = new BitSet(new long[]{0xC85D02041D40AEB0L,0x87C2FE0577DFF800L});
	public static final BitSet FOLLOW_expr_in_additiveExpression2431 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MINUS_in_additiveExpression2450 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_additiveExpression2455 = new BitSet(new long[]{0xC85D02041D40AEB0L,0x87C2FE0577DFF800L});
	public static final BitSet FOLLOW_expr_in_additiveExpression2459 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_STAR_in_multiplicativeExpression2491 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_multiplicativeExpression2496 = new BitSet(new long[]{0xC85D02041D40AEB0L,0x87C2FE0577DFF800L});
	public static final BitSet FOLLOW_expr_in_multiplicativeExpression2500 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DIVIDE_in_multiplicativeExpression2517 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_multiplicativeExpression2523 = new BitSet(new long[]{0xC85D02041D40AEB0L,0x87C2FE0577DFF800L});
	public static final BitSet FOLLOW_expr_in_multiplicativeExpression2527 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MOD_in_multiplicativeExpression2541 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_multiplicativeExpression2547 = new BitSet(new long[]{0xC85D02041D40AEB0L,0x87C2FE0577DFF800L});
	public static final BitSet FOLLOW_expr_in_multiplicativeExpression2551 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PLUSPLUS_in_unaryExpression2579 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_unaryExpression2584 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MINUSMINUS_in_unaryExpression2598 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_unaryExpression2603 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_REFERANCE_in_unaryExpression2617 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_unaryExpression2621 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_POINTER_AT_in_unaryExpression2635 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_unaryExpression2639 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_UNARY_MINUS_in_unaryExpression2653 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_unaryExpression2657 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_UNARY_PLUS_in_unaryExpression2671 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_unaryExpression2676 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SIZEOF_in_unaryExpression2688 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_unaryExpression2694 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SIZEOF_TYPE_in_unaryExpression2706 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_unaryExpression2710 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NOT_in_unaryExpression2722 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_unaryExpression2728 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TILDE_in_unaryExpression2742 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_unaryExpression2747 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TYPECAST_in_unaryExpression2761 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_unaryExpression2766 = new BitSet(new long[]{0xC85D02041D40AEB0L,0x87C2FE0577DFF800L});
	public static final BitSet FOLLOW_expr_in_unaryExpression2770 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DEFINED_in_unaryExpression2781 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_unaryExpression2787 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_POST_INC_in_postfixExpression2813 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_postfixExpression2818 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_POST_DEC_in_postfixExpression2838 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_postfixExpression2842 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_POINTERTO_in_postfixExpression2857 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_postfixExpression2861 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_postfixExpression2866 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_POINTER_in_postfixExpression2878 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_postfixExpression2883 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_postfixExpression2888 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DOT_in_postfixExpression2900 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_postfixExpression2906 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_postfixExpression2911 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INDEX_OP_in_postfixExpression2924 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_postfixExpression2929 = new BitSet(new long[]{0xC85D02041D40AEB0L,0x87C2FE0577DFF800L});
	public static final BitSet FOLLOW_expr_in_postfixExpression2934 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_constant_in_primaryExpression2964 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EXPR_GROUP_in_primaryExpression2980 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_primaryExpression2984 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IDENTIFIER_in_primaryExpression2997 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_METHOD_CALL_in_primaryExpression3011 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_primaryExpression3015 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_METHOD_CALL_in_primaryExpression3029 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_primaryExpression3033 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_argList_in_primaryExpression3037 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ARGS_in_argList3067 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_argList3072 = new BitSet(new long[]{0xC85D02041D40AEB8L,0x87C2FE0577DFF800L});
	public static final BitSet FOLLOW_HEX_LITERAL_in_constant3110 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OCTAL_LITERAL_in_constant3128 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DECIMAL_LITERAL_in_constant3144 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOATING_POINT_LITERAL_in_constant3160 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHARACTER_LITERAL_in_constant3174 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_constant3190 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INCLUDE_in_synpred10_CppTree221 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_synpred10_CppTree225 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INCLUDE_in_synpred11_CppTree237 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LIB_FILE_in_synpred11_CppTree241 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INCLUDE_in_synpred12_CppTree253 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_synpred12_CppTree257 = new BitSet(new long[]{0x0000000000000008L});
}
