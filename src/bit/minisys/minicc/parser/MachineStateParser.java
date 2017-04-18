package bit.minisys.minicc.parser;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import javax.xml.parsers.ParserConfigurationException;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;
import org.xml.sax.SAXException;


public class MachineStateParser implements IMiniCCParser {

	@Override
	public void run(String iFile, String oFile)
			throws ParserConfigurationException, SAXException, IOException {
		// TODO Auto-generated method stub
		wordAnalyze(iFile, oFile);
	}
	
	// 创建成员变量
	public ArrayList<Word> wordsArrayList;
	public ArrayList<Error> errorsArrayList;

	 public int state = 0;
	 public int start_cur = 0;
	 public int end_cur = 0;
	 public int word_count = 0;
	 public int error_count = 0;

	// 初始化成员变量
	public MachineStateParser() 
	{
		this.wordsArrayList = new ArrayList<Word>();
		this.errorsArrayList = new ArrayList<Error>();
	}

	// 进入终止状态
	public void got_a_word() 
	{
		state = 0;
		end_cur++;
		start_cur = end_cur;
		word_count++;
	}
	public void got_a_word(Word word) 
	{
		state = 0;
		end_cur++;
		start_cur = end_cur;
		word_count++;
		this.wordsArrayList.add(word);
	}

	// 外部进行分析所调用的函数
	public void wordAnalyze(String filename,String outputFilename) throws IOException
	{
		// 从文件中读取数据,并进行分析
		BufferedReader readstr = new BufferedReader(
				new InputStreamReader(new BufferedInputStream(
						new FileInputStream(filename)), "utf-8"));
		String str = "";
		int line;
		for (line = 1; (str = readstr.readLine()) != null; line++) 
		{
			analyze(str.trim(), line); // 进行词法分析
		}
		readstr.close();
		
		// 保存到xml文件中
		outputWordList(outputFilename);
		
		System.out.println("Finished");
	}

	// 对单词进行保存	 
	 public String outputWordList(String output) throws IOException
		    {
		        Element root = (new Element("project")).setAttribute("name", "test.l");
		        Document Doc = new Document(root);
		        Element tokens = new Element("tokens");
		        root.addContent(tokens);
		        for(int i = 0; i < wordsArrayList.size(); i++)
		        {
		            Word word = (Word)wordsArrayList.get(i);
		            Element elements = new Element("token");
		            elements.addContent((new Element("number")).setText((new Integer(word.id)).toString()));
		            elements.addContent((new Element("value")).setText(word.value));
		            elements.addContent((new Element("type")).setText(word.type));
		            elements.addContent((new Element("line")).setText((new Integer(word.line)).toString()));
		            elements.addContent((new Element("valid")).setText((new Boolean(word.flag)).toString()));
		            tokens.addContent(elements);
		        }

		        if(true)
		        {
		            for(int i = 0; i < errorsArrayList.size(); i++)
		            {
		                Error error = (Error)errorsArrayList.get(i);
		                Element elements = new Element("\u9519\u8BEF\u4FE1\u606F");
		                elements.addContent((new Element("\u9519\u8BEF\u5E8F\u53F7")).setText((new Integer(error.id)).toString()));
		                elements.addContent((new Element("\u9519\u8BEF\u4FE1\u606F")).setText(error.info));
		                elements.addContent((new Element("\u9519\u8BEF\u6240\u5728\u884C")).setText((new Integer(error.line)).toString()));
		                elements.addContent((new Element("\u9519\u8BEF\u5355\u8BCD")).setText(error.word.value));
		                root.addContent(elements);
		            }

		        }
		        Format format = Format.getPrettyFormat();
		        XMLOutputter XMLOut = new XMLOutputter(format);
		        XMLOut.output(Doc, new FileOutputStream(output));
		        return output;
		    }
	 	
