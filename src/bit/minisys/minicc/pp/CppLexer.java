// $ANTLR 3.5.2 Cpp.g 2022-04-24 22:14:19

	package bit.minisys.minicc.pp;

	import java.io.File;
	import java.io.IOException;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings("all")
public class CppLexer extends Lexer {
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

		boolean inDirective =false;
		boolean inDefineMode=false;
		boolean discardSpace=true;
		boolean inFileInclusion=false;
		int   ltoken=End;
		static char cpp = 'X';


	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public CppLexer() {} 
	public CppLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public CppLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "Cpp.g"; }

	// $ANTLR start "STRING_OP"
	public final void mSTRING_OP() throws RecognitionException {
		try {
			int _type = STRING_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			CommonToken id=null;

			// Cpp.g:319:3: ({...}? '#' ( WS )? id= IDENTIFIER )
			// Cpp.g:319:7: {...}? '#' ( WS )? id= IDENTIFIER
			{
			if ( !((inDefineMode)) ) {
				if (state.backtracking>0) {state.failed=true; return;}
				throw new FailedPredicateException(input, "STRING_OP", "inDefineMode");
			}
			match('#'); if (state.failed) return;
			// Cpp.g:319:27: ( WS )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0=='\t'||(LA1_0 >= '\f' && LA1_0 <= '\r')||LA1_0==' ') ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// Cpp.g:319:27: WS
					{
					mWS(); if (state.failed) return;

					}
					break;

			}

			int idStart37 = getCharIndex();
			int idStartLine37 = getLine();
			int idStartCharPos37 = getCharPositionInLine();
			mIDENTIFIER(); if (state.failed) return;
			id = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, idStart37, getCharIndex()-1);
			id.setLine(idStartLine37);
			id.setCharPositionInLine(idStartCharPos37);

			if ( state.backtracking==0 ) {	this.setText(id.getText());	}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING_OP"

	// $ANTLR start "DIRECTIVE"
	public final void mDIRECTIVE() throws RecognitionException {
		try {
			int _type = DIRECTIVE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			CommonToken m=null;

			// Cpp.g:325:3: ({...}? SHARP |{...}? '#' ( WS )? ( 'ifdef' | 'ifndef' | 'if' | 'elif' | 'else' | 'endif' | 'line' | 'undef' WS | 'define' WS | 'exec_macro_expression' | ( 'include' | 'include_next' ) WS | 'warning' m= MACRO_TEXT | 'error' (m= MACRO_TEXT )? | 'pragma' m= MACRO_TEXT |) )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0=='#') ) {
				int LA6_1 = input.LA(2);
				if ( (((input.LA(2) == ' '||input.LA(2) == '\n'||input.LA(2) == -1))) ) {
					alt6=1;
				}
				else if ( ((!inDirective && !inDefineMode)) ) {
					alt6=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 6, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// Cpp.g:325:5: {...}? SHARP
					{
					if ( !(((input.LA(2) == ' '||input.LA(2) == '\n'||input.LA(2) == -1))) ) {
						if (state.backtracking>0) {state.failed=true; return;}
						throw new FailedPredicateException(input, "DIRECTIVE", "(input.LA(2) == ' '||input.LA(2) == '\\n'||input.LA(2) == -1)");
					}
					mSHARP(); if (state.failed) return;

					if ( state.backtracking==0 ) { _type = SHARP;}
					}
					break;
				case 2 :
					// Cpp.g:326:6: {...}? '#' ( WS )? ( 'ifdef' | 'ifndef' | 'if' | 'elif' | 'else' | 'endif' | 'line' | 'undef' WS | 'define' WS | 'exec_macro_expression' | ( 'include' | 'include_next' ) WS | 'warning' m= MACRO_TEXT | 'error' (m= MACRO_TEXT )? | 'pragma' m= MACRO_TEXT |)
					{
					if ( !((!inDirective && !inDefineMode)) ) {
						if (state.backtracking>0) {state.failed=true; return;}
						throw new FailedPredicateException(input, "DIRECTIVE", "!inDirective && !inDefineMode");
					}
					match('#'); if (state.failed) return;
					if ( state.backtracking==0 ) {inDirective=true; cpp='X'; discardSpace=false;}
					// Cpp.g:326:93: ( WS )?
					int alt2=2;
					int LA2_0 = input.LA(1);
					if ( (LA2_0=='\t'||(LA2_0 >= '\f' && LA2_0 <= '\r')||LA2_0==' ') ) {
						alt2=1;
					}
					switch (alt2) {
						case 1 :
							// Cpp.g:326:93: WS
							{
							mWS(); if (state.failed) return;

							}
							break;

					}

					// Cpp.g:327:3: ( 'ifdef' | 'ifndef' | 'if' | 'elif' | 'else' | 'endif' | 'line' | 'undef' WS | 'define' WS | 'exec_macro_expression' | ( 'include' | 'include_next' ) WS | 'warning' m= MACRO_TEXT | 'error' (m= MACRO_TEXT )? | 'pragma' m= MACRO_TEXT |)
					int alt5=15;
					switch ( input.LA(1) ) {
					case 'i':
						{
						int LA5_1 = input.LA(2);
						if ( (LA5_1=='f') ) {
							switch ( input.LA(3) ) {
							case 'd':
								{
								alt5=1;
								}
								break;
							case 'n':
								{
								alt5=2;
								}
								break;
							default:
								alt5=3;
							}
						}
						else if ( (LA5_1=='n') ) {
							alt5=11;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return;}
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 5, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case 'e':
						{
						switch ( input.LA(2) ) {
						case 'l':
							{
							int LA5_11 = input.LA(3);
							if ( (LA5_11=='i') ) {
								alt5=4;
							}
							else if ( (LA5_11=='s') ) {
								alt5=5;
							}

							else {
								if (state.backtracking>0) {state.failed=true; return;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 5, 11, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

							}
							break;
						case 'n':
							{
							alt5=6;
							}
							break;
						case 'x':
							{
							alt5=10;
							}
							break;
						case 'r':
							{
							alt5=13;
							}
							break;
						default:
							if (state.backtracking>0) {state.failed=true; return;}
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 5, 2, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
						}
						break;
					case 'l':
						{
						alt5=7;
						}
						break;
					case 'u':
						{
						alt5=8;
						}
						break;
					case 'd':
						{
						alt5=9;
						}
						break;
					case 'w':
						{
						alt5=12;
						}
						break;
					case 'p':
						{
						alt5=14;
						}
						break;
					default:
						alt5=15;
					}
					switch (alt5) {
						case 1 :
							// Cpp.g:327:6: 'ifdef'
							{
							match("ifdef"); if (state.failed) return;

							if ( state.backtracking==0 ) { _type = IF;     discardSpace=true; this.setText("ifdef");}
							}
							break;
						case 2 :
							// Cpp.g:328:6: 'ifndef'
							{
							match("ifndef"); if (state.failed) return;

							if ( state.backtracking==0 ) { _type = IF;     discardSpace=true; this.setText("ifndef");}
							}
							break;
						case 3 :
							// Cpp.g:329:6: 'if'
							{
							match("if"); if (state.failed) return;

							if ( state.backtracking==0 ) { _type = IF; 	  discardSpace=true; this.setText("if");}
							}
							break;
						case 4 :
							// Cpp.g:330:6: 'elif'
							{
							match("elif"); if (state.failed) return;

							if ( state.backtracking==0 ) { _type = ELIF;	  discardSpace=true;}
							}
							break;
						case 5 :
							// Cpp.g:331:6: 'else'
							{
							match("else"); if (state.failed) return;

							if ( state.backtracking==0 ) { _type = ELSE;	  discardSpace=true;}
							}
							break;
						case 6 :
							// Cpp.g:332:6: 'endif'
							{
							match("endif"); if (state.failed) return;

							if ( state.backtracking==0 ) { _type = ENDIF;  discardSpace=true;}
							}
							break;
						case 7 :
							// Cpp.g:333:6: 'line'
							{
							match("line"); if (state.failed) return;

							if ( state.backtracking==0 ) { _type = LINE;   discardSpace=true;}
							}
							break;
						case 8 :
							// Cpp.g:334:6: 'undef' WS
							{
							match("undef"); if (state.failed) return;

							mWS(); if (state.failed) return;

							if ( state.backtracking==0 ) { _type = UNDEF;  discardSpace=true;}
							}
							break;
						case 9 :
							// Cpp.g:335:6: 'define' WS
							{
							match("define"); if (state.failed) return;

							mWS(); if (state.failed) return;

							if ( state.backtracking==0 ) { _type = DEFINE; cpp = 'D'; discardSpace=false;  }
							}
							break;
						case 10 :
							// Cpp.g:336:6: 'exec_macro_expression'
							{
							match("exec_macro_expression"); if (state.failed) return;

							if ( state.backtracking==0 ) {_type=EXEC_MACRO;discardSpace=true;}
							}
							break;
						case 11 :
							// Cpp.g:337:6: ( 'include' | 'include_next' ) WS
							{
							// Cpp.g:337:6: ( 'include' | 'include_next' )
							int alt3=2;
							int LA3_0 = input.LA(1);
							if ( (LA3_0=='i') ) {
								int LA3_1 = input.LA(2);
								if ( (LA3_1=='n') ) {
									int LA3_2 = input.LA(3);
									if ( (LA3_2=='c') ) {
										int LA3_3 = input.LA(4);
										if ( (LA3_3=='l') ) {
											int LA3_4 = input.LA(5);
											if ( (LA3_4=='u') ) {
												int LA3_5 = input.LA(6);
												if ( (LA3_5=='d') ) {
													int LA3_6 = input.LA(7);
													if ( (LA3_6=='e') ) {
														int LA3_7 = input.LA(8);
														if ( (LA3_7=='_') ) {
															alt3=2;
														}
														else if ( (LA3_7=='\t'||(LA3_7 >= '\f' && LA3_7 <= '\r')||LA3_7==' ') ) {
															alt3=1;
														}

														else {
															if (state.backtracking>0) {state.failed=true; return;}
															int nvaeMark = input.mark();
															try {
																for (int nvaeConsume = 0; nvaeConsume < 8 - 1; nvaeConsume++) {
																	input.consume();
																}
																NoViableAltException nvae =
																	new NoViableAltException("", 3, 7, input);
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
															for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
																input.consume();
															}
															NoViableAltException nvae =
																new NoViableAltException("", 3, 6, input);
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
														for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
															input.consume();
														}
														NoViableAltException nvae =
															new NoViableAltException("", 3, 5, input);
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
													for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
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

										else {
											if (state.backtracking>0) {state.failed=true; return;}
											int nvaeMark = input.mark();
											try {
												for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
													input.consume();
												}
												NoViableAltException nvae =
													new NoViableAltException("", 3, 3, input);
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
											for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 3, 2, input);
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
											new NoViableAltException("", 3, 1, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								if (state.backtracking>0) {state.failed=true; return;}
								NoViableAltException nvae =
									new NoViableAltException("", 3, 0, input);
								throw nvae;
							}

							switch (alt3) {
								case 1 :
									// Cpp.g:337:7: 'include'
									{
									match("include"); if (state.failed) return;

									}
									break;
								case 2 :
									// Cpp.g:337:17: 'include_next'
									{
									match("include_next"); if (state.failed) return;

									}
									break;

							}

							mWS(); if (state.failed) return;

							if ( state.backtracking==0 ) {_type = INCLUDE;discardSpace=true ;inDirective=false;inFileInclusion=true;}
							}
							break;
						case 12 :
							// Cpp.g:338:6: 'warning' m= MACRO_TEXT
							{
							match("warning"); if (state.failed) return;

							if ( state.backtracking==0 ) { _type = WARNING;}
							int mStart234 = getCharIndex();
							int mStartLine234 = getLine();
							int mStartCharPos234 = getCharPositionInLine();
							mMACRO_TEXT(); if (state.failed) return;
							m = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, mStart234, getCharIndex()-1);
							m.setLine(mStartLine234);
							m.setCharPositionInLine(mStartCharPos234);

							if ( state.backtracking==0 ) { this.setText(m.getText());}
							}
							break;
						case 13 :
							// Cpp.g:339:6: 'error' (m= MACRO_TEXT )?
							{
							match("error"); if (state.failed) return;

							if ( state.backtracking==0 ) { _type = ERROR;  }
							// Cpp.g:339:38: (m= MACRO_TEXT )?
							int alt4=2;
							int LA4_0 = input.LA(1);
							if ( ((LA4_0 >= '\u0000' && LA4_0 <= '\t')||(LA4_0 >= '\u000B' && LA4_0 <= '\uFFFF')) ) {
								alt4=1;
							}
							switch (alt4) {
								case 1 :
									// Cpp.g:339:39: m= MACRO_TEXT
									{
									int mStart255 = getCharIndex();
									int mStartLine255 = getLine();
									int mStartCharPos255 = getCharPositionInLine();
									mMACRO_TEXT(); if (state.failed) return;
									m = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, mStart255, getCharIndex()-1);
									m.setLine(mStartLine255);
									m.setCharPositionInLine(mStartCharPos255);

									if ( state.backtracking==0 ) { this.setText(m.getText());}
									}
									break;

							}

							}
							break;
						case 14 :
							// Cpp.g:340:6: 'pragma' m= MACRO_TEXT
							{
							match("pragma"); if (state.failed) return;

							if ( state.backtracking==0 ) { _type = PRAGMA; }
							int mStart275 = getCharIndex();
							int mStartLine275 = getLine();
							int mStartCharPos275 = getCharPositionInLine();
							mMACRO_TEXT(); if (state.failed) return;
							m = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, mStart275, getCharIndex()-1);
							m.setLine(mStartLine275);
							m.setCharPositionInLine(mStartCharPos275);

							if ( state.backtracking==0 ) { this.setText(m.getText());}
							}
							break;
						case 15 :
							// Cpp.g:342:3: 
							{
							}
							break;

					}

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIRECTIVE"

	// $ANTLR start "MACRO_TEXT"
	public final void mMACRO_TEXT() throws RecognitionException {
		try {
			// Cpp.g:346:9: ( ( ( '/*' )=> '/*' ( options {greedy=false; } : . )* '*/' | ( '\\\\\\n' )=> ( '\\\\\\n' ) | ( '\\\\\\r\\n' )=> ( '\\\\\\n' ) |~ '\\n' )+ )
			// Cpp.g:346:17: ( ( '/*' )=> '/*' ( options {greedy=false; } : . )* '*/' | ( '\\\\\\n' )=> ( '\\\\\\n' ) | ( '\\\\\\r\\n' )=> ( '\\\\\\n' ) |~ '\\n' )+
			{
			// Cpp.g:346:17: ( ( '/*' )=> '/*' ( options {greedy=false; } : . )* '*/' | ( '\\\\\\n' )=> ( '\\\\\\n' ) | ( '\\\\\\r\\n' )=> ( '\\\\\\n' ) |~ '\\n' )+
			int cnt8=0;
			loop8:
			while (true) {
				int alt8=5;
				alt8 = dfa8.predict(input);
				switch (alt8) {
				case 1 :
					// Cpp.g:346:21: ( '/*' )=> '/*' ( options {greedy=false; } : . )* '*/'
					{
					match("/*"); if (state.failed) return;

					// Cpp.g:346:38: ( options {greedy=false; } : . )*
					loop7:
					while (true) {
						int alt7=2;
						int LA7_0 = input.LA(1);
						if ( (LA7_0=='*') ) {
							int LA7_1 = input.LA(2);
							if ( (LA7_1=='/') ) {
								alt7=2;
							}
							else if ( ((LA7_1 >= '\u0000' && LA7_1 <= '.')||(LA7_1 >= '0' && LA7_1 <= '\uFFFF')) ) {
								alt7=1;
							}

						}
						else if ( ((LA7_0 >= '\u0000' && LA7_0 <= ')')||(LA7_0 >= '+' && LA7_0 <= '\uFFFF')) ) {
							alt7=1;
						}

						switch (alt7) {
						case 1 :
							// Cpp.g:346:64: .
							{
							matchAny(); if (state.failed) return;
							}
							break;

						default :
							break loop7;
						}
					}

					match("*/"); if (state.failed) return;

					}
					break;
				case 2 :
					// Cpp.g:347:17: ( '\\\\\\n' )=> ( '\\\\\\n' )
					{
					// Cpp.g:347:29: ( '\\\\\\n' )
					// Cpp.g:347:30: '\\\\\\n'
					{
					match("\\\n"); if (state.failed) return;

					}

					}
					break;
				case 3 :
					// Cpp.g:348:17: ( '\\\\\\r\\n' )=> ( '\\\\\\n' )
					{
					// Cpp.g:348:31: ( '\\\\\\n' )
					// Cpp.g:348:32: '\\\\\\n'
					{
					match("\\\n"); if (state.failed) return;

					}

					}
					break;
				case 4 :
					// Cpp.g:349:17: ~ '\\n'
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt8 >= 1 ) break loop8;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(8, input);
					throw eee;
				}
				cnt8++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MACRO_TEXT"

	// $ANTLR start "SIZEOF"
	public final void mSIZEOF() throws RecognitionException {
		try {
			int _type = SIZEOF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cpp.g:353:8: ( 'sizeof' )
			// Cpp.g:353:10: 'sizeof'
			{
			match("sizeof"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SIZEOF"

	// $ANTLR start "DEFINED"
	public final void mDEFINED() throws RecognitionException {
		try {
			int _type = DEFINED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cpp.g:356:9: ( 'defined' )
			// Cpp.g:356:11: 'defined'
			{
			match("defined"); if (state.failed) return;

			if ( state.backtracking==0 ) {	
							if(!inDirective)
							_type = CKEYWORD;
						}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DEFINED"

	// $ANTLR start "IDENTIFIER"
	public final void mIDENTIFIER() throws RecognitionException {
		try {
			int _type = IDENTIFIER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cpp.g:364:3: ( LETTER ( LETTER | '0' .. '9' )* )
			// Cpp.g:364:5: LETTER ( LETTER | '0' .. '9' )*
			{
			mLETTER(); if (state.failed) return;

			// Cpp.g:364:12: ( LETTER | '0' .. '9' )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0=='$'||(LA9_0 >= '0' && LA9_0 <= '9')||(LA9_0 >= 'A' && LA9_0 <= 'Z')||LA9_0=='_'||(LA9_0 >= 'a' && LA9_0 <= 'z')) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// Cpp.g:
					{
					if ( input.LA(1)=='$'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop9;
				}
			}

			if ( state.backtracking==0 ) {
							if(inDirective == true)
							{
								if(cpp == 'D') 
								{
									if(input.LA(1) != '(' )
									{
							 			inDefineMode= true; 
							 			inDirective = false; 
							 			cpp = 'X';
									}
									else 
									{  
										cpp = '('; 
									}
								}
							}
						}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IDENTIFIER"

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// Cpp.g:387:8: ( '$' | 'A' .. 'Z' | 'a' .. 'z' | '_' )
			// Cpp.g:
			{
			if ( input.LA(1)=='$'||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LETTER"

	// $ANTLR start "SHARP"
	public final void mSHARP() throws RecognitionException {
		try {
			int _type = SHARP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cpp.g:393:9: ( '#' )
			// Cpp.g:393:11: '#'
			{
			match('#'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SHARP"

	// $ANTLR start "STRINGIFICATION"
	public final void mSTRINGIFICATION() throws RecognitionException {
		try {
			int _type = STRINGIFICATION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cpp.g:395:17: ( '#_#_' )
			// Cpp.g:395:19: '#_#_'
			{
			match("#_#_"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRINGIFICATION"

	// $ANTLR start "SHARPSHARP"
	public final void mSHARPSHARP() throws RecognitionException {
		try {
			int _type = SHARPSHARP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cpp.g:398:13: ( '##' )
			// Cpp.g:398:15: '##'
			{
			match("##"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SHARPSHARP"

	// $ANTLR start "ASSIGNEQUAL"
	public final void mASSIGNEQUAL() throws RecognitionException {
		try {
			int _type = ASSIGNEQUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cpp.g:400:14: ( '=' )
			// Cpp.g:400:16: '='
			{
			match('='); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ASSIGNEQUAL"

	// $ANTLR start "COLON"
	public final void mCOLON() throws RecognitionException {
		try {
			int _type = COLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cpp.g:402:9: ( ':' )
			// Cpp.g:402:11: ':'
			{
			match(':'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COLON"

	// $ANTLR start "COMMA"
	public final void mCOMMA() throws RecognitionException {
		try {
			int _type = COMMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cpp.g:404:9: ( ',' )
			// Cpp.g:404:11: ','
			{
			match(','); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMA"

	// $ANTLR start "QUESTIONMARK"
	public final void mQUESTIONMARK() throws RecognitionException {
		try {
			int _type = QUESTIONMARK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cpp.g:406:14: ( '?' )
			// Cpp.g:406:16: '?'
			{
			match('?'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "QUESTIONMARK"

	// $ANTLR start "SEMICOLON"
	public final void mSEMICOLON() throws RecognitionException {
		try {
			int _type = SEMICOLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cpp.g:408:12: ( ';' )
			// Cpp.g:408:14: ';'
			{
			match(';'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEMICOLON"

	// $ANTLR start "POINTERTO"
	public final void mPOINTERTO() throws RecognitionException {
		try {
			int _type = POINTERTO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cpp.g:410:12: ( '->' )
			// Cpp.g:410:14: '->'
			{
			match("->"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "POINTERTO"

	// $ANTLR start "LPAREN"
	public final void mLPAREN() throws RecognitionException {
		try {
			int _type = LPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cpp.g:412:10: ( '(' )
			// Cpp.g:412:12: '('
			{
			match('('); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LPAREN"

	// $ANTLR start "RPAREN"
	public final void mRPAREN() throws RecognitionException {
		try {
			int _type = RPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cpp.g:414:8: ( ')' )
			// Cpp.g:414:10: ')'
			{
			match(')'); if (state.failed) return;
			if ( state.backtracking==0 ) {
							if(cpp=='(')
							{
								if(input.LA(1) != '\n')
								{
									inDefineMode = true; 
									inDirective = false; 
								}
								cpp ='X';
							}
						}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RPAREN"

	// $ANTLR start "LSQUARE"
	public final void mLSQUARE() throws RecognitionException {
		try {
			int _type = LSQUARE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cpp.g:428:11: ( '[' )
			// Cpp.g:428:13: '['
			{
			match('['); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LSQUARE"

	// $ANTLR start "RSQUARE"
	public final void mRSQUARE() throws RecognitionException {
		try {
			int _type = RSQUARE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cpp.g:430:11: ( ']' )
			// Cpp.g:430:13: ']'
			{
			match(']'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RSQUARE"

	// $ANTLR start "LCURLY"
	public final void mLCURLY() throws RecognitionException {
		try {
			int _type = LCURLY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cpp.g:432:10: ( '{' )
			// Cpp.g:432:12: '{'
			{
			match('{'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LCURLY"

	// $ANTLR start "RCURLY"
	public final void mRCURLY() throws RecognitionException {
		try {
			int _type = RCURLY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cpp.g:434:10: ( '}' )
			// Cpp.g:434:12: '}'
			{
			match('}'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RCURLY"

	// $ANTLR start "EQUAL"
	public final void mEQUAL() throws RecognitionException {
		try {
			int _type = EQUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cpp.g:436:9: ( '==' )
			// Cpp.g:436:11: '=='
			{
			match("=="); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQUAL"

	// $ANTLR start "NOTEQUAL"
	public final void mNOTEQUAL() throws RecognitionException {
		try {
			int _type = NOTEQUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cpp.g:438:11: ( '!=' )
			// Cpp.g:438:13: '!='
			{
			match("!="); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOTEQUAL"

	// $ANTLR start "LESSTHANOREQUALTO"
	public final void mLESSTHANOREQUALTO() throws RecognitionException {
		try {
			int _type = LESSTHANOREQUALTO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cpp.g:441:5: ( '<=' )
			// Cpp.g:441:7: '<='
			{
			match("<="); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LESSTHANOREQUALTO"

	// $ANTLR start "LESSTHAN"
	public final void mLESSTHAN() throws RecognitionException {
		try {
			int _type = LESSTHAN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cpp.g:443:12: ( '<' )
			// Cpp.g:443:14: '<'
			{
			match('<'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LESSTHAN"

	// $ANTLR start "GREATERTHANOREQUALTO"
	public final void mGREATERTHANOREQUALTO() throws RecognitionException {
		try {
			int _type = GREATERTHANOREQUALTO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cpp.g:446:5: ( '>=' )
			// Cpp.g:446:7: '>='
			{
			match(">="); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GREATERTHANOREQUALTO"

	// $ANTLR start "GREATERTHAN"
	public final void mGREATERTHAN() throws RecognitionException {
		try {
			int _type = GREATERTHAN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cpp.g:448:14: ( '>' )
			// Cpp.g:448:16: '>'
			{
			match('>'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GREATERTHAN"

	// $ANTLR start "DIVIDE"
	public final void mDIVIDE() throws RecognitionException {
		try {
			int _type = DIVIDE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cpp.g:450:10: ( '/' )
			// Cpp.g:450:12: '/'
			{
			match('/'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIVIDE"

	// $ANTLR start "DIVIDEEQUAL"
	public final void mDIVIDEEQUAL() throws RecognitionException {
		try {
			int _type = DIVIDEEQUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cpp.g:452:14: ( '/=' )
			// Cpp.g:452:16: '/='
			{
			match("/="); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIVIDEEQUAL"

	// $ANTLR start "PLUS"
	public final void mPLUS() throws RecognitionException {
		try {
			int _type = PLUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cpp.g:454:8: ( '+' )
			// Cpp.g:454:10: '+'
			{
			match('+'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PLUS"

	// $ANTLR start "PLUSEQUAL"
	public final void mPLUSEQUAL() throws RecognitionException {
		try {
			int _type = PLUSEQUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cpp.g:456:12: ( '+=' )
			// Cpp.g:456:14: '+='
			{
			match("+="); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PLUSEQUAL"

	// $ANTLR start "PLUSPLUS"
	public final void mPLUSPLUS() throws RecognitionException {
		try {
			int _type = PLUSPLUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cpp.g:458:11: ( '++' )
			// Cpp.g:458:13: '++'
			{
			match("++"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PLUSPLUS"

	// $ANTLR start "MINUS"
	public final void mMINUS() throws RecognitionException {
		try {
			int _type = MINUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cpp.g:460:9: ( '-' )
			// Cpp.g:460:11: '-'
			{
			match('-'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MINUS"

	// $ANTLR start "MINUSEQUAL"
	public final void mMINUSEQUAL() throws RecognitionException {
		try {
			int _type = MINUSEQUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cpp.g:462:13: ( '-=' )
			// Cpp.g:462:15: '-='
			{
			match("-="); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MINUSEQUAL"

	// $ANTLR start "MINUSMINUS"
	public final void mMINUSMINUS() throws RecognitionException {
		try {
			int _type = MINUSMINUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cpp.g:464:13: ( '--' )
			// Cpp.g:464:15: '--'
			{
			match("--"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MINUSMINUS"

	// $ANTLR start "STAR"
	public final void mSTAR() throws RecognitionException {
		try {
			int _type = STAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cpp.g:466:8: ( '*' )
			// Cpp.g:466:10: '*'
			{
			match('*'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STAR"

	// $ANTLR start "TIMESEQUAL"
	public final void mTIMESEQUAL() throws RecognitionException {
		try {
			int _type = TIMESEQUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cpp.g:468:13: ( '*=' )
			// Cpp.g:468:15: '*='
			{
			match("*="); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TIMESEQUAL"

	// $ANTLR start "MOD"
	public final void mMOD() throws RecognitionException {
		try {
			int _type = MOD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cpp.g:470:8: ( '%' )
			// Cpp.g:470:10: '%'
			{
			match('%'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MOD"

	// $ANTLR start "MODEQUAL"
	public final void mMODEQUAL() throws RecognitionException {
		try {
			int _type = MODEQUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cpp.g:472:11: ( '%=' )
			// Cpp.g:472:13: '%='
			{
			match("%="); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MODEQUAL"

	// $ANTLR start "SHIFTRIGHT"
	public final void mSHIFTRIGHT() throws RecognitionException {
		try {
			int _type = SHIFTRIGHT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cpp.g:474:13: ( '>>' )
			// Cpp.g:474:15: '>>'
			{
			match(">>"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SHIFTRIGHT"

	// $ANTLR start "SHIFTRIGHTEQUAL"
	public final void mSHIFTRIGHTEQUAL() throws RecognitionException {
		try {
			int _type = SHIFTRIGHTEQUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cpp.g:476:17: ( '>>=' )
			// Cpp.g:476:19: '>>='
			{
			match(">>="); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SHIFTRIGHTEQUAL"

	// $ANTLR start "SHIFTLEFT"
	public final void mSHIFTLEFT() throws RecognitionException {
		try {
			int _type = SHIFTLEFT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cpp.g:478:12: ( '<<' )
			// Cpp.g:478:14: '<<'
			{
			match("<<"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SHIFTLEFT"

	// $ANTLR start "SHIFTLEFTEQUAL"
	public final void mSHIFTLEFTEQUAL() throws RecognitionException {
		try {
			int _type = SHIFTLEFTEQUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cpp.g:480:16: ( '<<=' )
			// Cpp.g:480:18: '<<='
			{
			match("<<="); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SHIFTLEFTEQUAL"

	// $ANTLR start "AND"
	public final void mAND() throws RecognitionException {
		try {
			int _type = AND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cpp.g:482:8: ( '&&' )
			// Cpp.g:482:10: '&&'
			{
			match("&&"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AND"

	// $ANTLR start "NOT"
	public final void mNOT() throws RecognitionException {
		try {
			int _type = NOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cpp.g:484:8: ( '!' )
			// Cpp.g:484:10: '!'
			{
			match('!'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOT"

	// $ANTLR start "OR"
	public final void mOR() throws RecognitionException {
		try {
			int _type = OR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cpp.g:486:7: ( '||' )
			// Cpp.g:486:9: '||'
			{
			match("||"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OR"

	// $ANTLR start "AMPERSAND"
	public final void mAMPERSAND() throws RecognitionException {
		try {
			int _type = AMPERSAND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cpp.g:488:12: ( '&' )
			// Cpp.g:488:14: '&'
			{
			match('&'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AMPERSAND"

	// $ANTLR start "BITWISEANDEQUAL"
	public final void mBITWISEANDEQUAL() throws RecognitionException {
		try {
			int _type = BITWISEANDEQUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cpp.g:490:17: ( '&=' )
			// Cpp.g:490:19: '&='
			{
			match("&="); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BITWISEANDEQUAL"

	// $ANTLR start "TILDE"
	public final void mTILDE() throws RecognitionException {
		try {
			int _type = TILDE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cpp.g:492:9: ( '~' )
			// Cpp.g:492:11: '~'
			{
			match('~'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TILDE"

	// $ANTLR start "BITWISEOR"
	public final void mBITWISEOR() throws RecognitionException {
		try {
			int _type = BITWISEOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cpp.g:494:12: ( '|' )
			// Cpp.g:494:14: '|'
			{
			match('|'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BITWISEOR"

	// $ANTLR start "BITWISEOREQUAL"
	public final void mBITWISEOREQUAL() throws RecognitionException {
		try {
			int _type = BITWISEOREQUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cpp.g:496:16: ( '|=' )
			// Cpp.g:496:18: '|='
			{
			match("|="); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BITWISEOREQUAL"

	// $ANTLR start "BITWISEXOR"
	public final void mBITWISEXOR() throws RecognitionException {
		try {
			int _type = BITWISEXOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cpp.g:498:13: ( '^' )
			// Cpp.g:498:15: '^'
			{
			match('^'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BITWISEXOR"

	// $ANTLR start "BITWISEXOREQUAL"
	public final void mBITWISEXOREQUAL() throws RecognitionException {
		try {
			int _type = BITWISEXOREQUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cpp.g:500:17: ( '^=' )
			// Cpp.g:500:19: '^='
			{
			match("^="); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BITWISEXOREQUAL"

	// $ANTLR start "DOT"
	public final void mDOT() throws RecognitionException {
		try {
			int _type = DOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cpp.g:502:8: ( '.' )
			// Cpp.g:502:10: '.'
			{
			match('.'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOT"

	// $ANTLR start "POINTERTOMBR"
	public final void mPOINTERTOMBR() throws RecognitionException {
		try {
			int _type = POINTERTOMBR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cpp.g:504:14: ( '->*' )
			// Cpp.g:504:16: '->*'
			{
			match("->*"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "POINTERTOMBR"

	// $ANTLR start "DOTMBR"
	public final void mDOTMBR() throws RecognitionException {
		try {
			int _type = DOTMBR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cpp.g:506:10: ( '.*' )
			// Cpp.g:506:12: '.*'
			{
			match(".*"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOTMBR"

	// $ANTLR start "SCOPE"
	public final void mSCOPE() throws RecognitionException {
		try {
			int _type = SCOPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cpp.g:508:9: ( '::' )
			// Cpp.g:508:11: '::'
			{
			match("::"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SCOPE"

	// $ANTLR start "ELLIPSIS"
	public final void mELLIPSIS() throws RecognitionException {
		try {
			int _type = ELLIPSIS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cpp.g:510:11: ( '...' )
			// Cpp.g:510:13: '...'
			{
			match("..."); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELLIPSIS"

	// $ANTLR start "LIB_FILE"
	public final void mLIB_FILE() throws RecognitionException {
		try {
			int _type = LIB_FILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cpp.g:514:3: ( '<' ( ' ' | '!' | '#' .. ';' | '=' | '?' .. '[' | ']' .. '\\u00FF' )+ '>' )
			// Cpp.g:514:5: '<' ( ' ' | '!' | '#' .. ';' | '=' | '?' .. '[' | ']' .. '\\u00FF' )+ '>'
			{
			match('<'); if (state.failed) return;
			// Cpp.g:514:9: ( ' ' | '!' | '#' .. ';' | '=' | '?' .. '[' | ']' .. '\\u00FF' )+
			int cnt10=0;
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( ((LA10_0 >= ' ' && LA10_0 <= '!')||(LA10_0 >= '#' && LA10_0 <= ';')||LA10_0=='='||(LA10_0 >= '?' && LA10_0 <= '[')||(LA10_0 >= ']' && LA10_0 <= '\u00FF')) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// Cpp.g:
					{
					if ( (input.LA(1) >= ' ' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= ';')||input.LA(1)=='='||(input.LA(1) >= '?' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\u00FF') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
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

			match('>'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LIB_FILE"

	// $ANTLR start "CHARACTER_LITERAL"
	public final void mCHARACTER_LITERAL() throws RecognitionException {
		try {
			int _type = CHARACTER_LITERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cpp.g:518:3: ( ( 'L' )? '\\'' ( EscapeSequence |~ ( '\\'' | '\\\\' ) ) '\\'' )
			// Cpp.g:518:5: ( 'L' )? '\\'' ( EscapeSequence |~ ( '\\'' | '\\\\' ) ) '\\''
			{
			// Cpp.g:518:5: ( 'L' )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0=='L') ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// Cpp.g:518:6: 'L'
					{
					match('L'); if (state.failed) return;
					}
					break;

			}

			match('\''); if (state.failed) return;
			// Cpp.g:518:17: ( EscapeSequence |~ ( '\\'' | '\\\\' ) )
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0=='\\') ) {
				alt12=1;
			}
			else if ( ((LA12_0 >= '\u0000' && LA12_0 <= '&')||(LA12_0 >= '(' && LA12_0 <= '[')||(LA12_0 >= ']' && LA12_0 <= '\uFFFF')) ) {
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
					// Cpp.g:518:19: EscapeSequence
					{
					mEscapeSequence(); if (state.failed) return;

					}
					break;
				case 2 :
					// Cpp.g:518:36: ~ ( '\\'' | '\\\\' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			match('\''); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHARACTER_LITERAL"

	// $ANTLR start "STRING_LITERAL"
	public final void mSTRING_LITERAL() throws RecognitionException {
		try {
			int _type = STRING_LITERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cpp.g:523:3: ( '\"' ( EscapeSequence |~ ( '\"' ) )* '\"' )
			// Cpp.g:523:5: '\"' ( EscapeSequence |~ ( '\"' ) )* '\"'
			{
			match('\"'); if (state.failed) return;
			// Cpp.g:523:9: ( EscapeSequence |~ ( '\"' ) )*
			loop13:
			while (true) {
				int alt13=3;
				int LA13_0 = input.LA(1);
				if ( (LA13_0=='\\') ) {
					int LA13_2 = input.LA(2);
					if ( (LA13_2=='\"') ) {
						int LA13_4 = input.LA(3);
						if ( ((LA13_4 >= '\u0000' && LA13_4 <= '\uFFFF')) ) {
							alt13=1;
						}
						else {
							alt13=2;
						}

					}
					else if ( (LA13_2=='x') ) {
						int LA13_5 = input.LA(3);
						if ( ((LA13_5 >= '0' && LA13_5 <= '9')||(LA13_5 >= 'A' && LA13_5 <= 'F')||(LA13_5 >= 'a' && LA13_5 <= 'f')) ) {
							alt13=1;
						}
						else if ( ((LA13_5 >= '\u0000' && LA13_5 <= '/')||(LA13_5 >= ':' && LA13_5 <= '@')||(LA13_5 >= 'G' && LA13_5 <= '`')||(LA13_5 >= 'g' && LA13_5 <= '\uFFFF')) ) {
							alt13=2;
						}

					}
					else if ( ((LA13_2 >= '0' && LA13_2 <= '3')) ) {
						alt13=1;
					}
					else if ( ((LA13_2 >= '4' && LA13_2 <= '7')) ) {
						alt13=1;
					}
					else if ( (LA13_2=='\\') ) {
						alt13=1;
					}
					else if ( (LA13_2=='\''||LA13_2=='b'||LA13_2=='f'||LA13_2=='n'||LA13_2=='r'||LA13_2=='t'||LA13_2=='v') ) {
						alt13=1;
					}
					else if ( ((LA13_2 >= '\u0000' && LA13_2 <= '!')||(LA13_2 >= '#' && LA13_2 <= '&')||(LA13_2 >= '(' && LA13_2 <= '/')||(LA13_2 >= '8' && LA13_2 <= '[')||(LA13_2 >= ']' && LA13_2 <= 'a')||(LA13_2 >= 'c' && LA13_2 <= 'e')||(LA13_2 >= 'g' && LA13_2 <= 'm')||(LA13_2 >= 'o' && LA13_2 <= 'q')||LA13_2=='s'||LA13_2=='u'||LA13_2=='w'||(LA13_2 >= 'y' && LA13_2 <= '\uFFFF')) ) {
						alt13=2;
					}

				}
				else if ( ((LA13_0 >= '\u0000' && LA13_0 <= '!')||(LA13_0 >= '#' && LA13_0 <= '[')||(LA13_0 >= ']' && LA13_0 <= '\uFFFF')) ) {
					alt13=2;
				}

				switch (alt13) {
				case 1 :
					// Cpp.g:523:10: EscapeSequence
					{
					mEscapeSequence(); if (state.failed) return;

					}
					break;
				case 2 :
					// Cpp.g:523:27: ~ ( '\"' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop13;
				}
			}

			match('\"'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING_LITERAL"

	// $ANTLR start "HEX_LITERAL"
	public final void mHEX_LITERAL() throws RecognitionException {
		try {
			int _type = HEX_LITERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cpp.g:527:3: ( '0' ( 'x' | 'X' ) ( HexDigit )+ ( IntegerTypeSuffix )? )
			// Cpp.g:527:5: '0' ( 'x' | 'X' ) ( HexDigit )+ ( IntegerTypeSuffix )?
			{
			match('0'); if (state.failed) return;
			if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// Cpp.g:527:19: ( HexDigit )+
			int cnt14=0;
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( ((LA14_0 >= '0' && LA14_0 <= '9')||(LA14_0 >= 'A' && LA14_0 <= 'F')||(LA14_0 >= 'a' && LA14_0 <= 'f')) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// Cpp.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt14 >= 1 ) break loop14;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(14, input);
					throw eee;
				}
				cnt14++;
			}

			// Cpp.g:527:29: ( IntegerTypeSuffix )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0=='L'||LA15_0=='U'||LA15_0=='l'||LA15_0=='u') ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// Cpp.g:527:29: IntegerTypeSuffix
					{
					mIntegerTypeSuffix(); if (state.failed) return;

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HEX_LITERAL"

	// $ANTLR start "DECIMAL_LITERAL"
	public final void mDECIMAL_LITERAL() throws RecognitionException {
		try {
			int _type = DECIMAL_LITERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cpp.g:531:3: ( ( '0' | '1' .. '9' ( '0' .. '9' )* ) ( IntegerTypeSuffix )? )
			// Cpp.g:531:5: ( '0' | '1' .. '9' ( '0' .. '9' )* ) ( IntegerTypeSuffix )?
			{
			// Cpp.g:531:5: ( '0' | '1' .. '9' ( '0' .. '9' )* )
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0=='0') ) {
				alt17=1;
			}
			else if ( ((LA17_0 >= '1' && LA17_0 <= '9')) ) {
				alt17=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}

			switch (alt17) {
				case 1 :
					// Cpp.g:531:6: '0'
					{
					match('0'); if (state.failed) return;
					}
					break;
				case 2 :
					// Cpp.g:531:12: '1' .. '9' ( '0' .. '9' )*
					{
					matchRange('1','9'); if (state.failed) return;
					// Cpp.g:531:21: ( '0' .. '9' )*
					loop16:
					while (true) {
						int alt16=2;
						int LA16_0 = input.LA(1);
						if ( ((LA16_0 >= '0' && LA16_0 <= '9')) ) {
							alt16=1;
						}

						switch (alt16) {
						case 1 :
							// Cpp.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
								state.failed=false;
							}
							else {
								if (state.backtracking>0) {state.failed=true; return;}
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop16;
						}
					}

					}
					break;

			}

			// Cpp.g:531:32: ( IntegerTypeSuffix )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0=='L'||LA18_0=='U'||LA18_0=='l'||LA18_0=='u') ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// Cpp.g:531:32: IntegerTypeSuffix
					{
					mIntegerTypeSuffix(); if (state.failed) return;

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DECIMAL_LITERAL"

	// $ANTLR start "OCTAL_LITERAL"
	public final void mOCTAL_LITERAL() throws RecognitionException {
		try {
			int _type = OCTAL_LITERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cpp.g:535:3: ( '0' ( '0' .. '7' )+ ( IntegerTypeSuffix )? )
			// Cpp.g:535:5: '0' ( '0' .. '7' )+ ( IntegerTypeSuffix )?
			{
			match('0'); if (state.failed) return;
			// Cpp.g:535:9: ( '0' .. '7' )+
			int cnt19=0;
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( ((LA19_0 >= '0' && LA19_0 <= '7')) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// Cpp.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt19 >= 1 ) break loop19;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(19, input);
					throw eee;
				}
				cnt19++;
			}

			// Cpp.g:535:21: ( IntegerTypeSuffix )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0=='L'||LA20_0=='U'||LA20_0=='l'||LA20_0=='u') ) {
				alt20=1;
			}
			switch (alt20) {
				case 1 :
					// Cpp.g:535:21: IntegerTypeSuffix
					{
					mIntegerTypeSuffix(); if (state.failed) return;

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OCTAL_LITERAL"

	// $ANTLR start "HexDigit"
	public final void mHexDigit() throws RecognitionException {
		try {
			// Cpp.g:539:3: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
			// Cpp.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HexDigit"

	// $ANTLR start "IntegerTypeSuffix"
	public final void mIntegerTypeSuffix() throws RecognitionException {
		try {
			// Cpp.g:543:3: ( 'u' | 'ul' | 'U' | 'UL' | 'l' | 'L' )
			int alt21=6;
			switch ( input.LA(1) ) {
			case 'u':
				{
				int LA21_1 = input.LA(2);
				if ( (LA21_1=='l') ) {
					alt21=2;
				}

				else {
					alt21=1;
				}

				}
				break;
			case 'U':
				{
				int LA21_2 = input.LA(2);
				if ( (LA21_2=='L') ) {
					alt21=4;
				}

				else {
					alt21=3;
				}

				}
				break;
			case 'l':
				{
				alt21=5;
				}
				break;
			case 'L':
				{
				alt21=6;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}
			switch (alt21) {
				case 1 :
					// Cpp.g:543:5: 'u'
					{
					match('u'); if (state.failed) return;
					}
					break;
				case 2 :
					// Cpp.g:543:11: 'ul'
					{
					match("ul"); if (state.failed) return;

					}
					break;
				case 3 :
					// Cpp.g:543:18: 'U'
					{
					match('U'); if (state.failed) return;
					}
					break;
				case 4 :
					// Cpp.g:543:24: 'UL'
					{
					match("UL"); if (state.failed) return;

					}
					break;
				case 5 :
					// Cpp.g:543:31: 'l'
					{
					match('l'); if (state.failed) return;
					}
					break;
				case 6 :
					// Cpp.g:543:37: 'L'
					{
					match('L'); if (state.failed) return;
					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IntegerTypeSuffix"

	// $ANTLR start "FLOATING_POINT_LITERAL"
	public final void mFLOATING_POINT_LITERAL() throws RecognitionException {
		try {
			int _type = FLOATING_POINT_LITERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cpp.g:547:3: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( Exponent )? ( FloatTypeSuffix )? | '.' ( '0' .. '9' )+ ( Exponent )? ( FloatTypeSuffix )? | ( '0' .. '9' )+ Exponent ( FloatTypeSuffix )? | ( '0' .. '9' )+ FloatTypeSuffix )
			int alt32=4;
			alt32 = dfa32.predict(input);
			switch (alt32) {
				case 1 :
					// Cpp.g:547:5: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( Exponent )? ( FloatTypeSuffix )?
					{
					// Cpp.g:547:5: ( '0' .. '9' )+
					int cnt22=0;
					loop22:
					while (true) {
						int alt22=2;
						int LA22_0 = input.LA(1);
						if ( ((LA22_0 >= '0' && LA22_0 <= '9')) ) {
							alt22=1;
						}

						switch (alt22) {
						case 1 :
							// Cpp.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
								state.failed=false;
							}
							else {
								if (state.backtracking>0) {state.failed=true; return;}
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt22 >= 1 ) break loop22;
							if (state.backtracking>0) {state.failed=true; return;}
							EarlyExitException eee = new EarlyExitException(22, input);
							throw eee;
						}
						cnt22++;
					}

					match('.'); if (state.failed) return;
					// Cpp.g:547:21: ( '0' .. '9' )*
					loop23:
					while (true) {
						int alt23=2;
						int LA23_0 = input.LA(1);
						if ( ((LA23_0 >= '0' && LA23_0 <= '9')) ) {
							alt23=1;
						}

						switch (alt23) {
						case 1 :
							// Cpp.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
								state.failed=false;
							}
							else {
								if (state.backtracking>0) {state.failed=true; return;}
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop23;
						}
					}

					// Cpp.g:547:33: ( Exponent )?
					int alt24=2;
					int LA24_0 = input.LA(1);
					if ( (LA24_0=='E'||LA24_0=='e') ) {
						alt24=1;
					}
					switch (alt24) {
						case 1 :
							// Cpp.g:547:33: Exponent
							{
							mExponent(); if (state.failed) return;

							}
							break;

					}

					// Cpp.g:547:43: ( FloatTypeSuffix )?
					int alt25=2;
					int LA25_0 = input.LA(1);
					if ( (LA25_0=='D'||LA25_0=='F'||LA25_0=='d'||LA25_0=='f') ) {
						alt25=1;
					}
					switch (alt25) {
						case 1 :
							// Cpp.g:
							{
							if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='d'||input.LA(1)=='f' ) {
								input.consume();
								state.failed=false;
							}
							else {
								if (state.backtracking>0) {state.failed=true; return;}
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					}
					break;
				case 2 :
					// Cpp.g:548:5: '.' ( '0' .. '9' )+ ( Exponent )? ( FloatTypeSuffix )?
					{
					match('.'); if (state.failed) return;
					// Cpp.g:548:9: ( '0' .. '9' )+
					int cnt26=0;
					loop26:
					while (true) {
						int alt26=2;
						int LA26_0 = input.LA(1);
						if ( ((LA26_0 >= '0' && LA26_0 <= '9')) ) {
							alt26=1;
						}

						switch (alt26) {
						case 1 :
							// Cpp.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
								state.failed=false;
							}
							else {
								if (state.backtracking>0) {state.failed=true; return;}
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt26 >= 1 ) break loop26;
							if (state.backtracking>0) {state.failed=true; return;}
							EarlyExitException eee = new EarlyExitException(26, input);
							throw eee;
						}
						cnt26++;
					}

					// Cpp.g:548:21: ( Exponent )?
					int alt27=2;
					int LA27_0 = input.LA(1);
					if ( (LA27_0=='E'||LA27_0=='e') ) {
						alt27=1;
					}
					switch (alt27) {
						case 1 :
							// Cpp.g:548:21: Exponent
							{
							mExponent(); if (state.failed) return;

							}
							break;

					}

					// Cpp.g:548:31: ( FloatTypeSuffix )?
					int alt28=2;
					int LA28_0 = input.LA(1);
					if ( (LA28_0=='D'||LA28_0=='F'||LA28_0=='d'||LA28_0=='f') ) {
						alt28=1;
					}
					switch (alt28) {
						case 1 :
							// Cpp.g:
							{
							if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='d'||input.LA(1)=='f' ) {
								input.consume();
								state.failed=false;
							}
							else {
								if (state.backtracking>0) {state.failed=true; return;}
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					}
					break;
				case 3 :
					// Cpp.g:549:5: ( '0' .. '9' )+ Exponent ( FloatTypeSuffix )?
					{
					// Cpp.g:549:5: ( '0' .. '9' )+
					int cnt29=0;
					loop29:
					while (true) {
						int alt29=2;
						int LA29_0 = input.LA(1);
						if ( ((LA29_0 >= '0' && LA29_0 <= '9')) ) {
							alt29=1;
						}

						switch (alt29) {
						case 1 :
							// Cpp.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
								state.failed=false;
							}
							else {
								if (state.backtracking>0) {state.failed=true; return;}
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt29 >= 1 ) break loop29;
							if (state.backtracking>0) {state.failed=true; return;}
							EarlyExitException eee = new EarlyExitException(29, input);
							throw eee;
						}
						cnt29++;
					}

					mExponent(); if (state.failed) return;

					// Cpp.g:549:26: ( FloatTypeSuffix )?
					int alt30=2;
					int LA30_0 = input.LA(1);
					if ( (LA30_0=='D'||LA30_0=='F'||LA30_0=='d'||LA30_0=='f') ) {
						alt30=1;
					}
					switch (alt30) {
						case 1 :
							// Cpp.g:
							{
							if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='d'||input.LA(1)=='f' ) {
								input.consume();
								state.failed=false;
							}
							else {
								if (state.backtracking>0) {state.failed=true; return;}
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					}
					break;
				case 4 :
					// Cpp.g:550:5: ( '0' .. '9' )+ FloatTypeSuffix
					{
					// Cpp.g:550:5: ( '0' .. '9' )+
					int cnt31=0;
					loop31:
					while (true) {
						int alt31=2;
						int LA31_0 = input.LA(1);
						if ( ((LA31_0 >= '0' && LA31_0 <= '9')) ) {
							alt31=1;
						}

						switch (alt31) {
						case 1 :
							// Cpp.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
								state.failed=false;
							}
							else {
								if (state.backtracking>0) {state.failed=true; return;}
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt31 >= 1 ) break loop31;
							if (state.backtracking>0) {state.failed=true; return;}
							EarlyExitException eee = new EarlyExitException(31, input);
							throw eee;
						}
						cnt31++;
					}

					mFloatTypeSuffix(); if (state.failed) return;

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOATING_POINT_LITERAL"

	// $ANTLR start "Exponent"
	public final void mExponent() throws RecognitionException {
		try {
			// Cpp.g:554:3: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
			// Cpp.g:554:5: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
			{
			if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// Cpp.g:554:15: ( '+' | '-' )?
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( (LA33_0=='+'||LA33_0=='-') ) {
				alt33=1;
			}
			switch (alt33) {
				case 1 :
					// Cpp.g:
					{
					if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			// Cpp.g:554:26: ( '0' .. '9' )+
			int cnt34=0;
			loop34:
			while (true) {
				int alt34=2;
				int LA34_0 = input.LA(1);
				if ( ((LA34_0 >= '0' && LA34_0 <= '9')) ) {
					alt34=1;
				}

				switch (alt34) {
				case 1 :
					// Cpp.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt34 >= 1 ) break loop34;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(34, input);
					throw eee;
				}
				cnt34++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Exponent"

	// $ANTLR start "FloatTypeSuffix"
	public final void mFloatTypeSuffix() throws RecognitionException {
		try {
			// Cpp.g:558:3: ( ( 'f' | 'F' | 'd' | 'D' ) )
			// Cpp.g:
			{
			if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='d'||input.LA(1)=='f' ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FloatTypeSuffix"

	// $ANTLR start "EscapeSequence"
	public final void mEscapeSequence() throws RecognitionException {
		try {
			// Cpp.g:562:3: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'v' | '\\\"' | '\\'' | '\\\\' ) | '\\\\' 'x' ( HexDigit )+ | OctalEscape )
			int alt36=3;
			int LA36_0 = input.LA(1);
			if ( (LA36_0=='\\') ) {
				switch ( input.LA(2) ) {
				case '\"':
				case '\'':
				case '\\':
				case 'b':
				case 'f':
				case 'n':
				case 'r':
				case 't':
				case 'v':
					{
					alt36=1;
					}
					break;
				case 'x':
					{
					alt36=2;
					}
					break;
				case '0':
				case '1':
				case '2':
				case '3':
				case '4':
				case '5':
				case '6':
				case '7':
					{
					alt36=3;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 36, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 36, 0, input);
				throw nvae;
			}

			switch (alt36) {
				case 1 :
					// Cpp.g:562:6: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'v' | '\\\"' | '\\'' | '\\\\' )
					{
					match('\\'); if (state.failed) return;
					if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t'||input.LA(1)=='v' ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// Cpp.g:563:5: '\\\\' 'x' ( HexDigit )+
					{
					match('\\'); if (state.failed) return;
					match('x'); if (state.failed) return;
					// Cpp.g:563:14: ( HexDigit )+
					int cnt35=0;
					loop35:
					while (true) {
						int alt35=2;
						int LA35_0 = input.LA(1);
						if ( ((LA35_0 >= '0' && LA35_0 <= '9')||(LA35_0 >= 'A' && LA35_0 <= 'F')||(LA35_0 >= 'a' && LA35_0 <= 'f')) ) {
							alt35=1;
						}

						switch (alt35) {
						case 1 :
							// Cpp.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
								input.consume();
								state.failed=false;
							}
							else {
								if (state.backtracking>0) {state.failed=true; return;}
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt35 >= 1 ) break loop35;
							if (state.backtracking>0) {state.failed=true; return;}
							EarlyExitException eee = new EarlyExitException(35, input);
							throw eee;
						}
						cnt35++;
					}

					}
					break;
				case 3 :
					// Cpp.g:564:7: OctalEscape
					{
					mOctalEscape(); if (state.failed) return;

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EscapeSequence"

	// $ANTLR start "OctalEscape"
	public final void mOctalEscape() throws RecognitionException {
		try {
			// Cpp.g:568:3: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
			int alt37=3;
			int LA37_0 = input.LA(1);
			if ( (LA37_0=='\\') ) {
				int LA37_1 = input.LA(2);
				if ( ((LA37_1 >= '0' && LA37_1 <= '3')) ) {
					int LA37_2 = input.LA(3);
					if ( ((LA37_2 >= '0' && LA37_2 <= '7')) ) {
						int LA37_4 = input.LA(4);
						if ( ((LA37_4 >= '0' && LA37_4 <= '7')) ) {
							alt37=1;
						}

						else {
							alt37=2;
						}

					}

					else {
						alt37=3;
					}

				}
				else if ( ((LA37_1 >= '4' && LA37_1 <= '7')) ) {
					int LA37_3 = input.LA(3);
					if ( ((LA37_3 >= '0' && LA37_3 <= '7')) ) {
						alt37=2;
					}

					else {
						alt37=3;
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 37, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 37, 0, input);
				throw nvae;
			}

			switch (alt37) {
				case 1 :
					// Cpp.g:568:5: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
					{
					match('\\'); if (state.failed) return;
					if ( (input.LA(1) >= '0' && input.LA(1) <= '3') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// Cpp.g:569:5: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
					{
					match('\\'); if (state.failed) return;
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 3 :
					// Cpp.g:570:5: '\\\\' ( '0' .. '7' )
					{
					match('\\'); if (state.failed) return;
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OctalEscape"

	// $ANTLR start "UnicodeEscape"
	public final void mUnicodeEscape() throws RecognitionException {
		try {
			// Cpp.g:574:3: ( '\\\\' 'u' HexDigit HexDigit HexDigit HexDigit )
			// Cpp.g:574:5: '\\\\' 'u' HexDigit HexDigit HexDigit HexDigit
			{
			match('\\'); if (state.failed) return;
			match('u'); if (state.failed) return;
			mHexDigit(); if (state.failed) return;

			mHexDigit(); if (state.failed) return;

			mHexDigit(); if (state.failed) return;

			mHexDigit(); if (state.failed) return;

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UnicodeEscape"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cpp.g:578:3: ( '/*' ( options {greedy=false; } : . )* '*/' | '/' '\\\\' '\\n' '*' ( options {greedy=false; } : . )* '*/' )
			int alt40=2;
			int LA40_0 = input.LA(1);
			if ( (LA40_0=='/') ) {
				int LA40_1 = input.LA(2);
				if ( (LA40_1=='*') ) {
					alt40=1;
				}
				else if ( (LA40_1=='\\') ) {
					alt40=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 40, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 40, 0, input);
				throw nvae;
			}

			switch (alt40) {
				case 1 :
					// Cpp.g:578:5: '/*' ( options {greedy=false; } : . )* '*/'
					{
					match("/*"); if (state.failed) return;

					// Cpp.g:578:11: ( options {greedy=false; } : . )*
					loop38:
					while (true) {
						int alt38=2;
						int LA38_0 = input.LA(1);
						if ( (LA38_0=='*') ) {
							int LA38_1 = input.LA(2);
							if ( (LA38_1=='/') ) {
								alt38=2;
							}
							else if ( ((LA38_1 >= '\u0000' && LA38_1 <= '.')||(LA38_1 >= '0' && LA38_1 <= '\uFFFF')) ) {
								alt38=1;
							}

						}
						else if ( ((LA38_0 >= '\u0000' && LA38_0 <= ')')||(LA38_0 >= '+' && LA38_0 <= '\uFFFF')) ) {
							alt38=1;
						}

						switch (alt38) {
						case 1 :
							// Cpp.g:578:37: .
							{
							matchAny(); if (state.failed) return;
							}
							break;

						default :
							break loop38;
						}
					}

					match("*/"); if (state.failed) return;

					if ( state.backtracking==0 ) {_channel=99;}
					}
					break;
				case 2 :
					// Cpp.g:579:5: '/' '\\\\' '\\n' '*' ( options {greedy=false; } : . )* '*/'
					{
					match('/'); if (state.failed) return;
					match('\\'); if (state.failed) return;
					match('\n'); if (state.failed) return;
					match('*'); if (state.failed) return;
					// Cpp.g:579:24: ( options {greedy=false; } : . )*
					loop39:
					while (true) {
						int alt39=2;
						int LA39_0 = input.LA(1);
						if ( (LA39_0=='*') ) {
							int LA39_1 = input.LA(2);
							if ( (LA39_1=='/') ) {
								alt39=2;
							}
							else if ( ((LA39_1 >= '\u0000' && LA39_1 <= '.')||(LA39_1 >= '0' && LA39_1 <= '\uFFFF')) ) {
								alt39=1;
							}

						}
						else if ( ((LA39_0 >= '\u0000' && LA39_0 <= ')')||(LA39_0 >= '+' && LA39_0 <= '\uFFFF')) ) {
							alt39=1;
						}

						switch (alt39) {
						case 1 :
							// Cpp.g:579:50: .
							{
							matchAny(); if (state.failed) return;
							}
							break;

						default :
							break loop39;
						}
					}

					match("*/"); if (state.failed) return;

					if ( state.backtracking==0 ) {_channel=99;}
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	// $ANTLR start "LINE_COMMENT"
	public final void mLINE_COMMENT() throws RecognitionException {
		try {
			int _type = LINE_COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cpp.g:583:3: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
			// Cpp.g:583:5: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
			{
			match("//"); if (state.failed) return;

			// Cpp.g:583:10: (~ ( '\\n' | '\\r' ) )*
			loop41:
			while (true) {
				int alt41=2;
				int LA41_0 = input.LA(1);
				if ( ((LA41_0 >= '\u0000' && LA41_0 <= '\t')||(LA41_0 >= '\u000B' && LA41_0 <= '\f')||(LA41_0 >= '\u000E' && LA41_0 <= '\uFFFF')) ) {
					alt41=1;
				}

				switch (alt41) {
				case 1 :
					// Cpp.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop41;
				}
			}

			// Cpp.g:583:24: ( '\\r' )?
			int alt42=2;
			int LA42_0 = input.LA(1);
			if ( (LA42_0=='\r') ) {
				alt42=1;
			}
			switch (alt42) {
				case 1 :
					// Cpp.g:583:24: '\\r'
					{
					match('\r'); if (state.failed) return;
					}
					break;

			}

			match('\n'); if (state.failed) return;
			if ( state.backtracking==0 ) {
						if(!inDirective)
						{
							try{					
									if(input.LT(1) != '#' && input.LT(1) != -1 )
									{
										_type = TEXT_END;
									}
									else
									{
										_type = End;
									}
							}
							catch(Exception e)
							{
								_type = End;
							}
							if(inFileInclusion)_type=End;
						}
						else
						{
							 _type=End;
						}

						inDirective=false;
						inDefineMode=false;
						discardSpace = true;
						inFileInclusion=false;
					}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LINE_COMMENT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cpp.g:616:5: ( ( ' ' | '\\r' | '\\t' | '\\f' )+ )
			// Cpp.g:617:3: ( ' ' | '\\r' | '\\t' | '\\f' )+
			{
			if ( state.backtracking==0 ) { 
						if( this.getLine() != 1)
						{
							if(input.LA(-1) == '\n')
								ltoken = End;
							else
								ltoken = input.LA(-1);
						}
						else
						{
							try
							{
								if(input.LA(-1) == '\n')
									ltoken = End;
								else
									ltoken = input.LA(-1);	
							}
							catch (Exception e)
							{
								ltoken = End;
							}
						}

					}
			// Cpp.g:641:3: ( ' ' | '\\r' | '\\t' | '\\f' )+
			int cnt43=0;
			loop43:
			while (true) {
				int alt43=2;
				int LA43_0 = input.LA(1);
				if ( (LA43_0=='\t'||(LA43_0 >= '\f' && LA43_0 <= '\r')||LA43_0==' ') ) {
					alt43=1;
				}

				switch (alt43) {
				case 1 :
					// Cpp.g:
					{
					if ( input.LA(1)=='\t'||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt43 >= 1 ) break loop43;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(43, input);
					throw eee;
				}
				cnt43++;
			}

			if ( state.backtracking==0 ) {			 
						if(inDirective ==  true)
						{
							if(discardSpace == true)
							{
								_channel = 99;
							}
							else
							{
								_type = WS;
							}
						}
						else
						{
							if(!inDefineMode)
							{
								try
								{
									if(input.LA(1) != EOF  && input.LA(1) == '#' &&   ltoken == End )
									{
										_type = End;
									}
								}
								catch (Exception e)
								{
									_channel = 99;
								}
							}
						}
					}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "End"
	public final void mEnd() throws RecognitionException {
		try {
			int _type = End;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cpp.g:676:6: ( ( WS )? '\\n' )
			// Cpp.g:676:8: ( WS )? '\\n'
			{
			// Cpp.g:676:8: ( WS )?
			int alt44=2;
			int LA44_0 = input.LA(1);
			if ( (LA44_0=='\t'||(LA44_0 >= '\f' && LA44_0 <= '\r')||LA44_0==' ') ) {
				alt44=1;
			}
			switch (alt44) {
				case 1 :
					// Cpp.g:676:8: WS
					{
					mWS(); if (state.failed) return;

					}
					break;

			}

			match('\n'); if (state.failed) return;
			if ( state.backtracking==0 ) {
						if(!inDirective)
						{
							if(inDefineMode||inFileInclusion) 
							{
								_type=End;
							}
							else
							{
									try{					
											if(input.LT(1) != '#' && input.LT(1) != -1 )
											{
												_type = TEXT_END;
											}
									}
									catch(Exception e)
									{
										_type = End;
									}
							}
						} else {_type=End;}
						ltoken =End;	
						inDirective=false;
						inDefineMode=false;
						inFileInclusion=false;
						discardSpace=true;
					}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "End"

	// $ANTLR start "ESCAPED_NEWLINE"
	public final void mESCAPED_NEWLINE() throws RecognitionException {
		try {
			int _type = ESCAPED_NEWLINE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cpp.g:707:3: ( ( '\\\\\\n' | '\\\\\\r\\n' ) )
			// Cpp.g:707:5: ( '\\\\\\n' | '\\\\\\r\\n' )
			{
			// Cpp.g:707:5: ( '\\\\\\n' | '\\\\\\r\\n' )
			int alt45=2;
			int LA45_0 = input.LA(1);
			if ( (LA45_0=='\\') ) {
				int LA45_1 = input.LA(2);
				if ( (LA45_1=='\n') ) {
					alt45=1;
				}
				else if ( (LA45_1=='\r') ) {
					alt45=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 45, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 45, 0, input);
				throw nvae;
			}

			switch (alt45) {
				case 1 :
					// Cpp.g:707:6: '\\\\\\n'
					{
					match("\\\n"); if (state.failed) return;

					}
					break;
				case 2 :
					// Cpp.g:707:15: '\\\\\\r\\n'
					{
					match("\\\r\n"); if (state.failed) return;

					}
					break;

			}

			if ( state.backtracking==0 ) {
						_channel=99;
					}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ESCAPED_NEWLINE"

	// $ANTLR start "AT"
	public final void mAT() throws RecognitionException {
		try {
			int _type = AT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cpp.g:713:3: ( '@' )
			// Cpp.g:713:4: '@'
			{
			match('@'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AT"

	// $ANTLR start "BS"
	public final void mBS() throws RecognitionException {
		try {
			int _type = BS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cpp.g:714:3: ( '\\\\' )
			// Cpp.g:714:4: '\\\\'
			{
			match('\\'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BS"

	// $ANTLR start "COPERATOR"
	public final void mCOPERATOR() throws RecognitionException {
		try {
			int _type = COPERATOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cpp.g:717:3: ({...}? ( COLON | QUESTIONMARK | POINTERTO | LCURLY | RCURLY | LSQUARE | RSQUARE | STAR | EQUAL | NOTEQUAL | LESSTHANOREQUALTO | LESSTHAN | GREATERTHANOREQUALTO | GREATERTHAN | DIVIDE | PLUSPLUS | MINUSMINUS | MOD | SHIFTRIGHT | SHIFTLEFT | AND | OR | BITWISEOR | BITWISEXOR | DOT | POINTERTOMBR | DOTMBR | SCOPE | AMPERSAND | PLUS | MINUS | TILDE | ASSIGNEQUAL | TIMESEQUAL | DIVIDEEQUAL | MODEQUAL | PLUSEQUAL | MINUSEQUAL | SHIFTLEFTEQUAL | SHIFTRIGHTEQUAL | BITWISEANDEQUAL | BITWISEXOREQUAL | BITWISEOREQUAL | NOT | ELLIPSIS | AT | BS ) )
			// Cpp.g:717:7: {...}? ( COLON | QUESTIONMARK | POINTERTO | LCURLY | RCURLY | LSQUARE | RSQUARE | STAR | EQUAL | NOTEQUAL | LESSTHANOREQUALTO | LESSTHAN | GREATERTHANOREQUALTO | GREATERTHAN | DIVIDE | PLUSPLUS | MINUSMINUS | MOD | SHIFTRIGHT | SHIFTLEFT | AND | OR | BITWISEOR | BITWISEXOR | DOT | POINTERTOMBR | DOTMBR | SCOPE | AMPERSAND | PLUS | MINUS | TILDE | ASSIGNEQUAL | TIMESEQUAL | DIVIDEEQUAL | MODEQUAL | PLUSEQUAL | MINUSEQUAL | SHIFTLEFTEQUAL | SHIFTRIGHTEQUAL | BITWISEANDEQUAL | BITWISEXOREQUAL | BITWISEOREQUAL | NOT | ELLIPSIS | AT | BS )
			{
			if ( !((!inDirective)) ) {
				if (state.backtracking>0) {state.failed=true; return;}
				throw new FailedPredicateException(input, "COPERATOR", "!inDirective");
			}
			// Cpp.g:718:9: ( COLON | QUESTIONMARK | POINTERTO | LCURLY | RCURLY | LSQUARE | RSQUARE | STAR | EQUAL | NOTEQUAL | LESSTHANOREQUALTO | LESSTHAN | GREATERTHANOREQUALTO | GREATERTHAN | DIVIDE | PLUSPLUS | MINUSMINUS | MOD | SHIFTRIGHT | SHIFTLEFT | AND | OR | BITWISEOR | BITWISEXOR | DOT | POINTERTOMBR | DOTMBR | SCOPE | AMPERSAND | PLUS | MINUS | TILDE | ASSIGNEQUAL | TIMESEQUAL | DIVIDEEQUAL | MODEQUAL | PLUSEQUAL | MINUSEQUAL | SHIFTLEFTEQUAL | SHIFTRIGHTEQUAL | BITWISEANDEQUAL | BITWISEXOREQUAL | BITWISEOREQUAL | NOT | ELLIPSIS | AT | BS )
			int alt46=47;
			alt46 = dfa46.predict(input);
			switch (alt46) {
				case 1 :
					// Cpp.g:718:13: COLON
					{
					mCOLON(); if (state.failed) return;

					}
					break;
				case 2 :
					// Cpp.g:718:37: QUESTIONMARK
					{
					mQUESTIONMARK(); if (state.failed) return;

					}
					break;
				case 3 :
					// Cpp.g:719:13: POINTERTO
					{
					mPOINTERTO(); if (state.failed) return;

					}
					break;
				case 4 :
					// Cpp.g:719:27: LCURLY
					{
					mLCURLY(); if (state.failed) return;

					}
					break;
				case 5 :
					// Cpp.g:719:39: RCURLY
					{
					mRCURLY(); if (state.failed) return;

					}
					break;
				case 6 :
					// Cpp.g:720:5: LSQUARE
					{
					mLSQUARE(); if (state.failed) return;

					}
					break;
				case 7 :
					// Cpp.g:720:18: RSQUARE
					{
					mRSQUARE(); if (state.failed) return;

					}
					break;
				case 8 :
					// Cpp.g:720:39: STAR
					{
					mSTAR(); if (state.failed) return;

					}
					break;
				case 9 :
					// Cpp.g:721:13: EQUAL
					{
					mEQUAL(); if (state.failed) return;

					}
					break;
				case 10 :
					// Cpp.g:721:37: NOTEQUAL
					{
					mNOTEQUAL(); if (state.failed) return;

					}
					break;
				case 11 :
					// Cpp.g:721:61: LESSTHANOREQUALTO
					{
					mLESSTHANOREQUALTO(); if (state.failed) return;

					}
					break;
				case 12 :
					// Cpp.g:721:85: LESSTHAN
					{
					mLESSTHAN(); if (state.failed) return;

					}
					break;
				case 13 :
					// Cpp.g:722:13: GREATERTHANOREQUALTO
					{
					mGREATERTHANOREQUALTO(); if (state.failed) return;

					}
					break;
				case 14 :
					// Cpp.g:722:37: GREATERTHAN
					{
					mGREATERTHAN(); if (state.failed) return;

					}
					break;
				case 15 :
					// Cpp.g:722:61: DIVIDE
					{
					mDIVIDE(); if (state.failed) return;

					}
					break;
				case 16 :
					// Cpp.g:722:85: PLUSPLUS
					{
					mPLUSPLUS(); if (state.failed) return;

					}
					break;
				case 17 :
					// Cpp.g:723:13: MINUSMINUS
					{
					mMINUSMINUS(); if (state.failed) return;

					}
					break;
				case 18 :
					// Cpp.g:723:37: MOD
					{
					mMOD(); if (state.failed) return;

					}
					break;
				case 19 :
					// Cpp.g:723:61: SHIFTRIGHT
					{
					mSHIFTRIGHT(); if (state.failed) return;

					}
					break;
				case 20 :
					// Cpp.g:723:85: SHIFTLEFT
					{
					mSHIFTLEFT(); if (state.failed) return;

					}
					break;
				case 21 :
					// Cpp.g:724:13: AND
					{
					mAND(); if (state.failed) return;

					}
					break;
				case 22 :
					// Cpp.g:724:37: OR
					{
					mOR(); if (state.failed) return;

					}
					break;
				case 23 :
					// Cpp.g:724:61: BITWISEOR
					{
					mBITWISEOR(); if (state.failed) return;

					}
					break;
				case 24 :
					// Cpp.g:724:85: BITWISEXOR
					{
					mBITWISEXOR(); if (state.failed) return;

					}
					break;
				case 25 :
					// Cpp.g:725:13: DOT
					{
					mDOT(); if (state.failed) return;

					}
					break;
				case 26 :
					// Cpp.g:725:37: POINTERTOMBR
					{
					mPOINTERTOMBR(); if (state.failed) return;

					}
					break;
				case 27 :
					// Cpp.g:725:61: DOTMBR
					{
					mDOTMBR(); if (state.failed) return;

					}
					break;
				case 28 :
					// Cpp.g:725:85: SCOPE
					{
					mSCOPE(); if (state.failed) return;

					}
					break;
				case 29 :
					// Cpp.g:726:13: AMPERSAND
					{
					mAMPERSAND(); if (state.failed) return;

					}
					break;
				case 30 :
					// Cpp.g:726:37: PLUS
					{
					mPLUS(); if (state.failed) return;

					}
					break;
				case 31 :
					// Cpp.g:726:61: MINUS
					{
					mMINUS(); if (state.failed) return;

					}
					break;
				case 32 :
					// Cpp.g:727:13: TILDE
					{
					mTILDE(); if (state.failed) return;

					}
					break;
				case 33 :
					// Cpp.g:727:37: ASSIGNEQUAL
					{
					mASSIGNEQUAL(); if (state.failed) return;

					}
					break;
				case 34 :
					// Cpp.g:727:61: TIMESEQUAL
					{
					mTIMESEQUAL(); if (state.failed) return;

					}
					break;
				case 35 :
					// Cpp.g:727:85: DIVIDEEQUAL
					{
					mDIVIDEEQUAL(); if (state.failed) return;

					}
					break;
				case 36 :
					// Cpp.g:728:13: MODEQUAL
					{
					mMODEQUAL(); if (state.failed) return;

					}
					break;
				case 37 :
					// Cpp.g:728:37: PLUSEQUAL
					{
					mPLUSEQUAL(); if (state.failed) return;

					}
					break;
				case 38 :
					// Cpp.g:728:61: MINUSEQUAL
					{
					mMINUSEQUAL(); if (state.failed) return;

					}
					break;
				case 39 :
					// Cpp.g:728:85: SHIFTLEFTEQUAL
					{
					mSHIFTLEFTEQUAL(); if (state.failed) return;

					}
					break;
				case 40 :
					// Cpp.g:729:13: SHIFTRIGHTEQUAL
					{
					mSHIFTRIGHTEQUAL(); if (state.failed) return;

					}
					break;
				case 41 :
					// Cpp.g:729:37: BITWISEANDEQUAL
					{
					mBITWISEANDEQUAL(); if (state.failed) return;

					}
					break;
				case 42 :
					// Cpp.g:729:61: BITWISEXOREQUAL
					{
					mBITWISEXOREQUAL(); if (state.failed) return;

					}
					break;
				case 43 :
					// Cpp.g:729:85: BITWISEOREQUAL
					{
					mBITWISEOREQUAL(); if (state.failed) return;

					}
					break;
				case 44 :
					// Cpp.g:730:5: NOT
					{
					mNOT(); if (state.failed) return;

					}
					break;
				case 45 :
					// Cpp.g:730:15: ELLIPSIS
					{
					mELLIPSIS(); if (state.failed) return;

					}
					break;
				case 46 :
					// Cpp.g:731:4: AT
					{
					mAT(); if (state.failed) return;

					}
					break;
				case 47 :
					// Cpp.g:731:7: BS
					{
					mBS(); if (state.failed) return;

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COPERATOR"

	// $ANTLR start "CKEYWORD"
	public final void mCKEYWORD() throws RecognitionException {
		try {
			int _type = CKEYWORD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cpp.g:736:10: ({...}? 'typedef' | '__va_list__' | 'extern' | 'static' | 'auto' | 'register' | 'void' | 'char' | 'short' | 'int' | 'long' | 'float' | 'double' | 'signed' | 'unsigned' | '__fpreg' | '__float80' | 'struct' | 'union' | 'enum' | 'const' | 'volatile' | 'case' | 'default' | 'switch' | 'while' | 'do' | 'for' | 'goto' | 'continue' | 'break' | 'return' | 'if' | 'else' )
			int alt47=34;
			switch ( input.LA(1) ) {
			case 't':
				{
				alt47=1;
				}
				break;
			case '_':
				{
				int LA47_2 = input.LA(2);
				if ( (LA47_2=='_') ) {
					int LA47_17 = input.LA(3);
					if ( (LA47_17=='v') ) {
						alt47=2;
					}
					else if ( (LA47_17=='f') ) {
						int LA47_38 = input.LA(4);
						if ( (LA47_38=='p') ) {
							alt47=16;
						}
						else if ( (LA47_38=='l') ) {
							alt47=17;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 47, 38, input);
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
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 47, 17, input);
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
							new NoViableAltException("", 47, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'e':
				{
				switch ( input.LA(2) ) {
				case 'x':
					{
					alt47=3;
					}
					break;
				case 'n':
					{
					alt47=20;
					}
					break;
				case 'l':
					{
					alt47=34;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 47, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 's':
				{
				switch ( input.LA(2) ) {
				case 't':
					{
					int LA47_21 = input.LA(3);
					if ( (LA47_21=='a') ) {
						alt47=4;
					}
					else if ( (LA47_21=='r') ) {
						alt47=18;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 47, 21, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case 'h':
					{
					alt47=9;
					}
					break;
				case 'i':
					{
					alt47=14;
					}
					break;
				case 'w':
					{
					alt47=25;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 47, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'a':
				{
				alt47=5;
				}
				break;
			case 'r':
				{
				int LA47_6 = input.LA(2);
				if ( (LA47_6=='e') ) {
					int LA47_25 = input.LA(3);
					if ( (LA47_25=='g') ) {
						alt47=6;
					}
					else if ( (LA47_25=='t') ) {
						alt47=32;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 47, 25, input);
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
							new NoViableAltException("", 47, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'v':
				{
				int LA47_7 = input.LA(2);
				if ( (LA47_7=='o') ) {
					int LA47_26 = input.LA(3);
					if ( (LA47_26=='i') ) {
						alt47=7;
					}
					else if ( (LA47_26=='l') ) {
						alt47=22;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 47, 26, input);
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
							new NoViableAltException("", 47, 7, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'c':
				{
				switch ( input.LA(2) ) {
				case 'h':
					{
					alt47=8;
					}
					break;
				case 'o':
					{
					int LA47_28 = input.LA(3);
					if ( (LA47_28=='n') ) {
						int LA47_45 = input.LA(4);
						if ( (LA47_45=='s') ) {
							alt47=21;
						}
						else if ( (LA47_45=='t') ) {
							alt47=30;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 47, 45, input);
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
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 47, 28, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case 'a':
					{
					alt47=23;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 47, 8, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 'i':
				{
				int LA47_9 = input.LA(2);
				if ( (LA47_9=='n') ) {
					alt47=10;
				}
				else if ( (LA47_9=='f') ) {
					alt47=33;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 47, 9, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'l':
				{
				alt47=11;
				}
				break;
			case 'f':
				{
				int LA47_11 = input.LA(2);
				if ( (LA47_11=='l') ) {
					alt47=12;
				}
				else if ( (LA47_11=='o') ) {
					alt47=28;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 47, 11, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'd':
				{
				int LA47_12 = input.LA(2);
				if ( (LA47_12=='o') ) {
					int LA47_34 = input.LA(3);
					if ( (LA47_34=='u') ) {
						alt47=13;
					}

					else {
						alt47=27;
					}

				}
				else if ( (LA47_12=='e') ) {
					alt47=24;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 47, 12, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'u':
				{
				int LA47_13 = input.LA(2);
				if ( (LA47_13=='n') ) {
					int LA47_36 = input.LA(3);
					if ( (LA47_36=='s') ) {
						alt47=15;
					}
					else if ( (LA47_36=='i') ) {
						alt47=19;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 47, 36, input);
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
							new NoViableAltException("", 47, 13, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'w':
				{
				alt47=26;
				}
				break;
			case 'g':
				{
				alt47=29;
				}
				break;
			case 'b':
				{
				alt47=31;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 47, 0, input);
				throw nvae;
			}
			switch (alt47) {
				case 1 :
					// Cpp.g:736:12: {...}? 'typedef'
					{
					if ( !((!inDirective)) ) {
						if (state.backtracking>0) {state.failed=true; return;}
						throw new FailedPredicateException(input, "CKEYWORD", "!inDirective");
					}
					match("typedef"); if (state.failed) return;

					}
					break;
				case 2 :
					// Cpp.g:737:18: '__va_list__'
					{
					match("__va_list__"); if (state.failed) return;

					}
					break;
				case 3 :
					// Cpp.g:737:34: 'extern'
					{
					match("extern"); if (state.failed) return;

					}
					break;
				case 4 :
					// Cpp.g:737:45: 'static'
					{
					match("static"); if (state.failed) return;

					}
					break;
				case 5 :
					// Cpp.g:737:56: 'auto'
					{
					match("auto"); if (state.failed) return;

					}
					break;
				case 6 :
					// Cpp.g:737:66: 'register'
					{
					match("register"); if (state.failed) return;

					}
					break;
				case 7 :
					// Cpp.g:738:7: 'void'
					{
					match("void"); if (state.failed) return;

					}
					break;
				case 8 :
					// Cpp.g:738:18: 'char'
					{
					match("char"); if (state.failed) return;

					}
					break;
				case 9 :
					// Cpp.g:738:28: 'short'
					{
					match("short"); if (state.failed) return;

					}
					break;
				case 10 :
					// Cpp.g:738:38: 'int'
					{
					match("int"); if (state.failed) return;

					}
					break;
				case 11 :
					// Cpp.g:738:47: 'long'
					{
					match("long"); if (state.failed) return;

					}
					break;
				case 12 :
					// Cpp.g:738:57: 'float'
					{
					match("float"); if (state.failed) return;

					}
					break;
				case 13 :
					// Cpp.g:739:7: 'double'
					{
					match("double"); if (state.failed) return;

					}
					break;
				case 14 :
					// Cpp.g:739:18: 'signed'
					{
					match("signed"); if (state.failed) return;

					}
					break;
				case 15 :
					// Cpp.g:739:30: 'unsigned'
					{
					match("unsigned"); if (state.failed) return;

					}
					break;
				case 16 :
					// Cpp.g:739:42: '__fpreg'
					{
					match("__fpreg"); if (state.failed) return;

					}
					break;
				case 17 :
					// Cpp.g:739:54: '__float80'
					{
					match("__float80"); if (state.failed) return;

					}
					break;
				case 18 :
					// Cpp.g:739:69: 'struct'
					{
					match("struct"); if (state.failed) return;

					}
					break;
				case 19 :
					// Cpp.g:740:7: 'union'
					{
					match("union"); if (state.failed) return;

					}
					break;
				case 20 :
					// Cpp.g:740:18: 'enum'
					{
					match("enum"); if (state.failed) return;

					}
					break;
				case 21 :
					// Cpp.g:740:28: 'const'
					{
					match("const"); if (state.failed) return;

					}
					break;
				case 22 :
					// Cpp.g:740:38: 'volatile'
					{
					match("volatile"); if (state.failed) return;

					}
					break;
				case 23 :
					// Cpp.g:740:51: 'case'
					{
					match("case"); if (state.failed) return;

					}
					break;
				case 24 :
					// Cpp.g:740:62: 'default'
					{
					match("default"); if (state.failed) return;

					}
					break;
				case 25 :
					// Cpp.g:741:7: 'switch'
					{
					match("switch"); if (state.failed) return;

					}
					break;
				case 26 :
					// Cpp.g:741:18: 'while'
					{
					match("while"); if (state.failed) return;

					}
					break;
				case 27 :
					// Cpp.g:741:29: 'do'
					{
					match("do"); if (state.failed) return;

					}
					break;
				case 28 :
					// Cpp.g:741:38: 'for'
					{
					match("for"); if (state.failed) return;

					}
					break;
				case 29 :
					// Cpp.g:741:47: 'goto'
					{
					match("goto"); if (state.failed) return;

					}
					break;
				case 30 :
					// Cpp.g:741:57: 'continue'
					{
					match("continue"); if (state.failed) return;

					}
					break;
				case 31 :
					// Cpp.g:742:7: 'break'
					{
					match("break"); if (state.failed) return;

					}
					break;
				case 32 :
					// Cpp.g:742:18: 'return'
					{
					match("return"); if (state.failed) return;

					}
					break;
				case 33 :
					// Cpp.g:742:31: 'if'
					{
					match("if"); if (state.failed) return;

					}
					break;
				case 34 :
					// Cpp.g:742:40: 'else'
					{
					match("else"); if (state.failed) return;

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CKEYWORD"

	@Override
	public void mTokens() throws RecognitionException {
		// Cpp.g:1:8: ( STRING_OP | DIRECTIVE | SIZEOF | DEFINED | IDENTIFIER | SHARP | STRINGIFICATION | SHARPSHARP | ASSIGNEQUAL | COLON | COMMA | QUESTIONMARK | SEMICOLON | POINTERTO | LPAREN | RPAREN | LSQUARE | RSQUARE | LCURLY | RCURLY | EQUAL | NOTEQUAL | LESSTHANOREQUALTO | LESSTHAN | GREATERTHANOREQUALTO | GREATERTHAN | DIVIDE | DIVIDEEQUAL | PLUS | PLUSEQUAL | PLUSPLUS | MINUS | MINUSEQUAL | MINUSMINUS | STAR | TIMESEQUAL | MOD | MODEQUAL | SHIFTRIGHT | SHIFTRIGHTEQUAL | SHIFTLEFT | SHIFTLEFTEQUAL | AND | NOT | OR | AMPERSAND | BITWISEANDEQUAL | TILDE | BITWISEOR | BITWISEOREQUAL | BITWISEXOR | BITWISEXOREQUAL | DOT | POINTERTOMBR | DOTMBR | SCOPE | ELLIPSIS | LIB_FILE | CHARACTER_LITERAL | STRING_LITERAL | HEX_LITERAL | DECIMAL_LITERAL | OCTAL_LITERAL | FLOATING_POINT_LITERAL | COMMENT | LINE_COMMENT | WS | End | ESCAPED_NEWLINE | AT | BS | COPERATOR | CKEYWORD )
		int alt48=73;
		alt48 = dfa48.predict(input);
		switch (alt48) {
			case 1 :
				// Cpp.g:1:10: STRING_OP
				{
				mSTRING_OP(); if (state.failed) return;

				}
				break;
			case 2 :
				// Cpp.g:1:20: DIRECTIVE
				{
				mDIRECTIVE(); if (state.failed) return;

				}
				break;
			case 3 :
				// Cpp.g:1:30: SIZEOF
				{
				mSIZEOF(); if (state.failed) return;

				}
				break;
			case 4 :
				// Cpp.g:1:37: DEFINED
				{
				mDEFINED(); if (state.failed) return;

				}
				break;
			case 5 :
				// Cpp.g:1:45: IDENTIFIER
				{
				mIDENTIFIER(); if (state.failed) return;

				}
				break;
			case 6 :
				// Cpp.g:1:56: SHARP
				{
				mSHARP(); if (state.failed) return;

				}
				break;
			case 7 :
				// Cpp.g:1:62: STRINGIFICATION
				{
				mSTRINGIFICATION(); if (state.failed) return;

				}
				break;
			case 8 :
				// Cpp.g:1:78: SHARPSHARP
				{
				mSHARPSHARP(); if (state.failed) return;

				}
				break;
			case 9 :
				// Cpp.g:1:89: ASSIGNEQUAL
				{
				mASSIGNEQUAL(); if (state.failed) return;

				}
				break;
			case 10 :
				// Cpp.g:1:101: COLON
				{
				mCOLON(); if (state.failed) return;

				}
				break;
			case 11 :
				// Cpp.g:1:107: COMMA
				{
				mCOMMA(); if (state.failed) return;

				}
				break;
			case 12 :
				// Cpp.g:1:113: QUESTIONMARK
				{
				mQUESTIONMARK(); if (state.failed) return;

				}
				break;
			case 13 :
				// Cpp.g:1:126: SEMICOLON
				{
				mSEMICOLON(); if (state.failed) return;

				}
				break;
			case 14 :
				// Cpp.g:1:136: POINTERTO
				{
				mPOINTERTO(); if (state.failed) return;

				}
				break;
			case 15 :
				// Cpp.g:1:146: LPAREN
				{
				mLPAREN(); if (state.failed) return;

				}
				break;
			case 16 :
				// Cpp.g:1:153: RPAREN
				{
				mRPAREN(); if (state.failed) return;

				}
				break;
			case 17 :
				// Cpp.g:1:160: LSQUARE
				{
				mLSQUARE(); if (state.failed) return;

				}
				break;
			case 18 :
				// Cpp.g:1:168: RSQUARE
				{
				mRSQUARE(); if (state.failed) return;

				}
				break;
			case 19 :
				// Cpp.g:1:176: LCURLY
				{
				mLCURLY(); if (state.failed) return;

				}
				break;
			case 20 :
				// Cpp.g:1:183: RCURLY
				{
				mRCURLY(); if (state.failed) return;

				}
				break;
			case 21 :
				// Cpp.g:1:190: EQUAL
				{
				mEQUAL(); if (state.failed) return;

				}
				break;
			case 22 :
				// Cpp.g:1:196: NOTEQUAL
				{
				mNOTEQUAL(); if (state.failed) return;

				}
				break;
			case 23 :
				// Cpp.g:1:205: LESSTHANOREQUALTO
				{
				mLESSTHANOREQUALTO(); if (state.failed) return;

				}
				break;
			case 24 :
				// Cpp.g:1:223: LESSTHAN
				{
				mLESSTHAN(); if (state.failed) return;

				}
				break;
			case 25 :
				// Cpp.g:1:232: GREATERTHANOREQUALTO
				{
				mGREATERTHANOREQUALTO(); if (state.failed) return;

				}
				break;
			case 26 :
				// Cpp.g:1:253: GREATERTHAN
				{
				mGREATERTHAN(); if (state.failed) return;

				}
				break;
			case 27 :
				// Cpp.g:1:265: DIVIDE
				{
				mDIVIDE(); if (state.failed) return;

				}
				break;
			case 28 :
				// Cpp.g:1:272: DIVIDEEQUAL
				{
				mDIVIDEEQUAL(); if (state.failed) return;

				}
				break;
			case 29 :
				// Cpp.g:1:284: PLUS
				{
				mPLUS(); if (state.failed) return;

				}
				break;
			case 30 :
				// Cpp.g:1:289: PLUSEQUAL
				{
				mPLUSEQUAL(); if (state.failed) return;

				}
				break;
			case 31 :
				// Cpp.g:1:299: PLUSPLUS
				{
				mPLUSPLUS(); if (state.failed) return;

				}
				break;
			case 32 :
				// Cpp.g:1:308: MINUS
				{
				mMINUS(); if (state.failed) return;

				}
				break;
			case 33 :
				// Cpp.g:1:314: MINUSEQUAL
				{
				mMINUSEQUAL(); if (state.failed) return;

				}
				break;
			case 34 :
				// Cpp.g:1:325: MINUSMINUS
				{
				mMINUSMINUS(); if (state.failed) return;

				}
				break;
			case 35 :
				// Cpp.g:1:336: STAR
				{
				mSTAR(); if (state.failed) return;

				}
				break;
			case 36 :
				// Cpp.g:1:341: TIMESEQUAL
				{
				mTIMESEQUAL(); if (state.failed) return;

				}
				break;
			case 37 :
				// Cpp.g:1:352: MOD
				{
				mMOD(); if (state.failed) return;

				}
				break;
			case 38 :
				// Cpp.g:1:356: MODEQUAL
				{
				mMODEQUAL(); if (state.failed) return;

				}
				break;
			case 39 :
				// Cpp.g:1:365: SHIFTRIGHT
				{
				mSHIFTRIGHT(); if (state.failed) return;

				}
				break;
			case 40 :
				// Cpp.g:1:376: SHIFTRIGHTEQUAL
				{
				mSHIFTRIGHTEQUAL(); if (state.failed) return;

				}
				break;
			case 41 :
				// Cpp.g:1:392: SHIFTLEFT
				{
				mSHIFTLEFT(); if (state.failed) return;

				}
				break;
			case 42 :
				// Cpp.g:1:402: SHIFTLEFTEQUAL
				{
				mSHIFTLEFTEQUAL(); if (state.failed) return;

				}
				break;
			case 43 :
				// Cpp.g:1:417: AND
				{
				mAND(); if (state.failed) return;

				}
				break;
			case 44 :
				// Cpp.g:1:421: NOT
				{
				mNOT(); if (state.failed) return;

				}
				break;
			case 45 :
				// Cpp.g:1:425: OR
				{
				mOR(); if (state.failed) return;

				}
				break;
			case 46 :
				// Cpp.g:1:428: AMPERSAND
				{
				mAMPERSAND(); if (state.failed) return;

				}
				break;
			case 47 :
				// Cpp.g:1:438: BITWISEANDEQUAL
				{
				mBITWISEANDEQUAL(); if (state.failed) return;

				}
				break;
			case 48 :
				// Cpp.g:1:454: TILDE
				{
				mTILDE(); if (state.failed) return;

				}
				break;
			case 49 :
				// Cpp.g:1:460: BITWISEOR
				{
				mBITWISEOR(); if (state.failed) return;

				}
				break;
			case 50 :
				// Cpp.g:1:470: BITWISEOREQUAL
				{
				mBITWISEOREQUAL(); if (state.failed) return;

				}
				break;
			case 51 :
				// Cpp.g:1:485: BITWISEXOR
				{
				mBITWISEXOR(); if (state.failed) return;

				}
				break;
			case 52 :
				// Cpp.g:1:496: BITWISEXOREQUAL
				{
				mBITWISEXOREQUAL(); if (state.failed) return;

				}
				break;
			case 53 :
				// Cpp.g:1:512: DOT
				{
				mDOT(); if (state.failed) return;

				}
				break;
			case 54 :
				// Cpp.g:1:516: POINTERTOMBR
				{
				mPOINTERTOMBR(); if (state.failed) return;

				}
				break;
			case 55 :
				// Cpp.g:1:529: DOTMBR
				{
				mDOTMBR(); if (state.failed) return;

				}
				break;
			case 56 :
				// Cpp.g:1:536: SCOPE
				{
				mSCOPE(); if (state.failed) return;

				}
				break;
			case 57 :
				// Cpp.g:1:542: ELLIPSIS
				{
				mELLIPSIS(); if (state.failed) return;

				}
				break;
			case 58 :
				// Cpp.g:1:551: LIB_FILE
				{
				mLIB_FILE(); if (state.failed) return;

				}
				break;
			case 59 :
				// Cpp.g:1:560: CHARACTER_LITERAL
				{
				mCHARACTER_LITERAL(); if (state.failed) return;

				}
				break;
			case 60 :
				// Cpp.g:1:578: STRING_LITERAL
				{
				mSTRING_LITERAL(); if (state.failed) return;

				}
				break;
			case 61 :
				// Cpp.g:1:593: HEX_LITERAL
				{
				mHEX_LITERAL(); if (state.failed) return;

				}
				break;
			case 62 :
				// Cpp.g:1:605: DECIMAL_LITERAL
				{
				mDECIMAL_LITERAL(); if (state.failed) return;

				}
				break;
			case 63 :
				// Cpp.g:1:621: OCTAL_LITERAL
				{
				mOCTAL_LITERAL(); if (state.failed) return;

				}
				break;
			case 64 :
				// Cpp.g:1:635: FLOATING_POINT_LITERAL
				{
				mFLOATING_POINT_LITERAL(); if (state.failed) return;

				}
				break;
			case 65 :
				// Cpp.g:1:658: COMMENT
				{
				mCOMMENT(); if (state.failed) return;

				}
				break;
			case 66 :
				// Cpp.g:1:666: LINE_COMMENT
				{
				mLINE_COMMENT(); if (state.failed) return;

				}
				break;
			case 67 :
				// Cpp.g:1:679: WS
				{
				mWS(); if (state.failed) return;

				}
				break;
			case 68 :
				// Cpp.g:1:682: End
				{
				mEnd(); if (state.failed) return;

				}
				break;
			case 69 :
				// Cpp.g:1:686: ESCAPED_NEWLINE
				{
				mESCAPED_NEWLINE(); if (state.failed) return;

				}
				break;
			case 70 :
				// Cpp.g:1:702: AT
				{
				mAT(); if (state.failed) return;

				}
				break;
			case 71 :
				// Cpp.g:1:705: BS
				{
				mBS(); if (state.failed) return;

				}
				break;
			case 72 :
				// Cpp.g:1:708: COPERATOR
				{
				mCOPERATOR(); if (state.failed) return;

				}
				break;
			case 73 :
				// Cpp.g:1:718: CKEYWORD
				{
				mCKEYWORD(); if (state.failed) return;

				}
				break;

		}
	}

	// $ANTLR start synpred1_Cpp
	public final void synpred1_Cpp_fragment() throws RecognitionException {
		// Cpp.g:346:21: ( '/*' )
		// Cpp.g:346:22: '/*'
		{
		match("/*"); if (state.failed) return;

		}

	}
	// $ANTLR end synpred1_Cpp

	// $ANTLR start synpred2_Cpp
	public final void synpred2_Cpp_fragment() throws RecognitionException {
		// Cpp.g:347:17: ( '\\\\\\n' )
		// Cpp.g:347:18: '\\\\\\n'
		{
		match("\\\n"); if (state.failed) return;

		}

	}
	// $ANTLR end synpred2_Cpp

	// $ANTLR start synpred3_Cpp
	public final void synpred3_Cpp_fragment() throws RecognitionException {
		// Cpp.g:348:17: ( '\\\\\\r\\n' )
		// Cpp.g:348:18: '\\\\\\r\\n'
		{
		match("\\\r\n"); if (state.failed) return;

		}

	}
	// $ANTLR end synpred3_Cpp

	public final boolean synpred3_Cpp() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred3_Cpp_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred2_Cpp() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred2_Cpp_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred1_Cpp() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred1_Cpp_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}


	protected DFA8 dfa8 = new DFA8(this);
	protected DFA32 dfa32 = new DFA32(this);
	protected DFA46 dfa46 = new DFA46(this);
	protected DFA48 dfa48 = new DFA48(this);
	static final String DFA8_eotS =
		"\1\1\1\uffff\2\4\1\uffff\1\4\1\uffff\4\4\5\uffff\1\4";
	static final String DFA8_eofS =
		"\21\uffff";
	static final String DFA8_minS =
		"\1\0\1\uffff\1\52\1\12\1\uffff\6\0\3\uffff\3\0";
	static final String DFA8_maxS =
		"\1\uffff\1\uffff\1\52\1\12\1\uffff\1\uffff\1\0\4\uffff\3\uffff\2\0\1\uffff";
	static final String DFA8_acceptS =
		"\1\uffff\1\5\2\uffff\1\4\6\uffff\1\1\1\2\1\3\3\uffff";
	static final String DFA8_specialS =
		"\1\2\4\uffff\1\10\1\0\1\4\1\1\1\7\1\11\3\uffff\1\3\1\6\1\5}>";
	static final String[] DFA8_transitionS = {
			"\12\4\1\uffff\44\4\1\2\54\4\1\3\uffa3\4",
			"",
			"\1\5",
			"\1\6",
			"",
			"\12\12\1\13\37\12\1\7\4\12\1\10\54\12\1\11\uffa3\12",
			"\1\uffff",
			"\12\12\1\13\37\12\1\7\4\12\1\16\54\12\1\11\uffa3\12",
			"\12\12\1\13\37\12\1\17\4\12\1\10\54\12\1\11\uffa3\12",
			"\12\12\1\20\37\12\1\7\4\12\1\10\54\12\1\11\uffa3\12",
			"\12\12\1\13\37\12\1\7\4\12\1\10\54\12\1\11\uffa3\12",
			"",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"\12\12\1\13\37\12\1\7\4\12\1\10\54\12\1\11\uffa3\12"
	};

	static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
	static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
	static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
	static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
	static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
	static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
	static final short[][] DFA8_transition;

	static {
		int numStates = DFA8_transitionS.length;
		DFA8_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
		}
	}

	protected class DFA8 extends DFA {

		public DFA8(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 8;
			this.eot = DFA8_eot;
			this.eof = DFA8_eof;
			this.min = DFA8_min;
			this.max = DFA8_max;
			this.accept = DFA8_accept;
			this.special = DFA8_special;
			this.transition = DFA8_transition;
		}
		@Override
		public String getDescription() {
			return "()+ loopback of 346:17: ( ( '/*' )=> '/*' ( options {greedy=false; } : . )* '*/' | ( '\\\\\\n' )=> ( '\\\\\\n' ) | ( '\\\\\\r\\n' )=> ( '\\\\\\n' ) |~ '\\n' )+";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA8_6 = input.LA(1);
						 
						int index8_6 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred2_Cpp()) ) {s = 12;}
						else if ( (synpred3_Cpp()) ) {s = 13;}
						 
						input.seek(index8_6);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA8_8 = input.LA(1);
						 
						int index8_8 = input.index();
						input.rewind();
						s = -1;
						if ( (LA8_8=='*') ) {s = 15;}
						else if ( (LA8_8=='/') ) {s = 8;}
						else if ( (LA8_8=='\\') ) {s = 9;}
						else if ( ((LA8_8 >= '\u0000' && LA8_8 <= '\t')||(LA8_8 >= '\u000B' && LA8_8 <= ')')||(LA8_8 >= '+' && LA8_8 <= '.')||(LA8_8 >= '0' && LA8_8 <= '[')||(LA8_8 >= ']' && LA8_8 <= '\uFFFF')) ) {s = 10;}
						else if ( (LA8_8=='\n') && (synpred1_Cpp())) {s = 11;}
						else s = 4;
						 
						input.seek(index8_8);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA8_0 = input.LA(1);
						s = -1;
						if ( (LA8_0=='/') ) {s = 2;}
						else if ( (LA8_0=='\\') ) {s = 3;}
						else if ( ((LA8_0 >= '\u0000' && LA8_0 <= '\t')||(LA8_0 >= '\u000B' && LA8_0 <= '.')||(LA8_0 >= '0' && LA8_0 <= '[')||(LA8_0 >= ']' && LA8_0 <= '\uFFFF')) ) {s = 4;}
						else s = 1;
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA8_14 = input.LA(1);
						 
						int index8_14 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_Cpp()) ) {s = 11;}
						else if ( (true) ) {s = 4;}
						 
						input.seek(index8_14);
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA8_7 = input.LA(1);
						 
						int index8_7 = input.index();
						input.rewind();
						s = -1;
						if ( (LA8_7=='/') ) {s = 14;}
						else if ( (LA8_7=='*') ) {s = 7;}
						else if ( (LA8_7=='\\') ) {s = 9;}
						else if ( ((LA8_7 >= '\u0000' && LA8_7 <= '\t')||(LA8_7 >= '\u000B' && LA8_7 <= ')')||(LA8_7 >= '+' && LA8_7 <= '.')||(LA8_7 >= '0' && LA8_7 <= '[')||(LA8_7 >= ']' && LA8_7 <= '\uFFFF')) ) {s = 10;}
						else if ( (LA8_7=='\n') && (synpred1_Cpp())) {s = 11;}
						else s = 4;
						 
						input.seek(index8_7);
						if ( s>=0 ) return s;
						break;

					case 5 : 
						int LA8_16 = input.LA(1);
						 
						int index8_16 = input.index();
						input.rewind();
						s = -1;
						if ( (LA8_16=='/') ) {s = 8;}
						else if ( (LA8_16=='\\') ) {s = 9;}
						else if ( (LA8_16=='*') ) {s = 7;}
						else if ( ((LA8_16 >= '\u0000' && LA8_16 <= '\t')||(LA8_16 >= '\u000B' && LA8_16 <= ')')||(LA8_16 >= '+' && LA8_16 <= '.')||(LA8_16 >= '0' && LA8_16 <= '[')||(LA8_16 >= ']' && LA8_16 <= '\uFFFF')) ) {s = 10;}
						else if ( (LA8_16=='\n') && (synpred1_Cpp())) {s = 11;}
						else s = 4;
						 
						input.seek(index8_16);
						if ( s>=0 ) return s;
						break;

					case 6 : 
						int LA8_15 = input.LA(1);
						 
						int index8_15 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_Cpp()) ) {s = 11;}
						else if ( (true) ) {s = 4;}
						 
						input.seek(index8_15);
						if ( s>=0 ) return s;
						break;

					case 7 : 
						int LA8_9 = input.LA(1);
						s = -1;
						if ( (LA8_9=='\n') ) {s = 16;}
						else if ( (LA8_9=='*') ) {s = 7;}
						else if ( (LA8_9=='/') ) {s = 8;}
						else if ( (LA8_9=='\\') ) {s = 9;}
						else if ( ((LA8_9 >= '\u0000' && LA8_9 <= '\t')||(LA8_9 >= '\u000B' && LA8_9 <= ')')||(LA8_9 >= '+' && LA8_9 <= '.')||(LA8_9 >= '0' && LA8_9 <= '[')||(LA8_9 >= ']' && LA8_9 <= '\uFFFF')) ) {s = 10;}
						else s = 4;
						if ( s>=0 ) return s;
						break;

					case 8 : 
						int LA8_5 = input.LA(1);
						 
						int index8_5 = input.index();
						input.rewind();
						s = -1;
						if ( (LA8_5=='*') ) {s = 7;}
						else if ( (LA8_5=='/') ) {s = 8;}
						else if ( (LA8_5=='\\') ) {s = 9;}
						else if ( ((LA8_5 >= '\u0000' && LA8_5 <= '\t')||(LA8_5 >= '\u000B' && LA8_5 <= ')')||(LA8_5 >= '+' && LA8_5 <= '.')||(LA8_5 >= '0' && LA8_5 <= '[')||(LA8_5 >= ']' && LA8_5 <= '\uFFFF')) ) {s = 10;}
						else if ( (LA8_5=='\n') && (synpred1_Cpp())) {s = 11;}
						else s = 4;
						 
						input.seek(index8_5);
						if ( s>=0 ) return s;
						break;

					case 9 : 
						int LA8_10 = input.LA(1);
						 
						int index8_10 = input.index();
						input.rewind();
						s = -1;
						if ( (LA8_10=='*') ) {s = 7;}
						else if ( (LA8_10=='/') ) {s = 8;}
						else if ( (LA8_10=='\\') ) {s = 9;}
						else if ( ((LA8_10 >= '\u0000' && LA8_10 <= '\t')||(LA8_10 >= '\u000B' && LA8_10 <= ')')||(LA8_10 >= '+' && LA8_10 <= '.')||(LA8_10 >= '0' && LA8_10 <= '[')||(LA8_10 >= ']' && LA8_10 <= '\uFFFF')) ) {s = 10;}
						else if ( (LA8_10=='\n') && (synpred1_Cpp())) {s = 11;}
						else s = 4;
						 
						input.seek(index8_10);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 8, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA32_eotS =
		"\6\uffff";
	static final String DFA32_eofS =
		"\6\uffff";
	static final String DFA32_minS =
		"\2\56\4\uffff";
	static final String DFA32_maxS =
		"\1\71\1\146\4\uffff";
	static final String DFA32_acceptS =
		"\2\uffff\1\2\1\1\1\3\1\4";
	static final String DFA32_specialS =
		"\6\uffff}>";
	static final String[] DFA32_transitionS = {
			"\1\2\1\uffff\12\1",
			"\1\3\1\uffff\12\1\12\uffff\1\5\1\4\1\5\35\uffff\1\5\1\4\1\5",
			"",
			"",
			"",
			""
	};

	static final short[] DFA32_eot = DFA.unpackEncodedString(DFA32_eotS);
	static final short[] DFA32_eof = DFA.unpackEncodedString(DFA32_eofS);
	static final char[] DFA32_min = DFA.unpackEncodedStringToUnsignedChars(DFA32_minS);
	static final char[] DFA32_max = DFA.unpackEncodedStringToUnsignedChars(DFA32_maxS);
	static final short[] DFA32_accept = DFA.unpackEncodedString(DFA32_acceptS);
	static final short[] DFA32_special = DFA.unpackEncodedString(DFA32_specialS);
	static final short[][] DFA32_transition;

	static {
		int numStates = DFA32_transitionS.length;
		DFA32_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA32_transition[i] = DFA.unpackEncodedString(DFA32_transitionS[i]);
		}
	}

	protected class DFA32 extends DFA {

		public DFA32(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 32;
			this.eot = DFA32_eot;
			this.eof = DFA32_eof;
			this.min = DFA32_min;
			this.max = DFA32_max;
			this.accept = DFA32_accept;
			this.special = DFA32_special;
			this.transition = DFA32_transition;
		}
		@Override
		public String getDescription() {
			return "546:1: FLOATING_POINT_LITERAL : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( Exponent )? ( FloatTypeSuffix )? | '.' ( '0' .. '9' )+ ( Exponent )? ( FloatTypeSuffix )? | ( '0' .. '9' )+ Exponent ( FloatTypeSuffix )? | ( '0' .. '9' )+ FloatTypeSuffix );";
		}
	}

	static final String DFA46_eotS =
		"\1\uffff\1\30\1\uffff\1\34\4\uffff\1\36\1\40\1\42\1\45\1\50\1\52\1\55"+
		"\1\57\1\62\1\65\1\67\1\72\5\uffff\1\74\12\uffff\1\76\2\uffff\1\100\31"+
		"\uffff";
	static final String DFA46_eofS =
		"\101\uffff";
	static final String DFA46_minS =
		"\1\41\1\72\1\uffff\1\55\4\uffff\3\75\1\74\2\75\1\53\1\75\1\46\2\75\1\52"+
		"\5\uffff\1\52\12\uffff\1\75\2\uffff\1\75\31\uffff";
	static final String DFA46_maxS =
		"\1\176\1\72\1\uffff\1\76\4\uffff\4\75\1\76\4\75\1\174\1\75\1\56\5\uffff"+
		"\1\52\12\uffff\1\75\2\uffff\1\75\31\uffff";
	static final String DFA46_acceptS =
		"\2\uffff\1\2\1\uffff\1\4\1\5\1\6\1\7\14\uffff\1\40\1\56\1\57\1\34\1\1"+
		"\1\uffff\1\21\1\46\1\37\1\42\1\10\1\11\1\41\1\12\1\54\1\13\1\uffff\1\14"+
		"\1\15\1\uffff\1\16\1\43\1\17\1\20\1\45\1\36\1\44\1\22\1\25\1\51\1\35\1"+
		"\26\1\53\1\27\1\52\1\30\1\33\1\55\1\31\1\32\1\3\1\47\1\24\1\50\1\23";
	static final String DFA46_specialS =
		"\101\uffff}>";
	static final String[] DFA46_transitionS = {
			"\1\12\3\uffff\1\17\1\20\3\uffff\1\10\1\16\1\uffff\1\3\1\23\1\15\12\uffff"+
			"\1\1\1\uffff\1\13\1\11\1\14\1\2\1\25\32\uffff\1\6\1\26\1\7\1\22\34\uffff"+
			"\1\4\1\21\1\5\1\24",
			"\1\27",
			"",
			"\1\32\17\uffff\1\33\1\31",
			"",
			"",
			"",
			"",
			"\1\35",
			"\1\37",
			"\1\41",
			"\1\44\1\43",
			"\1\46\1\47",
			"\1\51",
			"\1\53\21\uffff\1\54",
			"\1\56",
			"\1\60\26\uffff\1\61",
			"\1\64\76\uffff\1\63",
			"\1\66",
			"\1\70\3\uffff\1\71",
			"",
			"",
			"",
			"",
			"",
			"\1\73",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\75",
			"",
			"",
			"\1\77",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA46_eot = DFA.unpackEncodedString(DFA46_eotS);
	static final short[] DFA46_eof = DFA.unpackEncodedString(DFA46_eofS);
	static final char[] DFA46_min = DFA.unpackEncodedStringToUnsignedChars(DFA46_minS);
	static final char[] DFA46_max = DFA.unpackEncodedStringToUnsignedChars(DFA46_maxS);
	static final short[] DFA46_accept = DFA.unpackEncodedString(DFA46_acceptS);
	static final short[] DFA46_special = DFA.unpackEncodedString(DFA46_specialS);
	static final short[][] DFA46_transition;

	static {
		int numStates = DFA46_transitionS.length;
		DFA46_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA46_transition[i] = DFA.unpackEncodedString(DFA46_transitionS[i]);
		}
	}

	protected class DFA46 extends DFA {

		public DFA46(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 46;
			this.eot = DFA46_eot;
			this.eof = DFA46_eof;
			this.min = DFA46_min;
			this.max = DFA46_max;
			this.accept = DFA46_accept;
			this.special = DFA46_special;
			this.transition = DFA46_transition;
		}
		@Override
		public String getDescription() {
			return "718:9: ( COLON | QUESTIONMARK | POINTERTO | LCURLY | RCURLY | LSQUARE | RSQUARE | STAR | EQUAL | NOTEQUAL | LESSTHANOREQUALTO | LESSTHAN | GREATERTHANOREQUALTO | GREATERTHAN | DIVIDE | PLUSPLUS | MINUSMINUS | MOD | SHIFTRIGHT | SHIFTLEFT | AND | OR | BITWISEOR | BITWISEXOR | DOT | POINTERTOMBR | DOTMBR | SCOPE | AMPERSAND | PLUS | MINUS | TILDE | ASSIGNEQUAL | TIMESEQUAL | DIVIDEEQUAL | MODEQUAL | PLUSEQUAL | MINUSEQUAL | SHIFTLEFTEQUAL | SHIFTRIGHTEQUAL | BITWISEANDEQUAL | BITWISEXOREQUAL | BITWISEOREQUAL | NOT | ELLIPSIS | AT | BS )";
		}
	}

	static final String DFA48_eotS =
		"\1\uffff\1\70\3\63\1\107\1\111\1\uffff\1\112\1\uffff\1\116\2\uffff\1\117"+
		"\1\120\1\121\1\122\1\124\1\127\1\133\1\137\1\142\1\144\1\146\1\151\1\154"+
		"\1\155\1\157\1\162\1\63\2\uffff\2\166\1\171\1\uffff\1\173\1\174\15\63"+
		"\1\uffff\1\77\1\uffff\1\u0091\1\77\1\uffff\6\77\1\uffff\6\63\1\u00a6\1"+
		"\uffff\1\u00a9\2\uffff\1\u00ad\1\u00ae\1\u00af\5\uffff\1\u00b5\1\uffff"+
		"\1\u00b7\1\u00b9\2\uffff\1\u00bb\1\u00bd\1\uffff\1\u00bf\3\uffff\1\u00c1"+
		"\1\u00c2\1\uffff\1\u00c4\1\uffff\1\u00c6\1\uffff\1\u00c8\1\u00c9\1\uffff"+
		"\1\u00cb\1\u00cc\2\uffff\1\u00cf\1\uffff\1\u00d1\3\uffff\1\63\2\uffff"+
		"\1\u00d5\1\166\4\uffff\13\63\1\uffff\7\63\2\uffff\1\u00f0\1\77\1\uffff"+
		"\11\77\10\63\6\uffff\1\u0107\13\uffff\1\u010d\3\uffff\1\u0110\25\uffff"+
		"\1\u011d\1\uffff\1\63\3\uffff\15\63\1\uffff\2\63\1\uffff\5\63\2\77\1\uffff"+
		"\13\77\11\63\31\uffff\5\63\3\uffff\2\63\1\uffff\1\63\1\uffff\2\63\2\uffff"+
		"\4\63\1\uffff\1\63\3\77\2\u00f0\3\77\1\u00f0\4\77\4\63\1\uffff\4\63\4"+
		"\uffff\10\63\1\uffff\1\63\1\uffff\1\63\3\uffff\1\u00f0\2\77\1\u00f0\1"+
		"\77\1\u00f0\4\77\1\u0181\4\uffff\2\63\1\uffff\4\63\1\uffff\1\63\1\uffff"+
		"\3\63\1\u00f0\2\77\1\u00f0\3\77\1\uffff\1\u0190\1\uffff\1\u0191\1\63\1"+
		"\uffff\5\63\3\77\1\u00f0\2\uffff\2\63\4\uffff\2\77\1\u00f0\1\uffff\1\63"+
		"\1\uffff\2\77\1\63\2\77\1\uffff\14\77\1\u00f0";
	static final String DFA48_eofS =
		"\u01b1\uffff";
	static final String DFA48_minS =
		"\2\11\1\150\1\145\1\47\1\75\1\72\1\uffff\1\0\1\uffff\1\55\2\uffff\4\0"+
		"\1\75\1\40\1\75\1\52\1\53\2\75\1\46\1\75\1\0\1\75\1\52\1\171\2\uffff\2"+
		"\56\1\11\1\uffff\1\12\1\0\1\137\1\154\1\165\1\145\1\157\1\141\1\146\1"+
		"\157\1\154\1\156\1\150\1\157\1\162\1\uffff\1\43\1\uffff\1\11\1\146\1\0"+
		"\1\154\1\151\1\156\1\145\1\141\1\162\1\uffff\1\147\1\141\1\157\1\151\1"+
		"\146\1\165\5\0\1\52\11\0\1\40\1\75\1\0\1\uffff\1\0\1\75\2\0\2\uffff\22"+
		"\0\1\56\1\0\1\uffff\1\160\2\uffff\2\56\2\uffff\2\0\1\146\1\164\1\165\1"+
		"\163\1\164\1\147\1\151\1\141\1\156\1\163\1\164\1\uffff\1\156\1\157\1\162"+
		"\2\151\1\164\1\145\2\uffff\1\44\1\143\1\uffff\1\151\1\144\1\145\1\162"+
		"\1\156\1\144\1\146\1\162\1\141\1\145\1\156\1\164\1\165\1\162\1\164\1\141"+
		"\1\142\1\0\2\uffff\1\0\2\uffff\4\0\5\uffff\1\0\1\uffff\3\0\1\uffff\3\0"+
		"\1\uffff\1\0\1\uffff\2\0\1\uffff\1\0\1\uffff\1\0\1\uffff\2\0\1\uffff\2"+
		"\0\2\uffff\1\0\1\uffff\2\0\1\uffff\1\145\3\uffff\1\141\1\154\1\145\1\155"+
		"\1\145\1\157\1\151\1\165\1\144\1\141\1\162\1\163\1\145\1\uffff\1\147\1"+
		"\141\1\uffff\1\151\1\157\1\154\1\157\1\141\1\145\1\144\1\0\1\154\1\146"+
		"\1\145\1\151\1\143\1\157\2\145\1\151\1\156\1\147\1\157\1\145\1\151\1\143"+
		"\1\164\1\143\1\156\1\165\1\154\2\uffff\1\0\5\uffff\1\0\2\uffff\1\0\14"+
		"\uffff\1\0\1\144\1\137\1\162\1\157\1\162\3\uffff\1\163\1\162\1\uffff\1"+
		"\164\1\uffff\1\164\1\151\2\uffff\1\164\1\147\1\156\1\145\1\uffff\1\153"+
		"\1\146\1\145\1\165\2\44\1\146\1\137\1\162\1\44\1\146\1\156\1\151\1\155"+
		"\1\146\1\144\1\143\1\164\1\uffff\1\150\1\145\1\154\1\145\4\uffff\1\145"+
		"\1\154\1\145\1\141\1\156\1\164\1\156\1\151\1\uffff\1\156\1\uffff\1\156"+
		"\3\uffff\1\44\1\146\1\144\1\44\1\155\1\0\1\11\1\145\1\156\1\141\1\44\4"+
		"\uffff\1\144\1\164\1\uffff\1\146\1\151\1\147\1\164\1\uffff\1\145\1\uffff"+
		"\1\154\1\165\1\145\1\44\1\145\1\141\1\0\1\11\1\147\1\0\1\uffff\1\44\1"+
		"\uffff\1\44\1\163\1\uffff\1\70\1\162\2\145\1\144\1\11\1\143\2\0\1\uffff"+
		"\1\0\1\164\1\60\4\uffff\1\156\1\162\1\0\1\uffff\1\137\1\uffff\1\145\1"+
		"\157\1\137\1\170\1\137\1\uffff\1\164\1\145\1\11\1\170\1\160\1\162\1\145"+
		"\2\163\1\151\1\157\1\156\1\44";
	static final String DFA48_maxS =
		"\1\176\1\172\1\167\1\157\1\47\1\75\1\72\1\uffff\1\0\1\uffff\1\76\2\uffff"+
		"\4\0\1\75\1\u00ff\1\76\1\134\4\75\1\174\1\0\1\75\1\71\1\171\2\uffff\1"+
		"\170\1\146\1\40\1\uffff\1\15\1\0\1\137\1\170\1\165\1\145\2\157\1\156\2"+
		"\157\1\156\1\150\1\157\1\162\1\uffff\1\43\1\uffff\1\172\1\156\1\0\1\170"+
		"\1\151\1\156\1\145\1\141\1\162\1\uffff\1\172\1\162\1\157\1\151\1\146\1"+
		"\165\5\0\1\52\11\0\1\u00ff\1\75\1\0\1\uffff\1\0\1\75\2\0\2\uffff\22\0"+
		"\1\56\1\0\1\uffff\1\160\2\uffff\2\146\2\uffff\2\0\1\166\1\164\1\165\1"+
		"\163\2\164\1\154\1\141\1\156\1\163\1\164\1\uffff\1\156\1\157\1\162\1\163"+
		"\1\151\1\164\1\145\2\uffff\1\172\1\143\1\uffff\1\163\1\144\1\145\1\162"+
		"\1\156\1\144\1\146\1\162\1\141\1\145\1\156\1\164\1\165\1\162\1\164\1\151"+
		"\1\142\1\0\2\uffff\1\0\2\uffff\4\0\5\uffff\1\0\1\uffff\3\0\1\uffff\3\0"+
		"\1\uffff\1\0\1\uffff\2\0\1\uffff\1\0\1\uffff\1\0\1\uffff\2\0\1\uffff\2"+
		"\0\2\uffff\1\0\1\uffff\2\0\1\uffff\1\145\3\uffff\1\141\1\160\1\145\1\155"+
		"\1\145\1\157\1\151\1\165\1\144\1\141\1\162\1\164\1\145\1\uffff\1\147\1"+
		"\141\1\uffff\1\151\1\157\1\154\1\157\1\141\1\145\1\144\1\0\1\154\1\146"+
		"\1\145\1\151\1\143\1\157\2\145\1\151\1\156\1\147\1\157\1\145\1\151\1\143"+
		"\1\164\1\143\1\156\1\165\1\154\2\uffff\1\0\5\uffff\1\0\2\uffff\1\0\14"+
		"\uffff\1\0\1\144\1\137\1\162\1\157\1\162\3\uffff\1\163\1\162\1\uffff\1"+
		"\164\1\uffff\1\164\1\151\2\uffff\1\164\1\147\1\156\1\145\1\uffff\1\153"+
		"\1\146\1\145\1\165\2\172\1\146\1\137\1\162\1\172\1\146\1\156\1\151\1\155"+
		"\1\146\1\144\1\143\1\164\1\uffff\1\150\1\145\1\154\1\145\4\uffff\1\145"+
		"\1\154\1\145\1\141\1\156\1\164\1\156\1\151\1\uffff\1\156\1\uffff\1\156"+
		"\3\uffff\1\172\1\146\1\144\1\172\1\155\1\uffff\1\40\1\145\1\156\1\141"+
		"\1\172\4\uffff\1\144\1\164\1\uffff\1\146\1\151\1\147\1\164\1\uffff\1\145"+
		"\1\uffff\1\154\1\165\1\145\1\172\1\145\1\141\1\uffff\1\40\1\147\1\uffff"+
		"\1\uffff\1\172\1\uffff\1\172\1\163\1\uffff\1\70\1\162\2\145\1\144\1\137"+
		"\1\143\2\uffff\1\uffff\1\0\1\164\1\60\4\uffff\1\156\1\162\1\uffff\1\uffff"+
		"\1\137\1\uffff\1\145\1\157\1\137\1\170\1\137\1\uffff\1\164\1\145\1\40"+
		"\1\170\1\160\1\162\1\145\2\163\1\151\1\157\1\156\1\172";
	static final String DFA48_acceptS =
		"\7\uffff\1\13\1\uffff\1\15\1\uffff\1\17\1\20\21\uffff\1\73\1\74\3\uffff"+
		"\1\104\17\uffff\1\5\1\uffff\1\10\11\uffff\1\1\30\uffff\1\72\4\uffff\1"+
		"\101\1\102\24\uffff\1\100\1\uffff\1\75\1\76\2\uffff\1\103\1\105\15\uffff"+
		"\1\5\7\uffff\1\7\1\2\2\uffff\1\6\22\uffff\1\11\1\110\1\uffff\1\12\1\14"+
		"\4\uffff\1\40\1\21\1\22\1\23\1\24\1\uffff\1\54\3\uffff\1\30\3\uffff\1"+
		"\32\1\uffff\1\33\2\uffff\1\35\1\uffff\1\43\1\uffff\1\45\2\uffff\1\56\2"+
		"\uffff\1\61\1\60\1\uffff\1\63\2\uffff\1\65\1\uffff\1\77\1\107\1\106\15"+
		"\uffff\1\5\2\uffff\1\5\34\uffff\1\25\1\70\1\uffff\1\16\1\41\1\42\1\26"+
		"\1\27\1\uffff\1\51\1\31\1\uffff\1\47\1\34\1\36\1\37\1\44\1\46\1\53\1\57"+
		"\1\55\1\62\1\64\1\67\6\uffff\3\5\2\uffff\1\5\1\uffff\1\5\2\uffff\2\5\4"+
		"\uffff\1\5\22\uffff\1\5\4\uffff\1\66\1\52\1\50\1\71\10\uffff\1\5\1\uffff"+
		"\1\5\1\uffff\3\5\13\uffff\4\5\2\uffff\1\5\4\uffff\1\5\1\uffff\1\5\12\uffff"+
		"\1\3\1\uffff\1\5\2\uffff\1\5\11\uffff\1\4\3\uffff\4\5\3\uffff\1\111\1"+
		"\uffff\1\5\5\uffff\1\5\15\uffff";
	static final String DFA48_specialS =
		"\70\uffff\1\0\16\uffff\1\5\1\uffff\1\6\1\7\3\uffff\1\30\1\11\1\12\1\13"+
		"\1\14\1\uffff\1\44\2\uffff\1\20\3\uffff\1\22\3\uffff\1\23\2\uffff\1\25"+
		"\1\uffff\1\33\1\uffff\1\35\2\uffff\1\46\2\uffff\1\51\1\50\1\uffff\1\53"+
		"\2\uffff\1\55\10\uffff\1\63\1\62\51\uffff\1\15\2\uffff\1\60\3\uffff\1"+
		"\10\1\31\1\32\5\uffff\1\16\1\uffff\1\17\1\uffff\1\41\1\uffff\1\21\1\uffff"+
		"\1\37\1\uffff\1\24\1\uffff\1\26\1\27\1\uffff\1\34\1\uffff\1\36\1\uffff"+
		"\1\43\1\47\1\uffff\1\45\1\52\2\uffff\1\54\1\uffff\1\57\36\uffff\1\2\26"+
		"\uffff\1\56\5\uffff\1\42\2\uffff\1\40\14\uffff\1\61\105\uffff\1\64\31"+
		"\uffff\1\67\2\uffff\1\3\15\uffff\1\1\1\66\1\uffff\1\4\10\uffff\1\65\26"+
		"\uffff}>";
	static final String[] DFA48_transitionS = {
			"\1\42\1\43\1\uffff\2\42\22\uffff\1\42\1\21\1\37\1\1\1\63\1\27\1\30\1"+
			"\36\1\13\1\14\1\26\1\25\1\7\1\12\1\34\1\24\1\40\11\41\1\6\1\11\1\22\1"+
			"\5\1\23\1\10\1\45\13\63\1\4\16\63\1\15\1\44\1\16\1\33\1\46\1\uffff\1"+
			"\50\1\62\1\53\1\3\1\47\1\56\1\61\1\63\1\54\2\63\1\55\5\63\1\51\1\2\1"+
			"\35\1\57\1\52\1\60\3\63\1\17\1\31\1\20\1\32",
			"\1\66\2\uffff\2\66\22\uffff\1\66\2\uffff\1\65\1\77\34\uffff\32\77\4"+
			"\uffff\1\64\1\uffff\3\77\1\74\1\71\3\77\1\67\2\77\1\72\3\77\1\76\4\77"+
			"\1\73\1\77\1\75\3\77",
			"\1\102\1\100\12\uffff\1\101\2\uffff\1\103",
			"\1\104\11\uffff\1\105",
			"\1\36",
			"\1\106",
			"\1\110",
			"",
			"\1\uffff",
			"",
			"\1\115\17\uffff\1\114\1\113",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\123",
			"\2\130\1\uffff\31\130\1\126\1\125\1\uffff\35\130\1\uffff\u00a3\130",
			"\1\131\1\132",
			"\1\135\4\uffff\1\136\15\uffff\1\134\36\uffff\1\135",
			"\1\141\21\uffff\1\140",
			"\1\143",
			"\1\145",
			"\1\147\26\uffff\1\150",
			"\1\153\76\uffff\1\152",
			"\1\uffff",
			"\1\156",
			"\1\160\3\uffff\1\161\1\uffff\12\163",
			"\1\164",
			"",
			"",
			"\1\163\1\uffff\10\167\2\163\12\uffff\3\163\21\uffff\1\165\13\uffff\3"+
			"\163\21\uffff\1\165",
			"\1\163\1\uffff\12\170\12\uffff\3\163\35\uffff\3\163",
			"\1\42\1\43\1\uffff\2\42\22\uffff\1\42",
			"",
			"\1\172\2\uffff\1\172",
			"\1\uffff",
			"\1\175",
			"\1\u0080\1\uffff\1\177\11\uffff\1\176",
			"\1\u0081",
			"\1\u0082",
			"\1\u0083",
			"\1\u0086\6\uffff\1\u0084\6\uffff\1\u0085",
			"\1\u0088\7\uffff\1\u0087",
			"\1\u0089",
			"\1\u008a\2\uffff\1\u008b",
			"\1\u008c",
			"\1\u008d",
			"\1\u008e",
			"\1\u008f",
			"",
			"\1\u0090",
			"",
			"\1\66\2\uffff\2\66\22\uffff\1\66\3\uffff\1\77\34\uffff\32\77\4\uffff"+
			"\1\77\1\uffff\3\77\1\74\1\71\3\77\1\67\2\77\1\72\3\77\1\76\4\77\1\73"+
			"\1\77\1\75\3\77",
			"\1\u0092\7\uffff\1\u0093",
			"\1\uffff",
			"\1\u0095\1\uffff\1\u0096\3\uffff\1\u0098\5\uffff\1\u0097",
			"\1\u0099",
			"\1\u009a",
			"\1\u009b",
			"\1\u009c",
			"\1\u009d",
			"",
			"\1\u009f\22\uffff\1\u009e",
			"\1\u00a0\20\uffff\1\u00a1",
			"\1\u00a2",
			"\1\u00a3",
			"\1\u00a4",
			"\1\u00a5",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\u00ac",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\2\130\1\uffff\31\130\1\uffff\37\130\1\uffff\u00a3\130",
			"\1\u00b8",
			"\1\uffff",
			"",
			"\1\uffff",
			"\1\u00bc",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\u00d2",
			"\1\uffff",
			"",
			"\1\u00d4",
			"",
			"",
			"\1\163\1\uffff\10\167\2\163\12\uffff\3\163\35\uffff\3\163",
			"\1\163\1\uffff\12\170\12\uffff\3\163\35\uffff\3\163",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\u00d9\17\uffff\1\u00d8",
			"\1\u00da",
			"\1\u00db",
			"\1\u00dc",
			"\1\u00dd",
			"\1\u00de\14\uffff\1\u00df",
			"\1\u00e0\2\uffff\1\u00e1",
			"\1\u00e2",
			"\1\u00e3",
			"\1\u00e4",
			"\1\u00e5",
			"",
			"\1\u00e6",
			"\1\u00e7",
			"\1\u00e8",
			"\1\u00ea\11\uffff\1\u00e9",
			"\1\u00eb",
			"\1\u00ec",
			"\1\u00ed",
			"",
			"",
			"\1\77\13\uffff\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\3\77\1\u00ee"+
			"\11\77\1\u00ef\14\77",
			"\1\u00f1",
			"",
			"\1\u00f2\11\uffff\1\u00f3",
			"\1\u00f4",
			"\1\u00f5",
			"\1\u00f6",
			"\1\u00f7",
			"\1\u00f8",
			"\1\u00f9",
			"\1\u00fa",
			"\1\u00fb",
			"\1\u00fc",
			"\1\u00fd",
			"\1\u00fe",
			"\1\u00ff",
			"\1\u0100",
			"\1\u0101",
			"\1\u0103\7\uffff\1\u0102",
			"\1\u0104",
			"\1\uffff",
			"",
			"",
			"\1\uffff",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"\1\uffff",
			"",
			"\1\uffff",
			"\1\uffff",
			"",
			"\1\uffff",
			"",
			"\1\uffff",
			"",
			"\1\uffff",
			"\1\uffff",
			"",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"\1\uffff",
			"",
			"\1\uffff",
			"\1\uffff",
			"",
			"\1\u011e",
			"",
			"",
			"",
			"\1\u011f",
			"\1\u0121\3\uffff\1\u0120",
			"\1\u0122",
			"\1\u0123",
			"\1\u0124",
			"\1\u0125",
			"\1\u0126",
			"\1\u0127",
			"\1\u0128",
			"\1\u0129",
			"\1\u012a",
			"\1\u012b\1\u012c",
			"\1\u012d",
			"",
			"\1\u012e",
			"\1\u012f",
			"",
			"\1\u0130",
			"\1\u0131",
			"\1\u0132",
			"\1\u0133",
			"\1\u0134",
			"\1\u0135",
			"\1\u0136",
			"\1\uffff",
			"\1\u0137",
			"\1\u0138",
			"\1\u0139",
			"\1\u013a",
			"\1\u013b",
			"\1\u013c",
			"\1\u013d",
			"\1\u013e",
			"\1\u013f",
			"\1\u0140",
			"\1\u0141",
			"\1\u0142",
			"\1\u0143",
			"\1\u0144",
			"\1\u0145",
			"\1\u0146",
			"\1\u0147",
			"\1\u0148",
			"\1\u0149",
			"\1\u014a",
			"",
			"",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"",
			"",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"\1\u014f",
			"\1\u0150",
			"\1\u0151",
			"\1\u0152",
			"\1\u0153",
			"",
			"",
			"",
			"\1\u0154",
			"\1\u0155",
			"",
			"\1\u0156",
			"",
			"\1\u0157",
			"\1\u0158",
			"",
			"",
			"\1\u0159",
			"\1\u015a",
			"\1\u015b",
			"\1\u015c",
			"",
			"\1\u015d",
			"\1\u015e",
			"\1\u015f",
			"\1\u0160",
			"\1\77\13\uffff\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
			"\1\77\13\uffff\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
			"\1\u0161",
			"\1\u0162",
			"\1\u0163",
			"\1\77\13\uffff\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
			"\1\u0164",
			"\1\u0165",
			"\1\u0166",
			"\1\u0167",
			"\1\u0168",
			"\1\u0169",
			"\1\u016a",
			"\1\u016b",
			"",
			"\1\u016c",
			"\1\u016d",
			"\1\u016e",
			"\1\u016f",
			"",
			"",
			"",
			"",
			"\1\u0170",
			"\1\u0171",
			"\1\u0172",
			"\1\u0173",
			"\1\u0174",
			"\1\u0175",
			"\1\u0176",
			"\1\u0177",
			"",
			"\1\u0178",
			"",
			"\1\u0179",
			"",
			"",
			"",
			"\1\77\13\uffff\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
			"\1\u017a",
			"\1\u017b",
			"\1\77\13\uffff\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
			"\1\u017c",
			"\12\u0091\1\uffff\31\u0091\1\u017d\13\u0091\12\u017d\7\u0091\32\u017d"+
			"\4\u0091\1\u017d\1\u0091\32\u017d\uff85\u0091",
			"\1\u0091\2\uffff\2\u0091\22\uffff\1\u0091",
			"\1\u017e",
			"\1\u017f",
			"\1\u0180",
			"\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"",
			"",
			"",
			"",
			"\1\u0182",
			"\1\u0183",
			"",
			"\1\u0184",
			"\1\u0185",
			"\1\u0186",
			"\1\u0187",
			"",
			"\1\u0188",
			"",
			"\1\u0189",
			"\1\u018a",
			"\1\u018b",
			"\1\77\13\uffff\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
			"\1\u018c",
			"\1\u018d",
			"\12\u0091\1\uffff\31\u0091\1\u017d\13\u0091\12\u017d\7\u0091\32\u017d"+
			"\4\u0091\1\u017d\1\u0091\32\u017d\uff85\u0091",
			"\1\u0091\2\uffff\2\u0091\22\uffff\1\u0091",
			"\1\u018e",
			"\12\u0091\1\uffff\31\u0091\1\u018f\13\u0091\12\u018f\7\u0091\32\u018f"+
			"\4\u0091\1\u018f\1\u0091\32\u018f\uff85\u0091",
			"",
			"\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"",
			"\1\63\13\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u0192",
			"",
			"\1\u0193",
			"\1\u0194",
			"\1\u0195",
			"\1\u0196",
			"\1\u0197",
			"\1\u0091\2\uffff\2\u0091\22\uffff\1\u0091\76\uffff\1\u0198",
			"\1\u0199",
			"\12\u0091\1\uffff\31\u0091\1\u019a\13\u0091\12\u019a\7\u0091\32\u019a"+
			"\4\u0091\1\u019a\1\u0091\32\u019a\uff85\u0091",
			"\12\u0091\1\uffff\31\u0091\1\u018f\13\u0091\12\u018f\7\u0091\32\u018f"+
			"\4\u0091\1\u018f\1\u0091\32\u018f\uff85\u0091",
			"",
			"\1\uffff",
			"\1\u019c",
			"\1\u019d",
			"",
			"",
			"",
			"",
			"\1\u019e",
			"\1\u019f",
			"\12\u0091\1\uffff\31\u0091\1\u019a\13\u0091\12\u019a\7\u0091\32\u019a"+
			"\4\u0091\1\u019a\1\u0091\32\u019a\uff85\u0091",
			"",
			"\1\u01a0",
			"",
			"\1\u01a1",
			"\1\u01a2",
			"\1\u01a3",
			"\1\u01a4",
			"\1\u01a5",
			"",
			"\1\u01a6",
			"\1\u01a7",
			"\1\u0091\2\uffff\2\u0091\22\uffff\1\u0091",
			"\1\u01a8",
			"\1\u01a9",
			"\1\u01aa",
			"\1\u01ab",
			"\1\u01ac",
			"\1\u01ad",
			"\1\u01ae",
			"\1\u01af",
			"\1\u01b0",
			"\1\77\13\uffff\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77"
	};

	static final short[] DFA48_eot = DFA.unpackEncodedString(DFA48_eotS);
	static final short[] DFA48_eof = DFA.unpackEncodedString(DFA48_eofS);
	static final char[] DFA48_min = DFA.unpackEncodedStringToUnsignedChars(DFA48_minS);
	static final char[] DFA48_max = DFA.unpackEncodedStringToUnsignedChars(DFA48_maxS);
	static final short[] DFA48_accept = DFA.unpackEncodedString(DFA48_acceptS);
	static final short[] DFA48_special = DFA.unpackEncodedString(DFA48_specialS);
	static final short[][] DFA48_transition;

	static {
		int numStates = DFA48_transitionS.length;
		DFA48_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA48_transition[i] = DFA.unpackEncodedString(DFA48_transitionS[i]);
		}
	}

	protected class DFA48 extends DFA {

		public DFA48(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 48;
			this.eot = DFA48_eot;
			this.eof = DFA48_eof;
			this.min = DFA48_min;
			this.max = DFA48_max;
			this.accept = DFA48_accept;
			this.special = DFA48_special;
			this.transition = DFA48_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( STRING_OP | DIRECTIVE | SIZEOF | DEFINED | IDENTIFIER | SHARP | STRINGIFICATION | SHARPSHARP | ASSIGNEQUAL | COLON | COMMA | QUESTIONMARK | SEMICOLON | POINTERTO | LPAREN | RPAREN | LSQUARE | RSQUARE | LCURLY | RCURLY | EQUAL | NOTEQUAL | LESSTHANOREQUALTO | LESSTHAN | GREATERTHANOREQUALTO | GREATERTHAN | DIVIDE | DIVIDEEQUAL | PLUS | PLUSEQUAL | PLUSPLUS | MINUS | MINUSEQUAL | MINUSMINUS | STAR | TIMESEQUAL | MOD | MODEQUAL | SHIFTRIGHT | SHIFTRIGHTEQUAL | SHIFTLEFT | SHIFTLEFTEQUAL | AND | NOT | OR | AMPERSAND | BITWISEANDEQUAL | TILDE | BITWISEOR | BITWISEOREQUAL | BITWISEXOR | BITWISEXOREQUAL | DOT | POINTERTOMBR | DOTMBR | SCOPE | ELLIPSIS | LIB_FILE | CHARACTER_LITERAL | STRING_LITERAL | HEX_LITERAL | DECIMAL_LITERAL | OCTAL_LITERAL | FLOATING_POINT_LITERAL | COMMENT | LINE_COMMENT | WS | End | ESCAPED_NEWLINE | AT | BS | COPERATOR | CKEYWORD );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA48_56 = input.LA(1);
						 
						int index48_56 = input.index();
						input.rewind();
						s = -1;
						if ( (((!inDirective && !inDefineMode)||((input.LA(2) == ' '||input.LA(2) == '\n'||input.LA(2) == -1)))) ) {s = 145;}
						else if ( (true) ) {s = 148;}
						 
						input.seek(index48_56);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA48_398 = input.LA(1);
						s = -1;
						if ( ((LA48_398 >= '\u0000' && LA48_398 <= '\t')||(LA48_398 >= '\u000B' && LA48_398 <= '#')||(LA48_398 >= '%' && LA48_398 <= '/')||(LA48_398 >= ':' && LA48_398 <= '@')||(LA48_398 >= '[' && LA48_398 <= '^')||LA48_398=='`'||(LA48_398 >= '{' && LA48_398 <= '\uFFFF')) ) {s = 145;}
						else if ( (LA48_398=='$'||(LA48_398 >= '0' && LA48_398 <= '9')||(LA48_398 >= 'A' && LA48_398 <= 'Z')||LA48_398=='_'||(LA48_398 >= 'a' && LA48_398 <= 'z')) ) {s = 410;}
						else s = 63;
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA48_240 = input.LA(1);
						 
						int index48_240 = input.index();
						input.rewind();
						s = -1;
						if ( ((inDefineMode)) ) {s = 63;}
						else if ( ((!inDirective && !inDefineMode)) ) {s = 145;}
						 
						input.seek(index48_240);
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA48_384 = input.LA(1);
						s = -1;
						if ( ((LA48_384 >= '\u0000' && LA48_384 <= '\t')||(LA48_384 >= '\u000B' && LA48_384 <= '#')||(LA48_384 >= '%' && LA48_384 <= '/')||(LA48_384 >= ':' && LA48_384 <= '@')||(LA48_384 >= '[' && LA48_384 <= '^')||LA48_384=='`'||(LA48_384 >= '{' && LA48_384 <= '\uFFFF')) ) {s = 145;}
						else if ( (LA48_384=='$'||(LA48_384 >= '0' && LA48_384 <= '9')||(LA48_384 >= 'A' && LA48_384 <= 'Z')||LA48_384=='_'||(LA48_384 >= 'a' && LA48_384 <= 'z')) ) {s = 399;}
						else s = 63;
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA48_401 = input.LA(1);
						 
						int index48_401 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((!inDirective)))) ) {s = 51;}
						else if ( ((!inDirective)) ) {s = 411;}
						 
						input.seek(index48_401);
						if ( s>=0 ) return s;
						break;

					case 5 : 
						int LA48_71 = input.LA(1);
						 
						int index48_71 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((!inDirective)))) ) {s = 167;}
						else if ( ((!inDirective)) ) {s = 168;}
						 
						input.seek(index48_71);
						if ( s>=0 ) return s;
						break;

					case 6 : 
						int LA48_73 = input.LA(1);
						 
						int index48_73 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((!inDirective)))) ) {s = 170;}
						else if ( ((!inDirective)) ) {s = 168;}
						 
						input.seek(index48_73);
						if ( s>=0 ) return s;
						break;

					case 7 : 
						int LA48_74 = input.LA(1);
						 
						int index48_74 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((!inDirective)))) ) {s = 171;}
						else if ( ((!inDirective)) ) {s = 168;}
						 
						input.seek(index48_74);
						if ( s>=0 ) return s;
						break;

					case 8 : 
						int LA48_173 = input.LA(1);
						 
						int index48_173 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((!inDirective)))) ) {s = 264;}
						else if ( ((!inDirective)) ) {s = 168;}
						 
						input.seek(index48_173);
						if ( s>=0 ) return s;
						break;

					case 9 : 
						int LA48_79 = input.LA(1);
						 
						int index48_79 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((!inDirective)))) ) {s = 177;}
						else if ( ((!inDirective)) ) {s = 168;}
						 
						input.seek(index48_79);
						if ( s>=0 ) return s;
						break;

					case 10 : 
						int LA48_80 = input.LA(1);
						 
						int index48_80 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((!inDirective)))) ) {s = 178;}
						else if ( ((!inDirective)) ) {s = 168;}
						 
						input.seek(index48_80);
						if ( s>=0 ) return s;
						break;

					case 11 : 
						int LA48_81 = input.LA(1);
						 
						int index48_81 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((!inDirective)))) ) {s = 179;}
						else if ( ((!inDirective)) ) {s = 168;}
						 
						input.seek(index48_81);
						if ( s>=0 ) return s;
						break;

					case 12 : 
						int LA48_82 = input.LA(1);
						 
						int index48_82 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((!inDirective)))) ) {s = 180;}
						else if ( ((!inDirective)) ) {s = 168;}
						 
						input.seek(index48_82);
						if ( s>=0 ) return s;
						break;

					case 13 : 
						int LA48_166 = input.LA(1);
						 
						int index48_166 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((!inDirective)))) ) {s = 261;}
						else if ( ((!inDirective)) ) {s = 168;}
						 
						input.seek(index48_166);
						if ( s>=0 ) return s;
						break;

					case 14 : 
						int LA48_181 = input.LA(1);
						 
						int index48_181 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((!inDirective)))) ) {s = 267;}
						else if ( ((!inDirective)) ) {s = 168;}
						 
						input.seek(index48_181);
						if ( s>=0 ) return s;
						break;

					case 15 : 
						int LA48_183 = input.LA(1);
						 
						int index48_183 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((!inDirective)))) ) {s = 268;}
						else if ( ((!inDirective)) ) {s = 168;}
						 
						input.seek(index48_183);
						if ( s>=0 ) return s;
						break;

					case 16 : 
						int LA48_87 = input.LA(1);
						 
						int index48_87 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((!inDirective)))) ) {s = 186;}
						else if ( ((!inDirective)) ) {s = 168;}
						 
						input.seek(index48_87);
						if ( s>=0 ) return s;
						break;

					case 17 : 
						int LA48_187 = input.LA(1);
						 
						int index48_187 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((!inDirective)))) ) {s = 271;}
						else if ( ((!inDirective)) ) {s = 168;}
						 
						input.seek(index48_187);
						if ( s>=0 ) return s;
						break;

					case 18 : 
						int LA48_91 = input.LA(1);
						 
						int index48_91 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((!inDirective)))) ) {s = 190;}
						else if ( ((!inDirective)) ) {s = 168;}
						 
						input.seek(index48_91);
						if ( s>=0 ) return s;
						break;

					case 19 : 
						int LA48_95 = input.LA(1);
						 
						int index48_95 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((!inDirective)))) ) {s = 192;}
						else if ( ((!inDirective)) ) {s = 168;}
						 
						input.seek(index48_95);
						if ( s>=0 ) return s;
						break;

					case 20 : 
						int LA48_191 = input.LA(1);
						 
						int index48_191 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((!inDirective)))) ) {s = 274;}
						else if ( ((!inDirective)) ) {s = 168;}
						 
						input.seek(index48_191);
						if ( s>=0 ) return s;
						break;

					case 21 : 
						int LA48_98 = input.LA(1);
						 
						int index48_98 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((!inDirective)))) ) {s = 195;}
						else if ( ((!inDirective)) ) {s = 168;}
						 
						input.seek(index48_98);
						if ( s>=0 ) return s;
						break;

					case 22 : 
						int LA48_193 = input.LA(1);
						 
						int index48_193 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((!inDirective)))) ) {s = 275;}
						else if ( ((!inDirective)) ) {s = 168;}
						 
						input.seek(index48_193);
						if ( s>=0 ) return s;
						break;

					case 23 : 
						int LA48_194 = input.LA(1);
						 
						int index48_194 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((!inDirective)))) ) {s = 276;}
						else if ( ((!inDirective)) ) {s = 168;}
						 
						input.seek(index48_194);
						if ( s>=0 ) return s;
						break;

					case 24 : 
						int LA48_78 = input.LA(1);
						 
						int index48_78 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((!inDirective)))) ) {s = 176;}
						else if ( ((!inDirective)) ) {s = 168;}
						 
						input.seek(index48_78);
						if ( s>=0 ) return s;
						break;

					case 25 : 
						int LA48_174 = input.LA(1);
						 
						int index48_174 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((!inDirective)))) ) {s = 265;}
						else if ( ((!inDirective)) ) {s = 168;}
						 
						input.seek(index48_174);
						if ( s>=0 ) return s;
						break;

					case 26 : 
						int LA48_175 = input.LA(1);
						 
						int index48_175 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((!inDirective)))) ) {s = 266;}
						else if ( ((!inDirective)) ) {s = 168;}
						 
						input.seek(index48_175);
						if ( s>=0 ) return s;
						break;

					case 27 : 
						int LA48_100 = input.LA(1);
						 
						int index48_100 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((!inDirective)))) ) {s = 197;}
						else if ( ((!inDirective)) ) {s = 168;}
						 
						input.seek(index48_100);
						if ( s>=0 ) return s;
						break;

					case 28 : 
						int LA48_196 = input.LA(1);
						 
						int index48_196 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((!inDirective)))) ) {s = 277;}
						else if ( ((!inDirective)) ) {s = 168;}
						 
						input.seek(index48_196);
						if ( s>=0 ) return s;
						break;

					case 29 : 
						int LA48_102 = input.LA(1);
						 
						int index48_102 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((!inDirective)))) ) {s = 199;}
						else if ( ((!inDirective)) ) {s = 168;}
						 
						input.seek(index48_102);
						if ( s>=0 ) return s;
						break;

					case 30 : 
						int LA48_198 = input.LA(1);
						 
						int index48_198 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((!inDirective)))) ) {s = 278;}
						else if ( ((!inDirective)) ) {s = 168;}
						 
						input.seek(index48_198);
						if ( s>=0 ) return s;
						break;

					case 31 : 
						int LA48_189 = input.LA(1);
						 
						int index48_189 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((!inDirective)))) ) {s = 273;}
						else if ( ((!inDirective)) ) {s = 168;}
						 
						input.seek(index48_189);
						if ( s>=0 ) return s;
						break;

					case 32 : 
						int LA48_272 = input.LA(1);
						 
						int index48_272 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((!inDirective)))) ) {s = 333;}
						else if ( ((!inDirective)) ) {s = 168;}
						 
						input.seek(index48_272);
						if ( s>=0 ) return s;
						break;

					case 33 : 
						int LA48_185 = input.LA(1);
						 
						int index48_185 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((!inDirective)))) ) {s = 270;}
						else if ( ((!inDirective)) ) {s = 168;}
						 
						input.seek(index48_185);
						if ( s>=0 ) return s;
						break;

					case 34 : 
						int LA48_269 = input.LA(1);
						 
						int index48_269 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((!inDirective)))) ) {s = 332;}
						else if ( ((!inDirective)) ) {s = 168;}
						 
						input.seek(index48_269);
						if ( s>=0 ) return s;
						break;

					case 35 : 
						int LA48_200 = input.LA(1);
						 
						int index48_200 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((!inDirective)))) ) {s = 279;}
						else if ( ((!inDirective)) ) {s = 168;}
						 
						input.seek(index48_200);
						if ( s>=0 ) return s;
						break;

					case 36 : 
						int LA48_84 = input.LA(1);
						 
						int index48_84 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((!inDirective)))) ) {s = 182;}
						else if ( ((!inDirective)) ) {s = 168;}
						 
						input.seek(index48_84);
						if ( s>=0 ) return s;
						break;

					case 37 : 
						int LA48_203 = input.LA(1);
						 
						int index48_203 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((!inDirective)))) ) {s = 281;}
						else if ( ((!inDirective)) ) {s = 168;}
						 
						input.seek(index48_203);
						if ( s>=0 ) return s;
						break;

					case 38 : 
						int LA48_105 = input.LA(1);
						 
						int index48_105 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((!inDirective)))) ) {s = 202;}
						else if ( ((!inDirective)) ) {s = 168;}
						 
						input.seek(index48_105);
						if ( s>=0 ) return s;
						break;

					case 39 : 
						int LA48_201 = input.LA(1);
						 
						int index48_201 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((!inDirective)))) ) {s = 280;}
						else if ( ((!inDirective)) ) {s = 168;}
						 
						input.seek(index48_201);
						if ( s>=0 ) return s;
						break;

					case 40 : 
						int LA48_109 = input.LA(1);
						 
						int index48_109 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((!inDirective)))) ) {s = 206;}
						else if ( ((!inDirective)) ) {s = 168;}
						 
						input.seek(index48_109);
						if ( s>=0 ) return s;
						break;

					case 41 : 
						int LA48_108 = input.LA(1);
						 
						int index48_108 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((!inDirective)))) ) {s = 205;}
						else if ( ((!inDirective)) ) {s = 168;}
						 
						input.seek(index48_108);
						if ( s>=0 ) return s;
						break;

					case 42 : 
						int LA48_204 = input.LA(1);
						 
						int index48_204 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((!inDirective)))) ) {s = 282;}
						else if ( ((!inDirective)) ) {s = 168;}
						 
						input.seek(index48_204);
						if ( s>=0 ) return s;
						break;

					case 43 : 
						int LA48_111 = input.LA(1);
						 
						int index48_111 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((!inDirective)))) ) {s = 208;}
						else if ( ((!inDirective)) ) {s = 168;}
						 
						input.seek(index48_111);
						if ( s>=0 ) return s;
						break;

					case 44 : 
						int LA48_207 = input.LA(1);
						 
						int index48_207 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((!inDirective)))) ) {s = 283;}
						else if ( ((!inDirective)) ) {s = 168;}
						 
						input.seek(index48_207);
						if ( s>=0 ) return s;
						break;

					case 45 : 
						int LA48_114 = input.LA(1);
						 
						int index48_114 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((!inDirective)))) ) {s = 211;}
						else if ( ((!inDirective)) ) {s = 168;}
						 
						input.seek(index48_114);
						if ( s>=0 ) return s;
						break;

					case 46 : 
						int LA48_263 = input.LA(1);
						 
						int index48_263 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((!inDirective)))) ) {s = 331;}
						else if ( ((!inDirective)) ) {s = 168;}
						 
						input.seek(index48_263);
						if ( s>=0 ) return s;
						break;

					case 47 : 
						int LA48_209 = input.LA(1);
						 
						int index48_209 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((!inDirective)))) ) {s = 284;}
						else if ( ((!inDirective)) ) {s = 168;}
						 
						input.seek(index48_209);
						if ( s>=0 ) return s;
						break;

					case 48 : 
						int LA48_169 = input.LA(1);
						 
						int index48_169 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((!inDirective)))) ) {s = 262;}
						else if ( ((!inDirective)) ) {s = 168;}
						 
						input.seek(index48_169);
						if ( s>=0 ) return s;
						break;

					case 49 : 
						int LA48_285 = input.LA(1);
						 
						int index48_285 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((!inDirective)))) ) {s = 334;}
						else if ( ((!inDirective)) ) {s = 168;}
						 
						input.seek(index48_285);
						if ( s>=0 ) return s;
						break;

					case 50 : 
						int LA48_124 = input.LA(1);
						 
						int index48_124 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((!inDirective)))) ) {s = 215;}
						else if ( ((!inDirective)) ) {s = 168;}
						 
						input.seek(index48_124);
						if ( s>=0 ) return s;
						break;

					case 51 : 
						int LA48_123 = input.LA(1);
						 
						int index48_123 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((!inDirective)))) ) {s = 214;}
						else if ( ((!inDirective)) ) {s = 168;}
						 
						input.seek(index48_123);
						if ( s>=0 ) return s;
						break;

					case 52 : 
						int LA48_355 = input.LA(1);
						s = -1;
						if ( ((LA48_355 >= '\u0000' && LA48_355 <= '\t')||(LA48_355 >= '\u000B' && LA48_355 <= '#')||(LA48_355 >= '%' && LA48_355 <= '/')||(LA48_355 >= ':' && LA48_355 <= '@')||(LA48_355 >= '[' && LA48_355 <= '^')||LA48_355=='`'||(LA48_355 >= '{' && LA48_355 <= '\uFFFF')) ) {s = 145;}
						else if ( (LA48_355=='$'||(LA48_355 >= '0' && LA48_355 <= '9')||(LA48_355 >= 'A' && LA48_355 <= 'Z')||LA48_355=='_'||(LA48_355 >= 'a' && LA48_355 <= 'z')) ) {s = 381;}
						else s = 240;
						if ( s>=0 ) return s;
						break;

					case 53 : 
						int LA48_410 = input.LA(1);
						s = -1;
						if ( ((LA48_410 >= '\u0000' && LA48_410 <= '\t')||(LA48_410 >= '\u000B' && LA48_410 <= '#')||(LA48_410 >= '%' && LA48_410 <= '/')||(LA48_410 >= ':' && LA48_410 <= '@')||(LA48_410 >= '[' && LA48_410 <= '^')||LA48_410=='`'||(LA48_410 >= '{' && LA48_410 <= '\uFFFF')) ) {s = 145;}
						else if ( (LA48_410=='$'||(LA48_410 >= '0' && LA48_410 <= '9')||(LA48_410 >= 'A' && LA48_410 <= 'Z')||LA48_410=='_'||(LA48_410 >= 'a' && LA48_410 <= 'z')) ) {s = 410;}
						else s = 240;
						if ( s>=0 ) return s;
						break;

					case 54 : 
						int LA48_399 = input.LA(1);
						s = -1;
						if ( ((LA48_399 >= '\u0000' && LA48_399 <= '\t')||(LA48_399 >= '\u000B' && LA48_399 <= '#')||(LA48_399 >= '%' && LA48_399 <= '/')||(LA48_399 >= ':' && LA48_399 <= '@')||(LA48_399 >= '[' && LA48_399 <= '^')||LA48_399=='`'||(LA48_399 >= '{' && LA48_399 <= '\uFFFF')) ) {s = 145;}
						else if ( (LA48_399=='$'||(LA48_399 >= '0' && LA48_399 <= '9')||(LA48_399 >= 'A' && LA48_399 <= 'Z')||LA48_399=='_'||(LA48_399 >= 'a' && LA48_399 <= 'z')) ) {s = 399;}
						else s = 240;
						if ( s>=0 ) return s;
						break;

					case 55 : 
						int LA48_381 = input.LA(1);
						s = -1;
						if ( ((LA48_381 >= '\u0000' && LA48_381 <= '\t')||(LA48_381 >= '\u000B' && LA48_381 <= '#')||(LA48_381 >= '%' && LA48_381 <= '/')||(LA48_381 >= ':' && LA48_381 <= '@')||(LA48_381 >= '[' && LA48_381 <= '^')||LA48_381=='`'||(LA48_381 >= '{' && LA48_381 <= '\uFFFF')) ) {s = 145;}
						else if ( (LA48_381=='$'||(LA48_381 >= '0' && LA48_381 <= '9')||(LA48_381 >= 'A' && LA48_381 <= 'Z')||LA48_381=='_'||(LA48_381 >= 'a' && LA48_381 <= 'z')) ) {s = 381;}
						else s = 240;
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 48, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
