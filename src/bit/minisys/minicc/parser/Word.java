package bit.minisys.minicc.parser;

import java.util.ArrayList;

public class Word {

	public static final String KEY = "keyword";
	public static final String OPERATOR = "operator";
	public static final String INT_CONST = "const_int";
	public static final String FLOAT_CONST = "const_float";
	public static final String CHAR_CONST = "const_char";
	public static final String BOOL_CONST = "const_boolean";
	public static final String IDENTIFIER = "identifier";
	public static final String BOUNDARYSIGN = "separator";
	public static final String END = "#";
	public static final String UNIDEF = "undefined";
	public static ArrayList<String> key;
	public static ArrayList<String> boundarySign;
	public static ArrayList<String> operator;
	
	public int id;
	public String value;
	public String type;
	public int line;
	public boolean flag;
	
	// 对数据进行初始化，将相应常量加入
	static {
		key = new ArrayList<String>();
		boundarySign = new ArrayList<String>();
		operator = new ArrayList<String>();
		operator.add("+");
		operator.add("-");
		operator.add("++");
		operator.add("--");
		operator.add("*");
		operator.add("/");
		operator.add(">");
		operator.add("<");
		operator.add(">=");
		operator.add("<=");
		operator.add("==");
		operator.add("!=");
		operator.add("=");
		operator.add("&&");
		operator.add("||");
		operator.add("!");
		operator.add(".");
		operator.add("?");
		operator.add("|");
		operator.add("&");
		operator.add("<<");
		operator.add(">>");
		operator.add(">>>");
		operator.add("<<<");
		operator.add("%");
		boundarySign.add("(");
		boundarySign.add(")");
		boundarySign.add("{");
		boundarySign.add("}");
		boundarySign.add(";");
		boundarySign.add(",");
		key.add("void");
		key.add("int");
		key.add("char");
		key.add("if");
		key.add("else");
		key.add("while");
		key.add("for");
		key.add("printf");
		key.add("scanf");
		key.add("float");
		key.add("return");
	}

	public Word() {
		flag = true;
	}

	public Word(int id, String value, String type, int line) {
		flag = true;
		this.id = id;
		this.value = value;
		this.type = type;
		this.line = line;
	}

	public static boolean isKey(String word) {
		return key.contains(word);
	}

	public static boolean isOperator(String word) {
		return operator.contains(word);
	}

	public static boolean isBoundarySign(String word) {
		return boundarySign.contains(word);
	}

	public static boolean isArOP(String word) {
		return word.equals("+") || word.equals("-") || word.equals("*")
				|| word.equals("/");
	}

	public static boolean isBoolOP(String word) {
		return word.equals(">") || word.equals("<") || word.equals("==")
				|| word.equals("!=") || word.equals("!") || word.equals("&&")
				|| word.equals("||");
	}
	
	public static boolean isBoolean(String word){
		word = word.toLowerCase();
		return word.equals("true") || word.equals("false");
	}
	
	// 用于判断是哪种类型
	public static String isWhat(String word){
		
		boolean isIntNum = true;
		boolean isFloatNum = true;
		
		try {
			Integer.parseInt(word);
		} catch (NumberFormatException e) {
			isIntNum = false;
		}	
		
		try {
			Float.parseFloat(word);
		} catch (NumberFormatException e) {
			isFloatNum = false;
		}
		
		
		if(isKey(word))
			return KEY;
		else if(isArOP(word))
			return "arOP";
		else if(isBoolean(word))
			return BOOL_CONST;
		else if(isBoolOP(word))
			return "boolOP";
		else if(isBoundarySign(word))
			return BOUNDARYSIGN;
		else if(isOperator(word))
			return OPERATOR;
		else if(isIntNum)
			return INT_CONST;
		else if(isFloatNum)
			return FLOAT_CONST;
		
		return IDENTIFIER;
	}


}