	// 对输入字符串进行词法分析
	private void analyze(String str, int line) 
	{
		// 进行初始化
		start_cur = 0;
		end_cur = 0;
		state = 0;
		char nextchar = 0;

		// 进入自动机
		//while (str.charAt(end_cur) != 0) 
		while(end_cur < str.length())
		{
			switch (state) {
			case 0:
				// 1,开头是字母 --> 标识符 ， 关键字 ， 布尔变量
				if ((str.charAt(end_cur) >= 'a' && str.charAt(end_cur) <= 'z')
						|| (str.charAt(end_cur) >= 'A' && str.charAt(end_cur) <= 'Z'))
					state = 1;

				// 3,空格
				else if (str.charAt(end_cur) == ' ')
					state = 3;

				// 0,换行
				else if (str.charAt(end_cur) == '\n') {
					state = 0;
					got_a_word();
				}

				// 4, $
				else if (str.charAt(end_cur) == '$')
					state = 4;

				// 5, _
				else if (str.charAt(end_cur) == '_')
					state = 5;

				// 6, "" 字符串常量
				else if (str.charAt(end_cur) == '\"')
					state = 6;

				// 8, ;
				else if (str.charAt(end_cur) == ';')
					state = 8;

				// 9, ,
				else if (str.charAt(end_cur) == ',')
					state = 9;

				// 10, =
				else if (str.charAt(end_cur) == '=')
					state = 10;

				// 13, {
				else if (str.charAt(end_cur) == '{')
					state = 13;

				// 14, }
				else if (str.charAt(end_cur) == '}')
					state = 14;

				// 15, [
				else if (str.charAt(end_cur) == '[')
					state = 15;

				// 16, ]
				else if (str.charAt(end_cur) == ']')
					state = 16;

				// 17, (
				else if (str.charAt(end_cur) == '(')
					state = 17;

				// 18, )
				else if (str.charAt(end_cur) == ')')
					state = 18;

				// 19, ?:
				else if (str.charAt(end_cur) == '?')
					state = 19;

				// 21, |
				else if (str.charAt(end_cur) == '|')
					state = 21;

				// 25, &
				else if (str.charAt(end_cur) == '&')
					state = 25;

				// 29, !
				else if (str.charAt(end_cur) == '!')
					state = 29;

				// 33, ^
				else if (str.charAt(end_cur) == '^')
					state = 33;

				// 36, <
				else if (str.charAt(end_cur) == '<')
					state = 36;

				// 42, >
				else if (str.charAt(end_cur) == '>')
					state = 42;

				// 51, *
				else if (str.charAt(end_cur) == '*')
					state = 51;

				// 54, %
				else if (str.charAt(end_cur) == '%')
					state = 54;

				// 57, /
				else if (str.charAt(end_cur) == '/')
					state = 57;

				// 60, ~
				else if (str.charAt(end_cur) == '~')
					state = 60;

				// 61, '
				else if (str.charAt(end_cur) == '\'')
					state = 61;

				// 64, +
				else if (str.charAt(end_cur) == '+')
					state = 64;

				// 68, -
				else if (str.charAt(end_cur) == '-')
					state = 68;

				// 72, 0
				else if (str.charAt(end_cur) == '0')
					state = 72;

				// 90, 1-9
				else if (str.charAt(end_cur) >= '1' && str.charAt(end_cur) <= '9')
					state = 90;

				// 93, .
				else if (str.charAt(end_cur) == '.')
					state = 93;

				// 95, \t
				else if (str.charAt(end_cur) == '\t')
					state = 95;

				break;

			case 1:
				nextchar = str.charAt(++end_cur);
				while ((nextchar >= 'a' && nextchar <= 'z')
						|| (nextchar >= 'A' && nextchar <= 'Z')
						|| nextchar == '$' || nextchar == '_'
						|| (nextchar >= '0' && nextchar <= '9')) {
					nextchar = str.charAt(++end_cur);
				}
				state = 2;
				end_cur--;

				break;
			case 2:
				Word word = new Word();
				word.id = word_count;
                word.line = line;
                word.value = str.substring(start_cur, end_cur+1);
                word.type = Word.isWhat(word.value);
                word.flag = false;

      
				got_a_word(word);
				break;

			case 3:
				word = new Word();
				word.id = word_count;
                word.line = line;
                word.value = str.substring(start_cur, end_cur+1);
                word.type = "blankspace";
                word.flag = false;
				got_a_word(word);
				break;

			case 4:
				nextchar = str.charAt(++end_cur);
				while ((nextchar >= 'a' && nextchar <= 'z')
						|| (nextchar >= 'A' && nextchar <= 'Z')
						|| nextchar == '$' || nextchar == '_'
						|| (nextchar >= '0' && nextchar <= '9')) {
					nextchar = str.charAt(++end_cur);
				}

				state = 2;
				end_cur--;
				break;
			case 5:
				nextchar = str.charAt(++end_cur);
				while ((nextchar >= 'a' && nextchar <= 'z')
						|| (nextchar >= 'A' && nextchar <= 'Z')
						|| nextchar == '$' || nextchar == '_'
						|| (nextchar >= '0' && nextchar <= '9')) {
					nextchar = str.charAt(++end_cur);
				}

				state = 2;
				end_cur--;
				break;

			case 6:
				nextchar = str.charAt(++end_cur);
				while (nextchar != '\"')
					nextchar = str.charAt(++end_cur);
				state = 7;

				break;

			case 7:
				word = new Word();
				word.id = word_count;
                word.line = line;
                word.value = str.substring(start_cur, end_cur+1);
                word.type = "const_string";
                word.flag = false;
				got_a_word(word);

				break;
			case 8:
				word = new Word();
				word.id = word_count;
                word.line = line;
                word.value = str.substring(start_cur, end_cur+1);
                word.type = Word.isWhat(word.value);
                word.flag = false;
				got_a_word(word);

				break;
			case 9:
				word = new Word();
				word.id = word_count;
                word.line = line;
                word.value = str.substring(start_cur, end_cur+1);
                word.type = Word.isWhat(word.value);
                word.flag = false;
				got_a_word(word);

				break;
			case 10:
				nextchar = str.charAt(++end_cur);
				if (nextchar == '=')
					state = 12;
				else {
					state = 11;
					end_cur--;
				}

				break;
			case 11:
				word = new Word();
				word.id = word_count;
                word.line = line;
                word.value = str.substring(start_cur, end_cur+1);
                word.type = Word.isWhat(word.value);
                word.flag = false;
			
				got_a_word(word);

				break;
			case 12:
				word = new Word();
				word.id = word_count;
                word.line = line;
                word.value = str.substring(start_cur, end_cur+1);
                word.type = Word.isWhat(word.value);
                word.flag = false;
			
				got_a_word(word);
				break;
			case 13:
				word = new Word();
				word.id = word_count;
                word.line = line;
                word.value = str.substring(start_cur, end_cur+1);
                word.type = Word.isWhat(word.value);
                word.flag = false;
				got_a_word(word);

				break;
			case 14:
				word = new Word();
				word.id = word_count;
                word.line = line;
                word.value = str.substring(start_cur, end_cur+1);
                word.type = Word.isWhat(word.value);
                word.flag = false;
				got_a_word(word);

				break;
			case 15:
				word = new Word();
				word.id = word_count;
                word.line = line;
                word.value = str.substring(start_cur, end_cur+1);
                word.type = Word.isWhat(word.value);
                word.flag = false;
				got_a_word(word);

				break;
			case 16:
				word = new Word();
				word.id = word_count;
                word.line = line;
                word.value = str.substring(start_cur, end_cur+1);
                word.type = Word.isWhat(word.value);
                word.flag = false;
				got_a_word(word);

				break;
			case 17:
				word = new Word();
				word.id = word_count;
                word.line = line;
                word.value = str.substring(start_cur, end_cur+1);
                word.type = Word.isWhat(word.value);
                word.flag = false;
				got_a_word();

				break;
			case 18:
				word = new Word();
				word.id = word_count;
                word.line = line;
                word.value = str.substring(start_cur, end_cur+1);
                word.type = Word.isWhat(word.value);
                word.flag = false;
				got_a_word(word);

				break;
			case 19:
				nextchar = str.charAt(++end_cur);
				if (nextchar == ':')
					state = 20;
				else {
					state = 100;
					end_cur--;
				}

				break;
			case 20:
				word = new Word();
				word.id = word_count;
                word.line = line;
                word.value = str.substring(start_cur, end_cur+1);
                word.type = Word.isWhat(word.value);
                word.flag = false;
				got_a_word(word);

				break;

			case 21:
				nextchar = str.charAt(++end_cur);
				if (nextchar == '=')
					state = 23;
				else if (nextchar == '|')
					state = 24;
				else {
					state = 22;
					end_cur--;
				}

				break;
			case 22:
				word = new Word();
				word.id = word_count;
                word.line = line;
                word.value = str.substring(start_cur, end_cur+1);
                word.type = Word.isWhat(word.value);
                word.flag = false;
				got_a_word(word);

				break;
			case 23:
				word = new Word();
				word.id = word_count;
                word.line = line;
                word.value = str.substring(start_cur, end_cur+1);
                word.type = Word.isWhat(word.value);
                word.flag = false;
				got_a_word(word);

				break;
			case 24:
				word = new Word();
				word.id = word_count;
                word.line = line;
                word.value = str.substring(start_cur, end_cur+1);
                word.type = Word.isWhat(word.value);
                word.flag = false;
				got_a_word(word);

				break;
			case 25:
				nextchar = str.charAt(++end_cur);
				if (nextchar == '=')
					state = 28;
				else if (nextchar == '&')
					state = 27;
				else {
					state = 26;
					end_cur--;
				}

				break;

			case 26:
				word = new Word();
				word.id = word_count;
                word.line = line;
                word.value = str.substring(start_cur, end_cur+1);
                word.type = Word.isWhat(word.value);
                word.flag = false;
				got_a_word(word);

				break;
			case 27:
				word = new Word();
				word.id = word_count;
                word.line = line;
                word.value = str.substring(start_cur, end_cur+1);
                word.type = Word.isWhat(word.value);
                word.flag = false;
				got_a_word(word);

				break;
			case 28:
				word = new Word();
				word.id = word_count;
                word.line = line;
                word.value = str.substring(start_cur, end_cur+1);
                word.type = Word.isWhat(word.value);
                word.flag = false;
				got_a_word(word);

				break;
			case 29:
				nextchar = str.charAt(++end_cur);
				if (nextchar == '=')
					state = 32;
				else {
					state = 30;
					end_cur--;
				}

				break;
			case 30:
				word = new Word();
				word.id = word_count;
                word.line = line;
                word.value = str.substring(start_cur, end_cur+1);
                word.type = Word.isWhat(word.value);
                word.flag = false;
				got_a_word(word);

				break;
			case 32:
				word = new Word();
				word.id = word_count;
                word.line = line;
                word.value = str.substring(start_cur, end_cur+1);
                word.type = Word.isWhat(word.value);
                word.flag = false;
				got_a_word(word);

				break;
			case 33:
				nextchar = str.charAt(++end_cur);
				if (nextchar == '=')
					state = 35;
				else {
					state = 34;
					end_cur--;
				}

				break;
			case 34:
				word = new Word();
				word.id = word_count;
                word.line = line;
                word.value = str.substring(start_cur, end_cur+1);
                word.type = Word.isWhat(word.value);
                word.flag = false;
				got_a_word(word);

				break;
			case 35:
				word = new Word();
				word.id = word_count;
                word.line = line;
                word.value = str.substring(start_cur, end_cur+1);
                word.type = Word.isWhat(word.value);
                word.flag = false;
				got_a_word(word);

				break;
			case 36:
				nextchar = str.charAt(++end_cur);
				if (nextchar == '=')
					state = 38;
				else if (nextchar == '<')
					state = 39;
				else {
					state = 37;
					end_cur--;
				}

				break;
			case 37:
				word = new Word();
				word.id = word_count;
                word.line = line;
                word.value = str.substring(start_cur, end_cur+1);
                word.type = Word.isWhat(word.value);
                word.flag = false;
				got_a_word(word);

				break;
			case 38:
				word = new Word();
				word.id = word_count;
                word.line = line;
                word.value = str.substring(start_cur, end_cur+1);
                word.type = Word.isWhat(word.value);
                word.flag = false;
				got_a_word(word);

				break;
			case 39:
				nextchar = str.charAt(++end_cur);
				if (nextchar == '=')
					state = 41;
				else {
					state = 40;
					end_cur--;
				}

				break;
			case 40:
				word = new Word();
				word.id = word_count;
                word.line = line;
                word.value = str.substring(start_cur, end_cur+1);
                word.type = Word.isWhat(word.value);
                word.flag = false;
				got_a_word(word);

				break;
			case 41:
				word = new Word();
				word.id = word_count;
                word.line = line;
                word.value = str.substring(start_cur, end_cur+1);
                word.type = Word.isWhat(word.value);
                word.flag = false;
				got_a_word(word);

				break;
			case 42:
				nextchar = str.charAt(++end_cur);
				if (nextchar == '=')
					state = 50;
				else if (nextchar == '>')
					state = 44;
				else {
					state = 43;
					end_cur--;
				}

				break;
			case 43:
				word = new Word();
				word.id = word_count;
                word.line = line;
                word.value = str.substring(start_cur, end_cur+1);
                word.type = Word.isWhat(word.value);
                word.flag = false;
				got_a_word(word);

				break;
			case 44:
				nextchar = str.charAt(++end_cur);
				if (nextchar == '=')
					state = 49;
				else if (nextchar == '>')
					state = 46;
				else {
					state = 45;
					end_cur--;
				}

				break;
			case 45:
				word = new Word();
				word.id = word_count;
                word.line = line;
                word.value = str.substring(start_cur, end_cur+1);
                word.type = Word.isWhat(word.value);
                word.flag = false;
				got_a_word(word);

				break;
			case 46:
				nextchar = str.charAt(++end_cur);
				if (nextchar == '=')
					state = 48;
				else {
					state = 47;
					end_cur--;
				}

				break;
			case 47:
				word = new Word();
				word.id = word_count;
                word.line = line;
                word.value = str.substring(start_cur, end_cur+1);
                word.type = Word.isWhat(word.value);
                word.flag = false;
				got_a_word(word);

				break;
			case 48:
				word = new Word();
				word.id = word_count;
                word.line = line;
                word.value = str.substring(start_cur, end_cur+1);
                word.type = Word.isWhat(word.value);
                word.flag = false;
				got_a_word(word);

				break;
			case 49:
				word = new Word();
				word.id = word_count;
                word.line = line;
                word.value = str.substring(start_cur, end_cur+1);
                word.type = Word.isWhat(word.value);
                word.flag = false;
				got_a_word(word);

				break;
			case 50:
				word = new Word();
				word.id = word_count;
                word.line = line;
                word.value = str.substring(start_cur, end_cur+1);
                word.type = Word.isWhat(word.value);
                word.flag = false;
				got_a_word(word);

				break;

			case 51:
				nextchar = str.charAt(++end_cur);
				if (nextchar == '=')
					state = 53;
				else {
					state = 52;
					end_cur--;
				}

				break;
			case 52:
				word = new Word();
				word.id = word_count;
                word.line = line;
                word.value = str.substring(start_cur, end_cur+1);
                word.type = Word.isWhat(word.value);
                word.flag = false;
				got_a_word(word);

				break;
			case 53:
				word = new Word();
				word.id = word_count;
                word.line = line;
                word.value = str.substring(start_cur, end_cur+1);
                word.type = Word.isWhat(word.value);
                word.flag = false;
				got_a_word(word);

				break;
			case 54:
				nextchar = str.charAt(++end_cur);
				if (nextchar == '=')
					state = 56;
				else {
					state = 55;
					end_cur--;
				}

				break;
			case 55:
				word = new Word();
				word.id = word_count;
                word.line = line;
                word.value = str.substring(start_cur, end_cur+1);
                word.type = Word.isWhat(word.value);
                word.flag = false;
				got_a_word(word);

				break;
			case 56:
				word = new Word();
				word.id = word_count;
                word.line = line;
                word.value = str.substring(start_cur, end_cur+1);
                word.type = Word.isWhat(word.value);
                word.flag = false;
				got_a_word(word);

				break;
			case 57:
				nextchar = str.charAt(++end_cur);
				if (nextchar == '=')
					state = 59;
				else {
					state = 58;
					end_cur--;
				}

				break;
			case 58:
				word = new Word();
				word.id = word_count;
                word.line = line;
                word.value = str.substring(start_cur, end_cur+1);
                word.type = Word.isWhat(word.value);
                word.flag = false;
				got_a_word(word);

				break;
			case 59:
				word = new Word();
				word.id = word_count;
                word.line = line;
                word.value = str.substring(start_cur, end_cur+1);
                word.type = Word.isWhat(word.value);
                word.flag = false;
				got_a_word(word);

				break;
			case 60:
				word = new Word();
				word.id = word_count;
                word.line = line;
                word.value = str.substring(start_cur, end_cur+1);
                word.type = Word.isWhat(word.value);
                word.flag = false;
				got_a_word(word);

				break;

			case 61:
				nextchar = str.charAt(++end_cur);
				if (nextchar == '\'')
					state = 100;
				else {
					state = 62;
				}

				break;
			case 62:
				nextchar = str.charAt(++end_cur);
				if (nextchar == '\'')
					state = 63;
				else {
					state = 100;
					end_cur--;
				}

				break;
			case 63:
				word = new Word();
				word.id = word_count;
                word.line = line;
                word.value = str.substring(start_cur, end_cur+1);
                word.type = Word.isWhat(word.value);
                word.flag = false;
				got_a_word(word);

				break;
			case 64:
				nextchar = str.charAt(++end_cur);
				if (nextchar == '+')
					state = 66;
				else if (nextchar == '=')
					state = 67;
				else {
					state = 65;
					end_cur--;
				}

				break;
			case 65:
				word = new Word();
				word.id = word_count;
                word.line = line;
                word.value = str.substring(start_cur, end_cur+1);
                word.type = Word.isWhat(word.value);
                word.flag = false;
				got_a_word(word);

				break;
			case 66:
				word = new Word();
				word.id = word_count;
                word.line = line;
                word.value = str.substring(start_cur, end_cur+1);
                word.type = Word.isWhat(word.value);
                word.flag = false;
				got_a_word(word);

				break;
			case 67:
				word = new Word();
				word.id = word_count;
                word.line = line;
                word.value = str.substring(start_cur, end_cur+1);
                word.type = Word.isWhat(word.value);
                word.flag = false;
				got_a_word(word);

				break;
			case 68:
				nextchar = str.charAt(++end_cur);
				if (nextchar == '-')
					state = 70;
				else if (nextchar == '=')
					state = 71;
				else {
					state = 69;
					end_cur--;
				}

				break;
			case 69:
				word = new Word();
				word.id = word_count;
                word.line = line;
                word.value = str.substring(start_cur, end_cur+1);
                word.type = Word.isWhat(word.value);
                word.flag = false;
				got_a_word(word);

				break;
			case 70:
				word = new Word();
				word.id = word_count;
                word.line = line;
                word.value = str.substring(start_cur, end_cur+1);
                word.type = Word.isWhat(word.value);
                word.flag = false;
				got_a_word(word);

				break;
			case 71:
				word = new Word();
				word.id = word_count;
                word.line = line;
                word.value = str.substring(start_cur, end_cur+1);
                word.type = Word.isWhat(word.value);
                word.flag = false;
				got_a_word(word);

				break;
			case 72:
				nextchar = str.charAt(++end_cur);
				if (nextchar == 'X' || nextchar == 'x')
					state = 73;
				else if (nextchar >= '0' && nextchar <= '9')
					state = 80;
				else if (nextchar == '.')
					state = 83;
				else if (nextchar == 'E' || nextchar == 'e')
					state = 86;
				else {
					state = 89;
					end_cur--;
				}

				break;
			case 73:
				nextchar = str.charAt(++end_cur);
				if ((nextchar >= '0' && nextchar <= '9')
						|| (nextchar >= 'a' && nextchar <= 'f')
						|| (nextchar >= 'A' && nextchar <= 'F'))
					state = 74;
				else {
					state = 100;
					end_cur--;
				}

				break;
			case 74:
				nextchar = str.charAt(++end_cur);
				while ((nextchar >= 'a' && nextchar <= 'f')
						|| (nextchar >= '0' && nextchar <= '9')
						|| (nextchar >= 'A' && nextchar <= 'F')) {
					nextchar = str.charAt(++end_cur);
				}

				state = 75;
				end_cur--;

				break;
			case 75:
				word = new Word();
				word.id = word_count;
                word.line = line;
                word.value = str.substring(start_cur, end_cur+1);
                word.type = Word.isWhat(word.value);
                word.flag = false;
				got_a_word(word);

				state = 76;

				break;
			case 76:
				state = 77;

				break;
			case 77:
				nextchar = str.charAt(++end_cur);
				while (nextchar == ' ') {
					nextchar = str.charAt(++end_cur);
				}

				if (nextchar == '+' || nextchar == '-')
					state = 79;
				else {
					state = 78;
					end_cur--;
				}

				break;
			case 78:
				end_cur--;
				got_a_word();

				break;
			case 79:
				word = new Word();
				word.id = word_count;
                word.line = line;
                word.value = str.substring(start_cur, end_cur+1);
                word.type = Word.isWhat(word.value);
                word.flag = false;
				got_a_word(word);

				break;
			case 80:
				nextchar = str.charAt(++end_cur);
				while (nextchar >= '0' && nextchar <= '9') {
					nextchar = str.charAt(++end_cur);
				}
				if (nextchar == 'L' || nextchar == 'l')
					state = 82;
				else if (nextchar == '.')
					state = 83;
				else {
					state = 81;
					end_cur--;
				}

				break;
// －－－－－－－－－－－－－－－－－－－－－－－－数字可能有问题
			case 81:
				word = new Word();
				word.id = word_count;
                word.line = line;
                word.value = str.substring(start_cur, end_cur+1);
                word.type = Word.isWhat(word.value);
                word.flag = false;
				got_a_word(word);

				break;
			case 82:
				word = new Word();
				word.id = word_count;
                word.line = line;
                word.value = str.substring(start_cur, end_cur+1);
                word.type = Word.isWhat(word.value);
                word.flag = false;
				got_a_word(word);

				break;
			case 83:
				nextchar = str.charAt(++end_cur);
				while (nextchar >= '0' && nextchar <= '9') {
					nextchar = str.charAt(++end_cur);
				}
				if (nextchar == 'F' || nextchar == 'f')
					state = 85;
				else {
					state = 84;
					end_cur--;
				}

				break;
			case 84:
				word = new Word();
				word.id = word_count;
                word.line = line;
                word.value = str.substring(start_cur, end_cur+1);
                word.type = Word.isWhat(word.value);
                word.flag = false;
				got_a_word(word);

				break;
			case 85:
				word = new Word();
				word.id = word_count;
                word.line = line;
                word.value = str.substring(start_cur, end_cur+1);
                word.type = Word.isWhat(word.value);
                word.flag = false;
				got_a_word(word);

				break;
			case 86:
				nextchar = str.charAt(++end_cur);
				if (nextchar >= '0' && nextchar <= '9')
					state = 87;
				else {
					state = 100;
					end_cur--;
				}

				break;
			case 87:
				nextchar = str.charAt(++end_cur);
				while (nextchar >= '0' && nextchar <= '9') {
					nextchar = str.charAt(++end_cur);
				}

				state = 88;
				end_cur--;

				break;
			case 88:
				word = new Word();
				word.id = word_count;
                word.line = line;
                word.value = str.substring(start_cur, end_cur+1);
                word.type = Word.isWhat(word.value);
                word.flag = false;
				got_a_word(word);

				break;
			case 89:
				word = new Word();
				word.id = word_count;
                word.line = line;
                word.value = str.substring(start_cur, end_cur+1);
                word.type = Word.isWhat(word.value);
                word.flag = false;
				got_a_word(word);

				break;
			case 90:
				nextchar = str.charAt(++end_cur);

				while (nextchar >= '0' && nextchar <= '9')
					nextchar = str.charAt(++end_cur);

				if (nextchar == 'L' || nextchar == 'l')
					state = 92;
				else if (nextchar == '.')
					state = 83;
				else if (nextchar == 'E' || nextchar == 'e')
					state = 86;
				else if ((nextchar >= 'a' && nextchar <= 'z')
						|| (nextchar >= 'A' && nextchar <= 'Z')
						|| (nextchar >= '!' && nextchar <= '$')
						|| (nextchar >= '!' && nextchar <= '$')
						|| nextchar == '_') {
					state = 100;
					end_cur--;
				} else {
					state = 91;
					end_cur--;
				}

				break;
			case 91:
				word = new Word();
				word.id = word_count;
                word.line = line;
                word.value = str.substring(start_cur, end_cur+1);
                word.type = Word.isWhat(word.value);
                word.flag = false;
				got_a_word(word);

				break;
			case 92:
				word = new Word();
				word.id = word_count;
                word.line = line;
                word.value = str.substring(start_cur, end_cur+1);
                word.type = Word.isWhat(word.value);
                word.flag = false;
				got_a_word(word);

				break;
			case 93:
				nextchar = str.charAt(++end_cur);
				if (nextchar >= '0' && nextchar <= '9')
					state = 83;
				else {
					state = 94;
					end_cur--;
				}

				break;
			case 94:
				word = new Word();
				word.id = word_count;
                word.line = line;
                word.value = str.substring(start_cur, end_cur+1);
                word.type = Word.isWhat(word.value);
                word.flag = false;
				got_a_word(word);

				break;
			case 95:
				word = new Word();
				word.id = word_count;
                word.line = line;
                word.value = str.substring(start_cur, end_cur+1);
                word.type = Word.isWhat(word.value);
                word.flag = false;
				got_a_word(word);

				break;

			case 100:
				nextchar = str.charAt(++end_cur);
				while (nextchar == '_' || nextchar == '$' || nextchar == '.'
						|| (nextchar >= 'a' && nextchar <= 'z')
						|| (nextchar >= 'A' && nextchar <= 'Z'))
					nextchar = str.charAt(++end_cur);

				state = 101;
				end_cur--;

				break;

			case 101:
				word = new Word();
				word.id = word_count;
                word.line = line;
                word.value = str.substring(start_cur, end_cur+1);
                word.type = Word.isWhat(word.value);
                word.flag = false;
                
				Error err = new Error(error_count, "", line, word);
				errorsArrayList.add(err);
				
				got_a_word();

				break;

			default:
				word = new Word();
				word.id = word_count;
                word.line = line;
                word.value = str.substring(start_cur, end_cur+1);
                word.type = Word.isWhat(word.value);
                word.flag = false;
				got_a_word(word);

				break;

			}

			
		}

	}


}
