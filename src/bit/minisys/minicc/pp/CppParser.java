// $ANTLR 3.5.2 Cpp.g 2022-04-24 22:14:19

	package bit.minisys.minicc.pp;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class CppParser extends Parser {
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
		"UNARY_PLUS", "UNDEF", "UnicodeEscape", "WARNING", "WS"
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

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public CppParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public CppParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
		this.state.ruleMemo = new HashMap[174+1];


	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return CppParser.tokenNames; }
	@Override public String getGrammarFileName() { return "Cpp.g"; }


	public static class preprocess_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "preprocess"
	// Cpp.g:56:1: preprocess : ( procLine )+ ;
	public final CppParser.preprocess_return preprocess() throws RecognitionException {
		CppParser.preprocess_return retval = new CppParser.preprocess_return();
		retval.start = input.LT(1);
		int preprocess_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope procLine1 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }

			// Cpp.g:57:3: ( ( procLine )+ )
			// Cpp.g:57:5: ( procLine )+
			{
			root_0 = (Object)adaptor.nil();


			// Cpp.g:57:5: ( procLine )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= CHARACTER_LITERAL && LA1_0 <= CKEYWORD)||LA1_0==COMMA||(LA1_0 >= COPERATOR && LA1_0 <= DEFINE)||LA1_0==DIRECTIVE||LA1_0==ERROR||LA1_0==EXEC_MACRO||LA1_0==End||LA1_0==FLOATING_POINT_LITERAL||LA1_0==HEX_LITERAL||(LA1_0 >= IDENTIFIER && LA1_0 <= IF)||LA1_0==INCLUDE||(LA1_0 >= LIB_FILE && LA1_0 <= LINE)||LA1_0==LPAREN||LA1_0==OCTAL_LITERAL||LA1_0==PRAGMA||LA1_0==RPAREN||(LA1_0 >= SEMICOLON && LA1_0 <= SHARPSHARP)||LA1_0==SIZEOF||(LA1_0 >= STRINGIFICATION && LA1_0 <= TEXT_END)||LA1_0==UNDEF||(LA1_0 >= WARNING && LA1_0 <= WS)) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// Cpp.g:57:5: procLine
					{
					pushFollow(FOLLOW_procLine_in_preprocess225);
					procLine1=procLine();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, procLine1.getTree());

					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 1, preprocess_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "preprocess"


	public static class procLine_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "procLine"
	// Cpp.g:60:1: procLine : ( DIRECTIVE !| text_line | diagnostics | fileInclusion | macroDefine | macroUndef | conditionalCompilation | lineControl | macroExecution )? End ;
	public final CppParser.procLine_return procLine() throws RecognitionException {
		CppParser.procLine_return retval = new CppParser.procLine_return();
		retval.start = input.LT(1);
		int procLine_StartIndex = input.index();

		Object root_0 = null;

		Token DIRECTIVE2=null;
		Token End11=null;
		ParserRuleReturnScope text_line3 =null;
		ParserRuleReturnScope diagnostics4 =null;
		ParserRuleReturnScope fileInclusion5 =null;
		ParserRuleReturnScope macroDefine6 =null;
		ParserRuleReturnScope macroUndef7 =null;
		ParserRuleReturnScope conditionalCompilation8 =null;
		ParserRuleReturnScope lineControl9 =null;
		ParserRuleReturnScope macroExecution10 =null;

		Object DIRECTIVE2_tree=null;
		Object End11_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }

			// Cpp.g:61:3: ( ( DIRECTIVE !| text_line | diagnostics | fileInclusion | macroDefine | macroUndef | conditionalCompilation | lineControl | macroExecution )? End )
			// Cpp.g:62:3: ( DIRECTIVE !| text_line | diagnostics | fileInclusion | macroDefine | macroUndef | conditionalCompilation | lineControl | macroExecution )? End
			{
			root_0 = (Object)adaptor.nil();


			// Cpp.g:62:3: ( DIRECTIVE !| text_line | diagnostics | fileInclusion | macroDefine | macroUndef | conditionalCompilation | lineControl | macroExecution )?
			int alt2=10;
			switch ( input.LA(1) ) {
				case DIRECTIVE:
					{
					alt2=1;
					}
					break;
				case CHARACTER_LITERAL:
				case CKEYWORD:
				case COMMA:
				case COPERATOR:
				case DECIMAL_LITERAL:
				case FLOATING_POINT_LITERAL:
				case HEX_LITERAL:
				case IDENTIFIER:
				case LIB_FILE:
				case LPAREN:
				case OCTAL_LITERAL:
				case RPAREN:
				case SEMICOLON:
				case SHARP:
				case SHARPSHARP:
				case SIZEOF:
				case STRINGIFICATION:
				case STRING_LITERAL:
				case STRING_OP:
				case TEXT_END:
				case WS:
					{
					alt2=2;
					}
					break;
				case ERROR:
				case PRAGMA:
				case WARNING:
					{
					alt2=3;
					}
					break;
				case INCLUDE:
					{
					alt2=4;
					}
					break;
				case DEFINE:
					{
					alt2=5;
					}
					break;
				case UNDEF:
					{
					alt2=6;
					}
					break;
				case IF:
					{
					alt2=7;
					}
					break;
				case LINE:
					{
					alt2=8;
					}
					break;
				case EXEC_MACRO:
					{
					alt2=9;
					}
					break;
			}
			switch (alt2) {
				case 1 :
					// Cpp.g:62:5: DIRECTIVE !
					{
					DIRECTIVE2=(Token)match(input,DIRECTIVE,FOLLOW_DIRECTIVE_in_procLine245); if (state.failed) return retval;
					}
					break;
				case 2 :
					// Cpp.g:63:5: text_line
					{
					pushFollow(FOLLOW_text_line_in_procLine252);
					text_line3=text_line();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, text_line3.getTree());

					}
					break;
				case 3 :
					// Cpp.g:64:5: diagnostics
					{
					pushFollow(FOLLOW_diagnostics_in_procLine258);
					diagnostics4=diagnostics();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, diagnostics4.getTree());

					}
					break;
				case 4 :
					// Cpp.g:65:5: fileInclusion
					{
					pushFollow(FOLLOW_fileInclusion_in_procLine264);
					fileInclusion5=fileInclusion();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, fileInclusion5.getTree());

					}
					break;
				case 5 :
					// Cpp.g:66:5: macroDefine
					{
					pushFollow(FOLLOW_macroDefine_in_procLine270);
					macroDefine6=macroDefine();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, macroDefine6.getTree());

					}
					break;
				case 6 :
					// Cpp.g:67:5: macroUndef
					{
					pushFollow(FOLLOW_macroUndef_in_procLine276);
					macroUndef7=macroUndef();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, macroUndef7.getTree());

					}
					break;
				case 7 :
					// Cpp.g:68:5: conditionalCompilation
					{
					pushFollow(FOLLOW_conditionalCompilation_in_procLine282);
					conditionalCompilation8=conditionalCompilation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalCompilation8.getTree());

					}
					break;
				case 8 :
					// Cpp.g:69:5: lineControl
					{
					pushFollow(FOLLOW_lineControl_in_procLine288);
					lineControl9=lineControl();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, lineControl9.getTree());

					}
					break;
				case 9 :
					// Cpp.g:70:5: macroExecution
					{
					pushFollow(FOLLOW_macroExecution_in_procLine294);
					macroExecution10=macroExecution();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, macroExecution10.getTree());

					}
					break;

			}

			End11=(Token)match(input,End,FOLLOW_End_in_procLine301); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			End11_tree = (Object)adaptor.create(End11);
			adaptor.addChild(root_0, End11_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 2, procLine_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "procLine"


	public static class fileInclusion_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "fileInclusion"
	// Cpp.g:74:1: fileInclusion : ( INCLUDE STRING_LITERAL -> ^( INCLUDE STRING_LITERAL ) | INCLUDE LIB_FILE -> ^( INCLUDE LIB_FILE ) | INCLUDE IDENTIFIER -> ^( INCLUDE IDENTIFIER ) | INCLUDE macroExpansion -> ^( INCLUDE macroExpansion ) );
	public final CppParser.fileInclusion_return fileInclusion() throws RecognitionException {
		CppParser.fileInclusion_return retval = new CppParser.fileInclusion_return();
		retval.start = input.LT(1);
		int fileInclusion_StartIndex = input.index();

		Object root_0 = null;

		Token INCLUDE12=null;
		Token STRING_LITERAL13=null;
		Token INCLUDE14=null;
		Token LIB_FILE15=null;
		Token INCLUDE16=null;
		Token IDENTIFIER17=null;
		Token INCLUDE18=null;
		ParserRuleReturnScope macroExpansion19 =null;

		Object INCLUDE12_tree=null;
		Object STRING_LITERAL13_tree=null;
		Object INCLUDE14_tree=null;
		Object LIB_FILE15_tree=null;
		Object INCLUDE16_tree=null;
		Object IDENTIFIER17_tree=null;
		Object INCLUDE18_tree=null;
		RewriteRuleTokenStream stream_STRING_LITERAL=new RewriteRuleTokenStream(adaptor,"token STRING_LITERAL");
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleTokenStream stream_INCLUDE=new RewriteRuleTokenStream(adaptor,"token INCLUDE");
		RewriteRuleTokenStream stream_LIB_FILE=new RewriteRuleTokenStream(adaptor,"token LIB_FILE");
		RewriteRuleSubtreeStream stream_macroExpansion=new RewriteRuleSubtreeStream(adaptor,"rule macroExpansion");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }

			// Cpp.g:75:3: ( INCLUDE STRING_LITERAL -> ^( INCLUDE STRING_LITERAL ) | INCLUDE LIB_FILE -> ^( INCLUDE LIB_FILE ) | INCLUDE IDENTIFIER -> ^( INCLUDE IDENTIFIER ) | INCLUDE macroExpansion -> ^( INCLUDE macroExpansion ) )
			int alt3=4;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==INCLUDE) ) {
				switch ( input.LA(2) ) {
				case STRING_LITERAL:
					{
					alt3=1;
					}
					break;
				case LIB_FILE:
					{
					alt3=2;
					}
					break;
				case IDENTIFIER:
					{
					int LA3_4 = input.LA(3);
					if ( (LA3_4==EOF||LA3_4==End) ) {
						alt3=3;
					}
					else if ( (LA3_4==LPAREN||LA3_4==WS) ) {
						alt3=4;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 3, 4, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 3, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// Cpp.g:75:5: INCLUDE STRING_LITERAL
					{
					INCLUDE12=(Token)match(input,INCLUDE,FOLLOW_INCLUDE_in_fileInclusion315); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_INCLUDE.add(INCLUDE12);

					STRING_LITERAL13=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_fileInclusion317); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_STRING_LITERAL.add(STRING_LITERAL13);

					// AST REWRITE
					// elements: INCLUDE, STRING_LITERAL
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 75:28: -> ^( INCLUDE STRING_LITERAL )
					{
						// Cpp.g:75:32: ^( INCLUDE STRING_LITERAL )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(stream_INCLUDE.nextNode(), root_1);
						adaptor.addChild(root_1, stream_STRING_LITERAL.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// Cpp.g:76:5: INCLUDE LIB_FILE
					{
					INCLUDE14=(Token)match(input,INCLUDE,FOLLOW_INCLUDE_in_fileInclusion332); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_INCLUDE.add(INCLUDE14);

					LIB_FILE15=(Token)match(input,LIB_FILE,FOLLOW_LIB_FILE_in_fileInclusion334); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LIB_FILE.add(LIB_FILE15);

					// AST REWRITE
					// elements: INCLUDE, LIB_FILE
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 76:22: -> ^( INCLUDE LIB_FILE )
					{
						// Cpp.g:76:26: ^( INCLUDE LIB_FILE )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(stream_INCLUDE.nextNode(), root_1);
						adaptor.addChild(root_1, stream_LIB_FILE.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// Cpp.g:77:5: INCLUDE IDENTIFIER
					{
					INCLUDE16=(Token)match(input,INCLUDE,FOLLOW_INCLUDE_in_fileInclusion349); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_INCLUDE.add(INCLUDE16);

					IDENTIFIER17=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_fileInclusion351); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER17);

					// AST REWRITE
					// elements: IDENTIFIER, INCLUDE
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 77:25: -> ^( INCLUDE IDENTIFIER )
					{
						// Cpp.g:77:28: ^( INCLUDE IDENTIFIER )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(stream_INCLUDE.nextNode(), root_1);
						adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 4 :
					// Cpp.g:78:5: INCLUDE macroExpansion
					{
					INCLUDE18=(Token)match(input,INCLUDE,FOLLOW_INCLUDE_in_fileInclusion366); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_INCLUDE.add(INCLUDE18);

					pushFollow(FOLLOW_macroExpansion_in_fileInclusion368);
					macroExpansion19=macroExpansion();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_macroExpansion.add(macroExpansion19.getTree());
					// AST REWRITE
					// elements: INCLUDE, macroExpansion
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 78:28: -> ^( INCLUDE macroExpansion )
					{
						// Cpp.g:78:31: ^( INCLUDE macroExpansion )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(stream_INCLUDE.nextNode(), root_1);
						adaptor.addChild(root_1, stream_macroExpansion.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 3, fileInclusion_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "fileInclusion"


	public static class macroDefine_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "macroDefine"
	// Cpp.g:81:1: macroDefine : ( DEFINE IDENTIFIER LPAREN ( WS )? RPAREN ( macro_text )? -> ^( MAC_FUNCTION_OBJECT IDENTIFIER ( macro_text )? ) | DEFINE mac= IDENTIFIER LPAREN ( WS )? (arg+= macroParam ( WS )? ( COMMA ( WS )* arg+= macroParam ( WS )* )* )? RPAREN ( macro_text )? -> ^( MAC_FUNCTION $mac ( $arg)+ ( macro_text )? ) | DEFINE IDENTIFIER ( WS )? ( macro_text )? -> ^( MAC_OBJECT IDENTIFIER ( macro_text )? ) );
	public final CppParser.macroDefine_return macroDefine() throws RecognitionException {
		CppParser.macroDefine_return retval = new CppParser.macroDefine_return();
		retval.start = input.LT(1);
		int macroDefine_StartIndex = input.index();

		Object root_0 = null;

		Token mac=null;
		Token DEFINE20=null;
		Token IDENTIFIER21=null;
		Token LPAREN22=null;
		Token WS23=null;
		Token RPAREN24=null;
		Token DEFINE26=null;
		Token LPAREN27=null;
		Token WS28=null;
		Token WS29=null;
		Token COMMA30=null;
		Token WS31=null;
		Token WS32=null;
		Token RPAREN33=null;
		Token DEFINE35=null;
		Token IDENTIFIER36=null;
		Token WS37=null;
		List<Object> list_arg=null;
		ParserRuleReturnScope macro_text25 =null;
		ParserRuleReturnScope macro_text34 =null;
		ParserRuleReturnScope macro_text38 =null;
		RuleReturnScope arg = null;
		Object mac_tree=null;
		Object DEFINE20_tree=null;
		Object IDENTIFIER21_tree=null;
		Object LPAREN22_tree=null;
		Object WS23_tree=null;
		Object RPAREN24_tree=null;
		Object DEFINE26_tree=null;
		Object LPAREN27_tree=null;
		Object WS28_tree=null;
		Object WS29_tree=null;
		Object COMMA30_tree=null;
		Object WS31_tree=null;
		Object WS32_tree=null;
		Object RPAREN33_tree=null;
		Object DEFINE35_tree=null;
		Object IDENTIFIER36_tree=null;
		Object WS37_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_DEFINE=new RewriteRuleTokenStream(adaptor,"token DEFINE");
		RewriteRuleSubtreeStream stream_macro_text=new RewriteRuleSubtreeStream(adaptor,"rule macro_text");
		RewriteRuleSubtreeStream stream_macroParam=new RewriteRuleSubtreeStream(adaptor,"rule macroParam");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }

			// Cpp.g:83:3: ( DEFINE IDENTIFIER LPAREN ( WS )? RPAREN ( macro_text )? -> ^( MAC_FUNCTION_OBJECT IDENTIFIER ( macro_text )? ) | DEFINE mac= IDENTIFIER LPAREN ( WS )? (arg+= macroParam ( WS )? ( COMMA ( WS )* arg+= macroParam ( WS )* )* )? RPAREN ( macro_text )? -> ^( MAC_FUNCTION $mac ( $arg)+ ( macro_text )? ) | DEFINE IDENTIFIER ( WS )? ( macro_text )? -> ^( MAC_OBJECT IDENTIFIER ( macro_text )? ) )
			int alt15=3;
			alt15 = dfa15.predict(input);
			switch (alt15) {
				case 1 :
					// Cpp.g:83:5: DEFINE IDENTIFIER LPAREN ( WS )? RPAREN ( macro_text )?
					{
					DEFINE20=(Token)match(input,DEFINE,FOLLOW_DEFINE_in_macroDefine394); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DEFINE.add(DEFINE20);

					IDENTIFIER21=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_macroDefine396); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER21);

					LPAREN22=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_macroDefine398); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN22);

					// Cpp.g:83:30: ( WS )?
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0==WS) ) {
						alt4=1;
					}
					switch (alt4) {
						case 1 :
							// Cpp.g:83:30: WS
							{
							WS23=(Token)match(input,WS,FOLLOW_WS_in_macroDefine400); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_WS.add(WS23);

							}
							break;

					}

					RPAREN24=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_macroDefine403); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN24);

					// Cpp.g:83:41: ( macro_text )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( ((LA5_0 >= CHARACTER_LITERAL && LA5_0 <= CKEYWORD)||LA5_0==COMMA||(LA5_0 >= COPERATOR && LA5_0 <= DECIMAL_LITERAL)||LA5_0==FLOATING_POINT_LITERAL||LA5_0==HEX_LITERAL||LA5_0==IDENTIFIER||LA5_0==LIB_FILE||LA5_0==LPAREN||LA5_0==OCTAL_LITERAL||LA5_0==RPAREN||(LA5_0 >= SEMICOLON && LA5_0 <= SHARPSHARP)||LA5_0==SIZEOF||(LA5_0 >= STRINGIFICATION && LA5_0 <= TEXT_END)||LA5_0==WS) ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// Cpp.g:83:41: macro_text
							{
							pushFollow(FOLLOW_macro_text_in_macroDefine405);
							macro_text25=macro_text();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_macro_text.add(macro_text25.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: IDENTIFIER, macro_text
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 83:53: -> ^( MAC_FUNCTION_OBJECT IDENTIFIER ( macro_text )? )
					{
						// Cpp.g:83:56: ^( MAC_FUNCTION_OBJECT IDENTIFIER ( macro_text )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MAC_FUNCTION_OBJECT, "MAC_FUNCTION_OBJECT"), root_1);
						adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
						// Cpp.g:83:90: ( macro_text )?
						if ( stream_macro_text.hasNext() ) {
							adaptor.addChild(root_1, stream_macro_text.nextTree());
						}
						stream_macro_text.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// Cpp.g:85:5: DEFINE mac= IDENTIFIER LPAREN ( WS )? (arg+= macroParam ( WS )? ( COMMA ( WS )* arg+= macroParam ( WS )* )* )? RPAREN ( macro_text )?
					{
					DEFINE26=(Token)match(input,DEFINE,FOLLOW_DEFINE_in_macroDefine427); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DEFINE.add(DEFINE26);

					mac=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_macroDefine431); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_IDENTIFIER.add(mac);

					LPAREN27=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_macroDefine434); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN27);

					// Cpp.g:85:35: ( WS )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==WS) ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// Cpp.g:85:35: WS
							{
							WS28=(Token)match(input,WS,FOLLOW_WS_in_macroDefine436); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_WS.add(WS28);

							}
							break;

					}

					// Cpp.g:85:40: (arg+= macroParam ( WS )? ( COMMA ( WS )* arg+= macroParam ( WS )* )* )?
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0==ELLIPSIS||LA11_0==IDENTIFIER) ) {
						alt11=1;
					}
					switch (alt11) {
						case 1 :
							// Cpp.g:85:41: arg+= macroParam ( WS )? ( COMMA ( WS )* arg+= macroParam ( WS )* )*
							{
							pushFollow(FOLLOW_macroParam_in_macroDefine443);
							arg=macroParam();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_macroParam.add(arg.getTree());
							if (list_arg==null) list_arg=new ArrayList<Object>();
							list_arg.add(arg.getTree());
							// Cpp.g:85:57: ( WS )?
							int alt7=2;
							int LA7_0 = input.LA(1);
							if ( (LA7_0==WS) ) {
								alt7=1;
							}
							switch (alt7) {
								case 1 :
									// Cpp.g:85:57: WS
									{
									WS29=(Token)match(input,WS,FOLLOW_WS_in_macroDefine445); if (state.failed) return retval; 
									if ( state.backtracking==0 ) stream_WS.add(WS29);

									}
									break;

							}

							// Cpp.g:85:61: ( COMMA ( WS )* arg+= macroParam ( WS )* )*
							loop10:
							while (true) {
								int alt10=2;
								int LA10_0 = input.LA(1);
								if ( (LA10_0==COMMA) ) {
									alt10=1;
								}

								switch (alt10) {
								case 1 :
									// Cpp.g:85:62: COMMA ( WS )* arg+= macroParam ( WS )*
									{
									COMMA30=(Token)match(input,COMMA,FOLLOW_COMMA_in_macroDefine449); if (state.failed) return retval; 
									if ( state.backtracking==0 ) stream_COMMA.add(COMMA30);

									// Cpp.g:85:68: ( WS )*
									loop8:
									while (true) {
										int alt8=2;
										int LA8_0 = input.LA(1);
										if ( (LA8_0==WS) ) {
											alt8=1;
										}

										switch (alt8) {
										case 1 :
											// Cpp.g:85:68: WS
											{
											WS31=(Token)match(input,WS,FOLLOW_WS_in_macroDefine451); if (state.failed) return retval; 
											if ( state.backtracking==0 ) stream_WS.add(WS31);

											}
											break;

										default :
											break loop8;
										}
									}

									pushFollow(FOLLOW_macroParam_in_macroDefine456);
									arg=macroParam();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) stream_macroParam.add(arg.getTree());
									if (list_arg==null) list_arg=new ArrayList<Object>();
									list_arg.add(arg.getTree());
									// Cpp.g:85:88: ( WS )*
									loop9:
									while (true) {
										int alt9=2;
										int LA9_0 = input.LA(1);
										if ( (LA9_0==WS) ) {
											alt9=1;
										}

										switch (alt9) {
										case 1 :
											// Cpp.g:85:88: WS
											{
											WS32=(Token)match(input,WS,FOLLOW_WS_in_macroDefine458); if (state.failed) return retval; 
											if ( state.backtracking==0 ) stream_WS.add(WS32);

											}
											break;

										default :
											break loop9;
										}
									}

									}
									break;

								default :
									break loop10;
								}
							}

							}
							break;

					}

					RPAREN33=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_macroDefine466); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN33);

					// Cpp.g:85:104: ( macro_text )?
					int alt12=2;
					int LA12_0 = input.LA(1);
					if ( ((LA12_0 >= CHARACTER_LITERAL && LA12_0 <= CKEYWORD)||LA12_0==COMMA||(LA12_0 >= COPERATOR && LA12_0 <= DECIMAL_LITERAL)||LA12_0==FLOATING_POINT_LITERAL||LA12_0==HEX_LITERAL||LA12_0==IDENTIFIER||LA12_0==LIB_FILE||LA12_0==LPAREN||LA12_0==OCTAL_LITERAL||LA12_0==RPAREN||(LA12_0 >= SEMICOLON && LA12_0 <= SHARPSHARP)||LA12_0==SIZEOF||(LA12_0 >= STRINGIFICATION && LA12_0 <= TEXT_END)||LA12_0==WS) ) {
						alt12=1;
					}
					switch (alt12) {
						case 1 :
							// Cpp.g:85:104: macro_text
							{
							pushFollow(FOLLOW_macro_text_in_macroDefine468);
							macro_text34=macro_text();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_macro_text.add(macro_text34.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: macro_text, mac, arg
					// token labels: mac
					// rule labels: retval
					// token list labels: 
					// rule list labels: arg
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_mac=new RewriteRuleTokenStream(adaptor,"token mac",mac);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_arg=new RewriteRuleSubtreeStream(adaptor,"token arg",list_arg);
					root_0 = (Object)adaptor.nil();
					// 85:124: -> ^( MAC_FUNCTION $mac ( $arg)+ ( macro_text )? )
					{
						// Cpp.g:85:127: ^( MAC_FUNCTION $mac ( $arg)+ ( macro_text )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MAC_FUNCTION, "MAC_FUNCTION"), root_1);
						adaptor.addChild(root_1, stream_mac.nextNode());
						if ( !(stream_arg.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_arg.hasNext() ) {
							adaptor.addChild(root_1, stream_arg.nextTree());
						}
						stream_arg.reset();

						// Cpp.g:85:154: ( macro_text )?
						if ( stream_macro_text.hasNext() ) {
							adaptor.addChild(root_1, stream_macro_text.nextTree());
						}
						stream_macro_text.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// Cpp.g:87:5: DEFINE IDENTIFIER ( WS )? ( macro_text )?
					{
					DEFINE35=(Token)match(input,DEFINE,FOLLOW_DEFINE_in_macroDefine504); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DEFINE.add(DEFINE35);

					IDENTIFIER36=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_macroDefine506); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER36);

					// Cpp.g:87:23: ( WS )?
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( (LA13_0==WS) ) {
						int LA13_1 = input.LA(2);
						if ( (synpred25_Cpp()) ) {
							alt13=1;
						}
					}
					switch (alt13) {
						case 1 :
							// Cpp.g:87:23: WS
							{
							WS37=(Token)match(input,WS,FOLLOW_WS_in_macroDefine508); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_WS.add(WS37);

							}
							break;

					}

					// Cpp.g:87:27: ( macro_text )?
					int alt14=2;
					int LA14_0 = input.LA(1);
					if ( ((LA14_0 >= CHARACTER_LITERAL && LA14_0 <= CKEYWORD)||LA14_0==COMMA||(LA14_0 >= COPERATOR && LA14_0 <= DECIMAL_LITERAL)||LA14_0==FLOATING_POINT_LITERAL||LA14_0==HEX_LITERAL||LA14_0==IDENTIFIER||LA14_0==LIB_FILE||LA14_0==LPAREN||LA14_0==OCTAL_LITERAL||LA14_0==RPAREN||(LA14_0 >= SEMICOLON && LA14_0 <= SHARPSHARP)||LA14_0==SIZEOF||(LA14_0 >= STRINGIFICATION && LA14_0 <= TEXT_END)||LA14_0==WS) ) {
						alt14=1;
					}
					switch (alt14) {
						case 1 :
							// Cpp.g:87:27: macro_text
							{
							pushFollow(FOLLOW_macro_text_in_macroDefine511);
							macro_text38=macro_text();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_macro_text.add(macro_text38.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: macro_text, IDENTIFIER
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 87:43: -> ^( MAC_OBJECT IDENTIFIER ( macro_text )? )
					{
						// Cpp.g:87:46: ^( MAC_OBJECT IDENTIFIER ( macro_text )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MAC_OBJECT, "MAC_OBJECT"), root_1);
						adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
						// Cpp.g:87:72: ( macro_text )?
						if ( stream_macro_text.hasNext() ) {
							adaptor.addChild(root_1, stream_macro_text.nextTree());
						}
						stream_macro_text.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 4, macroDefine_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "macroDefine"


	public static class macroParam_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "macroParam"
	// Cpp.g:90:1: macroParam : ( IDENTIFIER ELLIPSIS -> ^( ELLIPSIS IDENTIFIER ) | ELLIPSIS | IDENTIFIER );
	public final CppParser.macroParam_return macroParam() throws RecognitionException {
		CppParser.macroParam_return retval = new CppParser.macroParam_return();
		retval.start = input.LT(1);
		int macroParam_StartIndex = input.index();

		Object root_0 = null;

		Token IDENTIFIER39=null;
		Token ELLIPSIS40=null;
		Token ELLIPSIS41=null;
		Token IDENTIFIER42=null;

		Object IDENTIFIER39_tree=null;
		Object ELLIPSIS40_tree=null;
		Object ELLIPSIS41_tree=null;
		Object IDENTIFIER42_tree=null;
		RewriteRuleTokenStream stream_ELLIPSIS=new RewriteRuleTokenStream(adaptor,"token ELLIPSIS");
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }

			// Cpp.g:91:3: ( IDENTIFIER ELLIPSIS -> ^( ELLIPSIS IDENTIFIER ) | ELLIPSIS | IDENTIFIER )
			int alt16=3;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==IDENTIFIER) ) {
				int LA16_1 = input.LA(2);
				if ( (LA16_1==ELLIPSIS) ) {
					alt16=1;
				}
				else if ( (LA16_1==EOF||LA16_1==COMMA||LA16_1==RPAREN||LA16_1==WS) ) {
					alt16=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 16, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA16_0==ELLIPSIS) ) {
				alt16=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}

			switch (alt16) {
				case 1 :
					// Cpp.g:91:5: IDENTIFIER ELLIPSIS
					{
					IDENTIFIER39=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_macroParam544); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER39);

					ELLIPSIS40=(Token)match(input,ELLIPSIS,FOLLOW_ELLIPSIS_in_macroParam546); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ELLIPSIS.add(ELLIPSIS40);

					// AST REWRITE
					// elements: IDENTIFIER, ELLIPSIS
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 91:25: -> ^( ELLIPSIS IDENTIFIER )
					{
						// Cpp.g:91:27: ^( ELLIPSIS IDENTIFIER )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(stream_ELLIPSIS.nextNode(), root_1);
						adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// Cpp.g:92:5: ELLIPSIS
					{
					root_0 = (Object)adaptor.nil();


					ELLIPSIS41=(Token)match(input,ELLIPSIS,FOLLOW_ELLIPSIS_in_macroParam560); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ELLIPSIS41_tree = (Object)adaptor.create(ELLIPSIS41);
					adaptor.addChild(root_0, ELLIPSIS41_tree);
					}

					}
					break;
				case 3 :
					// Cpp.g:93:5: IDENTIFIER
					{
					root_0 = (Object)adaptor.nil();


					IDENTIFIER42=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_macroParam566); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IDENTIFIER42_tree = (Object)adaptor.create(IDENTIFIER42);
					adaptor.addChild(root_0, IDENTIFIER42_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 5, macroParam_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "macroParam"


	public static class macro_text_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "macro_text"
	// Cpp.g:96:1: macro_text : ( source_text )+ -> ^( MACRO_DEFINE ( source_text )+ ) ;
	public final CppParser.macro_text_return macro_text() throws RecognitionException {
		CppParser.macro_text_return retval = new CppParser.macro_text_return();
		retval.start = input.LT(1);
		int macro_text_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope source_text43 =null;

		RewriteRuleSubtreeStream stream_source_text=new RewriteRuleSubtreeStream(adaptor,"rule source_text");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }

			// Cpp.g:97:3: ( ( source_text )+ -> ^( MACRO_DEFINE ( source_text )+ ) )
			// Cpp.g:97:5: ( source_text )+
			{
			// Cpp.g:97:5: ( source_text )+
			int cnt17=0;
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( ((LA17_0 >= CHARACTER_LITERAL && LA17_0 <= CKEYWORD)||LA17_0==COMMA||(LA17_0 >= COPERATOR && LA17_0 <= DECIMAL_LITERAL)||LA17_0==FLOATING_POINT_LITERAL||LA17_0==HEX_LITERAL||LA17_0==IDENTIFIER||LA17_0==LIB_FILE||LA17_0==LPAREN||LA17_0==OCTAL_LITERAL||LA17_0==RPAREN||(LA17_0 >= SEMICOLON && LA17_0 <= SHARPSHARP)||LA17_0==SIZEOF||(LA17_0 >= STRINGIFICATION && LA17_0 <= TEXT_END)||LA17_0==WS) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// Cpp.g:97:5: source_text
					{
					pushFollow(FOLLOW_source_text_in_macro_text583);
					source_text43=source_text();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_source_text.add(source_text43.getTree());
					}
					break;

				default :
					if ( cnt17 >= 1 ) break loop17;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(17, input);
					throw eee;
				}
				cnt17++;
			}

			// AST REWRITE
			// elements: source_text
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 97:18: -> ^( MACRO_DEFINE ( source_text )+ )
			{
				// Cpp.g:97:21: ^( MACRO_DEFINE ( source_text )+ )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MACRO_DEFINE, "MACRO_DEFINE"), root_1);
				if ( !(stream_source_text.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_source_text.hasNext() ) {
					adaptor.addChild(root_1, stream_source_text.nextTree());
				}
				stream_source_text.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 6, macro_text_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "macro_text"


	public static class macroExecution_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "macroExecution"
	// Cpp.g:100:1: macroExecution : EXEC_MACRO ifexpression -> ^( EXEC_MACRO ifexpression ) ;
	public final CppParser.macroExecution_return macroExecution() throws RecognitionException {
		CppParser.macroExecution_return retval = new CppParser.macroExecution_return();
		retval.start = input.LT(1);
		int macroExecution_StartIndex = input.index();

		Object root_0 = null;

		Token EXEC_MACRO44=null;
		ParserRuleReturnScope ifexpression45 =null;

		Object EXEC_MACRO44_tree=null;
		RewriteRuleTokenStream stream_EXEC_MACRO=new RewriteRuleTokenStream(adaptor,"token EXEC_MACRO");
		RewriteRuleSubtreeStream stream_ifexpression=new RewriteRuleSubtreeStream(adaptor,"rule ifexpression");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }

			// Cpp.g:101:3: ( EXEC_MACRO ifexpression -> ^( EXEC_MACRO ifexpression ) )
			// Cpp.g:101:5: EXEC_MACRO ifexpression
			{
			EXEC_MACRO44=(Token)match(input,EXEC_MACRO,FOLLOW_EXEC_MACRO_in_macroExecution606); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_EXEC_MACRO.add(EXEC_MACRO44);

			pushFollow(FOLLOW_ifexpression_in_macroExecution608);
			ifexpression45=ifexpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_ifexpression.add(ifexpression45.getTree());
			// AST REWRITE
			// elements: ifexpression, EXEC_MACRO
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 101:29: -> ^( EXEC_MACRO ifexpression )
			{
				// Cpp.g:101:32: ^( EXEC_MACRO ifexpression )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_EXEC_MACRO.nextNode(), root_1);
				adaptor.addChild(root_1, stream_ifexpression.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 7, macroExecution_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "macroExecution"


	public static class macroUndef_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "macroUndef"
	// Cpp.g:104:1: macroUndef : UNDEF mac= IDENTIFIER -> ^( UNDEF IDENTIFIER ) ;
	public final CppParser.macroUndef_return macroUndef() throws RecognitionException {
		CppParser.macroUndef_return retval = new CppParser.macroUndef_return();
		retval.start = input.LT(1);
		int macroUndef_StartIndex = input.index();

		Object root_0 = null;

		Token mac=null;
		Token UNDEF46=null;

		Object mac_tree=null;
		Object UNDEF46_tree=null;
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleTokenStream stream_UNDEF=new RewriteRuleTokenStream(adaptor,"token UNDEF");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }

			// Cpp.g:105:3: ( UNDEF mac= IDENTIFIER -> ^( UNDEF IDENTIFIER ) )
			// Cpp.g:105:5: UNDEF mac= IDENTIFIER
			{
			UNDEF46=(Token)match(input,UNDEF,FOLLOW_UNDEF_in_macroUndef631); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_UNDEF.add(UNDEF46);

			mac=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_macroUndef635); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_IDENTIFIER.add(mac);

			// AST REWRITE
			// elements: IDENTIFIER, UNDEF
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 105:27: -> ^( UNDEF IDENTIFIER )
			{
				// Cpp.g:105:30: ^( UNDEF IDENTIFIER )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_UNDEF.nextNode(), root_1);
				adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 8, macroUndef_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "macroUndef"


	public static class conditionalCompilation_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "conditionalCompilation"
	// Cpp.g:108:1: conditionalCompilation : IF ifexp+= ifexpression ifstmt+= statement ( ELIF ifexp+= ifexpression ifstmt+= statement )* ( ELSE elsestmt= statement )? ENDIF -> ^( IF ( $ifexp $ifstmt)+ ( ELSE $elsestmt)? ) ;
	public final CppParser.conditionalCompilation_return conditionalCompilation() throws RecognitionException {
		CppParser.conditionalCompilation_return retval = new CppParser.conditionalCompilation_return();
		retval.start = input.LT(1);
		int conditionalCompilation_StartIndex = input.index();

		Object root_0 = null;

		Token IF47=null;
		Token ELIF48=null;
		Token ELSE49=null;
		Token ENDIF50=null;
		List<Object> list_ifexp=null;
		List<Object> list_ifstmt=null;
		ParserRuleReturnScope elsestmt =null;
		RuleReturnScope ifexp = null;
		RuleReturnScope ifstmt = null;
		Object IF47_tree=null;
		Object ELIF48_tree=null;
		Object ELSE49_tree=null;
		Object ENDIF50_tree=null;
		RewriteRuleTokenStream stream_ELIF=new RewriteRuleTokenStream(adaptor,"token ELIF");
		RewriteRuleTokenStream stream_ENDIF=new RewriteRuleTokenStream(adaptor,"token ENDIF");
		RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
		RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
		RewriteRuleSubtreeStream stream_ifexpression=new RewriteRuleSubtreeStream(adaptor,"rule ifexpression");
		RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }

			// Cpp.g:109:3: ( IF ifexp+= ifexpression ifstmt+= statement ( ELIF ifexp+= ifexpression ifstmt+= statement )* ( ELSE elsestmt= statement )? ENDIF -> ^( IF ( $ifexp $ifstmt)+ ( ELSE $elsestmt)? ) )
			// Cpp.g:109:5: IF ifexp+= ifexpression ifstmt+= statement ( ELIF ifexp+= ifexpression ifstmt+= statement )* ( ELSE elsestmt= statement )? ENDIF
			{
			IF47=(Token)match(input,IF,FOLLOW_IF_in_conditionalCompilation657); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_IF.add(IF47);

			pushFollow(FOLLOW_ifexpression_in_conditionalCompilation662);
			ifexp=ifexpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_ifexpression.add(ifexp.getTree());
			if (list_ifexp==null) list_ifexp=new ArrayList<Object>();
			list_ifexp.add(ifexp.getTree());
			pushFollow(FOLLOW_statement_in_conditionalCompilation667);
			ifstmt=statement();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_statement.add(ifstmt.getTree());
			if (list_ifstmt==null) list_ifstmt=new ArrayList<Object>();
			list_ifstmt.add(ifstmt.getTree());
			// Cpp.g:110:4: ( ELIF ifexp+= ifexpression ifstmt+= statement )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==ELIF) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// Cpp.g:110:5: ELIF ifexp+= ifexpression ifstmt+= statement
					{
					ELIF48=(Token)match(input,ELIF,FOLLOW_ELIF_in_conditionalCompilation675); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ELIF.add(ELIF48);

					pushFollow(FOLLOW_ifexpression_in_conditionalCompilation679);
					ifexp=ifexpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_ifexpression.add(ifexp.getTree());
					if (list_ifexp==null) list_ifexp=new ArrayList<Object>();
					list_ifexp.add(ifexp.getTree());
					pushFollow(FOLLOW_statement_in_conditionalCompilation684);
					ifstmt=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_statement.add(ifstmt.getTree());
					if (list_ifstmt==null) list_ifstmt=new ArrayList<Object>();
					list_ifstmt.add(ifstmt.getTree());
					}
					break;

				default :
					break loop18;
				}
			}

			// Cpp.g:110:53: ( ELSE elsestmt= statement )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==ELSE) ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// Cpp.g:110:54: ELSE elsestmt= statement
					{
					ELSE49=(Token)match(input,ELSE,FOLLOW_ELSE_in_conditionalCompilation691); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ELSE.add(ELSE49);

					pushFollow(FOLLOW_statement_in_conditionalCompilation696);
					elsestmt=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_statement.add(elsestmt.getTree());
					}
					break;

			}

			ENDIF50=(Token)match(input,ENDIF,FOLLOW_ENDIF_in_conditionalCompilation700); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ENDIF.add(ENDIF50);

			// AST REWRITE
			// elements: ifstmt, elsestmt, ELSE, IF, ifexp
			// token labels: 
			// rule labels: elsestmt, retval
			// token list labels: 
			// rule list labels: ifstmt, ifexp
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_elsestmt=new RewriteRuleSubtreeStream(adaptor,"rule elsestmt",elsestmt!=null?elsestmt.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_ifstmt=new RewriteRuleSubtreeStream(adaptor,"token ifstmt",list_ifstmt);
			RewriteRuleSubtreeStream stream_ifexp=new RewriteRuleSubtreeStream(adaptor,"token ifexp",list_ifexp);
			root_0 = (Object)adaptor.nil();
			// 111:4: -> ^( IF ( $ifexp $ifstmt)+ ( ELSE $elsestmt)? )
			{
				// Cpp.g:111:8: ^( IF ( $ifexp $ifstmt)+ ( ELSE $elsestmt)? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_IF.nextNode(), root_1);
				if ( !(stream_ifstmt.hasNext()||stream_ifexp.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_ifstmt.hasNext()||stream_ifexp.hasNext() ) {
					adaptor.addChild(root_1, stream_ifexp.nextTree());
					adaptor.addChild(root_1, stream_ifstmt.nextTree());
				}
				stream_ifstmt.reset();
				stream_ifexp.reset();

				// Cpp.g:111:31: ( ELSE $elsestmt)?
				if ( stream_elsestmt.hasNext()||stream_ELSE.hasNext() ) {
					adaptor.addChild(root_1, stream_ELSE.nextNode());
					adaptor.addChild(root_1, stream_elsestmt.nextTree());
				}
				stream_elsestmt.reset();
				stream_ELSE.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 9, conditionalCompilation_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "conditionalCompilation"


	public static class lineControl_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "lineControl"
	// Cpp.g:114:1: lineControl : LINE n= DECIMAL_LITERAL (theFile= STRING_LITERAL )? -> ^( LINE $n ( $theFile)? ) ;
	public final CppParser.lineControl_return lineControl() throws RecognitionException {
		CppParser.lineControl_return retval = new CppParser.lineControl_return();
		retval.start = input.LT(1);
		int lineControl_StartIndex = input.index();

		Object root_0 = null;

		Token n=null;
		Token theFile=null;
		Token LINE51=null;

		Object n_tree=null;
		Object theFile_tree=null;
		Object LINE51_tree=null;
		RewriteRuleTokenStream stream_LINE=new RewriteRuleTokenStream(adaptor,"token LINE");
		RewriteRuleTokenStream stream_STRING_LITERAL=new RewriteRuleTokenStream(adaptor,"token STRING_LITERAL");
		RewriteRuleTokenStream stream_DECIMAL_LITERAL=new RewriteRuleTokenStream(adaptor,"token DECIMAL_LITERAL");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }

			// Cpp.g:115:3: ( LINE n= DECIMAL_LITERAL (theFile= STRING_LITERAL )? -> ^( LINE $n ( $theFile)? ) )
			// Cpp.g:115:5: LINE n= DECIMAL_LITERAL (theFile= STRING_LITERAL )?
			{
			LINE51=(Token)match(input,LINE,FOLLOW_LINE_in_lineControl743); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LINE.add(LINE51);

			n=(Token)match(input,DECIMAL_LITERAL,FOLLOW_DECIMAL_LITERAL_in_lineControl747); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_DECIMAL_LITERAL.add(n);

			// Cpp.g:115:28: (theFile= STRING_LITERAL )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==STRING_LITERAL) ) {
				alt20=1;
			}
			switch (alt20) {
				case 1 :
					// Cpp.g:115:29: theFile= STRING_LITERAL
					{
					theFile=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_lineControl752); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_STRING_LITERAL.add(theFile);

					}
					break;

			}

			// AST REWRITE
			// elements: LINE, theFile, n
			// token labels: theFile, n
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_theFile=new RewriteRuleTokenStream(adaptor,"token theFile",theFile);
			RewriteRuleTokenStream stream_n=new RewriteRuleTokenStream(adaptor,"token n",n);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 115:55: -> ^( LINE $n ( $theFile)? )
			{
				// Cpp.g:115:57: ^( LINE $n ( $theFile)? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_LINE.nextNode(), root_1);
				adaptor.addChild(root_1, stream_n.nextNode());
				// Cpp.g:115:67: ( $theFile)?
				if ( stream_theFile.hasNext() ) {
					adaptor.addChild(root_1, stream_theFile.nextNode());
				}
				stream_theFile.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 10, lineControl_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "lineControl"


	public static class diagnostics_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "diagnostics"
	// Cpp.g:118:1: diagnostics : ( WARNING -> ^( WARNING ) | ERROR -> ^( ERROR ) | PRAGMA -> ^( PRAGMA ) );
	public final CppParser.diagnostics_return diagnostics() throws RecognitionException {
		CppParser.diagnostics_return retval = new CppParser.diagnostics_return();
		retval.start = input.LT(1);
		int diagnostics_StartIndex = input.index();

		Object root_0 = null;

		Token WARNING52=null;
		Token ERROR53=null;
		Token PRAGMA54=null;

		Object WARNING52_tree=null;
		Object ERROR53_tree=null;
		Object PRAGMA54_tree=null;
		RewriteRuleTokenStream stream_PRAGMA=new RewriteRuleTokenStream(adaptor,"token PRAGMA");
		RewriteRuleTokenStream stream_ERROR=new RewriteRuleTokenStream(adaptor,"token ERROR");
		RewriteRuleTokenStream stream_WARNING=new RewriteRuleTokenStream(adaptor,"token WARNING");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }

			// Cpp.g:119:3: ( WARNING -> ^( WARNING ) | ERROR -> ^( ERROR ) | PRAGMA -> ^( PRAGMA ) )
			int alt21=3;
			switch ( input.LA(1) ) {
			case WARNING:
				{
				alt21=1;
				}
				break;
			case ERROR:
				{
				alt21=2;
				}
				break;
			case PRAGMA:
				{
				alt21=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}
			switch (alt21) {
				case 1 :
					// Cpp.g:119:5: WARNING
					{
					WARNING52=(Token)match(input,WARNING,FOLLOW_WARNING_in_diagnostics785); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_WARNING.add(WARNING52);

					// AST REWRITE
					// elements: WARNING
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 119:13: -> ^( WARNING )
					{
						// Cpp.g:119:16: ^( WARNING )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(stream_WARNING.nextNode(), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// Cpp.g:120:5: ERROR
					{
					ERROR53=(Token)match(input,ERROR,FOLLOW_ERROR_in_diagnostics797); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ERROR.add(ERROR53);

					// AST REWRITE
					// elements: ERROR
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 120:11: -> ^( ERROR )
					{
						// Cpp.g:120:14: ^( ERROR )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(stream_ERROR.nextNode(), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// Cpp.g:121:5: PRAGMA
					{
					PRAGMA54=(Token)match(input,PRAGMA,FOLLOW_PRAGMA_in_diagnostics809); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_PRAGMA.add(PRAGMA54);

					// AST REWRITE
					// elements: PRAGMA
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 121:12: -> ^( PRAGMA )
					{
						// Cpp.g:121:15: ^( PRAGMA )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(stream_PRAGMA.nextNode(), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 11, diagnostics_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "diagnostics"


	public static class text_line_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "text_line"
	// Cpp.g:124:1: text_line : ( source_text )+ -> ^( TEXT_LINE ( source_text )+ ) ;
	public final CppParser.text_line_return text_line() throws RecognitionException {
		CppParser.text_line_return retval = new CppParser.text_line_return();
		retval.start = input.LT(1);
		int text_line_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope source_text55 =null;

		RewriteRuleSubtreeStream stream_source_text=new RewriteRuleSubtreeStream(adaptor,"rule source_text");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }

			// Cpp.g:125:3: ( ( source_text )+ -> ^( TEXT_LINE ( source_text )+ ) )
			// Cpp.g:125:5: ( source_text )+
			{
			// Cpp.g:125:5: ( source_text )+
			int cnt22=0;
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( ((LA22_0 >= CHARACTER_LITERAL && LA22_0 <= CKEYWORD)||LA22_0==COMMA||(LA22_0 >= COPERATOR && LA22_0 <= DECIMAL_LITERAL)||LA22_0==FLOATING_POINT_LITERAL||LA22_0==HEX_LITERAL||LA22_0==IDENTIFIER||LA22_0==LIB_FILE||LA22_0==LPAREN||LA22_0==OCTAL_LITERAL||LA22_0==RPAREN||(LA22_0 >= SEMICOLON && LA22_0 <= SHARPSHARP)||LA22_0==SIZEOF||(LA22_0 >= STRINGIFICATION && LA22_0 <= TEXT_END)||LA22_0==WS) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// Cpp.g:125:5: source_text
					{
					pushFollow(FOLLOW_source_text_in_text_line830);
					source_text55=source_text();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_source_text.add(source_text55.getTree());
					}
					break;

				default :
					if ( cnt22 >= 1 ) break loop22;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(22, input);
					throw eee;
				}
				cnt22++;
			}

			// AST REWRITE
			// elements: source_text
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 125:22: -> ^( TEXT_LINE ( source_text )+ )
			{
				// Cpp.g:125:25: ^( TEXT_LINE ( source_text )+ )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TEXT_LINE, "TEXT_LINE"), root_1);
				if ( !(stream_source_text.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_source_text.hasNext() ) {
					adaptor.addChild(root_1, stream_source_text.nextTree());
				}
				stream_source_text.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 12, text_line_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "text_line"


	public static class statement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "statement"
	// Cpp.g:129:1: statement : ( procLine )+ ;
	public final CppParser.statement_return statement() throws RecognitionException {
		CppParser.statement_return retval = new CppParser.statement_return();
		retval.start = input.LT(1);
		int statement_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope procLine56 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }

			// Cpp.g:130:3: ( ( procLine )+ )
			// Cpp.g:130:5: ( procLine )+
			{
			root_0 = (Object)adaptor.nil();


			// Cpp.g:130:5: ( procLine )+
			int cnt23=0;
			loop23:
			while (true) {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( ((LA23_0 >= CHARACTER_LITERAL && LA23_0 <= CKEYWORD)||LA23_0==COMMA||(LA23_0 >= COPERATOR && LA23_0 <= DEFINE)||LA23_0==DIRECTIVE||LA23_0==ERROR||LA23_0==EXEC_MACRO||LA23_0==End||LA23_0==FLOATING_POINT_LITERAL||LA23_0==HEX_LITERAL||(LA23_0 >= IDENTIFIER && LA23_0 <= IF)||LA23_0==INCLUDE||(LA23_0 >= LIB_FILE && LA23_0 <= LINE)||LA23_0==LPAREN||LA23_0==OCTAL_LITERAL||LA23_0==PRAGMA||LA23_0==RPAREN||(LA23_0 >= SEMICOLON && LA23_0 <= SHARPSHARP)||LA23_0==SIZEOF||(LA23_0 >= STRINGIFICATION && LA23_0 <= TEXT_END)||LA23_0==UNDEF||(LA23_0 >= WARNING && LA23_0 <= WS)) ) {
					alt23=1;
				}

				switch (alt23) {
				case 1 :
					// Cpp.g:130:5: procLine
					{
					pushFollow(FOLLOW_procLine_in_statement861);
					procLine56=procLine();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, procLine56.getTree());

					}
					break;

				default :
					if ( cnt23 >= 1 ) break loop23;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(23, input);
					throw eee;
				}
				cnt23++;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 13, statement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "statement"


	public static class type_name_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "type_name"
	// Cpp.g:133:1: type_name : IDENTIFIER ;
	public final CppParser.type_name_return type_name() throws RecognitionException {
		CppParser.type_name_return retval = new CppParser.type_name_return();
		retval.start = input.LT(1);
		int type_name_StartIndex = input.index();

		Object root_0 = null;

		Token IDENTIFIER57=null;

		Object IDENTIFIER57_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }

			// Cpp.g:134:3: ( IDENTIFIER )
			// Cpp.g:134:5: IDENTIFIER
			{
			root_0 = (Object)adaptor.nil();


			IDENTIFIER57=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_type_name877); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IDENTIFIER57_tree = (Object)adaptor.create(IDENTIFIER57);
			adaptor.addChild(root_0, IDENTIFIER57_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 14, type_name_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "type_name"


	public static class ifexpression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "ifexpression"
	// Cpp.g:137:1: ifexpression : ( IDENTIFIER {...}? -> ^( EXPR_NDEF IDENTIFIER ) | IDENTIFIER {...}? -> ^( EXPR_DEF IDENTIFIER ) | assignmentExpression -> ^( EXPR assignmentExpression ) );
	public final CppParser.ifexpression_return ifexpression() throws RecognitionException {
		CppParser.ifexpression_return retval = new CppParser.ifexpression_return();
		retval.start = input.LT(1);
		int ifexpression_StartIndex = input.index();

		Object root_0 = null;

		Token IDENTIFIER58=null;
		Token IDENTIFIER59=null;
		ParserRuleReturnScope assignmentExpression60 =null;

		Object IDENTIFIER58_tree=null;
		Object IDENTIFIER59_tree=null;
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleSubtreeStream stream_assignmentExpression=new RewriteRuleSubtreeStream(adaptor,"rule assignmentExpression");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }

			// Cpp.g:138:3: ( IDENTIFIER {...}? -> ^( EXPR_NDEF IDENTIFIER ) | IDENTIFIER {...}? -> ^( EXPR_DEF IDENTIFIER ) | assignmentExpression -> ^( EXPR assignmentExpression ) )
			int alt24=3;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==IDENTIFIER) ) {
				int LA24_1 = input.LA(2);
				if ( (synpred37_Cpp()) ) {
					alt24=1;
				}
				else if ( (synpred38_Cpp()) ) {
					alt24=2;
				}
				else if ( (true) ) {
					alt24=3;
				}

			}
			else if ( (LA24_0==AMPERSAND||LA24_0==CHARACTER_LITERAL||LA24_0==DECIMAL_LITERAL||LA24_0==DEFINED||LA24_0==FLOATING_POINT_LITERAL||LA24_0==HEX_LITERAL||LA24_0==LPAREN||LA24_0==MINUS||LA24_0==MINUSMINUS||LA24_0==NOT||LA24_0==OCTAL_LITERAL||LA24_0==PLUS||LA24_0==PLUSPLUS||LA24_0==SIZEOF||LA24_0==STAR||LA24_0==STRING_LITERAL||LA24_0==TILDE) ) {
				alt24=3;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				throw nvae;
			}

			switch (alt24) {
				case 1 :
					// Cpp.g:138:5: IDENTIFIER {...}?
					{
					IDENTIFIER58=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_ifexpression890); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER58);

					if ( !((input.LT(-2).getText().equals("ifndef"))) ) {
						if (state.backtracking>0) {state.failed=true; return retval;}
						throw new FailedPredicateException(input, "ifexpression", "input.LT(-2).getText().equals(\"ifndef\")");
					}
					// AST REWRITE
					// elements: IDENTIFIER
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 138:62: -> ^( EXPR_NDEF IDENTIFIER )
					{
						// Cpp.g:138:65: ^( EXPR_NDEF IDENTIFIER )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPR_NDEF, "EXPR_NDEF"), root_1);
						adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// Cpp.g:139:5: IDENTIFIER {...}?
					{
					IDENTIFIER59=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_ifexpression910); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER59);

					if ( !((input.LT(-2).getText().equals("ifdef"))) ) {
						if (state.backtracking>0) {state.failed=true; return retval;}
						throw new FailedPredicateException(input, "ifexpression", "input.LT(-2).getText().equals(\"ifdef\")");
					}
					// AST REWRITE
					// elements: IDENTIFIER
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 139:61: -> ^( EXPR_DEF IDENTIFIER )
					{
						// Cpp.g:139:64: ^( EXPR_DEF IDENTIFIER )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPR_DEF, "EXPR_DEF"), root_1);
						adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// Cpp.g:140:5: assignmentExpression
					{
					pushFollow(FOLLOW_assignmentExpression_in_ifexpression930);
					assignmentExpression60=assignmentExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_assignmentExpression.add(assignmentExpression60.getTree());
					// AST REWRITE
					// elements: assignmentExpression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 140:26: -> ^( EXPR assignmentExpression )
					{
						// Cpp.g:140:29: ^( EXPR assignmentExpression )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPR, "EXPR"), root_1);
						adaptor.addChild(root_1, stream_assignmentExpression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 15, ifexpression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "ifexpression"


	public static class assignmentExpression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "assignmentExpression"
	// Cpp.g:143:1: assignmentExpression : conditionalExpression ( ( ASSIGNEQUAL ^| TIMESEQUAL ^| DIVIDEEQUAL ^| MODEQUAL ^| PLUSEQUAL ^| MINUSEQUAL ^| SHIFTLEFTEQUAL ^| SHIFTRIGHTEQUAL ^| BITWISEANDEQUAL ^| BITWISEXOREQUAL ^| BITWISEOREQUAL ^) assignmentExpression )? ;
	public final CppParser.assignmentExpression_return assignmentExpression() throws RecognitionException {
		CppParser.assignmentExpression_return retval = new CppParser.assignmentExpression_return();
		retval.start = input.LT(1);
		int assignmentExpression_StartIndex = input.index();

		Object root_0 = null;

		Token ASSIGNEQUAL62=null;
		Token TIMESEQUAL63=null;
		Token DIVIDEEQUAL64=null;
		Token MODEQUAL65=null;
		Token PLUSEQUAL66=null;
		Token MINUSEQUAL67=null;
		Token SHIFTLEFTEQUAL68=null;
		Token SHIFTRIGHTEQUAL69=null;
		Token BITWISEANDEQUAL70=null;
		Token BITWISEXOREQUAL71=null;
		Token BITWISEOREQUAL72=null;
		ParserRuleReturnScope conditionalExpression61 =null;
		ParserRuleReturnScope assignmentExpression73 =null;

		Object ASSIGNEQUAL62_tree=null;
		Object TIMESEQUAL63_tree=null;
		Object DIVIDEEQUAL64_tree=null;
		Object MODEQUAL65_tree=null;
		Object PLUSEQUAL66_tree=null;
		Object MINUSEQUAL67_tree=null;
		Object SHIFTLEFTEQUAL68_tree=null;
		Object SHIFTRIGHTEQUAL69_tree=null;
		Object BITWISEANDEQUAL70_tree=null;
		Object BITWISEXOREQUAL71_tree=null;
		Object BITWISEOREQUAL72_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }

			// Cpp.g:144:3: ( conditionalExpression ( ( ASSIGNEQUAL ^| TIMESEQUAL ^| DIVIDEEQUAL ^| MODEQUAL ^| PLUSEQUAL ^| MINUSEQUAL ^| SHIFTLEFTEQUAL ^| SHIFTRIGHTEQUAL ^| BITWISEANDEQUAL ^| BITWISEXOREQUAL ^| BITWISEOREQUAL ^) assignmentExpression )? )
			// Cpp.g:144:5: conditionalExpression ( ( ASSIGNEQUAL ^| TIMESEQUAL ^| DIVIDEEQUAL ^| MODEQUAL ^| PLUSEQUAL ^| MINUSEQUAL ^| SHIFTLEFTEQUAL ^| SHIFTRIGHTEQUAL ^| BITWISEANDEQUAL ^| BITWISEXOREQUAL ^| BITWISEOREQUAL ^) assignmentExpression )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_conditionalExpression_in_assignmentExpression951);
			conditionalExpression61=conditionalExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalExpression61.getTree());

			// Cpp.g:145:4: ( ( ASSIGNEQUAL ^| TIMESEQUAL ^| DIVIDEEQUAL ^| MODEQUAL ^| PLUSEQUAL ^| MINUSEQUAL ^| SHIFTLEFTEQUAL ^| SHIFTRIGHTEQUAL ^| BITWISEANDEQUAL ^| BITWISEXOREQUAL ^| BITWISEOREQUAL ^) assignmentExpression )?
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==ASSIGNEQUAL||LA26_0==BITWISEANDEQUAL||LA26_0==BITWISEOREQUAL||LA26_0==BITWISEXOREQUAL||LA26_0==DIVIDEEQUAL||LA26_0==MINUSEQUAL||LA26_0==MODEQUAL||LA26_0==PLUSEQUAL||LA26_0==SHIFTLEFTEQUAL||LA26_0==SHIFTRIGHTEQUAL||LA26_0==TIMESEQUAL) ) {
				alt26=1;
			}
			switch (alt26) {
				case 1 :
					// Cpp.g:145:6: ( ASSIGNEQUAL ^| TIMESEQUAL ^| DIVIDEEQUAL ^| MODEQUAL ^| PLUSEQUAL ^| MINUSEQUAL ^| SHIFTLEFTEQUAL ^| SHIFTRIGHTEQUAL ^| BITWISEANDEQUAL ^| BITWISEXOREQUAL ^| BITWISEOREQUAL ^) assignmentExpression
					{
					// Cpp.g:145:6: ( ASSIGNEQUAL ^| TIMESEQUAL ^| DIVIDEEQUAL ^| MODEQUAL ^| PLUSEQUAL ^| MINUSEQUAL ^| SHIFTLEFTEQUAL ^| SHIFTRIGHTEQUAL ^| BITWISEANDEQUAL ^| BITWISEXOREQUAL ^| BITWISEOREQUAL ^)
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
					case MODEQUAL:
						{
						alt25=4;
						}
						break;
					case PLUSEQUAL:
						{
						alt25=5;
						}
						break;
					case MINUSEQUAL:
						{
						alt25=6;
						}
						break;
					case SHIFTLEFTEQUAL:
						{
						alt25=7;
						}
						break;
					case SHIFTRIGHTEQUAL:
						{
						alt25=8;
						}
						break;
					case BITWISEANDEQUAL:
						{
						alt25=9;
						}
						break;
					case BITWISEXOREQUAL:
						{
						alt25=10;
						}
						break;
					case BITWISEOREQUAL:
						{
						alt25=11;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 25, 0, input);
						throw nvae;
					}
					switch (alt25) {
						case 1 :
							// Cpp.g:145:8: ASSIGNEQUAL ^
							{
							ASSIGNEQUAL62=(Token)match(input,ASSIGNEQUAL,FOLLOW_ASSIGNEQUAL_in_assignmentExpression960); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							ASSIGNEQUAL62_tree = (Object)adaptor.create(ASSIGNEQUAL62);
							root_0 = (Object)adaptor.becomeRoot(ASSIGNEQUAL62_tree, root_0);
							}

							}
							break;
						case 2 :
							// Cpp.g:146:9: TIMESEQUAL ^
							{
							TIMESEQUAL63=(Token)match(input,TIMESEQUAL,FOLLOW_TIMESEQUAL_in_assignmentExpression971); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							TIMESEQUAL63_tree = (Object)adaptor.create(TIMESEQUAL63);
							root_0 = (Object)adaptor.becomeRoot(TIMESEQUAL63_tree, root_0);
							}

							}
							break;
						case 3 :
							// Cpp.g:147:9: DIVIDEEQUAL ^
							{
							DIVIDEEQUAL64=(Token)match(input,DIVIDEEQUAL,FOLLOW_DIVIDEEQUAL_in_assignmentExpression982); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							DIVIDEEQUAL64_tree = (Object)adaptor.create(DIVIDEEQUAL64);
							root_0 = (Object)adaptor.becomeRoot(DIVIDEEQUAL64_tree, root_0);
							}

							}
							break;
						case 4 :
							// Cpp.g:148:9: MODEQUAL ^
							{
							MODEQUAL65=(Token)match(input,MODEQUAL,FOLLOW_MODEQUAL_in_assignmentExpression993); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							MODEQUAL65_tree = (Object)adaptor.create(MODEQUAL65);
							root_0 = (Object)adaptor.becomeRoot(MODEQUAL65_tree, root_0);
							}

							}
							break;
						case 5 :
							// Cpp.g:149:9: PLUSEQUAL ^
							{
							PLUSEQUAL66=(Token)match(input,PLUSEQUAL,FOLLOW_PLUSEQUAL_in_assignmentExpression1004); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							PLUSEQUAL66_tree = (Object)adaptor.create(PLUSEQUAL66);
							root_0 = (Object)adaptor.becomeRoot(PLUSEQUAL66_tree, root_0);
							}

							}
							break;
						case 6 :
							// Cpp.g:150:9: MINUSEQUAL ^
							{
							MINUSEQUAL67=(Token)match(input,MINUSEQUAL,FOLLOW_MINUSEQUAL_in_assignmentExpression1015); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							MINUSEQUAL67_tree = (Object)adaptor.create(MINUSEQUAL67);
							root_0 = (Object)adaptor.becomeRoot(MINUSEQUAL67_tree, root_0);
							}

							}
							break;
						case 7 :
							// Cpp.g:151:9: SHIFTLEFTEQUAL ^
							{
							SHIFTLEFTEQUAL68=(Token)match(input,SHIFTLEFTEQUAL,FOLLOW_SHIFTLEFTEQUAL_in_assignmentExpression1026); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							SHIFTLEFTEQUAL68_tree = (Object)adaptor.create(SHIFTLEFTEQUAL68);
							root_0 = (Object)adaptor.becomeRoot(SHIFTLEFTEQUAL68_tree, root_0);
							}

							}
							break;
						case 8 :
							// Cpp.g:152:9: SHIFTRIGHTEQUAL ^
							{
							SHIFTRIGHTEQUAL69=(Token)match(input,SHIFTRIGHTEQUAL,FOLLOW_SHIFTRIGHTEQUAL_in_assignmentExpression1037); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							SHIFTRIGHTEQUAL69_tree = (Object)adaptor.create(SHIFTRIGHTEQUAL69);
							root_0 = (Object)adaptor.becomeRoot(SHIFTRIGHTEQUAL69_tree, root_0);
							}

							}
							break;
						case 9 :
							// Cpp.g:153:7: BITWISEANDEQUAL ^
							{
							BITWISEANDEQUAL70=(Token)match(input,BITWISEANDEQUAL,FOLLOW_BITWISEANDEQUAL_in_assignmentExpression1046); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							BITWISEANDEQUAL70_tree = (Object)adaptor.create(BITWISEANDEQUAL70);
							root_0 = (Object)adaptor.becomeRoot(BITWISEANDEQUAL70_tree, root_0);
							}

							}
							break;
						case 10 :
							// Cpp.g:154:7: BITWISEXOREQUAL ^
							{
							BITWISEXOREQUAL71=(Token)match(input,BITWISEXOREQUAL,FOLLOW_BITWISEXOREQUAL_in_assignmentExpression1055); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							BITWISEXOREQUAL71_tree = (Object)adaptor.create(BITWISEXOREQUAL71);
							root_0 = (Object)adaptor.becomeRoot(BITWISEXOREQUAL71_tree, root_0);
							}

							}
							break;
						case 11 :
							// Cpp.g:155:7: BITWISEOREQUAL ^
							{
							BITWISEOREQUAL72=(Token)match(input,BITWISEOREQUAL,FOLLOW_BITWISEOREQUAL_in_assignmentExpression1064); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							BITWISEOREQUAL72_tree = (Object)adaptor.create(BITWISEOREQUAL72);
							root_0 = (Object)adaptor.becomeRoot(BITWISEOREQUAL72_tree, root_0);
							}

							}
							break;

					}

					pushFollow(FOLLOW_assignmentExpression_in_assignmentExpression1076);
					assignmentExpression73=assignmentExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, assignmentExpression73.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 16, assignmentExpression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "assignmentExpression"


	public static class conditionalExpression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "conditionalExpression"
	// Cpp.g:161:1: conditionalExpression : logicalOrExpression ( QUESTIONMARK ^ assignmentExpression COLON conditionalExpression )? ;
	public final CppParser.conditionalExpression_return conditionalExpression() throws RecognitionException {
		CppParser.conditionalExpression_return retval = new CppParser.conditionalExpression_return();
		retval.start = input.LT(1);
		int conditionalExpression_StartIndex = input.index();

		Object root_0 = null;

		Token QUESTIONMARK75=null;
		Token COLON77=null;
		ParserRuleReturnScope logicalOrExpression74 =null;
		ParserRuleReturnScope assignmentExpression76 =null;
		ParserRuleReturnScope conditionalExpression78 =null;

		Object QUESTIONMARK75_tree=null;
		Object COLON77_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }

			// Cpp.g:162:3: ( logicalOrExpression ( QUESTIONMARK ^ assignmentExpression COLON conditionalExpression )? )
			// Cpp.g:162:5: logicalOrExpression ( QUESTIONMARK ^ assignmentExpression COLON conditionalExpression )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_logicalOrExpression_in_conditionalExpression1095);
			logicalOrExpression74=logicalOrExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, logicalOrExpression74.getTree());

			// Cpp.g:163:4: ( QUESTIONMARK ^ assignmentExpression COLON conditionalExpression )?
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0==QUESTIONMARK) ) {
				alt27=1;
			}
			switch (alt27) {
				case 1 :
					// Cpp.g:163:6: QUESTIONMARK ^ assignmentExpression COLON conditionalExpression
					{
					QUESTIONMARK75=(Token)match(input,QUESTIONMARK,FOLLOW_QUESTIONMARK_in_conditionalExpression1103); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					QUESTIONMARK75_tree = (Object)adaptor.create(QUESTIONMARK75);
					root_0 = (Object)adaptor.becomeRoot(QUESTIONMARK75_tree, root_0);
					}

					pushFollow(FOLLOW_assignmentExpression_in_conditionalExpression1106);
					assignmentExpression76=assignmentExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, assignmentExpression76.getTree());

					COLON77=(Token)match(input,COLON,FOLLOW_COLON_in_conditionalExpression1108); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					COLON77_tree = (Object)adaptor.create(COLON77);
					adaptor.addChild(root_0, COLON77_tree);
					}

					pushFollow(FOLLOW_conditionalExpression_in_conditionalExpression1110);
					conditionalExpression78=conditionalExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalExpression78.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 17, conditionalExpression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "conditionalExpression"


	public static class logicalOrExpression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "logicalOrExpression"
	// Cpp.g:166:1: logicalOrExpression : logicalAndExpression ( OR ^ logicalAndExpression )* ;
	public final CppParser.logicalOrExpression_return logicalOrExpression() throws RecognitionException {
		CppParser.logicalOrExpression_return retval = new CppParser.logicalOrExpression_return();
		retval.start = input.LT(1);
		int logicalOrExpression_StartIndex = input.index();

		Object root_0 = null;

		Token OR80=null;
		ParserRuleReturnScope logicalAndExpression79 =null;
		ParserRuleReturnScope logicalAndExpression81 =null;

		Object OR80_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }

			// Cpp.g:167:3: ( logicalAndExpression ( OR ^ logicalAndExpression )* )
			// Cpp.g:167:5: logicalAndExpression ( OR ^ logicalAndExpression )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_logicalAndExpression_in_logicalOrExpression1126);
			logicalAndExpression79=logicalAndExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, logicalAndExpression79.getTree());

			// Cpp.g:167:26: ( OR ^ logicalAndExpression )*
			loop28:
			while (true) {
				int alt28=2;
				int LA28_0 = input.LA(1);
				if ( (LA28_0==OR) ) {
					alt28=1;
				}

				switch (alt28) {
				case 1 :
					// Cpp.g:167:27: OR ^ logicalAndExpression
					{
					OR80=(Token)match(input,OR,FOLLOW_OR_in_logicalOrExpression1129); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					OR80_tree = (Object)adaptor.create(OR80);
					root_0 = (Object)adaptor.becomeRoot(OR80_tree, root_0);
					}

					pushFollow(FOLLOW_logicalAndExpression_in_logicalOrExpression1132);
					logicalAndExpression81=logicalAndExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, logicalAndExpression81.getTree());

					}
					break;

				default :
					break loop28;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 18, logicalOrExpression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "logicalOrExpression"


	public static class logicalAndExpression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "logicalAndExpression"
	// Cpp.g:170:1: logicalAndExpression : inclusiveOrExpression ( AND ^ inclusiveOrExpression )* ;
	public final CppParser.logicalAndExpression_return logicalAndExpression() throws RecognitionException {
		CppParser.logicalAndExpression_return retval = new CppParser.logicalAndExpression_return();
		retval.start = input.LT(1);
		int logicalAndExpression_StartIndex = input.index();

		Object root_0 = null;

		Token AND83=null;
		ParserRuleReturnScope inclusiveOrExpression82 =null;
		ParserRuleReturnScope inclusiveOrExpression84 =null;

		Object AND83_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }

			// Cpp.g:171:3: ( inclusiveOrExpression ( AND ^ inclusiveOrExpression )* )
			// Cpp.g:171:5: inclusiveOrExpression ( AND ^ inclusiveOrExpression )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_inclusiveOrExpression_in_logicalAndExpression1147);
			inclusiveOrExpression82=inclusiveOrExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, inclusiveOrExpression82.getTree());

			// Cpp.g:171:27: ( AND ^ inclusiveOrExpression )*
			loop29:
			while (true) {
				int alt29=2;
				int LA29_0 = input.LA(1);
				if ( (LA29_0==AND) ) {
					alt29=1;
				}

				switch (alt29) {
				case 1 :
					// Cpp.g:171:28: AND ^ inclusiveOrExpression
					{
					AND83=(Token)match(input,AND,FOLLOW_AND_in_logicalAndExpression1150); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					AND83_tree = (Object)adaptor.create(AND83);
					root_0 = (Object)adaptor.becomeRoot(AND83_tree, root_0);
					}

					pushFollow(FOLLOW_inclusiveOrExpression_in_logicalAndExpression1153);
					inclusiveOrExpression84=inclusiveOrExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, inclusiveOrExpression84.getTree());

					}
					break;

				default :
					break loop29;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 19, logicalAndExpression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "logicalAndExpression"


	public static class inclusiveOrExpression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "inclusiveOrExpression"
	// Cpp.g:174:1: inclusiveOrExpression : exclusiveOrExpression ( BITWISEOR ^ exclusiveOrExpression )* ;
	public final CppParser.inclusiveOrExpression_return inclusiveOrExpression() throws RecognitionException {
		CppParser.inclusiveOrExpression_return retval = new CppParser.inclusiveOrExpression_return();
		retval.start = input.LT(1);
		int inclusiveOrExpression_StartIndex = input.index();

		Object root_0 = null;

		Token BITWISEOR86=null;
		ParserRuleReturnScope exclusiveOrExpression85 =null;
		ParserRuleReturnScope exclusiveOrExpression87 =null;

		Object BITWISEOR86_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }

			// Cpp.g:175:3: ( exclusiveOrExpression ( BITWISEOR ^ exclusiveOrExpression )* )
			// Cpp.g:175:5: exclusiveOrExpression ( BITWISEOR ^ exclusiveOrExpression )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_exclusiveOrExpression_in_inclusiveOrExpression1168);
			exclusiveOrExpression85=exclusiveOrExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, exclusiveOrExpression85.getTree());

			// Cpp.g:175:27: ( BITWISEOR ^ exclusiveOrExpression )*
			loop30:
			while (true) {
				int alt30=2;
				int LA30_0 = input.LA(1);
				if ( (LA30_0==BITWISEOR) ) {
					alt30=1;
				}

				switch (alt30) {
				case 1 :
					// Cpp.g:175:28: BITWISEOR ^ exclusiveOrExpression
					{
					BITWISEOR86=(Token)match(input,BITWISEOR,FOLLOW_BITWISEOR_in_inclusiveOrExpression1171); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					BITWISEOR86_tree = (Object)adaptor.create(BITWISEOR86);
					root_0 = (Object)adaptor.becomeRoot(BITWISEOR86_tree, root_0);
					}

					pushFollow(FOLLOW_exclusiveOrExpression_in_inclusiveOrExpression1174);
					exclusiveOrExpression87=exclusiveOrExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, exclusiveOrExpression87.getTree());

					}
					break;

				default :
					break loop30;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 20, inclusiveOrExpression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "inclusiveOrExpression"


	public static class exclusiveOrExpression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exclusiveOrExpression"
	// Cpp.g:178:1: exclusiveOrExpression : andExpression ( BITWISEXOR ^ andExpression )* ;
	public final CppParser.exclusiveOrExpression_return exclusiveOrExpression() throws RecognitionException {
		CppParser.exclusiveOrExpression_return retval = new CppParser.exclusiveOrExpression_return();
		retval.start = input.LT(1);
		int exclusiveOrExpression_StartIndex = input.index();

		Object root_0 = null;

		Token BITWISEXOR89=null;
		ParserRuleReturnScope andExpression88 =null;
		ParserRuleReturnScope andExpression90 =null;

		Object BITWISEXOR89_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }

			// Cpp.g:179:3: ( andExpression ( BITWISEXOR ^ andExpression )* )
			// Cpp.g:179:5: andExpression ( BITWISEXOR ^ andExpression )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_andExpression_in_exclusiveOrExpression1189);
			andExpression88=andExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, andExpression88.getTree());

			// Cpp.g:179:19: ( BITWISEXOR ^ andExpression )*
			loop31:
			while (true) {
				int alt31=2;
				int LA31_0 = input.LA(1);
				if ( (LA31_0==BITWISEXOR) ) {
					alt31=1;
				}

				switch (alt31) {
				case 1 :
					// Cpp.g:179:20: BITWISEXOR ^ andExpression
					{
					BITWISEXOR89=(Token)match(input,BITWISEXOR,FOLLOW_BITWISEXOR_in_exclusiveOrExpression1192); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					BITWISEXOR89_tree = (Object)adaptor.create(BITWISEXOR89);
					root_0 = (Object)adaptor.becomeRoot(BITWISEXOR89_tree, root_0);
					}

					pushFollow(FOLLOW_andExpression_in_exclusiveOrExpression1195);
					andExpression90=andExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, andExpression90.getTree());

					}
					break;

				default :
					break loop31;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 21, exclusiveOrExpression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "exclusiveOrExpression"


	public static class andExpression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "andExpression"
	// Cpp.g:182:1: andExpression : equalityExpression ( AMPERSAND ^ equalityExpression )* ;
	public final CppParser.andExpression_return andExpression() throws RecognitionException {
		CppParser.andExpression_return retval = new CppParser.andExpression_return();
		retval.start = input.LT(1);
		int andExpression_StartIndex = input.index();

		Object root_0 = null;

		Token AMPERSAND92=null;
		ParserRuleReturnScope equalityExpression91 =null;
		ParserRuleReturnScope equalityExpression93 =null;

		Object AMPERSAND92_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }

			// Cpp.g:183:3: ( equalityExpression ( AMPERSAND ^ equalityExpression )* )
			// Cpp.g:183:5: equalityExpression ( AMPERSAND ^ equalityExpression )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_equalityExpression_in_andExpression1210);
			equalityExpression91=equalityExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpression91.getTree());

			// Cpp.g:183:24: ( AMPERSAND ^ equalityExpression )*
			loop32:
			while (true) {
				int alt32=2;
				int LA32_0 = input.LA(1);
				if ( (LA32_0==AMPERSAND) ) {
					alt32=1;
				}

				switch (alt32) {
				case 1 :
					// Cpp.g:183:25: AMPERSAND ^ equalityExpression
					{
					AMPERSAND92=(Token)match(input,AMPERSAND,FOLLOW_AMPERSAND_in_andExpression1213); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					AMPERSAND92_tree = (Object)adaptor.create(AMPERSAND92);
					root_0 = (Object)adaptor.becomeRoot(AMPERSAND92_tree, root_0);
					}

					pushFollow(FOLLOW_equalityExpression_in_andExpression1216);
					equalityExpression93=equalityExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpression93.getTree());

					}
					break;

				default :
					break loop32;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 22, andExpression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "andExpression"


	public static class equalityExpression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "equalityExpression"
	// Cpp.g:186:1: equalityExpression : relationalExpression ( ( NOTEQUAL ^| EQUAL ^) relationalExpression )* ;
	public final CppParser.equalityExpression_return equalityExpression() throws RecognitionException {
		CppParser.equalityExpression_return retval = new CppParser.equalityExpression_return();
		retval.start = input.LT(1);
		int equalityExpression_StartIndex = input.index();

		Object root_0 = null;

		Token NOTEQUAL95=null;
		Token EQUAL96=null;
		ParserRuleReturnScope relationalExpression94 =null;
		ParserRuleReturnScope relationalExpression97 =null;

		Object NOTEQUAL95_tree=null;
		Object EQUAL96_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }

			// Cpp.g:187:3: ( relationalExpression ( ( NOTEQUAL ^| EQUAL ^) relationalExpression )* )
			// Cpp.g:187:5: relationalExpression ( ( NOTEQUAL ^| EQUAL ^) relationalExpression )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_relationalExpression_in_equalityExpression1231);
			relationalExpression94=relationalExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpression94.getTree());

			// Cpp.g:187:26: ( ( NOTEQUAL ^| EQUAL ^) relationalExpression )*
			loop34:
			while (true) {
				int alt34=2;
				int LA34_0 = input.LA(1);
				if ( (LA34_0==EQUAL||LA34_0==NOTEQUAL) ) {
					alt34=1;
				}

				switch (alt34) {
				case 1 :
					// Cpp.g:187:27: ( NOTEQUAL ^| EQUAL ^) relationalExpression
					{
					// Cpp.g:187:27: ( NOTEQUAL ^| EQUAL ^)
					int alt33=2;
					int LA33_0 = input.LA(1);
					if ( (LA33_0==NOTEQUAL) ) {
						alt33=1;
					}
					else if ( (LA33_0==EQUAL) ) {
						alt33=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 33, 0, input);
						throw nvae;
					}

					switch (alt33) {
						case 1 :
							// Cpp.g:187:28: NOTEQUAL ^
							{
							NOTEQUAL95=(Token)match(input,NOTEQUAL,FOLLOW_NOTEQUAL_in_equalityExpression1235); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							NOTEQUAL95_tree = (Object)adaptor.create(NOTEQUAL95);
							root_0 = (Object)adaptor.becomeRoot(NOTEQUAL95_tree, root_0);
							}

							}
							break;
						case 2 :
							// Cpp.g:187:40: EQUAL ^
							{
							EQUAL96=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_equalityExpression1240); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							EQUAL96_tree = (Object)adaptor.create(EQUAL96);
							root_0 = (Object)adaptor.becomeRoot(EQUAL96_tree, root_0);
							}

							}
							break;

					}

					pushFollow(FOLLOW_relationalExpression_in_equalityExpression1244);
					relationalExpression97=relationalExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpression97.getTree());

					}
					break;

				default :
					break loop34;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 23, equalityExpression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "equalityExpression"


	public static class relationalExpression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "relationalExpression"
	// Cpp.g:190:1: relationalExpression : shiftExpression ( ( ( LESSTHAN ^| GREATERTHAN ^| LESSTHANOREQUALTO ^| GREATERTHANOREQUALTO ^) shiftExpression )* ) ;
	public final CppParser.relationalExpression_return relationalExpression() throws RecognitionException {
		CppParser.relationalExpression_return retval = new CppParser.relationalExpression_return();
		retval.start = input.LT(1);
		int relationalExpression_StartIndex = input.index();

		Object root_0 = null;

		Token LESSTHAN99=null;
		Token GREATERTHAN100=null;
		Token LESSTHANOREQUALTO101=null;
		Token GREATERTHANOREQUALTO102=null;
		ParserRuleReturnScope shiftExpression98 =null;
		ParserRuleReturnScope shiftExpression103 =null;

		Object LESSTHAN99_tree=null;
		Object GREATERTHAN100_tree=null;
		Object LESSTHANOREQUALTO101_tree=null;
		Object GREATERTHANOREQUALTO102_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }

			// Cpp.g:191:3: ( shiftExpression ( ( ( LESSTHAN ^| GREATERTHAN ^| LESSTHANOREQUALTO ^| GREATERTHANOREQUALTO ^) shiftExpression )* ) )
			// Cpp.g:191:5: shiftExpression ( ( ( LESSTHAN ^| GREATERTHAN ^| LESSTHANOREQUALTO ^| GREATERTHANOREQUALTO ^) shiftExpression )* )
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_shiftExpression_in_relationalExpression1259);
			shiftExpression98=shiftExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpression98.getTree());

			// Cpp.g:192:4: ( ( ( LESSTHAN ^| GREATERTHAN ^| LESSTHANOREQUALTO ^| GREATERTHANOREQUALTO ^) shiftExpression )* )
			// Cpp.g:192:6: ( ( LESSTHAN ^| GREATERTHAN ^| LESSTHANOREQUALTO ^| GREATERTHANOREQUALTO ^) shiftExpression )*
			{
			// Cpp.g:192:6: ( ( LESSTHAN ^| GREATERTHAN ^| LESSTHANOREQUALTO ^| GREATERTHANOREQUALTO ^) shiftExpression )*
			loop36:
			while (true) {
				int alt36=2;
				int LA36_0 = input.LA(1);
				if ( ((LA36_0 >= GREATERTHAN && LA36_0 <= GREATERTHANOREQUALTO)||(LA36_0 >= LESSTHAN && LA36_0 <= LESSTHANOREQUALTO)) ) {
					alt36=1;
				}

				switch (alt36) {
				case 1 :
					// Cpp.g:192:8: ( LESSTHAN ^| GREATERTHAN ^| LESSTHANOREQUALTO ^| GREATERTHANOREQUALTO ^) shiftExpression
					{
					// Cpp.g:192:8: ( LESSTHAN ^| GREATERTHAN ^| LESSTHANOREQUALTO ^| GREATERTHANOREQUALTO ^)
					int alt35=4;
					switch ( input.LA(1) ) {
					case LESSTHAN:
						{
						alt35=1;
						}
						break;
					case GREATERTHAN:
						{
						alt35=2;
						}
						break;
					case LESSTHANOREQUALTO:
						{
						alt35=3;
						}
						break;
					case GREATERTHANOREQUALTO:
						{
						alt35=4;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 35, 0, input);
						throw nvae;
					}
					switch (alt35) {
						case 1 :
							// Cpp.g:192:10: LESSTHAN ^
							{
							LESSTHAN99=(Token)match(input,LESSTHAN,FOLLOW_LESSTHAN_in_relationalExpression1270); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							LESSTHAN99_tree = (Object)adaptor.create(LESSTHAN99);
							root_0 = (Object)adaptor.becomeRoot(LESSTHAN99_tree, root_0);
							}

							}
							break;
						case 2 :
							// Cpp.g:193:8: GREATERTHAN ^
							{
							GREATERTHAN100=(Token)match(input,GREATERTHAN,FOLLOW_GREATERTHAN_in_relationalExpression1280); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							GREATERTHAN100_tree = (Object)adaptor.create(GREATERTHAN100);
							root_0 = (Object)adaptor.becomeRoot(GREATERTHAN100_tree, root_0);
							}

							}
							break;
						case 3 :
							// Cpp.g:194:8: LESSTHANOREQUALTO ^
							{
							LESSTHANOREQUALTO101=(Token)match(input,LESSTHANOREQUALTO,FOLLOW_LESSTHANOREQUALTO_in_relationalExpression1290); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							LESSTHANOREQUALTO101_tree = (Object)adaptor.create(LESSTHANOREQUALTO101);
							root_0 = (Object)adaptor.becomeRoot(LESSTHANOREQUALTO101_tree, root_0);
							}

							}
							break;
						case 4 :
							// Cpp.g:195:8: GREATERTHANOREQUALTO ^
							{
							GREATERTHANOREQUALTO102=(Token)match(input,GREATERTHANOREQUALTO,FOLLOW_GREATERTHANOREQUALTO_in_relationalExpression1300); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							GREATERTHANOREQUALTO102_tree = (Object)adaptor.create(GREATERTHANOREQUALTO102);
							root_0 = (Object)adaptor.becomeRoot(GREATERTHANOREQUALTO102_tree, root_0);
							}

							}
							break;

					}

					pushFollow(FOLLOW_shiftExpression_in_relationalExpression1314);
					shiftExpression103=shiftExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpression103.getTree());

					}
					break;

				default :
					break loop36;
				}
			}

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 24, relationalExpression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "relationalExpression"


	public static class shiftExpression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "shiftExpression"
	// Cpp.g:201:1: shiftExpression : additiveExpression ( ( SHIFTLEFT ^| SHIFTRIGHT ^) additiveExpression )* ;
	public final CppParser.shiftExpression_return shiftExpression() throws RecognitionException {
		CppParser.shiftExpression_return retval = new CppParser.shiftExpression_return();
		retval.start = input.LT(1);
		int shiftExpression_StartIndex = input.index();

		Object root_0 = null;

		Token SHIFTLEFT105=null;
		Token SHIFTRIGHT106=null;
		ParserRuleReturnScope additiveExpression104 =null;
		ParserRuleReturnScope additiveExpression107 =null;

		Object SHIFTLEFT105_tree=null;
		Object SHIFTRIGHT106_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }

			// Cpp.g:202:3: ( additiveExpression ( ( SHIFTLEFT ^| SHIFTRIGHT ^) additiveExpression )* )
			// Cpp.g:202:5: additiveExpression ( ( SHIFTLEFT ^| SHIFTRIGHT ^) additiveExpression )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_additiveExpression_in_shiftExpression1338);
			additiveExpression104=additiveExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, additiveExpression104.getTree());

			// Cpp.g:202:24: ( ( SHIFTLEFT ^| SHIFTRIGHT ^) additiveExpression )*
			loop38:
			while (true) {
				int alt38=2;
				int LA38_0 = input.LA(1);
				if ( (LA38_0==SHIFTLEFT||LA38_0==SHIFTRIGHT) ) {
					alt38=1;
				}

				switch (alt38) {
				case 1 :
					// Cpp.g:202:25: ( SHIFTLEFT ^| SHIFTRIGHT ^) additiveExpression
					{
					// Cpp.g:202:25: ( SHIFTLEFT ^| SHIFTRIGHT ^)
					int alt37=2;
					int LA37_0 = input.LA(1);
					if ( (LA37_0==SHIFTLEFT) ) {
						alt37=1;
					}
					else if ( (LA37_0==SHIFTRIGHT) ) {
						alt37=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 37, 0, input);
						throw nvae;
					}

					switch (alt37) {
						case 1 :
							// Cpp.g:202:26: SHIFTLEFT ^
							{
							SHIFTLEFT105=(Token)match(input,SHIFTLEFT,FOLLOW_SHIFTLEFT_in_shiftExpression1342); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							SHIFTLEFT105_tree = (Object)adaptor.create(SHIFTLEFT105);
							root_0 = (Object)adaptor.becomeRoot(SHIFTLEFT105_tree, root_0);
							}

							}
							break;
						case 2 :
							// Cpp.g:202:39: SHIFTRIGHT ^
							{
							SHIFTRIGHT106=(Token)match(input,SHIFTRIGHT,FOLLOW_SHIFTRIGHT_in_shiftExpression1347); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							SHIFTRIGHT106_tree = (Object)adaptor.create(SHIFTRIGHT106);
							root_0 = (Object)adaptor.becomeRoot(SHIFTRIGHT106_tree, root_0);
							}

							}
							break;

					}

					pushFollow(FOLLOW_additiveExpression_in_shiftExpression1351);
					additiveExpression107=additiveExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, additiveExpression107.getTree());

					}
					break;

				default :
					break loop38;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 25, shiftExpression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "shiftExpression"


	public static class additiveExpression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "additiveExpression"
	// Cpp.g:205:1: additiveExpression : multiplicativeExpression ( ( PLUS ^| MINUS ^) multiplicativeExpression )* ;
	public final CppParser.additiveExpression_return additiveExpression() throws RecognitionException {
		CppParser.additiveExpression_return retval = new CppParser.additiveExpression_return();
		retval.start = input.LT(1);
		int additiveExpression_StartIndex = input.index();

		Object root_0 = null;

		Token PLUS109=null;
		Token MINUS110=null;
		ParserRuleReturnScope multiplicativeExpression108 =null;
		ParserRuleReturnScope multiplicativeExpression111 =null;

		Object PLUS109_tree=null;
		Object MINUS110_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }

			// Cpp.g:206:3: ( multiplicativeExpression ( ( PLUS ^| MINUS ^) multiplicativeExpression )* )
			// Cpp.g:206:5: multiplicativeExpression ( ( PLUS ^| MINUS ^) multiplicativeExpression )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1366);
			multiplicativeExpression108=multiplicativeExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpression108.getTree());

			// Cpp.g:206:30: ( ( PLUS ^| MINUS ^) multiplicativeExpression )*
			loop40:
			while (true) {
				int alt40=2;
				int LA40_0 = input.LA(1);
				if ( (LA40_0==MINUS||LA40_0==PLUS) ) {
					alt40=1;
				}

				switch (alt40) {
				case 1 :
					// Cpp.g:206:31: ( PLUS ^| MINUS ^) multiplicativeExpression
					{
					// Cpp.g:206:31: ( PLUS ^| MINUS ^)
					int alt39=2;
					int LA39_0 = input.LA(1);
					if ( (LA39_0==PLUS) ) {
						alt39=1;
					}
					else if ( (LA39_0==MINUS) ) {
						alt39=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 39, 0, input);
						throw nvae;
					}

					switch (alt39) {
						case 1 :
							// Cpp.g:206:32: PLUS ^
							{
							PLUS109=(Token)match(input,PLUS,FOLLOW_PLUS_in_additiveExpression1370); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							PLUS109_tree = (Object)adaptor.create(PLUS109);
							root_0 = (Object)adaptor.becomeRoot(PLUS109_tree, root_0);
							}

							}
							break;
						case 2 :
							// Cpp.g:206:40: MINUS ^
							{
							MINUS110=(Token)match(input,MINUS,FOLLOW_MINUS_in_additiveExpression1375); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							MINUS110_tree = (Object)adaptor.create(MINUS110);
							root_0 = (Object)adaptor.becomeRoot(MINUS110_tree, root_0);
							}

							}
							break;

					}

					pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1379);
					multiplicativeExpression111=multiplicativeExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpression111.getTree());

					}
					break;

				default :
					break loop40;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 26, additiveExpression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "additiveExpression"


	public static class multiplicativeExpression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "multiplicativeExpression"
	// Cpp.g:209:1: multiplicativeExpression : unaryExpression ( ( STAR ^| DIVIDE ^| MOD ^) unaryExpression )* ;
	public final CppParser.multiplicativeExpression_return multiplicativeExpression() throws RecognitionException {
		CppParser.multiplicativeExpression_return retval = new CppParser.multiplicativeExpression_return();
		retval.start = input.LT(1);
		int multiplicativeExpression_StartIndex = input.index();

		Object root_0 = null;

		Token STAR113=null;
		Token DIVIDE114=null;
		Token MOD115=null;
		ParserRuleReturnScope unaryExpression112 =null;
		ParserRuleReturnScope unaryExpression116 =null;

		Object STAR113_tree=null;
		Object DIVIDE114_tree=null;
		Object MOD115_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }

			// Cpp.g:210:3: ( unaryExpression ( ( STAR ^| DIVIDE ^| MOD ^) unaryExpression )* )
			// Cpp.g:210:5: unaryExpression ( ( STAR ^| DIVIDE ^| MOD ^) unaryExpression )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1394);
			unaryExpression112=unaryExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression112.getTree());

			// Cpp.g:210:21: ( ( STAR ^| DIVIDE ^| MOD ^) unaryExpression )*
			loop42:
			while (true) {
				int alt42=2;
				int LA42_0 = input.LA(1);
				if ( (LA42_0==DIVIDE||LA42_0==MOD||LA42_0==STAR) ) {
					alt42=1;
				}

				switch (alt42) {
				case 1 :
					// Cpp.g:210:22: ( STAR ^| DIVIDE ^| MOD ^) unaryExpression
					{
					// Cpp.g:210:22: ( STAR ^| DIVIDE ^| MOD ^)
					int alt41=3;
					switch ( input.LA(1) ) {
					case STAR:
						{
						alt41=1;
						}
						break;
					case DIVIDE:
						{
						alt41=2;
						}
						break;
					case MOD:
						{
						alt41=3;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 41, 0, input);
						throw nvae;
					}
					switch (alt41) {
						case 1 :
							// Cpp.g:210:23: STAR ^
							{
							STAR113=(Token)match(input,STAR,FOLLOW_STAR_in_multiplicativeExpression1398); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							STAR113_tree = (Object)adaptor.create(STAR113);
							root_0 = (Object)adaptor.becomeRoot(STAR113_tree, root_0);
							}

							}
							break;
						case 2 :
							// Cpp.g:210:31: DIVIDE ^
							{
							DIVIDE114=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_multiplicativeExpression1403); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							DIVIDE114_tree = (Object)adaptor.create(DIVIDE114);
							root_0 = (Object)adaptor.becomeRoot(DIVIDE114_tree, root_0);
							}

							}
							break;
						case 3 :
							// Cpp.g:210:41: MOD ^
							{
							MOD115=(Token)match(input,MOD,FOLLOW_MOD_in_multiplicativeExpression1408); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							MOD115_tree = (Object)adaptor.create(MOD115);
							root_0 = (Object)adaptor.becomeRoot(MOD115_tree, root_0);
							}

							}
							break;

					}

					pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1413);
					unaryExpression116=unaryExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression116.getTree());

					}
					break;

				default :
					break loop42;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 27, multiplicativeExpression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "multiplicativeExpression"


	public static class unaryExpression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "unaryExpression"
	// Cpp.g:213:1: unaryExpression : ( PLUSPLUS unaryExpression -> ^( PLUSPLUS unaryExpression ) | MINUSMINUS unaryExpression -> ^( MINUSMINUS unaryExpression ) | SIZEOF unaryExpression -> ^( SIZEOF unaryExpression ) | SIZEOF LPAREN type_name RPAREN -> ^( SIZEOF_TYPE type_name ) | DEFINED type_name -> ^( DEFINED type_name ) | DEFINED LPAREN type_name RPAREN -> ^( DEFINED type_name ) | unaryExpressionNotPlusMinus );
	public final CppParser.unaryExpression_return unaryExpression() throws RecognitionException {
		CppParser.unaryExpression_return retval = new CppParser.unaryExpression_return();
		retval.start = input.LT(1);
		int unaryExpression_StartIndex = input.index();

		Object root_0 = null;

		Token PLUSPLUS117=null;
		Token MINUSMINUS119=null;
		Token SIZEOF121=null;
		Token SIZEOF123=null;
		Token LPAREN124=null;
		Token RPAREN126=null;
		Token DEFINED127=null;
		Token DEFINED129=null;
		Token LPAREN130=null;
		Token RPAREN132=null;
		ParserRuleReturnScope unaryExpression118 =null;
		ParserRuleReturnScope unaryExpression120 =null;
		ParserRuleReturnScope unaryExpression122 =null;
		ParserRuleReturnScope type_name125 =null;
		ParserRuleReturnScope type_name128 =null;
		ParserRuleReturnScope type_name131 =null;
		ParserRuleReturnScope unaryExpressionNotPlusMinus133 =null;

		Object PLUSPLUS117_tree=null;
		Object MINUSMINUS119_tree=null;
		Object SIZEOF121_tree=null;
		Object SIZEOF123_tree=null;
		Object LPAREN124_tree=null;
		Object RPAREN126_tree=null;
		Object DEFINED127_tree=null;
		Object DEFINED129_tree=null;
		Object LPAREN130_tree=null;
		Object RPAREN132_tree=null;
		RewriteRuleTokenStream stream_SIZEOF=new RewriteRuleTokenStream(adaptor,"token SIZEOF");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_MINUSMINUS=new RewriteRuleTokenStream(adaptor,"token MINUSMINUS");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleTokenStream stream_DEFINED=new RewriteRuleTokenStream(adaptor,"token DEFINED");
		RewriteRuleTokenStream stream_PLUSPLUS=new RewriteRuleTokenStream(adaptor,"token PLUSPLUS");
		RewriteRuleSubtreeStream stream_type_name=new RewriteRuleSubtreeStream(adaptor,"rule type_name");
		RewriteRuleSubtreeStream stream_unaryExpression=new RewriteRuleSubtreeStream(adaptor,"rule unaryExpression");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }

			// Cpp.g:214:3: ( PLUSPLUS unaryExpression -> ^( PLUSPLUS unaryExpression ) | MINUSMINUS unaryExpression -> ^( MINUSMINUS unaryExpression ) | SIZEOF unaryExpression -> ^( SIZEOF unaryExpression ) | SIZEOF LPAREN type_name RPAREN -> ^( SIZEOF_TYPE type_name ) | DEFINED type_name -> ^( DEFINED type_name ) | DEFINED LPAREN type_name RPAREN -> ^( DEFINED type_name ) | unaryExpressionNotPlusMinus )
			int alt43=7;
			switch ( input.LA(1) ) {
			case PLUSPLUS:
				{
				alt43=1;
				}
				break;
			case MINUSMINUS:
				{
				alt43=2;
				}
				break;
			case SIZEOF:
				{
				int LA43_3 = input.LA(2);
				if ( (LA43_3==LPAREN) ) {
					int LA43_6 = input.LA(3);
					if ( (LA43_6==IDENTIFIER) ) {
						int LA43_10 = input.LA(4);
						if ( ((LA43_10 >= AMPERSAND && LA43_10 <= AND)||LA43_10==ASSIGNEQUAL||(LA43_10 >= BITWISEANDEQUAL && LA43_10 <= BITWISEXOREQUAL)||(LA43_10 >= DIVIDE && LA43_10 <= DIVIDEEQUAL)||LA43_10==EQUAL||(LA43_10 >= GREATERTHAN && LA43_10 <= GREATERTHANOREQUALTO)||(LA43_10 >= LESSTHAN && LA43_10 <= LESSTHANOREQUALTO)||(LA43_10 >= LPAREN && LA43_10 <= LSQUARE)||(LA43_10 >= MINUS && LA43_10 <= MODEQUAL)||LA43_10==NOTEQUAL||LA43_10==OR||(LA43_10 >= PLUS && LA43_10 <= PLUSPLUS)||LA43_10==POINTERTO||LA43_10==QUESTIONMARK||(LA43_10 >= SHIFTLEFT && LA43_10 <= SHIFTRIGHTEQUAL)||LA43_10==STAR||LA43_10==TIMESEQUAL) ) {
							alt43=3;
						}
						else if ( (LA43_10==RPAREN) ) {
							int LA43_11 = input.LA(5);
							if ( (synpred71_Cpp()) ) {
								alt43=3;
							}
							else if ( (synpred72_Cpp()) ) {
								alt43=4;
							}

							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 43, 11, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 43, 10, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}
					else if ( (LA43_6==AMPERSAND||LA43_6==CHARACTER_LITERAL||LA43_6==DECIMAL_LITERAL||LA43_6==DEFINED||LA43_6==FLOATING_POINT_LITERAL||LA43_6==HEX_LITERAL||LA43_6==LPAREN||LA43_6==MINUS||LA43_6==MINUSMINUS||LA43_6==NOT||LA43_6==OCTAL_LITERAL||LA43_6==PLUS||LA43_6==PLUSPLUS||LA43_6==SIZEOF||LA43_6==STAR||LA43_6==STRING_LITERAL||LA43_6==TILDE) ) {
						alt43=3;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 43, 6, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA43_3==AMPERSAND||LA43_3==CHARACTER_LITERAL||LA43_3==DECIMAL_LITERAL||LA43_3==DEFINED||LA43_3==FLOATING_POINT_LITERAL||LA43_3==HEX_LITERAL||LA43_3==IDENTIFIER||LA43_3==MINUS||LA43_3==MINUSMINUS||LA43_3==NOT||LA43_3==OCTAL_LITERAL||LA43_3==PLUS||LA43_3==PLUSPLUS||LA43_3==SIZEOF||LA43_3==STAR||LA43_3==STRING_LITERAL||LA43_3==TILDE) ) {
					alt43=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 43, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case DEFINED:
				{
				int LA43_4 = input.LA(2);
				if ( (LA43_4==LPAREN) ) {
					alt43=6;
				}
				else if ( (LA43_4==IDENTIFIER) ) {
					alt43=5;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 43, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case AMPERSAND:
			case CHARACTER_LITERAL:
			case DECIMAL_LITERAL:
			case FLOATING_POINT_LITERAL:
			case HEX_LITERAL:
			case IDENTIFIER:
			case LPAREN:
			case MINUS:
			case NOT:
			case OCTAL_LITERAL:
			case PLUS:
			case STAR:
			case STRING_LITERAL:
			case TILDE:
				{
				alt43=7;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 43, 0, input);
				throw nvae;
			}
			switch (alt43) {
				case 1 :
					// Cpp.g:214:5: PLUSPLUS unaryExpression
					{
					PLUSPLUS117=(Token)match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_unaryExpression1428); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_PLUSPLUS.add(PLUSPLUS117);

					pushFollow(FOLLOW_unaryExpression_in_unaryExpression1431);
					unaryExpression118=unaryExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_unaryExpression.add(unaryExpression118.getTree());
					// AST REWRITE
					// elements: unaryExpression, PLUSPLUS
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 214:31: -> ^( PLUSPLUS unaryExpression )
					{
						// Cpp.g:214:34: ^( PLUSPLUS unaryExpression )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(stream_PLUSPLUS.nextNode(), root_1);
						adaptor.addChild(root_1, stream_unaryExpression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// Cpp.g:215:5: MINUSMINUS unaryExpression
					{
					MINUSMINUS119=(Token)match(input,MINUSMINUS,FOLLOW_MINUSMINUS_in_unaryExpression1445); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_MINUSMINUS.add(MINUSMINUS119);

					pushFollow(FOLLOW_unaryExpression_in_unaryExpression1447);
					unaryExpression120=unaryExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_unaryExpression.add(unaryExpression120.getTree());
					// AST REWRITE
					// elements: unaryExpression, MINUSMINUS
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 215:32: -> ^( MINUSMINUS unaryExpression )
					{
						// Cpp.g:215:35: ^( MINUSMINUS unaryExpression )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(stream_MINUSMINUS.nextNode(), root_1);
						adaptor.addChild(root_1, stream_unaryExpression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// Cpp.g:216:5: SIZEOF unaryExpression
					{
					SIZEOF121=(Token)match(input,SIZEOF,FOLLOW_SIZEOF_in_unaryExpression1461); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SIZEOF.add(SIZEOF121);

					pushFollow(FOLLOW_unaryExpression_in_unaryExpression1463);
					unaryExpression122=unaryExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_unaryExpression.add(unaryExpression122.getTree());
					// AST REWRITE
					// elements: unaryExpression, SIZEOF
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 216:28: -> ^( SIZEOF unaryExpression )
					{
						// Cpp.g:216:31: ^( SIZEOF unaryExpression )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(stream_SIZEOF.nextNode(), root_1);
						adaptor.addChild(root_1, stream_unaryExpression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 4 :
					// Cpp.g:217:5: SIZEOF LPAREN type_name RPAREN
					{
					SIZEOF123=(Token)match(input,SIZEOF,FOLLOW_SIZEOF_in_unaryExpression1477); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SIZEOF.add(SIZEOF123);

					LPAREN124=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_unaryExpression1479); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN124);

					pushFollow(FOLLOW_type_name_in_unaryExpression1481);
					type_name125=type_name();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_type_name.add(type_name125.getTree());
					RPAREN126=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_unaryExpression1483); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN126);

					// AST REWRITE
					// elements: type_name
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 217:36: -> ^( SIZEOF_TYPE type_name )
					{
						// Cpp.g:217:39: ^( SIZEOF_TYPE type_name )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SIZEOF_TYPE, "SIZEOF_TYPE"), root_1);
						adaptor.addChild(root_1, stream_type_name.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 5 :
					// Cpp.g:218:5: DEFINED type_name
					{
					DEFINED127=(Token)match(input,DEFINED,FOLLOW_DEFINED_in_unaryExpression1497); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DEFINED.add(DEFINED127);

					pushFollow(FOLLOW_type_name_in_unaryExpression1499);
					type_name128=type_name();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_type_name.add(type_name128.getTree());
					// AST REWRITE
					// elements: type_name, DEFINED
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 218:25: -> ^( DEFINED type_name )
					{
						// Cpp.g:218:28: ^( DEFINED type_name )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(stream_DEFINED.nextNode(), root_1);
						adaptor.addChild(root_1, stream_type_name.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 6 :
					// Cpp.g:219:5: DEFINED LPAREN type_name RPAREN
					{
					DEFINED129=(Token)match(input,DEFINED,FOLLOW_DEFINED_in_unaryExpression1515); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DEFINED.add(DEFINED129);

					LPAREN130=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_unaryExpression1517); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN130);

					pushFollow(FOLLOW_type_name_in_unaryExpression1519);
					type_name131=type_name();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_type_name.add(type_name131.getTree());
					RPAREN132=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_unaryExpression1522); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN132);

					// AST REWRITE
					// elements: type_name, DEFINED
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 219:38: -> ^( DEFINED type_name )
					{
						// Cpp.g:219:40: ^( DEFINED type_name )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(stream_DEFINED.nextNode(), root_1);
						adaptor.addChild(root_1, stream_type_name.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 7 :
					// Cpp.g:220:5: unaryExpressionNotPlusMinus
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpression1535);
					unaryExpressionNotPlusMinus133=unaryExpressionNotPlusMinus();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpressionNotPlusMinus133.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 28, unaryExpression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "unaryExpression"


	public static class unaryExpressionNotPlusMinus_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "unaryExpressionNotPlusMinus"
	// Cpp.g:223:1: unaryExpressionNotPlusMinus : ( NOT unaryExpression -> ^( NOT unaryExpression ) | TILDE unaryExpression -> ^( TILDE unaryExpression ) | AMPERSAND unaryExpression -> ^( REFERANCE unaryExpression ) | STAR unaryExpression -> ^( POINTER_AT unaryExpression ) | MINUS unaryExpression -> ^( UNARY_MINUS unaryExpression ) | PLUS unaryExpression -> ^( UNARY_PLUS unaryExpression ) | LPAREN type_name RPAREN unaryExpression -> ^( TYPECAST type_name unaryExpression ) | postfixExpression );
	public final CppParser.unaryExpressionNotPlusMinus_return unaryExpressionNotPlusMinus() throws RecognitionException {
		CppParser.unaryExpressionNotPlusMinus_return retval = new CppParser.unaryExpressionNotPlusMinus_return();
		retval.start = input.LT(1);
		int unaryExpressionNotPlusMinus_StartIndex = input.index();

		Object root_0 = null;

		Token NOT134=null;
		Token TILDE136=null;
		Token AMPERSAND138=null;
		Token STAR140=null;
		Token MINUS142=null;
		Token PLUS144=null;
		Token LPAREN146=null;
		Token RPAREN148=null;
		ParserRuleReturnScope unaryExpression135 =null;
		ParserRuleReturnScope unaryExpression137 =null;
		ParserRuleReturnScope unaryExpression139 =null;
		ParserRuleReturnScope unaryExpression141 =null;
		ParserRuleReturnScope unaryExpression143 =null;
		ParserRuleReturnScope unaryExpression145 =null;
		ParserRuleReturnScope type_name147 =null;
		ParserRuleReturnScope unaryExpression149 =null;
		ParserRuleReturnScope postfixExpression150 =null;

		Object NOT134_tree=null;
		Object TILDE136_tree=null;
		Object AMPERSAND138_tree=null;
		Object STAR140_tree=null;
		Object MINUS142_tree=null;
		Object PLUS144_tree=null;
		Object LPAREN146_tree=null;
		Object RPAREN148_tree=null;
		RewriteRuleTokenStream stream_AMPERSAND=new RewriteRuleTokenStream(adaptor,"token AMPERSAND");
		RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
		RewriteRuleTokenStream stream_STAR=new RewriteRuleTokenStream(adaptor,"token STAR");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_TILDE=new RewriteRuleTokenStream(adaptor,"token TILDE");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
		RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
		RewriteRuleSubtreeStream stream_type_name=new RewriteRuleSubtreeStream(adaptor,"rule type_name");
		RewriteRuleSubtreeStream stream_unaryExpression=new RewriteRuleSubtreeStream(adaptor,"rule unaryExpression");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }

			// Cpp.g:224:3: ( NOT unaryExpression -> ^( NOT unaryExpression ) | TILDE unaryExpression -> ^( TILDE unaryExpression ) | AMPERSAND unaryExpression -> ^( REFERANCE unaryExpression ) | STAR unaryExpression -> ^( POINTER_AT unaryExpression ) | MINUS unaryExpression -> ^( UNARY_MINUS unaryExpression ) | PLUS unaryExpression -> ^( UNARY_PLUS unaryExpression ) | LPAREN type_name RPAREN unaryExpression -> ^( TYPECAST type_name unaryExpression ) | postfixExpression )
			int alt44=8;
			switch ( input.LA(1) ) {
			case NOT:
				{
				alt44=1;
				}
				break;
			case TILDE:
				{
				alt44=2;
				}
				break;
			case AMPERSAND:
				{
				alt44=3;
				}
				break;
			case STAR:
				{
				alt44=4;
				}
				break;
			case MINUS:
				{
				alt44=5;
				}
				break;
			case PLUS:
				{
				alt44=6;
				}
				break;
			case LPAREN:
				{
				int LA44_7 = input.LA(2);
				if ( (synpred81_Cpp()) ) {
					alt44=7;
				}
				else if ( (true) ) {
					alt44=8;
				}

				}
				break;
			case CHARACTER_LITERAL:
			case DECIMAL_LITERAL:
			case FLOATING_POINT_LITERAL:
			case HEX_LITERAL:
			case IDENTIFIER:
			case OCTAL_LITERAL:
			case STRING_LITERAL:
				{
				alt44=8;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 44, 0, input);
				throw nvae;
			}
			switch (alt44) {
				case 1 :
					// Cpp.g:224:5: NOT unaryExpression
					{
					NOT134=(Token)match(input,NOT,FOLLOW_NOT_in_unaryExpressionNotPlusMinus1548); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NOT.add(NOT134);

					pushFollow(FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus1552);
					unaryExpression135=unaryExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_unaryExpression.add(unaryExpression135.getTree());
					// AST REWRITE
					// elements: NOT, unaryExpression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 224:27: -> ^( NOT unaryExpression )
					{
						// Cpp.g:224:30: ^( NOT unaryExpression )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(stream_NOT.nextNode(), root_1);
						adaptor.addChild(root_1, stream_unaryExpression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// Cpp.g:225:5: TILDE unaryExpression
					{
					TILDE136=(Token)match(input,TILDE,FOLLOW_TILDE_in_unaryExpressionNotPlusMinus1566); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TILDE.add(TILDE136);

					pushFollow(FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus1569);
					unaryExpression137=unaryExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_unaryExpression.add(unaryExpression137.getTree());
					// AST REWRITE
					// elements: unaryExpression, TILDE
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 225:28: -> ^( TILDE unaryExpression )
					{
						// Cpp.g:225:31: ^( TILDE unaryExpression )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(stream_TILDE.nextNode(), root_1);
						adaptor.addChild(root_1, stream_unaryExpression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// Cpp.g:226:5: AMPERSAND unaryExpression
					{
					AMPERSAND138=(Token)match(input,AMPERSAND,FOLLOW_AMPERSAND_in_unaryExpressionNotPlusMinus1584); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_AMPERSAND.add(AMPERSAND138);

					pushFollow(FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus1586);
					unaryExpression139=unaryExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_unaryExpression.add(unaryExpression139.getTree());
					// AST REWRITE
					// elements: unaryExpression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 226:31: -> ^( REFERANCE unaryExpression )
					{
						// Cpp.g:226:34: ^( REFERANCE unaryExpression )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(REFERANCE, "REFERANCE"), root_1);
						adaptor.addChild(root_1, stream_unaryExpression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 4 :
					// Cpp.g:227:5: STAR unaryExpression
					{
					STAR140=(Token)match(input,STAR,FOLLOW_STAR_in_unaryExpressionNotPlusMinus1600); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_STAR.add(STAR140);

					pushFollow(FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus1603);
					unaryExpression141=unaryExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_unaryExpression.add(unaryExpression141.getTree());
					// AST REWRITE
					// elements: unaryExpression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 227:27: -> ^( POINTER_AT unaryExpression )
					{
						// Cpp.g:227:30: ^( POINTER_AT unaryExpression )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(POINTER_AT, "POINTER_AT"), root_1);
						adaptor.addChild(root_1, stream_unaryExpression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 5 :
					// Cpp.g:228:5: MINUS unaryExpression
					{
					MINUS142=(Token)match(input,MINUS,FOLLOW_MINUS_in_unaryExpressionNotPlusMinus1617); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_MINUS.add(MINUS142);

					pushFollow(FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus1620);
					unaryExpression143=unaryExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_unaryExpression.add(unaryExpression143.getTree());
					// AST REWRITE
					// elements: unaryExpression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 228:29: -> ^( UNARY_MINUS unaryExpression )
					{
						// Cpp.g:228:32: ^( UNARY_MINUS unaryExpression )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(UNARY_MINUS, "UNARY_MINUS"), root_1);
						adaptor.addChild(root_1, stream_unaryExpression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 6 :
					// Cpp.g:229:5: PLUS unaryExpression
					{
					PLUS144=(Token)match(input,PLUS,FOLLOW_PLUS_in_unaryExpressionNotPlusMinus1635); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_PLUS.add(PLUS144);

					pushFollow(FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus1639);
					unaryExpression145=unaryExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_unaryExpression.add(unaryExpression145.getTree());
					// AST REWRITE
					// elements: unaryExpression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 229:28: -> ^( UNARY_PLUS unaryExpression )
					{
						// Cpp.g:229:31: ^( UNARY_PLUS unaryExpression )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(UNARY_PLUS, "UNARY_PLUS"), root_1);
						adaptor.addChild(root_1, stream_unaryExpression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 7 :
					// Cpp.g:230:5: LPAREN type_name RPAREN unaryExpression
					{
					LPAREN146=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_unaryExpressionNotPlusMinus1653); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN146);

					pushFollow(FOLLOW_type_name_in_unaryExpressionNotPlusMinus1655);
					type_name147=type_name();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_type_name.add(type_name147.getTree());
					RPAREN148=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_unaryExpressionNotPlusMinus1657); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN148);

					pushFollow(FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus1660);
					unaryExpression149=unaryExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_unaryExpression.add(unaryExpression149.getTree());
					// AST REWRITE
					// elements: type_name, unaryExpression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 230:46: -> ^( TYPECAST type_name unaryExpression )
					{
						// Cpp.g:230:49: ^( TYPECAST type_name unaryExpression )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TYPECAST, "TYPECAST"), root_1);
						adaptor.addChild(root_1, stream_type_name.nextTree());
						adaptor.addChild(root_1, stream_unaryExpression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 8 :
					// Cpp.g:231:5: postfixExpression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_postfixExpression_in_unaryExpressionNotPlusMinus1676);
					postfixExpression150=postfixExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, postfixExpression150.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 29, unaryExpressionNotPlusMinus_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "unaryExpressionNotPlusMinus"


	public static class postfixExpression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "postfixExpression"
	// Cpp.g:234:1: postfixExpression : primaryExpression (l= LSQUARE ^ assignmentExpression RSQUARE !|s= STAR ^ IDENTIFIER | POINTERTO ^ IDENTIFIER |p= PLUSPLUS ^|m= MINUSMINUS ^)* ;
	public final CppParser.postfixExpression_return postfixExpression() throws RecognitionException {
		CppParser.postfixExpression_return retval = new CppParser.postfixExpression_return();
		retval.start = input.LT(1);
		int postfixExpression_StartIndex = input.index();

		Object root_0 = null;

		Token l=null;
		Token s=null;
		Token p=null;
		Token m=null;
		Token RSQUARE153=null;
		Token IDENTIFIER154=null;
		Token POINTERTO155=null;
		Token IDENTIFIER156=null;
		ParserRuleReturnScope primaryExpression151 =null;
		ParserRuleReturnScope assignmentExpression152 =null;

		Object l_tree=null;
		Object s_tree=null;
		Object p_tree=null;
		Object m_tree=null;
		Object RSQUARE153_tree=null;
		Object IDENTIFIER154_tree=null;
		Object POINTERTO155_tree=null;
		Object IDENTIFIER156_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }

			// Cpp.g:235:3: ( primaryExpression (l= LSQUARE ^ assignmentExpression RSQUARE !|s= STAR ^ IDENTIFIER | POINTERTO ^ IDENTIFIER |p= PLUSPLUS ^|m= MINUSMINUS ^)* )
			// Cpp.g:235:7: primaryExpression (l= LSQUARE ^ assignmentExpression RSQUARE !|s= STAR ^ IDENTIFIER | POINTERTO ^ IDENTIFIER |p= PLUSPLUS ^|m= MINUSMINUS ^)*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_primaryExpression_in_postfixExpression1691);
			primaryExpression151=primaryExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, primaryExpression151.getTree());

			// Cpp.g:236:3: (l= LSQUARE ^ assignmentExpression RSQUARE !|s= STAR ^ IDENTIFIER | POINTERTO ^ IDENTIFIER |p= PLUSPLUS ^|m= MINUSMINUS ^)*
			loop45:
			while (true) {
				int alt45=6;
				switch ( input.LA(1) ) {
				case STAR:
					{
					int LA45_1 = input.LA(2);
					if ( (LA45_1==IDENTIFIER) ) {
						int LA45_7 = input.LA(3);
						if ( (synpred83_Cpp()) ) {
							alt45=2;
						}

					}

					}
					break;
				case LSQUARE:
					{
					alt45=1;
					}
					break;
				case POINTERTO:
					{
					alt45=3;
					}
					break;
				case PLUSPLUS:
					{
					alt45=4;
					}
					break;
				case MINUSMINUS:
					{
					alt45=5;
					}
					break;
				}
				switch (alt45) {
				case 1 :
					// Cpp.g:236:7: l= LSQUARE ^ assignmentExpression RSQUARE !
					{
					l=(Token)match(input,LSQUARE,FOLLOW_LSQUARE_in_postfixExpression1701); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					l_tree = (Object)adaptor.create(l);
					root_0 = (Object)adaptor.becomeRoot(l_tree, root_0);
					}

					if ( state.backtracking==0 ) {l.setType(INDEX_OP);}
					pushFollow(FOLLOW_assignmentExpression_in_postfixExpression1706);
					assignmentExpression152=assignmentExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, assignmentExpression152.getTree());

					RSQUARE153=(Token)match(input,RSQUARE,FOLLOW_RSQUARE_in_postfixExpression1708); if (state.failed) return retval;
					}
					break;
				case 2 :
					// Cpp.g:238:5: s= STAR ^ IDENTIFIER
					{
					s=(Token)match(input,STAR,FOLLOW_STAR_in_postfixExpression1718); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					s_tree = (Object)adaptor.create(s);
					root_0 = (Object)adaptor.becomeRoot(s_tree, root_0);
					}

					if ( state.backtracking==0 ) {s.setType(POINTER);}
					IDENTIFIER154=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_postfixExpression1723); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IDENTIFIER154_tree = (Object)adaptor.create(IDENTIFIER154);
					adaptor.addChild(root_0, IDENTIFIER154_tree);
					}

					}
					break;
				case 3 :
					// Cpp.g:239:7: POINTERTO ^ IDENTIFIER
					{
					POINTERTO155=(Token)match(input,POINTERTO,FOLLOW_POINTERTO_in_postfixExpression1731); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					POINTERTO155_tree = (Object)adaptor.create(POINTERTO155);
					root_0 = (Object)adaptor.becomeRoot(POINTERTO155_tree, root_0);
					}

					IDENTIFIER156=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_postfixExpression1734); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IDENTIFIER156_tree = (Object)adaptor.create(IDENTIFIER156);
					adaptor.addChild(root_0, IDENTIFIER156_tree);
					}

					}
					break;
				case 4 :
					// Cpp.g:240:7: p= PLUSPLUS ^
					{
					p=(Token)match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_postfixExpression1744); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					p_tree = (Object)adaptor.create(p);
					root_0 = (Object)adaptor.becomeRoot(p_tree, root_0);
					}

					if ( state.backtracking==0 ) {p.setType(POST_INC);}
					}
					break;
				case 5 :
					// Cpp.g:241:7: m= MINUSMINUS ^
					{
					m=(Token)match(input,MINUSMINUS,FOLLOW_MINUSMINUS_in_postfixExpression1760); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					m_tree = (Object)adaptor.create(m);
					root_0 = (Object)adaptor.becomeRoot(m_tree, root_0);
					}

					if ( state.backtracking==0 ) {m.setType(POST_DEC);}
					}
					break;

				default :
					break loop45;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 30, postfixExpression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "postfixExpression"


	public static class primaryExpression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "primaryExpression"
	// Cpp.g:245:1: primaryExpression : ( ( IDENTIFIER LPAREN )=> functionCall | IDENTIFIER | constant | LPAREN assignmentExpression RPAREN -> ^( EXPR_GROUP assignmentExpression ) );
	public final CppParser.primaryExpression_return primaryExpression() throws RecognitionException {
		CppParser.primaryExpression_return retval = new CppParser.primaryExpression_return();
		retval.start = input.LT(1);
		int primaryExpression_StartIndex = input.index();

		Object root_0 = null;

		Token IDENTIFIER158=null;
		Token LPAREN160=null;
		Token RPAREN162=null;
		ParserRuleReturnScope functionCall157 =null;
		ParserRuleReturnScope constant159 =null;
		ParserRuleReturnScope assignmentExpression161 =null;

		Object IDENTIFIER158_tree=null;
		Object LPAREN160_tree=null;
		Object RPAREN162_tree=null;
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleSubtreeStream stream_assignmentExpression=new RewriteRuleSubtreeStream(adaptor,"rule assignmentExpression");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }

			// Cpp.g:246:3: ( ( IDENTIFIER LPAREN )=> functionCall | IDENTIFIER | constant | LPAREN assignmentExpression RPAREN -> ^( EXPR_GROUP assignmentExpression ) )
			int alt46=4;
			switch ( input.LA(1) ) {
			case IDENTIFIER:
				{
				int LA46_1 = input.LA(2);
				if ( (synpred87_Cpp()) ) {
					alt46=1;
				}
				else if ( (synpred88_Cpp()) ) {
					alt46=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 46, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case CHARACTER_LITERAL:
			case DECIMAL_LITERAL:
			case FLOATING_POINT_LITERAL:
			case HEX_LITERAL:
			case OCTAL_LITERAL:
			case STRING_LITERAL:
				{
				alt46=3;
				}
				break;
			case LPAREN:
				{
				alt46=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 46, 0, input);
				throw nvae;
			}
			switch (alt46) {
				case 1 :
					// Cpp.g:246:7: ( IDENTIFIER LPAREN )=> functionCall
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_functionCall_in_primaryExpression1794);
					functionCall157=functionCall();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, functionCall157.getTree());

					}
					break;
				case 2 :
					// Cpp.g:247:7: IDENTIFIER
					{
					root_0 = (Object)adaptor.nil();


					IDENTIFIER158=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_primaryExpression1802); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IDENTIFIER158_tree = (Object)adaptor.create(IDENTIFIER158);
					adaptor.addChild(root_0, IDENTIFIER158_tree);
					}

					}
					break;
				case 3 :
					// Cpp.g:248:7: constant
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_constant_in_primaryExpression1816);
					constant159=constant();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, constant159.getTree());

					}
					break;
				case 4 :
					// Cpp.g:249:7: LPAREN assignmentExpression RPAREN
					{
					LPAREN160=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression1829); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN160);

					pushFollow(FOLLOW_assignmentExpression_in_primaryExpression1832);
					assignmentExpression161=assignmentExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_assignmentExpression.add(assignmentExpression161.getTree());
					RPAREN162=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression1834); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN162);

					// AST REWRITE
					// elements: assignmentExpression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 249:44: -> ^( EXPR_GROUP assignmentExpression )
					{
						// Cpp.g:249:47: ^( EXPR_GROUP assignmentExpression )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPR_GROUP, "EXPR_GROUP"), root_1);
						adaptor.addChild(root_1, stream_assignmentExpression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 31, primaryExpression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "primaryExpression"


	public static class functionCall_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "functionCall"
	// Cpp.g:252:1: functionCall : id= IDENTIFIER LPAREN ( argList )? RPAREN -> ^( METHOD_CALL $id ( argList )? ) ;
	public final CppParser.functionCall_return functionCall() throws RecognitionException {
		CppParser.functionCall_return retval = new CppParser.functionCall_return();
		retval.start = input.LT(1);
		int functionCall_StartIndex = input.index();

		Object root_0 = null;

		Token id=null;
		Token LPAREN163=null;
		Token RPAREN165=null;
		ParserRuleReturnScope argList164 =null;

		Object id_tree=null;
		Object LPAREN163_tree=null;
		Object RPAREN165_tree=null;
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleSubtreeStream stream_argList=new RewriteRuleSubtreeStream(adaptor,"rule argList");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }

			// Cpp.g:253:3: (id= IDENTIFIER LPAREN ( argList )? RPAREN -> ^( METHOD_CALL $id ( argList )? ) )
			// Cpp.g:253:5: id= IDENTIFIER LPAREN ( argList )? RPAREN
			{
			id=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_functionCall1861); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_IDENTIFIER.add(id);

			LPAREN163=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_functionCall1863); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN163);

			// Cpp.g:253:26: ( argList )?
			int alt47=2;
			int LA47_0 = input.LA(1);
			if ( (LA47_0==AMPERSAND||LA47_0==CHARACTER_LITERAL||LA47_0==DECIMAL_LITERAL||LA47_0==DEFINED||LA47_0==FLOATING_POINT_LITERAL||LA47_0==HEX_LITERAL||LA47_0==IDENTIFIER||LA47_0==LPAREN||LA47_0==MINUS||LA47_0==MINUSMINUS||LA47_0==NOT||LA47_0==OCTAL_LITERAL||LA47_0==PLUS||LA47_0==PLUSPLUS||LA47_0==SIZEOF||LA47_0==STAR||LA47_0==STRING_LITERAL||LA47_0==TILDE) ) {
				alt47=1;
			}
			switch (alt47) {
				case 1 :
					// Cpp.g:253:26: argList
					{
					pushFollow(FOLLOW_argList_in_functionCall1865);
					argList164=argList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_argList.add(argList164.getTree());
					}
					break;

			}

			RPAREN165=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_functionCall1868); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN165);

			// AST REWRITE
			// elements: id, argList
			// token labels: id
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_id=new RewriteRuleTokenStream(adaptor,"token id",id);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 253:43: -> ^( METHOD_CALL $id ( argList )? )
			{
				// Cpp.g:253:46: ^( METHOD_CALL $id ( argList )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(METHOD_CALL, "METHOD_CALL"), root_1);
				adaptor.addChild(root_1, stream_id.nextNode());
				// Cpp.g:253:64: ( argList )?
				if ( stream_argList.hasNext() ) {
					adaptor.addChild(root_1, stream_argList.nextTree());
				}
				stream_argList.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 32, functionCall_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "functionCall"


	public static class argList_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "argList"
	// Cpp.g:256:1: argList : assignmentExpression ( COMMA assignmentExpression )* -> ^( ARGS ( assignmentExpression )+ ) ;
	public final CppParser.argList_return argList() throws RecognitionException {
		CppParser.argList_return retval = new CppParser.argList_return();
		retval.start = input.LT(1);
		int argList_StartIndex = input.index();

		Object root_0 = null;

		Token COMMA167=null;
		ParserRuleReturnScope assignmentExpression166 =null;
		ParserRuleReturnScope assignmentExpression168 =null;

		Object COMMA167_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_assignmentExpression=new RewriteRuleSubtreeStream(adaptor,"rule assignmentExpression");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }

			// Cpp.g:257:3: ( assignmentExpression ( COMMA assignmentExpression )* -> ^( ARGS ( assignmentExpression )+ ) )
			// Cpp.g:257:5: assignmentExpression ( COMMA assignmentExpression )*
			{
			pushFollow(FOLLOW_assignmentExpression_in_argList1894);
			assignmentExpression166=assignmentExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_assignmentExpression.add(assignmentExpression166.getTree());
			// Cpp.g:257:26: ( COMMA assignmentExpression )*
			loop48:
			while (true) {
				int alt48=2;
				int LA48_0 = input.LA(1);
				if ( (LA48_0==COMMA) ) {
					alt48=1;
				}

				switch (alt48) {
				case 1 :
					// Cpp.g:257:27: COMMA assignmentExpression
					{
					COMMA167=(Token)match(input,COMMA,FOLLOW_COMMA_in_argList1897); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA167);

					pushFollow(FOLLOW_assignmentExpression_in_argList1899);
					assignmentExpression168=assignmentExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_assignmentExpression.add(assignmentExpression168.getTree());
					}
					break;

				default :
					break loop48;
				}
			}

			// AST REWRITE
			// elements: assignmentExpression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 257:56: -> ^( ARGS ( assignmentExpression )+ )
			{
				// Cpp.g:257:59: ^( ARGS ( assignmentExpression )+ )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARGS, "ARGS"), root_1);
				if ( !(stream_assignmentExpression.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_assignmentExpression.hasNext() ) {
					adaptor.addChild(root_1, stream_assignmentExpression.nextTree());
				}
				stream_assignmentExpression.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 33, argList_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "argList"


	public static class constant_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "constant"
	// Cpp.g:260:1: constant : ( HEX_LITERAL | OCTAL_LITERAL | DECIMAL_LITERAL | CHARACTER_LITERAL | STRING_LITERAL | FLOATING_POINT_LITERAL );
	public final CppParser.constant_return constant() throws RecognitionException {
		CppParser.constant_return retval = new CppParser.constant_return();
		retval.start = input.LT(1);
		int constant_StartIndex = input.index();

		Object root_0 = null;

		Token set169=null;

		Object set169_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }

			// Cpp.g:261:3: ( HEX_LITERAL | OCTAL_LITERAL | DECIMAL_LITERAL | CHARACTER_LITERAL | STRING_LITERAL | FLOATING_POINT_LITERAL )
			// Cpp.g:
			{
			root_0 = (Object)adaptor.nil();


			set169=input.LT(1);
			if ( input.LA(1)==CHARACTER_LITERAL||input.LA(1)==DECIMAL_LITERAL||input.LA(1)==FLOATING_POINT_LITERAL||input.LA(1)==HEX_LITERAL||input.LA(1)==OCTAL_LITERAL||input.LA(1)==STRING_LITERAL ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set169));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 34, constant_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "constant"


	public static class source_text_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "source_text"
	// Cpp.g:271:1: source_text : ( sourceExpression | COMMA | LPAREN | RPAREN | WS );
	public final CppParser.source_text_return source_text() throws RecognitionException {
		CppParser.source_text_return retval = new CppParser.source_text_return();
		retval.start = input.LT(1);
		int source_text_StartIndex = input.index();

		Object root_0 = null;

		Token COMMA171=null;
		Token LPAREN172=null;
		Token RPAREN173=null;
		Token WS174=null;
		ParserRuleReturnScope sourceExpression170 =null;

		Object COMMA171_tree=null;
		Object LPAREN172_tree=null;
		Object RPAREN173_tree=null;
		Object WS174_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }

			// Cpp.g:272:3: ( sourceExpression | COMMA | LPAREN | RPAREN | WS )
			int alt49=5;
			switch ( input.LA(1) ) {
			case CHARACTER_LITERAL:
			case CKEYWORD:
			case COPERATOR:
			case DECIMAL_LITERAL:
			case FLOATING_POINT_LITERAL:
			case HEX_LITERAL:
			case IDENTIFIER:
			case LIB_FILE:
			case OCTAL_LITERAL:
			case SEMICOLON:
			case SHARP:
			case SHARPSHARP:
			case SIZEOF:
			case STRINGIFICATION:
			case STRING_LITERAL:
			case STRING_OP:
			case TEXT_END:
				{
				alt49=1;
				}
				break;
			case LPAREN:
				{
				int LA49_11 = input.LA(2);
				if ( (synpred97_Cpp()) ) {
					alt49=1;
				}
				else if ( (synpred99_Cpp()) ) {
					alt49=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 49, 11, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case WS:
				{
				int LA49_14 = input.LA(2);
				if ( (synpred97_Cpp()) ) {
					alt49=1;
				}
				else if ( (true) ) {
					alt49=5;
				}

				}
				break;
			case COMMA:
				{
				alt49=2;
				}
				break;
			case RPAREN:
				{
				alt49=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 49, 0, input);
				throw nvae;
			}
			switch (alt49) {
				case 1 :
					// Cpp.g:272:7: sourceExpression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_sourceExpression_in_source_text1981);
					sourceExpression170=sourceExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, sourceExpression170.getTree());

					}
					break;
				case 2 :
					// Cpp.g:273:5: COMMA
					{
					root_0 = (Object)adaptor.nil();


					COMMA171=(Token)match(input,COMMA,FOLLOW_COMMA_in_source_text1987); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					COMMA171_tree = (Object)adaptor.create(COMMA171);
					adaptor.addChild(root_0, COMMA171_tree);
					}

					}
					break;
				case 3 :
					// Cpp.g:274:5: LPAREN
					{
					root_0 = (Object)adaptor.nil();


					LPAREN172=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_source_text1993); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LPAREN172_tree = (Object)adaptor.create(LPAREN172);
					adaptor.addChild(root_0, LPAREN172_tree);
					}

					}
					break;
				case 4 :
					// Cpp.g:275:5: RPAREN
					{
					root_0 = (Object)adaptor.nil();


					RPAREN173=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_source_text1999); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					RPAREN173_tree = (Object)adaptor.create(RPAREN173);
					adaptor.addChild(root_0, RPAREN173_tree);
					}

					}
					break;
				case 5 :
					// Cpp.g:276:5: WS
					{
					root_0 = (Object)adaptor.nil();


					WS174=(Token)match(input,WS,FOLLOW_WS_in_source_text2005); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					WS174_tree = (Object)adaptor.create(WS174);
					adaptor.addChild(root_0, WS174_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 35, source_text_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "source_text"


	public static class macroExpansion_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "macroExpansion"
	// Cpp.g:279:1: macroExpansion : (id= IDENTIFIER ( WS )? LPAREN ( WS )? RPAREN -> ^( EXPAND $id) |id= IDENTIFIER ( WS )? LPAREN ( WS )? macArgs ( WS )? RPAREN -> ^( EXPAND $id ( macArgs )? ) );
	public final CppParser.macroExpansion_return macroExpansion() throws RecognitionException {
		CppParser.macroExpansion_return retval = new CppParser.macroExpansion_return();
		retval.start = input.LT(1);
		int macroExpansion_StartIndex = input.index();

		Object root_0 = null;

		Token id=null;
		Token WS175=null;
		Token LPAREN176=null;
		Token WS177=null;
		Token RPAREN178=null;
		Token WS179=null;
		Token LPAREN180=null;
		Token WS181=null;
		Token WS183=null;
		Token RPAREN184=null;
		ParserRuleReturnScope macArgs182 =null;

		Object id_tree=null;
		Object WS175_tree=null;
		Object LPAREN176_tree=null;
		Object WS177_tree=null;
		Object RPAREN178_tree=null;
		Object WS179_tree=null;
		Object LPAREN180_tree=null;
		Object WS181_tree=null;
		Object WS183_tree=null;
		Object RPAREN184_tree=null;
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_macArgs=new RewriteRuleSubtreeStream(adaptor,"rule macArgs");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }

			// Cpp.g:280:3: (id= IDENTIFIER ( WS )? LPAREN ( WS )? RPAREN -> ^( EXPAND $id) |id= IDENTIFIER ( WS )? LPAREN ( WS )? macArgs ( WS )? RPAREN -> ^( EXPAND $id ( macArgs )? ) )
			int alt55=2;
			int LA55_0 = input.LA(1);
			if ( (LA55_0==IDENTIFIER) ) {
				int LA55_1 = input.LA(2);
				if ( (LA55_1==WS) ) {
					int LA55_2 = input.LA(3);
					if ( (LA55_2==LPAREN) ) {
						switch ( input.LA(4) ) {
						case WS:
							{
							int LA55_4 = input.LA(5);
							if ( (LA55_4==RPAREN) ) {
								int LA55_7 = input.LA(6);
								if ( (synpred103_Cpp()) ) {
									alt55=1;
								}
								else if ( (true) ) {
									alt55=2;
								}

							}
							else if ( ((LA55_4 >= CHARACTER_LITERAL && LA55_4 <= CKEYWORD)||LA55_4==COMMA||(LA55_4 >= COPERATOR && LA55_4 <= DECIMAL_LITERAL)||LA55_4==FLOATING_POINT_LITERAL||LA55_4==HEX_LITERAL||LA55_4==IDENTIFIER||LA55_4==LIB_FILE||LA55_4==LPAREN||LA55_4==OCTAL_LITERAL||(LA55_4 >= SEMICOLON && LA55_4 <= SHARPSHARP)||LA55_4==SIZEOF||(LA55_4 >= STRINGIFICATION && LA55_4 <= TEXT_END)||LA55_4==WS) ) {
								alt55=2;
							}

							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 55, 4, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

							}
							break;
						case RPAREN:
							{
							int LA55_5 = input.LA(5);
							if ( (synpred103_Cpp()) ) {
								alt55=1;
							}
							else if ( (true) ) {
								alt55=2;
							}

							}
							break;
						case CHARACTER_LITERAL:
						case CKEYWORD:
						case COMMA:
						case COPERATOR:
						case DECIMAL_LITERAL:
						case FLOATING_POINT_LITERAL:
						case HEX_LITERAL:
						case IDENTIFIER:
						case LIB_FILE:
						case LPAREN:
						case OCTAL_LITERAL:
						case SEMICOLON:
						case SHARP:
						case SHARPSHARP:
						case SIZEOF:
						case STRINGIFICATION:
						case STRING_LITERAL:
						case STRING_OP:
						case TEXT_END:
							{
							alt55=2;
							}
							break;
						default:
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 55, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 55, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA55_1==LPAREN) ) {
					switch ( input.LA(3) ) {
					case WS:
						{
						int LA55_4 = input.LA(4);
						if ( (LA55_4==RPAREN) ) {
							int LA55_7 = input.LA(5);
							if ( (synpred103_Cpp()) ) {
								alt55=1;
							}
							else if ( (true) ) {
								alt55=2;
							}

						}
						else if ( ((LA55_4 >= CHARACTER_LITERAL && LA55_4 <= CKEYWORD)||LA55_4==COMMA||(LA55_4 >= COPERATOR && LA55_4 <= DECIMAL_LITERAL)||LA55_4==FLOATING_POINT_LITERAL||LA55_4==HEX_LITERAL||LA55_4==IDENTIFIER||LA55_4==LIB_FILE||LA55_4==LPAREN||LA55_4==OCTAL_LITERAL||(LA55_4 >= SEMICOLON && LA55_4 <= SHARPSHARP)||LA55_4==SIZEOF||(LA55_4 >= STRINGIFICATION && LA55_4 <= TEXT_END)||LA55_4==WS) ) {
							alt55=2;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 55, 4, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case RPAREN:
						{
						int LA55_5 = input.LA(4);
						if ( (synpred103_Cpp()) ) {
							alt55=1;
						}
						else if ( (true) ) {
							alt55=2;
						}

						}
						break;
					case CHARACTER_LITERAL:
					case CKEYWORD:
					case COMMA:
					case COPERATOR:
					case DECIMAL_LITERAL:
					case FLOATING_POINT_LITERAL:
					case HEX_LITERAL:
					case IDENTIFIER:
					case LIB_FILE:
					case LPAREN:
					case OCTAL_LITERAL:
					case SEMICOLON:
					case SHARP:
					case SHARPSHARP:
					case SIZEOF:
					case STRINGIFICATION:
					case STRING_LITERAL:
					case STRING_OP:
					case TEXT_END:
						{
						alt55=2;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 55, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 55, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 55, 0, input);
				throw nvae;
			}

			switch (alt55) {
				case 1 :
					// Cpp.g:280:5: id= IDENTIFIER ( WS )? LPAREN ( WS )? RPAREN
					{
					id=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_macroExpansion2021); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_IDENTIFIER.add(id);

					// Cpp.g:280:19: ( WS )?
					int alt50=2;
					int LA50_0 = input.LA(1);
					if ( (LA50_0==WS) ) {
						alt50=1;
					}
					switch (alt50) {
						case 1 :
							// Cpp.g:280:19: WS
							{
							WS175=(Token)match(input,WS,FOLLOW_WS_in_macroExpansion2023); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_WS.add(WS175);

							}
							break;

					}

					LPAREN176=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_macroExpansion2026); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN176);

					// Cpp.g:280:30: ( WS )?
					int alt51=2;
					int LA51_0 = input.LA(1);
					if ( (LA51_0==WS) ) {
						alt51=1;
					}
					switch (alt51) {
						case 1 :
							// Cpp.g:280:30: WS
							{
							WS177=(Token)match(input,WS,FOLLOW_WS_in_macroExpansion2028); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_WS.add(WS177);

							}
							break;

					}

					RPAREN178=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_macroExpansion2033); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN178);

					// AST REWRITE
					// elements: id
					// token labels: id
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_id=new RewriteRuleTokenStream(adaptor,"token id",id);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 280:44: -> ^( EXPAND $id)
					{
						// Cpp.g:280:47: ^( EXPAND $id)
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPAND, "EXPAND"), root_1);
						adaptor.addChild(root_1, stream_id.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// Cpp.g:281:5: id= IDENTIFIER ( WS )? LPAREN ( WS )? macArgs ( WS )? RPAREN
					{
					id=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_macroExpansion2051); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_IDENTIFIER.add(id);

					// Cpp.g:281:19: ( WS )?
					int alt52=2;
					int LA52_0 = input.LA(1);
					if ( (LA52_0==WS) ) {
						alt52=1;
					}
					switch (alt52) {
						case 1 :
							// Cpp.g:281:19: WS
							{
							WS179=(Token)match(input,WS,FOLLOW_WS_in_macroExpansion2053); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_WS.add(WS179);

							}
							break;

					}

					LPAREN180=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_macroExpansion2056); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN180);

					// Cpp.g:281:30: ( WS )?
					int alt53=2;
					int LA53_0 = input.LA(1);
					if ( (LA53_0==WS) ) {
						int LA53_1 = input.LA(2);
						if ( (synpred105_Cpp()) ) {
							alt53=1;
						}
					}
					switch (alt53) {
						case 1 :
							// Cpp.g:281:30: WS
							{
							WS181=(Token)match(input,WS,FOLLOW_WS_in_macroExpansion2058); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_WS.add(WS181);

							}
							break;

					}

					pushFollow(FOLLOW_macArgs_in_macroExpansion2061);
					macArgs182=macArgs();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_macArgs.add(macArgs182.getTree());
					// Cpp.g:281:43: ( WS )?
					int alt54=2;
					int LA54_0 = input.LA(1);
					if ( (LA54_0==WS) ) {
						alt54=1;
					}
					switch (alt54) {
						case 1 :
							// Cpp.g:281:43: WS
							{
							WS183=(Token)match(input,WS,FOLLOW_WS_in_macroExpansion2064); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_WS.add(WS183);

							}
							break;

					}

					RPAREN184=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_macroExpansion2067); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN184);

					// AST REWRITE
					// elements: id, macArgs
					// token labels: id
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_id=new RewriteRuleTokenStream(adaptor,"token id",id);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 281:55: -> ^( EXPAND $id ( macArgs )? )
					{
						// Cpp.g:281:58: ^( EXPAND $id ( macArgs )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPAND, "EXPAND"), root_1);
						adaptor.addChild(root_1, stream_id.nextNode());
						// Cpp.g:281:71: ( macArgs )?
						if ( stream_macArgs.hasNext() ) {
							adaptor.addChild(root_1, stream_macArgs.nextTree());
						}
						stream_macArgs.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 36, macroExpansion_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "macroExpansion"


	public static class macArgs_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "macArgs"
	// Cpp.g:284:1: macArgs :marg+= mArg ( ( WS )? COMMA ( WS )? marg+= mArg )* -> ^( EXP_ARGS ( $marg)+ ) ;
	public final CppParser.macArgs_return macArgs() throws RecognitionException {
		CppParser.macArgs_return retval = new CppParser.macArgs_return();
		retval.start = input.LT(1);
		int macArgs_StartIndex = input.index();

		Object root_0 = null;

		Token WS185=null;
		Token COMMA186=null;
		Token WS187=null;
		List<Object> list_marg=null;
		RuleReturnScope marg = null;
		Object WS185_tree=null;
		Object COMMA186_tree=null;
		Object WS187_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_mArg=new RewriteRuleSubtreeStream(adaptor,"rule mArg");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }

			// Cpp.g:284:9: (marg+= mArg ( ( WS )? COMMA ( WS )? marg+= mArg )* -> ^( EXP_ARGS ( $marg)+ ) )
			// Cpp.g:284:11: marg+= mArg ( ( WS )? COMMA ( WS )? marg+= mArg )*
			{
			pushFollow(FOLLOW_mArg_in_macArgs2093);
			marg=mArg();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_mArg.add(marg.getTree());
			if (list_marg==null) list_marg=new ArrayList<Object>();
			list_marg.add(marg.getTree());
			// Cpp.g:284:22: ( ( WS )? COMMA ( WS )? marg+= mArg )*
			loop58:
			while (true) {
				int alt58=2;
				int LA58_0 = input.LA(1);
				if ( (LA58_0==WS) ) {
					int LA58_1 = input.LA(2);
					if ( (LA58_1==COMMA) ) {
						alt58=1;
					}

				}
				else if ( (LA58_0==COMMA) ) {
					alt58=1;
				}

				switch (alt58) {
				case 1 :
					// Cpp.g:284:24: ( WS )? COMMA ( WS )? marg+= mArg
					{
					// Cpp.g:284:24: ( WS )?
					int alt56=2;
					int LA56_0 = input.LA(1);
					if ( (LA56_0==WS) ) {
						alt56=1;
					}
					switch (alt56) {
						case 1 :
							// Cpp.g:284:24: WS
							{
							WS185=(Token)match(input,WS,FOLLOW_WS_in_macArgs2097); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_WS.add(WS185);

							}
							break;

					}

					COMMA186=(Token)match(input,COMMA,FOLLOW_COMMA_in_macArgs2100); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA186);

					// Cpp.g:284:34: ( WS )?
					int alt57=2;
					int LA57_0 = input.LA(1);
					if ( (LA57_0==WS) ) {
						int LA57_1 = input.LA(2);
						if ( (synpred108_Cpp()) ) {
							alt57=1;
						}
					}
					switch (alt57) {
						case 1 :
							// Cpp.g:284:34: WS
							{
							WS187=(Token)match(input,WS,FOLLOW_WS_in_macArgs2102); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_WS.add(WS187);

							}
							break;

					}

					pushFollow(FOLLOW_mArg_in_macArgs2107);
					marg=mArg();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_mArg.add(marg.getTree());
					if (list_marg==null) list_marg=new ArrayList<Object>();
					list_marg.add(marg.getTree());
					}
					break;

				default :
					break loop58;
				}
			}

			// AST REWRITE
			// elements: marg
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: marg
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_marg=new RewriteRuleSubtreeStream(adaptor,"token marg",list_marg);
			root_0 = (Object)adaptor.nil();
			// 284:52: -> ^( EXP_ARGS ( $marg)+ )
			{
				// Cpp.g:284:55: ^( EXP_ARGS ( $marg)+ )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXP_ARGS, "EXP_ARGS"), root_1);
				if ( !(stream_marg.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_marg.hasNext() ) {
					adaptor.addChild(root_1, stream_marg.nextTree());
				}
				stream_marg.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 37, macArgs_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "macArgs"


	public static class mArg_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "mArg"
	// Cpp.g:287:1: mArg : ( ( sourceExpression )+ -> ^( EXP_ARG ( sourceExpression )+ ) | -> ^( EXP_ARG ) );
	public final CppParser.mArg_return mArg() throws RecognitionException {
		CppParser.mArg_return retval = new CppParser.mArg_return();
		retval.start = input.LT(1);
		int mArg_StartIndex = input.index();

		Object root_0 = null;

		ParserRuleReturnScope sourceExpression188 =null;

		RewriteRuleSubtreeStream stream_sourceExpression=new RewriteRuleSubtreeStream(adaptor,"rule sourceExpression");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }

			// Cpp.g:287:6: ( ( sourceExpression )+ -> ^( EXP_ARG ( sourceExpression )+ ) | -> ^( EXP_ARG ) )
			int alt60=2;
			switch ( input.LA(1) ) {
			case CHARACTER_LITERAL:
			case CKEYWORD:
			case COPERATOR:
			case DECIMAL_LITERAL:
			case FLOATING_POINT_LITERAL:
			case HEX_LITERAL:
			case IDENTIFIER:
			case LIB_FILE:
			case LPAREN:
			case OCTAL_LITERAL:
			case SEMICOLON:
			case SHARP:
			case SHARPSHARP:
			case SIZEOF:
			case STRINGIFICATION:
			case STRING_LITERAL:
			case STRING_OP:
			case TEXT_END:
				{
				alt60=1;
				}
				break;
			case WS:
				{
				int LA60_2 = input.LA(2);
				if ( (synpred111_Cpp()) ) {
					alt60=1;
				}
				else if ( (true) ) {
					alt60=2;
				}

				}
				break;
			case EOF:
			case COMMA:
			case RPAREN:
				{
				alt60=2;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 60, 0, input);
				throw nvae;
			}
			switch (alt60) {
				case 1 :
					// Cpp.g:287:8: ( sourceExpression )+
					{
					// Cpp.g:287:8: ( sourceExpression )+
					int cnt59=0;
					loop59:
					while (true) {
						int alt59=2;
						int LA59_0 = input.LA(1);
						if ( (LA59_0==WS) ) {
							int LA59_1 = input.LA(2);
							if ( (synpred110_Cpp()) ) {
								alt59=1;
							}

						}
						else if ( ((LA59_0 >= CHARACTER_LITERAL && LA59_0 <= CKEYWORD)||(LA59_0 >= COPERATOR && LA59_0 <= DECIMAL_LITERAL)||LA59_0==FLOATING_POINT_LITERAL||LA59_0==HEX_LITERAL||LA59_0==IDENTIFIER||LA59_0==LIB_FILE||LA59_0==LPAREN||LA59_0==OCTAL_LITERAL||(LA59_0 >= SEMICOLON && LA59_0 <= SHARPSHARP)||LA59_0==SIZEOF||(LA59_0 >= STRINGIFICATION && LA59_0 <= TEXT_END)) ) {
							alt59=1;
						}

						switch (alt59) {
						case 1 :
							// Cpp.g:287:8: sourceExpression
							{
							pushFollow(FOLLOW_sourceExpression_in_mArg2131);
							sourceExpression188=sourceExpression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_sourceExpression.add(sourceExpression188.getTree());
							}
							break;

						default :
							if ( cnt59 >= 1 ) break loop59;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(59, input);
							throw eee;
						}
						cnt59++;
					}

					// AST REWRITE
					// elements: sourceExpression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 287:27: -> ^( EXP_ARG ( sourceExpression )+ )
					{
						// Cpp.g:287:30: ^( EXP_ARG ( sourceExpression )+ )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXP_ARG, "EXP_ARG"), root_1);
						if ( !(stream_sourceExpression.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_sourceExpression.hasNext() ) {
							adaptor.addChild(root_1, stream_sourceExpression.nextTree());
						}
						stream_sourceExpression.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// Cpp.g:288:5: 
					{
					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 288:5: -> ^( EXP_ARG )
					{
						// Cpp.g:288:8: ^( EXP_ARG )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXP_ARG, "EXP_ARG"), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 38, mArg_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "mArg"


	public static class sourceExpression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "sourceExpression"
	// Cpp.g:291:1: sourceExpression : ( ( IDENTIFIER ( WS )? LPAREN )=> macroExpansion | ( primarySource ( WS )? SHARPSHARP )=> concatenate | STRINGIFICATION IDENTIFIER -> ^( STRINGIFICATION IDENTIFIER ) | primarySource | STRING_OP | SIZEOF | LPAREN ( macArgs )? RPAREN -> ^( TEXT_GROUP ( macArgs )? ) | SEMICOLON | TEXT_END | WS );
	public final CppParser.sourceExpression_return sourceExpression() throws RecognitionException {
		CppParser.sourceExpression_return retval = new CppParser.sourceExpression_return();
		retval.start = input.LT(1);
		int sourceExpression_StartIndex = input.index();

		Object root_0 = null;

		Token STRINGIFICATION191=null;
		Token IDENTIFIER192=null;
		Token STRING_OP194=null;
		Token SIZEOF195=null;
		Token LPAREN196=null;
		Token RPAREN198=null;
		Token SEMICOLON199=null;
		Token TEXT_END200=null;
		Token WS201=null;
		ParserRuleReturnScope macroExpansion189 =null;
		ParserRuleReturnScope concatenate190 =null;
		ParserRuleReturnScope primarySource193 =null;
		ParserRuleReturnScope macArgs197 =null;

		Object STRINGIFICATION191_tree=null;
		Object IDENTIFIER192_tree=null;
		Object STRING_OP194_tree=null;
		Object SIZEOF195_tree=null;
		Object LPAREN196_tree=null;
		Object RPAREN198_tree=null;
		Object SEMICOLON199_tree=null;
		Object TEXT_END200_tree=null;
		Object WS201_tree=null;
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleTokenStream stream_STRINGIFICATION=new RewriteRuleTokenStream(adaptor,"token STRINGIFICATION");
		RewriteRuleSubtreeStream stream_macArgs=new RewriteRuleSubtreeStream(adaptor,"rule macArgs");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }

			// Cpp.g:292:3: ( ( IDENTIFIER ( WS )? LPAREN )=> macroExpansion | ( primarySource ( WS )? SHARPSHARP )=> concatenate | STRINGIFICATION IDENTIFIER -> ^( STRINGIFICATION IDENTIFIER ) | primarySource | STRING_OP | SIZEOF | LPAREN ( macArgs )? RPAREN -> ^( TEXT_GROUP ( macArgs )? ) | SEMICOLON | TEXT_END | WS )
			int alt62=10;
			switch ( input.LA(1) ) {
			case IDENTIFIER:
				{
				int LA62_1 = input.LA(2);
				if ( (synpred113_Cpp()) ) {
					alt62=1;
				}
				else if ( (synpred115_Cpp()) ) {
					alt62=2;
				}
				else if ( (synpred117_Cpp()) ) {
					alt62=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 62, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case SHARPSHARP:
				{
				int LA62_2 = input.LA(2);
				if ( (synpred115_Cpp()) ) {
					alt62=2;
				}
				else if ( (synpred117_Cpp()) ) {
					alt62=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 62, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case SHARP:
				{
				int LA62_3 = input.LA(2);
				if ( (synpred115_Cpp()) ) {
					alt62=2;
				}
				else if ( (synpred117_Cpp()) ) {
					alt62=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 62, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case LIB_FILE:
				{
				int LA62_4 = input.LA(2);
				if ( (synpred115_Cpp()) ) {
					alt62=2;
				}
				else if ( (synpred117_Cpp()) ) {
					alt62=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 62, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case CHARACTER_LITERAL:
			case DECIMAL_LITERAL:
			case FLOATING_POINT_LITERAL:
			case HEX_LITERAL:
			case OCTAL_LITERAL:
			case STRING_LITERAL:
				{
				int LA62_5 = input.LA(2);
				if ( (synpred115_Cpp()) ) {
					alt62=2;
				}
				else if ( (synpred117_Cpp()) ) {
					alt62=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 62, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case CKEYWORD:
				{
				int LA62_6 = input.LA(2);
				if ( (synpred115_Cpp()) ) {
					alt62=2;
				}
				else if ( (synpred117_Cpp()) ) {
					alt62=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 62, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case COPERATOR:
				{
				int LA62_7 = input.LA(2);
				if ( (synpred115_Cpp()) ) {
					alt62=2;
				}
				else if ( (synpred117_Cpp()) ) {
					alt62=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 62, 7, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case STRINGIFICATION:
				{
				alt62=3;
				}
				break;
			case STRING_OP:
				{
				alt62=5;
				}
				break;
			case SIZEOF:
				{
				alt62=6;
				}
				break;
			case LPAREN:
				{
				alt62=7;
				}
				break;
			case SEMICOLON:
				{
				alt62=8;
				}
				break;
			case TEXT_END:
				{
				alt62=9;
				}
				break;
			case WS:
				{
				alt62=10;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 62, 0, input);
				throw nvae;
			}
			switch (alt62) {
				case 1 :
					// Cpp.g:292:5: ( IDENTIFIER ( WS )? LPAREN )=> macroExpansion
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_macroExpansion_in_sourceExpression2176);
					macroExpansion189=macroExpansion();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, macroExpansion189.getTree());

					}
					break;
				case 2 :
					// Cpp.g:293:5: ( primarySource ( WS )? SHARPSHARP )=> concatenate
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_concatenate_in_sourceExpression2195);
					concatenate190=concatenate();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, concatenate190.getTree());

					}
					break;
				case 3 :
					// Cpp.g:294:5: STRINGIFICATION IDENTIFIER
					{
					STRINGIFICATION191=(Token)match(input,STRINGIFICATION,FOLLOW_STRINGIFICATION_in_sourceExpression2201); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_STRINGIFICATION.add(STRINGIFICATION191);

					IDENTIFIER192=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_sourceExpression2203); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER192);

					// AST REWRITE
					// elements: IDENTIFIER, STRINGIFICATION
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 294:33: -> ^( STRINGIFICATION IDENTIFIER )
					{
						// Cpp.g:294:36: ^( STRINGIFICATION IDENTIFIER )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(stream_STRINGIFICATION.nextNode(), root_1);
						adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 4 :
					// Cpp.g:295:5: primarySource
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_primarySource_in_sourceExpression2218);
					primarySource193=primarySource();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primarySource193.getTree());

					}
					break;
				case 5 :
					// Cpp.g:296:5: STRING_OP
					{
					root_0 = (Object)adaptor.nil();


					STRING_OP194=(Token)match(input,STRING_OP,FOLLOW_STRING_OP_in_sourceExpression2224); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					STRING_OP194_tree = (Object)adaptor.create(STRING_OP194);
					adaptor.addChild(root_0, STRING_OP194_tree);
					}

					}
					break;
				case 6 :
					// Cpp.g:297:5: SIZEOF
					{
					root_0 = (Object)adaptor.nil();


					SIZEOF195=(Token)match(input,SIZEOF,FOLLOW_SIZEOF_in_sourceExpression2230); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					SIZEOF195_tree = (Object)adaptor.create(SIZEOF195);
					adaptor.addChild(root_0, SIZEOF195_tree);
					}

					}
					break;
				case 7 :
					// Cpp.g:298:5: LPAREN ( macArgs )? RPAREN
					{
					LPAREN196=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_sourceExpression2236); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN196);

					// Cpp.g:298:12: ( macArgs )?
					int alt61=2;
					int LA61_0 = input.LA(1);
					if ( ((LA61_0 >= CHARACTER_LITERAL && LA61_0 <= CKEYWORD)||LA61_0==COMMA||(LA61_0 >= COPERATOR && LA61_0 <= DECIMAL_LITERAL)||LA61_0==FLOATING_POINT_LITERAL||LA61_0==HEX_LITERAL||LA61_0==IDENTIFIER||LA61_0==LIB_FILE||LA61_0==LPAREN||LA61_0==OCTAL_LITERAL||(LA61_0 >= SEMICOLON && LA61_0 <= SHARPSHARP)||LA61_0==SIZEOF||(LA61_0 >= STRINGIFICATION && LA61_0 <= TEXT_END)||LA61_0==WS) ) {
						alt61=1;
					}
					else if ( (LA61_0==RPAREN) ) {
						int LA61_2 = input.LA(2);
						if ( (synpred120_Cpp()) ) {
							alt61=1;
						}
					}
					switch (alt61) {
						case 1 :
							// Cpp.g:298:12: macArgs
							{
							pushFollow(FOLLOW_macArgs_in_sourceExpression2238);
							macArgs197=macArgs();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_macArgs.add(macArgs197.getTree());
							}
							break;

					}

					RPAREN198=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_sourceExpression2241); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN198);

					// AST REWRITE
					// elements: macArgs
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 298:28: -> ^( TEXT_GROUP ( macArgs )? )
					{
						// Cpp.g:298:31: ^( TEXT_GROUP ( macArgs )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TEXT_GROUP, "TEXT_GROUP"), root_1);
						// Cpp.g:298:44: ( macArgs )?
						if ( stream_macArgs.hasNext() ) {
							adaptor.addChild(root_1, stream_macArgs.nextTree());
						}
						stream_macArgs.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 8 :
					// Cpp.g:299:5: SEMICOLON
					{
					root_0 = (Object)adaptor.nil();


					SEMICOLON199=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_sourceExpression2256); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					SEMICOLON199_tree = (Object)adaptor.create(SEMICOLON199);
					adaptor.addChild(root_0, SEMICOLON199_tree);
					}

					}
					break;
				case 9 :
					// Cpp.g:300:5: TEXT_END
					{
					root_0 = (Object)adaptor.nil();


					TEXT_END200=(Token)match(input,TEXT_END,FOLLOW_TEXT_END_in_sourceExpression2262); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TEXT_END200_tree = (Object)adaptor.create(TEXT_END200);
					adaptor.addChild(root_0, TEXT_END200_tree);
					}

					}
					break;
				case 10 :
					// Cpp.g:301:5: WS
					{
					root_0 = (Object)adaptor.nil();


					WS201=(Token)match(input,WS,FOLLOW_WS_in_sourceExpression2268); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					WS201_tree = (Object)adaptor.create(WS201);
					adaptor.addChild(root_0, WS201_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 39, sourceExpression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "sourceExpression"


	public static class concatenate_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "concatenate"
	// Cpp.g:304:1: concatenate :prim+= primarySource ( ( WS )? SHARPSHARP ( WS )? prim+= primarySource )+ -> ^( CONCATENATE ( $prim)+ ) ;
	public final CppParser.concatenate_return concatenate() throws RecognitionException {
		CppParser.concatenate_return retval = new CppParser.concatenate_return();
		retval.start = input.LT(1);
		int concatenate_StartIndex = input.index();

		Object root_0 = null;

		Token WS202=null;
		Token SHARPSHARP203=null;
		Token WS204=null;
		List<Object> list_prim=null;
		RuleReturnScope prim = null;
		Object WS202_tree=null;
		Object SHARPSHARP203_tree=null;
		Object WS204_tree=null;
		RewriteRuleTokenStream stream_SHARPSHARP=new RewriteRuleTokenStream(adaptor,"token SHARPSHARP");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_primarySource=new RewriteRuleSubtreeStream(adaptor,"rule primarySource");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }

			// Cpp.g:305:3: (prim+= primarySource ( ( WS )? SHARPSHARP ( WS )? prim+= primarySource )+ -> ^( CONCATENATE ( $prim)+ ) )
			// Cpp.g:305:5: prim+= primarySource ( ( WS )? SHARPSHARP ( WS )? prim+= primarySource )+
			{
			pushFollow(FOLLOW_primarySource_in_concatenate2283);
			prim=primarySource();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_primarySource.add(prim.getTree());
			if (list_prim==null) list_prim=new ArrayList<Object>();
			list_prim.add(prim.getTree());
			// Cpp.g:305:25: ( ( WS )? SHARPSHARP ( WS )? prim+= primarySource )+
			int cnt65=0;
			loop65:
			while (true) {
				int alt65=2;
				int LA65_0 = input.LA(1);
				if ( (LA65_0==SHARPSHARP) ) {
					switch ( input.LA(2) ) {
					case WS:
						{
						int LA65_4 = input.LA(3);
						if ( (LA65_4==IDENTIFIER) ) {
							int LA65_7 = input.LA(4);
							if ( (synpred126_Cpp()) ) {
								alt65=1;
							}

						}
						else if ( ((LA65_4 >= CHARACTER_LITERAL && LA65_4 <= CKEYWORD)||(LA65_4 >= COPERATOR && LA65_4 <= DECIMAL_LITERAL)||LA65_4==FLOATING_POINT_LITERAL||LA65_4==HEX_LITERAL||LA65_4==LIB_FILE||LA65_4==OCTAL_LITERAL||(LA65_4 >= SHARP && LA65_4 <= SHARPSHARP)||LA65_4==STRING_LITERAL) ) {
							alt65=1;
						}

						}
						break;
					case IDENTIFIER:
						{
						int LA65_5 = input.LA(3);
						if ( (synpred126_Cpp()) ) {
							alt65=1;
						}

						}
						break;
					case CHARACTER_LITERAL:
					case CKEYWORD:
					case COPERATOR:
					case DECIMAL_LITERAL:
					case FLOATING_POINT_LITERAL:
					case HEX_LITERAL:
					case LIB_FILE:
					case OCTAL_LITERAL:
					case SHARP:
					case SHARPSHARP:
					case STRING_LITERAL:
						{
						alt65=1;
						}
						break;
					}
				}
				else if ( (LA65_0==WS) ) {
					int LA65_3 = input.LA(2);
					if ( (LA65_3==SHARPSHARP) ) {
						switch ( input.LA(3) ) {
						case WS:
							{
							int LA65_4 = input.LA(4);
							if ( (LA65_4==IDENTIFIER) ) {
								int LA65_7 = input.LA(5);
								if ( (synpred126_Cpp()) ) {
									alt65=1;
								}

							}
							else if ( ((LA65_4 >= CHARACTER_LITERAL && LA65_4 <= CKEYWORD)||(LA65_4 >= COPERATOR && LA65_4 <= DECIMAL_LITERAL)||LA65_4==FLOATING_POINT_LITERAL||LA65_4==HEX_LITERAL||LA65_4==LIB_FILE||LA65_4==OCTAL_LITERAL||(LA65_4 >= SHARP && LA65_4 <= SHARPSHARP)||LA65_4==STRING_LITERAL) ) {
								alt65=1;
							}

							}
							break;
						case IDENTIFIER:
							{
							int LA65_5 = input.LA(4);
							if ( (synpred126_Cpp()) ) {
								alt65=1;
							}

							}
							break;
						case CHARACTER_LITERAL:
						case CKEYWORD:
						case COPERATOR:
						case DECIMAL_LITERAL:
						case FLOATING_POINT_LITERAL:
						case HEX_LITERAL:
						case LIB_FILE:
						case OCTAL_LITERAL:
						case SHARP:
						case SHARPSHARP:
						case STRING_LITERAL:
							{
							alt65=1;
							}
							break;
						}
					}

				}

				switch (alt65) {
				case 1 :
					// Cpp.g:305:26: ( WS )? SHARPSHARP ( WS )? prim+= primarySource
					{
					// Cpp.g:305:26: ( WS )?
					int alt63=2;
					int LA63_0 = input.LA(1);
					if ( (LA63_0==WS) ) {
						alt63=1;
					}
					switch (alt63) {
						case 1 :
							// Cpp.g:305:26: WS
							{
							WS202=(Token)match(input,WS,FOLLOW_WS_in_concatenate2286); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_WS.add(WS202);

							}
							break;

					}

					SHARPSHARP203=(Token)match(input,SHARPSHARP,FOLLOW_SHARPSHARP_in_concatenate2289); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SHARPSHARP.add(SHARPSHARP203);

					// Cpp.g:305:42: ( WS )?
					int alt64=2;
					int LA64_0 = input.LA(1);
					if ( (LA64_0==WS) ) {
						alt64=1;
					}
					switch (alt64) {
						case 1 :
							// Cpp.g:305:42: WS
							{
							WS204=(Token)match(input,WS,FOLLOW_WS_in_concatenate2292); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_WS.add(WS204);

							}
							break;

					}

					pushFollow(FOLLOW_primarySource_in_concatenate2297);
					prim=primarySource();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_primarySource.add(prim.getTree());
					if (list_prim==null) list_prim=new ArrayList<Object>();
					list_prim.add(prim.getTree());
					}
					break;

				default :
					if ( cnt65 >= 1 ) break loop65;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(65, input);
					throw eee;
				}
				cnt65++;
			}

			// AST REWRITE
			// elements: prim
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: prim
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_prim=new RewriteRuleSubtreeStream(adaptor,"token prim",list_prim);
			root_0 = (Object)adaptor.nil();
			// 305:69: -> ^( CONCATENATE ( $prim)+ )
			{
				// Cpp.g:305:72: ^( CONCATENATE ( $prim)+ )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONCATENATE, "CONCATENATE"), root_1);
				if ( !(stream_prim.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_prim.hasNext() ) {
					adaptor.addChild(root_1, stream_prim.nextTree());
				}
				stream_prim.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 40, concatenate_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "concatenate"


	public static class primarySource_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "primarySource"
	// Cpp.g:308:1: primarySource : ( SHARPSHARP ( WS )? IDENTIFIER -> ^( SHARPSHARP IDENTIFIER ) | IDENTIFIER | SHARP | LIB_FILE | constant | CKEYWORD | COPERATOR );
	public final CppParser.primarySource_return primarySource() throws RecognitionException {
		CppParser.primarySource_return retval = new CppParser.primarySource_return();
		retval.start = input.LT(1);
		int primarySource_StartIndex = input.index();

		Object root_0 = null;

		Token SHARPSHARP205=null;
		Token WS206=null;
		Token IDENTIFIER207=null;
		Token IDENTIFIER208=null;
		Token SHARP209=null;
		Token LIB_FILE210=null;
		Token CKEYWORD212=null;
		Token COPERATOR213=null;
		ParserRuleReturnScope constant211 =null;

		Object SHARPSHARP205_tree=null;
		Object WS206_tree=null;
		Object IDENTIFIER207_tree=null;
		Object IDENTIFIER208_tree=null;
		Object SHARP209_tree=null;
		Object LIB_FILE210_tree=null;
		Object CKEYWORD212_tree=null;
		Object COPERATOR213_tree=null;
		RewriteRuleTokenStream stream_SHARPSHARP=new RewriteRuleTokenStream(adaptor,"token SHARPSHARP");
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }

			// Cpp.g:309:3: ( SHARPSHARP ( WS )? IDENTIFIER -> ^( SHARPSHARP IDENTIFIER ) | IDENTIFIER | SHARP | LIB_FILE | constant | CKEYWORD | COPERATOR )
			int alt67=7;
			switch ( input.LA(1) ) {
			case SHARPSHARP:
				{
				alt67=1;
				}
				break;
			case IDENTIFIER:
				{
				alt67=2;
				}
				break;
			case SHARP:
				{
				alt67=3;
				}
				break;
			case LIB_FILE:
				{
				alt67=4;
				}
				break;
			case CHARACTER_LITERAL:
			case DECIMAL_LITERAL:
			case FLOATING_POINT_LITERAL:
			case HEX_LITERAL:
			case OCTAL_LITERAL:
			case STRING_LITERAL:
				{
				alt67=5;
				}
				break;
			case CKEYWORD:
				{
				alt67=6;
				}
				break;
			case COPERATOR:
				{
				alt67=7;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 67, 0, input);
				throw nvae;
			}
			switch (alt67) {
				case 1 :
					// Cpp.g:309:6: SHARPSHARP ( WS )? IDENTIFIER
					{
					SHARPSHARP205=(Token)match(input,SHARPSHARP,FOLLOW_SHARPSHARP_in_primarySource2324); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SHARPSHARP.add(SHARPSHARP205);

					// Cpp.g:309:17: ( WS )?
					int alt66=2;
					int LA66_0 = input.LA(1);
					if ( (LA66_0==WS) ) {
						alt66=1;
					}
					switch (alt66) {
						case 1 :
							// Cpp.g:309:17: WS
							{
							WS206=(Token)match(input,WS,FOLLOW_WS_in_primarySource2326); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_WS.add(WS206);

							}
							break;

					}

					IDENTIFIER207=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_primarySource2329); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER207);

					// AST REWRITE
					// elements: IDENTIFIER, SHARPSHARP
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 309:32: -> ^( SHARPSHARP IDENTIFIER )
					{
						// Cpp.g:309:35: ^( SHARPSHARP IDENTIFIER )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(stream_SHARPSHARP.nextNode(), root_1);
						adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// Cpp.g:310:5: IDENTIFIER
					{
					root_0 = (Object)adaptor.nil();


					IDENTIFIER208=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_primarySource2343); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IDENTIFIER208_tree = (Object)adaptor.create(IDENTIFIER208);
					adaptor.addChild(root_0, IDENTIFIER208_tree);
					}

					}
					break;
				case 3 :
					// Cpp.g:311:5: SHARP
					{
					root_0 = (Object)adaptor.nil();


					SHARP209=(Token)match(input,SHARP,FOLLOW_SHARP_in_primarySource2349); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					SHARP209_tree = (Object)adaptor.create(SHARP209);
					adaptor.addChild(root_0, SHARP209_tree);
					}

					}
					break;
				case 4 :
					// Cpp.g:312:5: LIB_FILE
					{
					root_0 = (Object)adaptor.nil();


					LIB_FILE210=(Token)match(input,LIB_FILE,FOLLOW_LIB_FILE_in_primarySource2355); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LIB_FILE210_tree = (Object)adaptor.create(LIB_FILE210);
					adaptor.addChild(root_0, LIB_FILE210_tree);
					}

					}
					break;
				case 5 :
					// Cpp.g:313:5: constant
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_constant_in_primarySource2361);
					constant211=constant();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, constant211.getTree());

					}
					break;
				case 6 :
					// Cpp.g:314:5: CKEYWORD
					{
					root_0 = (Object)adaptor.nil();


					CKEYWORD212=(Token)match(input,CKEYWORD,FOLLOW_CKEYWORD_in_primarySource2367); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					CKEYWORD212_tree = (Object)adaptor.create(CKEYWORD212);
					adaptor.addChild(root_0, CKEYWORD212_tree);
					}

					}
					break;
				case 7 :
					// Cpp.g:315:5: COPERATOR
					{
					root_0 = (Object)adaptor.nil();


					COPERATOR213=(Token)match(input,COPERATOR,FOLLOW_COPERATOR_in_primarySource2373); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					COPERATOR213_tree = (Object)adaptor.create(COPERATOR213);
					adaptor.addChild(root_0, COPERATOR213_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 41, primarySource_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "primarySource"

	// $ANTLR start synpred16_Cpp
	public final void synpred16_Cpp_fragment() throws RecognitionException {
		// Cpp.g:83:5: ( DEFINE IDENTIFIER LPAREN ( WS )? RPAREN ( macro_text )? )
		// Cpp.g:83:5: DEFINE IDENTIFIER LPAREN ( WS )? RPAREN ( macro_text )?
		{
		match(input,DEFINE,FOLLOW_DEFINE_in_synpred16_Cpp394); if (state.failed) return;

		match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_synpred16_Cpp396); if (state.failed) return;

		match(input,LPAREN,FOLLOW_LPAREN_in_synpred16_Cpp398); if (state.failed) return;

		// Cpp.g:83:30: ( WS )?
		int alt68=2;
		int LA68_0 = input.LA(1);
		if ( (LA68_0==WS) ) {
			alt68=1;
		}
		switch (alt68) {
			case 1 :
				// Cpp.g:83:30: WS
				{
				match(input,WS,FOLLOW_WS_in_synpred16_Cpp400); if (state.failed) return;

				}
				break;

		}

		match(input,RPAREN,FOLLOW_RPAREN_in_synpred16_Cpp403); if (state.failed) return;

		// Cpp.g:83:41: ( macro_text )?
		int alt69=2;
		int LA69_0 = input.LA(1);
		if ( ((LA69_0 >= CHARACTER_LITERAL && LA69_0 <= CKEYWORD)||LA69_0==COMMA||(LA69_0 >= COPERATOR && LA69_0 <= DECIMAL_LITERAL)||LA69_0==FLOATING_POINT_LITERAL||LA69_0==HEX_LITERAL||LA69_0==IDENTIFIER||LA69_0==LIB_FILE||LA69_0==LPAREN||LA69_0==OCTAL_LITERAL||LA69_0==RPAREN||(LA69_0 >= SEMICOLON && LA69_0 <= SHARPSHARP)||LA69_0==SIZEOF||(LA69_0 >= STRINGIFICATION && LA69_0 <= TEXT_END)||LA69_0==WS) ) {
			alt69=1;
		}
		switch (alt69) {
			case 1 :
				// Cpp.g:83:41: macro_text
				{
				pushFollow(FOLLOW_macro_text_in_synpred16_Cpp405);
				macro_text();
				state._fsp--;
				if (state.failed) return;

				}
				break;

		}

		}

	}
	// $ANTLR end synpred16_Cpp

	// $ANTLR start synpred24_Cpp
	public final void synpred24_Cpp_fragment() throws RecognitionException {
		Token mac=null;
		List<Object> list_arg=null;
		RuleReturnScope arg = null;

		// Cpp.g:85:5: ( DEFINE mac= IDENTIFIER LPAREN ( WS )? (arg+= macroParam ( WS )? ( COMMA ( WS )* arg+= macroParam ( WS )* )* )? RPAREN ( macro_text )? )
		// Cpp.g:85:5: DEFINE mac= IDENTIFIER LPAREN ( WS )? (arg+= macroParam ( WS )? ( COMMA ( WS )* arg+= macroParam ( WS )* )* )? RPAREN ( macro_text )?
		{
		match(input,DEFINE,FOLLOW_DEFINE_in_synpred24_Cpp427); if (state.failed) return;

		mac=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_synpred24_Cpp431); if (state.failed) return;

		match(input,LPAREN,FOLLOW_LPAREN_in_synpred24_Cpp434); if (state.failed) return;

		// Cpp.g:85:35: ( WS )?
		int alt76=2;
		int LA76_0 = input.LA(1);
		if ( (LA76_0==WS) ) {
			alt76=1;
		}
		switch (alt76) {
			case 1 :
				// Cpp.g:85:35: WS
				{
				match(input,WS,FOLLOW_WS_in_synpred24_Cpp436); if (state.failed) return;

				}
				break;

		}

		// Cpp.g:85:40: (arg+= macroParam ( WS )? ( COMMA ( WS )* arg+= macroParam ( WS )* )* )?
		int alt81=2;
		int LA81_0 = input.LA(1);
		if ( (LA81_0==ELLIPSIS||LA81_0==IDENTIFIER) ) {
			alt81=1;
		}
		switch (alt81) {
			case 1 :
				// Cpp.g:85:41: arg+= macroParam ( WS )? ( COMMA ( WS )* arg+= macroParam ( WS )* )*
				{
				pushFollow(FOLLOW_macroParam_in_synpred24_Cpp443);
				arg=macroParam();
				state._fsp--;
				if (state.failed) return;

				// Cpp.g:85:57: ( WS )?
				int alt77=2;
				int LA77_0 = input.LA(1);
				if ( (LA77_0==WS) ) {
					alt77=1;
				}
				switch (alt77) {
					case 1 :
						// Cpp.g:85:57: WS
						{
						match(input,WS,FOLLOW_WS_in_synpred24_Cpp445); if (state.failed) return;

						}
						break;

				}

				// Cpp.g:85:61: ( COMMA ( WS )* arg+= macroParam ( WS )* )*
				loop80:
				while (true) {
					int alt80=2;
					int LA80_0 = input.LA(1);
					if ( (LA80_0==COMMA) ) {
						alt80=1;
					}

					switch (alt80) {
					case 1 :
						// Cpp.g:85:62: COMMA ( WS )* arg+= macroParam ( WS )*
						{
						match(input,COMMA,FOLLOW_COMMA_in_synpred24_Cpp449); if (state.failed) return;

						// Cpp.g:85:68: ( WS )*
						loop78:
						while (true) {
							int alt78=2;
							int LA78_0 = input.LA(1);
							if ( (LA78_0==WS) ) {
								alt78=1;
							}

							switch (alt78) {
							case 1 :
								// Cpp.g:85:68: WS
								{
								match(input,WS,FOLLOW_WS_in_synpred24_Cpp451); if (state.failed) return;

								}
								break;

							default :
								break loop78;
							}
						}

						pushFollow(FOLLOW_macroParam_in_synpred24_Cpp456);
						arg=macroParam();
						state._fsp--;
						if (state.failed) return;

						// Cpp.g:85:88: ( WS )*
						loop79:
						while (true) {
							int alt79=2;
							int LA79_0 = input.LA(1);
							if ( (LA79_0==WS) ) {
								alt79=1;
							}

							switch (alt79) {
							case 1 :
								// Cpp.g:85:88: WS
								{
								match(input,WS,FOLLOW_WS_in_synpred24_Cpp458); if (state.failed) return;

								}
								break;

							default :
								break loop79;
							}
						}

						}
						break;

					default :
						break loop80;
					}
				}

				}
				break;

		}

		match(input,RPAREN,FOLLOW_RPAREN_in_synpred24_Cpp466); if (state.failed) return;

		// Cpp.g:85:104: ( macro_text )?
		int alt82=2;
		int LA82_0 = input.LA(1);
		if ( ((LA82_0 >= CHARACTER_LITERAL && LA82_0 <= CKEYWORD)||LA82_0==COMMA||(LA82_0 >= COPERATOR && LA82_0 <= DECIMAL_LITERAL)||LA82_0==FLOATING_POINT_LITERAL||LA82_0==HEX_LITERAL||LA82_0==IDENTIFIER||LA82_0==LIB_FILE||LA82_0==LPAREN||LA82_0==OCTAL_LITERAL||LA82_0==RPAREN||(LA82_0 >= SEMICOLON && LA82_0 <= SHARPSHARP)||LA82_0==SIZEOF||(LA82_0 >= STRINGIFICATION && LA82_0 <= TEXT_END)||LA82_0==WS) ) {
			alt82=1;
		}
		switch (alt82) {
			case 1 :
				// Cpp.g:85:104: macro_text
				{
				pushFollow(FOLLOW_macro_text_in_synpred24_Cpp468);
				macro_text();
				state._fsp--;
				if (state.failed) return;

				}
				break;

		}

		}

	}
	// $ANTLR end synpred24_Cpp

	// $ANTLR start synpred25_Cpp
	public final void synpred25_Cpp_fragment() throws RecognitionException {
		// Cpp.g:87:23: ( WS )
		// Cpp.g:87:23: WS
		{
		match(input,WS,FOLLOW_WS_in_synpred25_Cpp508); if (state.failed) return;

		}

	}
	// $ANTLR end synpred25_Cpp

	// $ANTLR start synpred37_Cpp
	public final void synpred37_Cpp_fragment() throws RecognitionException {
		// Cpp.g:138:5: ( IDENTIFIER {...}?)
		// Cpp.g:138:5: IDENTIFIER {...}?
		{
		match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_synpred37_Cpp890); if (state.failed) return;

		if ( !((input.LT(-2).getText().equals("ifndef"))) ) {
			if (state.backtracking>0) {state.failed=true; return;}
			throw new FailedPredicateException(input, "synpred37_Cpp", "input.LT(-2).getText().equals(\"ifndef\")");
		}
		}

	}
	// $ANTLR end synpred37_Cpp

	// $ANTLR start synpred38_Cpp
	public final void synpred38_Cpp_fragment() throws RecognitionException {
		// Cpp.g:139:5: ( IDENTIFIER {...}?)
		// Cpp.g:139:5: IDENTIFIER {...}?
		{
		match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_synpred38_Cpp910); if (state.failed) return;

		if ( !((input.LT(-2).getText().equals("ifdef"))) ) {
			if (state.backtracking>0) {state.failed=true; return;}
			throw new FailedPredicateException(input, "synpred38_Cpp", "input.LT(-2).getText().equals(\"ifdef\")");
		}
		}

	}
	// $ANTLR end synpred38_Cpp

	// $ANTLR start synpred71_Cpp
	public final void synpred71_Cpp_fragment() throws RecognitionException {
		// Cpp.g:216:5: ( SIZEOF unaryExpression )
		// Cpp.g:216:5: SIZEOF unaryExpression
		{
		match(input,SIZEOF,FOLLOW_SIZEOF_in_synpred71_Cpp1461); if (state.failed) return;

		pushFollow(FOLLOW_unaryExpression_in_synpred71_Cpp1463);
		unaryExpression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred71_Cpp

	// $ANTLR start synpred72_Cpp
	public final void synpred72_Cpp_fragment() throws RecognitionException {
		// Cpp.g:217:5: ( SIZEOF LPAREN type_name RPAREN )
		// Cpp.g:217:5: SIZEOF LPAREN type_name RPAREN
		{
		match(input,SIZEOF,FOLLOW_SIZEOF_in_synpred72_Cpp1477); if (state.failed) return;

		match(input,LPAREN,FOLLOW_LPAREN_in_synpred72_Cpp1479); if (state.failed) return;

		pushFollow(FOLLOW_type_name_in_synpred72_Cpp1481);
		type_name();
		state._fsp--;
		if (state.failed) return;

		match(input,RPAREN,FOLLOW_RPAREN_in_synpred72_Cpp1483); if (state.failed) return;

		}

	}
	// $ANTLR end synpred72_Cpp

	// $ANTLR start synpred81_Cpp
	public final void synpred81_Cpp_fragment() throws RecognitionException {
		// Cpp.g:230:5: ( LPAREN type_name RPAREN unaryExpression )
		// Cpp.g:230:5: LPAREN type_name RPAREN unaryExpression
		{
		match(input,LPAREN,FOLLOW_LPAREN_in_synpred81_Cpp1653); if (state.failed) return;

		pushFollow(FOLLOW_type_name_in_synpred81_Cpp1655);
		type_name();
		state._fsp--;
		if (state.failed) return;

		match(input,RPAREN,FOLLOW_RPAREN_in_synpred81_Cpp1657); if (state.failed) return;

		pushFollow(FOLLOW_unaryExpression_in_synpred81_Cpp1660);
		unaryExpression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred81_Cpp

	// $ANTLR start synpred83_Cpp
	public final void synpred83_Cpp_fragment() throws RecognitionException {
		Token s=null;


		// Cpp.g:238:5: (s= STAR IDENTIFIER )
		// Cpp.g:238:5: s= STAR IDENTIFIER
		{
		s=(Token)match(input,STAR,FOLLOW_STAR_in_synpred83_Cpp1718); if (state.failed) return;

		match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_synpred83_Cpp1723); if (state.failed) return;

		}

	}
	// $ANTLR end synpred83_Cpp

	// $ANTLR start synpred87_Cpp
	public final void synpred87_Cpp_fragment() throws RecognitionException {
		// Cpp.g:246:7: ( IDENTIFIER LPAREN )
		// Cpp.g:246:8: IDENTIFIER LPAREN
		{
		match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_synpred87_Cpp1786); if (state.failed) return;

		match(input,LPAREN,FOLLOW_LPAREN_in_synpred87_Cpp1788); if (state.failed) return;

		}

	}
	// $ANTLR end synpred87_Cpp

	// $ANTLR start synpred88_Cpp
	public final void synpred88_Cpp_fragment() throws RecognitionException {
		// Cpp.g:247:7: ( IDENTIFIER )
		// Cpp.g:247:7: IDENTIFIER
		{
		match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_synpred88_Cpp1802); if (state.failed) return;

		}

	}
	// $ANTLR end synpred88_Cpp

	// $ANTLR start synpred97_Cpp
	public final void synpred97_Cpp_fragment() throws RecognitionException {
		// Cpp.g:272:7: ( sourceExpression )
		// Cpp.g:272:7: sourceExpression
		{
		pushFollow(FOLLOW_sourceExpression_in_synpred97_Cpp1981);
		sourceExpression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred97_Cpp

	// $ANTLR start synpred99_Cpp
	public final void synpred99_Cpp_fragment() throws RecognitionException {
		// Cpp.g:274:5: ( LPAREN )
		// Cpp.g:274:5: LPAREN
		{
		match(input,LPAREN,FOLLOW_LPAREN_in_synpred99_Cpp1993); if (state.failed) return;

		}

	}
	// $ANTLR end synpred99_Cpp

	// $ANTLR start synpred103_Cpp
	public final void synpred103_Cpp_fragment() throws RecognitionException {
		Token id=null;


		// Cpp.g:280:5: (id= IDENTIFIER ( WS )? LPAREN ( WS )? RPAREN )
		// Cpp.g:280:5: id= IDENTIFIER ( WS )? LPAREN ( WS )? RPAREN
		{
		id=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_synpred103_Cpp2021); if (state.failed) return;

		// Cpp.g:280:19: ( WS )?
		int alt83=2;
		int LA83_0 = input.LA(1);
		if ( (LA83_0==WS) ) {
			alt83=1;
		}
		switch (alt83) {
			case 1 :
				// Cpp.g:280:19: WS
				{
				match(input,WS,FOLLOW_WS_in_synpred103_Cpp2023); if (state.failed) return;

				}
				break;

		}

		match(input,LPAREN,FOLLOW_LPAREN_in_synpred103_Cpp2026); if (state.failed) return;

		// Cpp.g:280:30: ( WS )?
		int alt84=2;
		int LA84_0 = input.LA(1);
		if ( (LA84_0==WS) ) {
			alt84=1;
		}
		switch (alt84) {
			case 1 :
				// Cpp.g:280:30: WS
				{
				match(input,WS,FOLLOW_WS_in_synpred103_Cpp2028); if (state.failed) return;

				}
				break;

		}

		match(input,RPAREN,FOLLOW_RPAREN_in_synpred103_Cpp2033); if (state.failed) return;

		}

	}
	// $ANTLR end synpred103_Cpp

	// $ANTLR start synpred105_Cpp
	public final void synpred105_Cpp_fragment() throws RecognitionException {
		// Cpp.g:281:30: ( WS )
		// Cpp.g:281:30: WS
		{
		match(input,WS,FOLLOW_WS_in_synpred105_Cpp2058); if (state.failed) return;

		}

	}
	// $ANTLR end synpred105_Cpp

	// $ANTLR start synpred108_Cpp
	public final void synpred108_Cpp_fragment() throws RecognitionException {
		// Cpp.g:284:34: ( WS )
		// Cpp.g:284:34: WS
		{
		match(input,WS,FOLLOW_WS_in_synpred108_Cpp2102); if (state.failed) return;

		}

	}
	// $ANTLR end synpred108_Cpp

	// $ANTLR start synpred110_Cpp
	public final void synpred110_Cpp_fragment() throws RecognitionException {
		// Cpp.g:287:8: ( sourceExpression )
		// Cpp.g:287:8: sourceExpression
		{
		pushFollow(FOLLOW_sourceExpression_in_synpred110_Cpp2131);
		sourceExpression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred110_Cpp

	// $ANTLR start synpred111_Cpp
	public final void synpred111_Cpp_fragment() throws RecognitionException {
		// Cpp.g:287:8: ( ( sourceExpression )+ )
		// Cpp.g:287:8: ( sourceExpression )+
		{
		// Cpp.g:287:8: ( sourceExpression )+
		int cnt87=0;
		loop87:
		while (true) {
			int alt87=2;
			int LA87_0 = input.LA(1);
			if ( ((LA87_0 >= CHARACTER_LITERAL && LA87_0 <= CKEYWORD)||(LA87_0 >= COPERATOR && LA87_0 <= DECIMAL_LITERAL)||LA87_0==FLOATING_POINT_LITERAL||LA87_0==HEX_LITERAL||LA87_0==IDENTIFIER||LA87_0==LIB_FILE||LA87_0==LPAREN||LA87_0==OCTAL_LITERAL||(LA87_0 >= SEMICOLON && LA87_0 <= SHARPSHARP)||LA87_0==SIZEOF||(LA87_0 >= STRINGIFICATION && LA87_0 <= TEXT_END)||LA87_0==WS) ) {
				alt87=1;
			}

			switch (alt87) {
			case 1 :
				// Cpp.g:287:8: sourceExpression
				{
				pushFollow(FOLLOW_sourceExpression_in_synpred111_Cpp2131);
				sourceExpression();
				state._fsp--;
				if (state.failed) return;

				}
				break;

			default :
				if ( cnt87 >= 1 ) break loop87;
				if (state.backtracking>0) {state.failed=true; return;}
				EarlyExitException eee = new EarlyExitException(87, input);
				throw eee;
			}
			cnt87++;
		}

		}

	}
	// $ANTLR end synpred111_Cpp

	// $ANTLR start synpred113_Cpp
	public final void synpred113_Cpp_fragment() throws RecognitionException {
		// Cpp.g:292:5: ( IDENTIFIER ( WS )? LPAREN )
		// Cpp.g:292:6: IDENTIFIER ( WS )? LPAREN
		{
		match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_synpred113_Cpp2167); if (state.failed) return;

		// Cpp.g:292:17: ( WS )?
		int alt88=2;
		int LA88_0 = input.LA(1);
		if ( (LA88_0==WS) ) {
			alt88=1;
		}
		switch (alt88) {
			case 1 :
				// Cpp.g:292:17: WS
				{
				match(input,WS,FOLLOW_WS_in_synpred113_Cpp2169); if (state.failed) return;

				}
				break;

		}

		match(input,LPAREN,FOLLOW_LPAREN_in_synpred113_Cpp2172); if (state.failed) return;

		}

	}
	// $ANTLR end synpred113_Cpp

	// $ANTLR start synpred115_Cpp
	public final void synpred115_Cpp_fragment() throws RecognitionException {
		// Cpp.g:293:5: ( primarySource ( WS )? SHARPSHARP )
		// Cpp.g:293:6: primarySource ( WS )? SHARPSHARP
		{
		pushFollow(FOLLOW_primarySource_in_synpred115_Cpp2183);
		primarySource();
		state._fsp--;
		if (state.failed) return;

		// Cpp.g:293:20: ( WS )?
		int alt89=2;
		int LA89_0 = input.LA(1);
		if ( (LA89_0==WS) ) {
			alt89=1;
		}
		switch (alt89) {
			case 1 :
				// Cpp.g:293:20: WS
				{
				match(input,WS,FOLLOW_WS_in_synpred115_Cpp2185); if (state.failed) return;

				}
				break;

		}

		match(input,SHARPSHARP,FOLLOW_SHARPSHARP_in_synpred115_Cpp2188); if (state.failed) return;

		}

	}
	// $ANTLR end synpred115_Cpp

	// $ANTLR start synpred117_Cpp
	public final void synpred117_Cpp_fragment() throws RecognitionException {
		// Cpp.g:295:5: ( primarySource )
		// Cpp.g:295:5: primarySource
		{
		pushFollow(FOLLOW_primarySource_in_synpred117_Cpp2218);
		primarySource();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred117_Cpp

	// $ANTLR start synpred120_Cpp
	public final void synpred120_Cpp_fragment() throws RecognitionException {
		// Cpp.g:298:12: ( macArgs )
		// Cpp.g:298:12: macArgs
		{
		pushFollow(FOLLOW_macArgs_in_synpred120_Cpp2238);
		macArgs();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred120_Cpp

	// $ANTLR start synpred126_Cpp
	public final void synpred126_Cpp_fragment() throws RecognitionException {
		List<Object> list_prim=null;
		RuleReturnScope prim = null;

		// Cpp.g:305:26: ( ( WS )? SHARPSHARP ( WS )? prim+= primarySource )
		// Cpp.g:305:26: ( WS )? SHARPSHARP ( WS )? prim+= primarySource
		{
		// Cpp.g:305:26: ( WS )?
		int alt91=2;
		int LA91_0 = input.LA(1);
		if ( (LA91_0==WS) ) {
			alt91=1;
		}
		switch (alt91) {
			case 1 :
				// Cpp.g:305:26: WS
				{
				match(input,WS,FOLLOW_WS_in_synpred126_Cpp2286); if (state.failed) return;

				}
				break;

		}

		match(input,SHARPSHARP,FOLLOW_SHARPSHARP_in_synpred126_Cpp2289); if (state.failed) return;

		// Cpp.g:305:42: ( WS )?
		int alt92=2;
		int LA92_0 = input.LA(1);
		if ( (LA92_0==WS) ) {
			alt92=1;
		}
		switch (alt92) {
			case 1 :
				// Cpp.g:305:42: WS
				{
				match(input,WS,FOLLOW_WS_in_synpred126_Cpp2292); if (state.failed) return;

				}
				break;

		}

		pushFollow(FOLLOW_primarySource_in_synpred126_Cpp2297);
		prim=primarySource();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred126_Cpp

	// Delegated rules

	public final boolean synpred81_Cpp() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred81_Cpp_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred99_Cpp() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred99_Cpp_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred37_Cpp() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred37_Cpp_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred108_Cpp() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred108_Cpp_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred88_Cpp() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred88_Cpp_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred111_Cpp() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred111_Cpp_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred72_Cpp() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred72_Cpp_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred113_Cpp() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred113_Cpp_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred16_Cpp() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred16_Cpp_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred83_Cpp() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred83_Cpp_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred117_Cpp() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred117_Cpp_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred25_Cpp() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred25_Cpp_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred115_Cpp() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred115_Cpp_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred38_Cpp() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred38_Cpp_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred126_Cpp() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred126_Cpp_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred71_Cpp() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred71_Cpp_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred87_Cpp() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred87_Cpp_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred110_Cpp() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred110_Cpp_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred120_Cpp() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred120_Cpp_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred97_Cpp() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred97_Cpp_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred24_Cpp() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred24_Cpp_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred105_Cpp() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred105_Cpp_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred103_Cpp() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred103_Cpp_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}


	protected DFA15 dfa15 = new DFA15(this);
	static final String DFA15_eotS =
		"\27\uffff";
	static final String DFA15_eofS =
		"\2\uffff\2\4\1\uffff\1\4\1\uffff\1\4\3\uffff\2\4\2\uffff\4\4\2\uffff\1"+
		"\4\1\uffff";
	static final String DFA15_minS =
		"\1\27\1\66\2\17\1\uffff\1\17\1\0\1\17\1\uffff\1\0\1\uffff\2\17\2\0\4\17"+
		"\2\0\1\17\1\0";
	static final String DFA15_maxS =
		"\1\27\1\66\2\176\1\uffff\1\176\1\0\1\176\1\uffff\1\0\1\uffff\2\176\2\0"+
		"\4\176\2\0\1\176\1\0";
	static final String DFA15_acceptS =
		"\4\uffff\1\3\3\uffff\1\2\1\uffff\1\1\14\uffff";
	static final String DFA15_specialS =
		"\6\uffff\1\0\2\uffff\1\1\3\uffff\1\2\1\3\4\uffff\1\4\1\5\1\uffff\1\6}>";
	static final String[] DFA15_transitionS = {
			"\1\1",
			"\1\2",
			"\2\4\1\uffff\1\4\2\uffff\2\4\26\uffff\1\4\2\uffff\1\4\3\uffff\1\4\1"+
			"\uffff\1\4\12\uffff\1\4\2\uffff\1\3\16\uffff\1\4\17\uffff\1\4\2\uffff"+
			"\3\4\4\uffff\1\4\2\uffff\4\4\12\uffff\1\4",
			"\2\4\1\uffff\1\4\2\uffff\2\4\10\uffff\1\10\15\uffff\1\4\2\uffff\1\4"+
			"\3\uffff\1\4\1\uffff\1\7\12\uffff\1\4\2\uffff\1\4\16\uffff\1\4\17\uffff"+
			"\1\6\2\uffff\3\4\4\uffff\1\4\2\uffff\4\4\12\uffff\1\5",
			"",
			"\2\4\1\uffff\1\4\2\uffff\2\4\10\uffff\1\10\15\uffff\1\4\2\uffff\1\4"+
			"\3\uffff\1\4\1\uffff\1\7\12\uffff\1\4\2\uffff\1\4\16\uffff\1\4\17\uffff"+
			"\1\11\2\uffff\3\4\4\uffff\1\4\2\uffff\4\4\12\uffff\1\4",
			"\1\uffff",
			"\2\4\1\uffff\1\14\2\uffff\2\4\10\uffff\1\10\15\uffff\1\4\2\uffff\1\4"+
			"\3\uffff\1\4\1\uffff\1\4\12\uffff\1\4\2\uffff\1\4\16\uffff\1\4\17\uffff"+
			"\1\15\2\uffff\3\4\4\uffff\1\4\2\uffff\4\4\12\uffff\1\13",
			"",
			"\1\uffff",
			"",
			"\2\4\1\uffff\1\14\2\uffff\2\4\26\uffff\1\4\2\uffff\1\4\3\uffff\1\4\1"+
			"\uffff\1\4\12\uffff\1\4\2\uffff\1\4\16\uffff\1\4\17\uffff\1\16\2\uffff"+
			"\3\4\4\uffff\1\4\2\uffff\4\4\12\uffff\1\4",
			"\2\4\1\uffff\1\4\2\uffff\2\4\10\uffff\1\10\15\uffff\1\4\2\uffff\1\4"+
			"\3\uffff\1\4\1\uffff\1\20\12\uffff\1\4\2\uffff\1\4\16\uffff\1\4\17\uffff"+
			"\1\4\2\uffff\3\4\4\uffff\1\4\2\uffff\4\4\12\uffff\1\17",
			"\1\uffff",
			"\1\uffff",
			"\2\4\1\uffff\1\4\2\uffff\2\4\10\uffff\1\10\15\uffff\1\4\2\uffff\1\4"+
			"\3\uffff\1\4\1\uffff\1\20\12\uffff\1\4\2\uffff\1\4\16\uffff\1\4\17\uffff"+
			"\1\4\2\uffff\3\4\4\uffff\1\4\2\uffff\4\4\12\uffff\1\21",
			"\2\4\1\uffff\1\14\2\uffff\2\4\10\uffff\1\10\15\uffff\1\4\2\uffff\1\4"+
			"\3\uffff\1\4\1\uffff\1\4\12\uffff\1\4\2\uffff\1\4\16\uffff\1\4\17\uffff"+
			"\1\23\2\uffff\3\4\4\uffff\1\4\2\uffff\4\4\12\uffff\1\22",
			"\2\4\1\uffff\1\4\2\uffff\2\4\10\uffff\1\10\15\uffff\1\4\2\uffff\1\4"+
			"\3\uffff\1\4\1\uffff\1\20\12\uffff\1\4\2\uffff\1\4\16\uffff\1\4\17\uffff"+
			"\1\4\2\uffff\3\4\4\uffff\1\4\2\uffff\4\4\12\uffff\1\21",
			"\2\4\1\uffff\1\14\2\uffff\2\4\26\uffff\1\4\2\uffff\1\4\3\uffff\1\4\1"+
			"\uffff\1\4\12\uffff\1\4\2\uffff\1\4\16\uffff\1\4\17\uffff\1\24\2\uffff"+
			"\3\4\4\uffff\1\4\2\uffff\4\4\12\uffff\1\25",
			"\1\uffff",
			"\1\uffff",
			"\2\4\1\uffff\1\14\2\uffff\2\4\26\uffff\1\4\2\uffff\1\4\3\uffff\1\4\1"+
			"\uffff\1\4\12\uffff\1\4\2\uffff\1\4\16\uffff\1\4\17\uffff\1\26\2\uffff"+
			"\3\4\4\uffff\1\4\2\uffff\4\4\12\uffff\1\25",
			"\1\uffff"
	};

	static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
	static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
	static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
	static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
	static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
	static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
	static final short[][] DFA15_transition;

	static {
		int numStates = DFA15_transitionS.length;
		DFA15_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
		}
	}

	protected class DFA15 extends DFA {

		public DFA15(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 15;
			this.eot = DFA15_eot;
			this.eof = DFA15_eof;
			this.min = DFA15_min;
			this.max = DFA15_max;
			this.accept = DFA15_accept;
			this.special = DFA15_special;
			this.transition = DFA15_transition;
		}
		@Override
		public String getDescription() {
			return "81:1: macroDefine : ( DEFINE IDENTIFIER LPAREN ( WS )? RPAREN ( macro_text )? -> ^( MAC_FUNCTION_OBJECT IDENTIFIER ( macro_text )? ) | DEFINE mac= IDENTIFIER LPAREN ( WS )? (arg+= macroParam ( WS )? ( COMMA ( WS )* arg+= macroParam ( WS )* )* )? RPAREN ( macro_text )? -> ^( MAC_FUNCTION $mac ( $arg)+ ( macro_text )? ) | DEFINE IDENTIFIER ( WS )? ( macro_text )? -> ^( MAC_OBJECT IDENTIFIER ( macro_text )? ) );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA15_6 = input.LA(1);
						 
						int index15_6 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred16_Cpp()) ) {s = 10;}
						else if ( (synpred24_Cpp()) ) {s = 8;}
						else if ( (true) ) {s = 4;}
						 
						input.seek(index15_6);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA15_9 = input.LA(1);
						 
						int index15_9 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred16_Cpp()) ) {s = 10;}
						else if ( (synpred24_Cpp()) ) {s = 8;}
						else if ( (true) ) {s = 4;}
						 
						input.seek(index15_9);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA15_13 = input.LA(1);
						 
						int index15_13 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred24_Cpp()) ) {s = 8;}
						else if ( (true) ) {s = 4;}
						 
						input.seek(index15_13);
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA15_14 = input.LA(1);
						 
						int index15_14 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred24_Cpp()) ) {s = 8;}
						else if ( (true) ) {s = 4;}
						 
						input.seek(index15_14);
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA15_19 = input.LA(1);
						 
						int index15_19 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred24_Cpp()) ) {s = 8;}
						else if ( (true) ) {s = 4;}
						 
						input.seek(index15_19);
						if ( s>=0 ) return s;
						break;

					case 5 : 
						int LA15_20 = input.LA(1);
						 
						int index15_20 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred24_Cpp()) ) {s = 8;}
						else if ( (true) ) {s = 4;}
						 
						input.seek(index15_20);
						if ( s>=0 ) return s;
						break;

					case 6 : 
						int LA15_22 = input.LA(1);
						 
						int index15_22 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred24_Cpp()) ) {s = 8;}
						else if ( (true) ) {s = 4;}
						 
						input.seek(index15_22);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 15, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	public static final BitSet FOLLOW_procLine_in_preprocess225 = new BitSet(new long[]{0x04D1202802E58002L,0x680F21C880080016L});
	public static final BitSet FOLLOW_DIRECTIVE_in_procLine245 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_text_line_in_procLine252 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_diagnostics_in_procLine258 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_fileInclusion_in_procLine264 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_macroDefine_in_procLine270 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_macroUndef_in_procLine276 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_conditionalCompilation_in_procLine282 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_lineControl_in_procLine288 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_macroExecution_in_procLine294 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_End_in_procLine301 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INCLUDE_in_fileInclusion315 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_fileInclusion317 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INCLUDE_in_fileInclusion332 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_LIB_FILE_in_fileInclusion334 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INCLUDE_in_fileInclusion349 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_fileInclusion351 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INCLUDE_in_fileInclusion366 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_macroExpansion_in_fileInclusion368 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DEFINE_in_macroDefine394 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_macroDefine396 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_LPAREN_in_macroDefine398 = new BitSet(new long[]{0x0000000000000000L,0x4000000800000000L});
	public static final BitSet FOLLOW_WS_in_macroDefine400 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_RPAREN_in_macroDefine403 = new BitSet(new long[]{0x0051000000658002L,0x400F21C800080012L});
	public static final BitSet FOLLOW_macro_text_in_macroDefine405 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DEFINE_in_macroDefine427 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_macroDefine431 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_LPAREN_in_macroDefine434 = new BitSet(new long[]{0x0040000080000000L,0x4000000800000000L});
	public static final BitSet FOLLOW_WS_in_macroDefine436 = new BitSet(new long[]{0x0040000080000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_macroParam_in_macroDefine443 = new BitSet(new long[]{0x0000000000040000L,0x4000000800000000L});
	public static final BitSet FOLLOW_WS_in_macroDefine445 = new BitSet(new long[]{0x0000000000040000L,0x0000000800000000L});
	public static final BitSet FOLLOW_COMMA_in_macroDefine449 = new BitSet(new long[]{0x0040000080000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_WS_in_macroDefine451 = new BitSet(new long[]{0x0040000080000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_macroParam_in_macroDefine456 = new BitSet(new long[]{0x0000000000040000L,0x4000000800000000L});
	public static final BitSet FOLLOW_WS_in_macroDefine458 = new BitSet(new long[]{0x0000000000040000L,0x4000000800000000L});
	public static final BitSet FOLLOW_RPAREN_in_macroDefine466 = new BitSet(new long[]{0x0051000000658002L,0x400F21C800080012L});
	public static final BitSet FOLLOW_macro_text_in_macroDefine468 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DEFINE_in_macroDefine504 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_macroDefine506 = new BitSet(new long[]{0x0051000000658002L,0x400F21C800080012L});
	public static final BitSet FOLLOW_WS_in_macroDefine508 = new BitSet(new long[]{0x0051000000658002L,0x400F21C800080012L});
	public static final BitSet FOLLOW_macro_text_in_macroDefine511 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_macroParam544 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_ELLIPSIS_in_macroParam546 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELLIPSIS_in_macroParam560 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_macroParam566 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_source_text_in_macro_text583 = new BitSet(new long[]{0x0051000000658002L,0x400F21C800080012L});
	public static final BitSet FOLLOW_EXEC_MACRO_in_macroExecution606 = new BitSet(new long[]{0x0051000001408010L,0x0042A000014A5010L});
	public static final BitSet FOLLOW_ifexpression_in_macroExecution608 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UNDEF_in_macroUndef631 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_macroUndef635 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_conditionalCompilation657 = new BitSet(new long[]{0x0051000001408010L,0x0042A000014A5010L});
	public static final BitSet FOLLOW_ifexpression_in_conditionalCompilation662 = new BitSet(new long[]{0x04D1202802E58000L,0x680F21C880080016L});
	public static final BitSet FOLLOW_statement_in_conditionalCompilation667 = new BitSet(new long[]{0x0000000340000000L});
	public static final BitSet FOLLOW_ELIF_in_conditionalCompilation675 = new BitSet(new long[]{0x0051000001408010L,0x0042A000014A5010L});
	public static final BitSet FOLLOW_ifexpression_in_conditionalCompilation679 = new BitSet(new long[]{0x04D1202802E58000L,0x680F21C880080016L});
	public static final BitSet FOLLOW_statement_in_conditionalCompilation684 = new BitSet(new long[]{0x0000000340000000L});
	public static final BitSet FOLLOW_ELSE_in_conditionalCompilation691 = new BitSet(new long[]{0x04D1202802E58000L,0x680F21C880080016L});
	public static final BitSet FOLLOW_statement_in_conditionalCompilation696 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_ENDIF_in_conditionalCompilation700 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LINE_in_lineControl743 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_DECIMAL_LITERAL_in_lineControl747 = new BitSet(new long[]{0x0000000000000002L,0x0002000000000000L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_lineControl752 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WARNING_in_diagnostics785 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ERROR_in_diagnostics797 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRAGMA_in_diagnostics809 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_source_text_in_text_line830 = new BitSet(new long[]{0x0051000000658002L,0x400F21C800080012L});
	public static final BitSet FOLLOW_procLine_in_statement861 = new BitSet(new long[]{0x04D1202802E58002L,0x680F21C880080016L});
	public static final BitSet FOLLOW_IDENTIFIER_in_type_name877 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_ifexpression890 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_ifexpression910 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignmentExpression_in_ifexpression930 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditionalExpression_in_assignmentExpression951 = new BitSet(new long[]{0x0000000008002A82L,0x0080140000812000L});
	public static final BitSet FOLLOW_ASSIGNEQUAL_in_assignmentExpression960 = new BitSet(new long[]{0x0051000001408010L,0x0042A000014A5010L});
	public static final BitSet FOLLOW_TIMESEQUAL_in_assignmentExpression971 = new BitSet(new long[]{0x0051000001408010L,0x0042A000014A5010L});
	public static final BitSet FOLLOW_DIVIDEEQUAL_in_assignmentExpression982 = new BitSet(new long[]{0x0051000001408010L,0x0042A000014A5010L});
	public static final BitSet FOLLOW_MODEQUAL_in_assignmentExpression993 = new BitSet(new long[]{0x0051000001408010L,0x0042A000014A5010L});
	public static final BitSet FOLLOW_PLUSEQUAL_in_assignmentExpression1004 = new BitSet(new long[]{0x0051000001408010L,0x0042A000014A5010L});
	public static final BitSet FOLLOW_MINUSEQUAL_in_assignmentExpression1015 = new BitSet(new long[]{0x0051000001408010L,0x0042A000014A5010L});
	public static final BitSet FOLLOW_SHIFTLEFTEQUAL_in_assignmentExpression1026 = new BitSet(new long[]{0x0051000001408010L,0x0042A000014A5010L});
	public static final BitSet FOLLOW_SHIFTRIGHTEQUAL_in_assignmentExpression1037 = new BitSet(new long[]{0x0051000001408010L,0x0042A000014A5010L});
	public static final BitSet FOLLOW_BITWISEANDEQUAL_in_assignmentExpression1046 = new BitSet(new long[]{0x0051000001408010L,0x0042A000014A5010L});
	public static final BitSet FOLLOW_BITWISEXOREQUAL_in_assignmentExpression1055 = new BitSet(new long[]{0x0051000001408010L,0x0042A000014A5010L});
	public static final BitSet FOLLOW_BITWISEOREQUAL_in_assignmentExpression1064 = new BitSet(new long[]{0x0051000001408010L,0x0042A000014A5010L});
	public static final BitSet FOLLOW_assignmentExpression_in_assignmentExpression1076 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logicalOrExpression_in_conditionalExpression1095 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
	public static final BitSet FOLLOW_QUESTIONMARK_in_conditionalExpression1103 = new BitSet(new long[]{0x0051000001408010L,0x0042A000014A5010L});
	public static final BitSet FOLLOW_assignmentExpression_in_conditionalExpression1106 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_COLON_in_conditionalExpression1108 = new BitSet(new long[]{0x0051000001408010L,0x0042A000014A5010L});
	public static final BitSet FOLLOW_conditionalExpression_in_conditionalExpression1110 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logicalAndExpression_in_logicalOrExpression1126 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
	public static final BitSet FOLLOW_OR_in_logicalOrExpression1129 = new BitSet(new long[]{0x0051000001408010L,0x0042A000014A5010L});
	public static final BitSet FOLLOW_logicalAndExpression_in_logicalOrExpression1132 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
	public static final BitSet FOLLOW_inclusiveOrExpression_in_logicalAndExpression1147 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_AND_in_logicalAndExpression1150 = new BitSet(new long[]{0x0051000001408010L,0x0042A000014A5010L});
	public static final BitSet FOLLOW_inclusiveOrExpression_in_logicalAndExpression1153 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_exclusiveOrExpression_in_inclusiveOrExpression1168 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_BITWISEOR_in_inclusiveOrExpression1171 = new BitSet(new long[]{0x0051000001408010L,0x0042A000014A5010L});
	public static final BitSet FOLLOW_exclusiveOrExpression_in_inclusiveOrExpression1174 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_andExpression_in_exclusiveOrExpression1189 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_BITWISEXOR_in_exclusiveOrExpression1192 = new BitSet(new long[]{0x0051000001408010L,0x0042A000014A5010L});
	public static final BitSet FOLLOW_andExpression_in_exclusiveOrExpression1195 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_equalityExpression_in_andExpression1210 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_AMPERSAND_in_andExpression1213 = new BitSet(new long[]{0x0051000001408010L,0x0042A000014A5010L});
	public static final BitSet FOLLOW_equalityExpression_in_andExpression1216 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_relationalExpression_in_equalityExpression1231 = new BitSet(new long[]{0x0000000400000002L,0x0000000000040000L});
	public static final BitSet FOLLOW_NOTEQUAL_in_equalityExpression1235 = new BitSet(new long[]{0x0051000001408010L,0x0042A000014A5010L});
	public static final BitSet FOLLOW_EQUAL_in_equalityExpression1240 = new BitSet(new long[]{0x0051000001408010L,0x0042A000014A5010L});
	public static final BitSet FOLLOW_relationalExpression_in_equalityExpression1244 = new BitSet(new long[]{0x0000000400000002L,0x0000000000040000L});
	public static final BitSet FOLLOW_shiftExpression_in_relationalExpression1259 = new BitSet(new long[]{0xC00C000000000002L});
	public static final BitSet FOLLOW_LESSTHAN_in_relationalExpression1270 = new BitSet(new long[]{0x0051000001408010L,0x0042A000014A5010L});
	public static final BitSet FOLLOW_GREATERTHAN_in_relationalExpression1280 = new BitSet(new long[]{0x0051000001408010L,0x0042A000014A5010L});
	public static final BitSet FOLLOW_LESSTHANOREQUALTO_in_relationalExpression1290 = new BitSet(new long[]{0x0051000001408010L,0x0042A000014A5010L});
	public static final BitSet FOLLOW_GREATERTHANOREQUALTO_in_relationalExpression1300 = new BitSet(new long[]{0x0051000001408010L,0x0042A000014A5010L});
	public static final BitSet FOLLOW_shiftExpression_in_relationalExpression1314 = new BitSet(new long[]{0xC00C000000000002L});
	public static final BitSet FOLLOW_additiveExpression_in_shiftExpression1338 = new BitSet(new long[]{0x0000000000000002L,0x00000A0000000000L});
	public static final BitSet FOLLOW_SHIFTLEFT_in_shiftExpression1342 = new BitSet(new long[]{0x0051000001408010L,0x0042A000014A5010L});
	public static final BitSet FOLLOW_SHIFTRIGHT_in_shiftExpression1347 = new BitSet(new long[]{0x0051000001408010L,0x0042A000014A5010L});
	public static final BitSet FOLLOW_additiveExpression_in_shiftExpression1351 = new BitSet(new long[]{0x0000000000000002L,0x00000A0000000000L});
	public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1366 = new BitSet(new long[]{0x0000000000000002L,0x0000000000401000L});
	public static final BitSet FOLLOW_PLUS_in_additiveExpression1370 = new BitSet(new long[]{0x0051000001408010L,0x0042A000014A5010L});
	public static final BitSet FOLLOW_MINUS_in_additiveExpression1375 = new BitSet(new long[]{0x0051000001408010L,0x0042A000014A5010L});
	public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1379 = new BitSet(new long[]{0x0000000000000002L,0x0000000000401000L});
	public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1394 = new BitSet(new long[]{0x0000000004000002L,0x0000800000008000L});
	public static final BitSet FOLLOW_STAR_in_multiplicativeExpression1398 = new BitSet(new long[]{0x0051000001408010L,0x0042A000014A5010L});
	public static final BitSet FOLLOW_DIVIDE_in_multiplicativeExpression1403 = new BitSet(new long[]{0x0051000001408010L,0x0042A000014A5010L});
	public static final BitSet FOLLOW_MOD_in_multiplicativeExpression1408 = new BitSet(new long[]{0x0051000001408010L,0x0042A000014A5010L});
	public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1413 = new BitSet(new long[]{0x0000000004000002L,0x0000800000008000L});
	public static final BitSet FOLLOW_PLUSPLUS_in_unaryExpression1428 = new BitSet(new long[]{0x0051000001408010L,0x0042A000014A5010L});
	public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1431 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MINUSMINUS_in_unaryExpression1445 = new BitSet(new long[]{0x0051000001408010L,0x0042A000014A5010L});
	public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1447 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SIZEOF_in_unaryExpression1461 = new BitSet(new long[]{0x0051000001408010L,0x0042A000014A5010L});
	public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1463 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SIZEOF_in_unaryExpression1477 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_LPAREN_in_unaryExpression1479 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_type_name_in_unaryExpression1481 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_RPAREN_in_unaryExpression1483 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DEFINED_in_unaryExpression1497 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_type_name_in_unaryExpression1499 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DEFINED_in_unaryExpression1515 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_LPAREN_in_unaryExpression1517 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_type_name_in_unaryExpression1519 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_RPAREN_in_unaryExpression1522 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpression1535 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_in_unaryExpressionNotPlusMinus1548 = new BitSet(new long[]{0x0051000001408010L,0x0042A000014A5010L});
	public static final BitSet FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus1552 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TILDE_in_unaryExpressionNotPlusMinus1566 = new BitSet(new long[]{0x0051000001408010L,0x0042A000014A5010L});
	public static final BitSet FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus1569 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AMPERSAND_in_unaryExpressionNotPlusMinus1584 = new BitSet(new long[]{0x0051000001408010L,0x0042A000014A5010L});
	public static final BitSet FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus1586 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STAR_in_unaryExpressionNotPlusMinus1600 = new BitSet(new long[]{0x0051000001408010L,0x0042A000014A5010L});
	public static final BitSet FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus1603 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MINUS_in_unaryExpressionNotPlusMinus1617 = new BitSet(new long[]{0x0051000001408010L,0x0042A000014A5010L});
	public static final BitSet FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus1620 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUS_in_unaryExpressionNotPlusMinus1635 = new BitSet(new long[]{0x0051000001408010L,0x0042A000014A5010L});
	public static final BitSet FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus1639 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_unaryExpressionNotPlusMinus1653 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_type_name_in_unaryExpressionNotPlusMinus1655 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_RPAREN_in_unaryExpressionNotPlusMinus1657 = new BitSet(new long[]{0x0051000001408010L,0x0042A000014A5010L});
	public static final BitSet FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus1660 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postfixExpression_in_unaryExpressionNotPlusMinus1676 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primaryExpression_in_postfixExpression1691 = new BitSet(new long[]{0x0000000000000002L,0x0000800005004020L});
	public static final BitSet FOLLOW_LSQUARE_in_postfixExpression1701 = new BitSet(new long[]{0x0051000001408010L,0x0042A000014A5010L});
	public static final BitSet FOLLOW_assignmentExpression_in_postfixExpression1706 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
	public static final BitSet FOLLOW_RSQUARE_in_postfixExpression1708 = new BitSet(new long[]{0x0000000000000002L,0x0000800005004020L});
	public static final BitSet FOLLOW_STAR_in_postfixExpression1718 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_postfixExpression1723 = new BitSet(new long[]{0x0000000000000002L,0x0000800005004020L});
	public static final BitSet FOLLOW_POINTERTO_in_postfixExpression1731 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_postfixExpression1734 = new BitSet(new long[]{0x0000000000000002L,0x0000800005004020L});
	public static final BitSet FOLLOW_PLUSPLUS_in_postfixExpression1744 = new BitSet(new long[]{0x0000000000000002L,0x0000800005004020L});
	public static final BitSet FOLLOW_MINUSMINUS_in_postfixExpression1760 = new BitSet(new long[]{0x0000000000000002L,0x0000800005004020L});
	public static final BitSet FOLLOW_functionCall_in_primaryExpression1794 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_primaryExpression1802 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constant_in_primaryExpression1816 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_primaryExpression1829 = new BitSet(new long[]{0x0051000001408010L,0x0042A000014A5010L});
	public static final BitSet FOLLOW_assignmentExpression_in_primaryExpression1832 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_RPAREN_in_primaryExpression1834 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_functionCall1861 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_LPAREN_in_functionCall1863 = new BitSet(new long[]{0x0051000001408010L,0x0042A008014A5010L});
	public static final BitSet FOLLOW_argList_in_functionCall1865 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_RPAREN_in_functionCall1868 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignmentExpression_in_argList1894 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_COMMA_in_argList1897 = new BitSet(new long[]{0x0051000001408010L,0x0042A000014A5010L});
	public static final BitSet FOLLOW_assignmentExpression_in_argList1899 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_sourceExpression_in_source_text1981 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMA_in_source_text1987 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_source_text1993 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RPAREN_in_source_text1999 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WS_in_source_text2005 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_macroExpansion2021 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000010L});
	public static final BitSet FOLLOW_WS_in_macroExpansion2023 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_LPAREN_in_macroExpansion2026 = new BitSet(new long[]{0x0000000000000000L,0x4000000800000000L});
	public static final BitSet FOLLOW_WS_in_macroExpansion2028 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_RPAREN_in_macroExpansion2033 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_macroExpansion2051 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000010L});
	public static final BitSet FOLLOW_WS_in_macroExpansion2053 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_LPAREN_in_macroExpansion2056 = new BitSet(new long[]{0x0051000000658000L,0x400F21C000080012L});
	public static final BitSet FOLLOW_WS_in_macroExpansion2058 = new BitSet(new long[]{0x0051000000658000L,0x400F21C000080012L});
	public static final BitSet FOLLOW_macArgs_in_macroExpansion2061 = new BitSet(new long[]{0x0000000000000000L,0x4000000800000000L});
	public static final BitSet FOLLOW_WS_in_macroExpansion2064 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_RPAREN_in_macroExpansion2067 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mArg_in_macArgs2093 = new BitSet(new long[]{0x0000000000040002L,0x4000000000000000L});
	public static final BitSet FOLLOW_WS_in_macArgs2097 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_COMMA_in_macArgs2100 = new BitSet(new long[]{0x0051000000658000L,0x400F21C000080012L});
	public static final BitSet FOLLOW_WS_in_macArgs2102 = new BitSet(new long[]{0x0051000000658000L,0x400F21C000080012L});
	public static final BitSet FOLLOW_mArg_in_macArgs2107 = new BitSet(new long[]{0x0000000000040002L,0x4000000000000000L});
	public static final BitSet FOLLOW_sourceExpression_in_mArg2131 = new BitSet(new long[]{0x0051000000618002L,0x400F21C000080012L});
	public static final BitSet FOLLOW_macroExpansion_in_sourceExpression2176 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_concatenate_in_sourceExpression2195 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRINGIFICATION_in_sourceExpression2201 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_sourceExpression2203 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primarySource_in_sourceExpression2218 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_OP_in_sourceExpression2224 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SIZEOF_in_sourceExpression2230 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_sourceExpression2236 = new BitSet(new long[]{0x0051000000658000L,0x400F21C800080012L});
	public static final BitSet FOLLOW_macArgs_in_sourceExpression2238 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_RPAREN_in_sourceExpression2241 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEMICOLON_in_sourceExpression2256 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEXT_END_in_sourceExpression2262 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WS_in_sourceExpression2268 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primarySource_in_concatenate2283 = new BitSet(new long[]{0x0000000000000000L,0x4000010000000000L});
	public static final BitSet FOLLOW_WS_in_concatenate2286 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_SHARPSHARP_in_concatenate2289 = new BitSet(new long[]{0x0051000000618000L,0x4002018000080002L});
	public static final BitSet FOLLOW_WS_in_concatenate2292 = new BitSet(new long[]{0x0051000000618000L,0x0002018000080002L});
	public static final BitSet FOLLOW_primarySource_in_concatenate2297 = new BitSet(new long[]{0x0000000000000002L,0x4000010000000000L});
	public static final BitSet FOLLOW_SHARPSHARP_in_primarySource2324 = new BitSet(new long[]{0x0040000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_WS_in_primarySource2326 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_primarySource2329 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_primarySource2343 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SHARP_in_primarySource2349 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LIB_FILE_in_primarySource2355 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constant_in_primarySource2361 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CKEYWORD_in_primarySource2367 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COPERATOR_in_primarySource2373 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DEFINE_in_synpred16_Cpp394 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_synpred16_Cpp396 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_LPAREN_in_synpred16_Cpp398 = new BitSet(new long[]{0x0000000000000000L,0x4000000800000000L});
	public static final BitSet FOLLOW_WS_in_synpred16_Cpp400 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_RPAREN_in_synpred16_Cpp403 = new BitSet(new long[]{0x0051000000658002L,0x400F21C800080012L});
	public static final BitSet FOLLOW_macro_text_in_synpred16_Cpp405 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DEFINE_in_synpred24_Cpp427 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_synpred24_Cpp431 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_LPAREN_in_synpred24_Cpp434 = new BitSet(new long[]{0x0040000080000000L,0x4000000800000000L});
	public static final BitSet FOLLOW_WS_in_synpred24_Cpp436 = new BitSet(new long[]{0x0040000080000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_macroParam_in_synpred24_Cpp443 = new BitSet(new long[]{0x0000000000040000L,0x4000000800000000L});
	public static final BitSet FOLLOW_WS_in_synpred24_Cpp445 = new BitSet(new long[]{0x0000000000040000L,0x0000000800000000L});
	public static final BitSet FOLLOW_COMMA_in_synpred24_Cpp449 = new BitSet(new long[]{0x0040000080000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_WS_in_synpred24_Cpp451 = new BitSet(new long[]{0x0040000080000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_macroParam_in_synpred24_Cpp456 = new BitSet(new long[]{0x0000000000040000L,0x4000000800000000L});
	public static final BitSet FOLLOW_WS_in_synpred24_Cpp458 = new BitSet(new long[]{0x0000000000040000L,0x4000000800000000L});
	public static final BitSet FOLLOW_RPAREN_in_synpred24_Cpp466 = new BitSet(new long[]{0x0051000000658002L,0x400F21C800080012L});
	public static final BitSet FOLLOW_macro_text_in_synpred24_Cpp468 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WS_in_synpred25_Cpp508 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_synpred37_Cpp890 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_synpred38_Cpp910 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SIZEOF_in_synpred71_Cpp1461 = new BitSet(new long[]{0x0051000001408010L,0x0042A000014A5010L});
	public static final BitSet FOLLOW_unaryExpression_in_synpred71_Cpp1463 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SIZEOF_in_synpred72_Cpp1477 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_LPAREN_in_synpred72_Cpp1479 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_type_name_in_synpred72_Cpp1481 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_RPAREN_in_synpred72_Cpp1483 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_synpred81_Cpp1653 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_type_name_in_synpred81_Cpp1655 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_RPAREN_in_synpred81_Cpp1657 = new BitSet(new long[]{0x0051000001408010L,0x0042A000014A5010L});
	public static final BitSet FOLLOW_unaryExpression_in_synpred81_Cpp1660 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STAR_in_synpred83_Cpp1718 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_synpred83_Cpp1723 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_synpred87_Cpp1786 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_LPAREN_in_synpred87_Cpp1788 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_synpred88_Cpp1802 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sourceExpression_in_synpred97_Cpp1981 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_synpred99_Cpp1993 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_synpred103_Cpp2021 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000010L});
	public static final BitSet FOLLOW_WS_in_synpred103_Cpp2023 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_LPAREN_in_synpred103_Cpp2026 = new BitSet(new long[]{0x0000000000000000L,0x4000000800000000L});
	public static final BitSet FOLLOW_WS_in_synpred103_Cpp2028 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_RPAREN_in_synpred103_Cpp2033 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WS_in_synpred105_Cpp2058 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WS_in_synpred108_Cpp2102 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sourceExpression_in_synpred110_Cpp2131 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sourceExpression_in_synpred111_Cpp2131 = new BitSet(new long[]{0x0051000000618002L,0x400F21C000080012L});
	public static final BitSet FOLLOW_IDENTIFIER_in_synpred113_Cpp2167 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000010L});
	public static final BitSet FOLLOW_WS_in_synpred113_Cpp2169 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_LPAREN_in_synpred113_Cpp2172 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primarySource_in_synpred115_Cpp2183 = new BitSet(new long[]{0x0000000000000000L,0x4000010000000000L});
	public static final BitSet FOLLOW_WS_in_synpred115_Cpp2185 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_SHARPSHARP_in_synpred115_Cpp2188 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primarySource_in_synpred117_Cpp2218 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_macArgs_in_synpred120_Cpp2238 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WS_in_synpred126_Cpp2286 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_SHARPSHARP_in_synpred126_Cpp2289 = new BitSet(new long[]{0x0051000000618000L,0x4002018000080002L});
	public static final BitSet FOLLOW_WS_in_synpred126_Cpp2292 = new BitSet(new long[]{0x0051000000618000L,0x0002018000080002L});
	public static final BitSet FOLLOW_primarySource_in_synpred126_Cpp2297 = new BitSet(new long[]{0x0000000000000002L});
}
