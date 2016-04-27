package bit.minisys.minicc;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

public class BITMiniCC {
	/**
	 * @param args
	 * @throws IOException 
	 * @throws SAXException 
	 * @throws ParserConfigurationException 
	 */
	public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {
		//System.out.println(System.getProperty("user.dir"));
		if(args.length < 1){
			usage();
			return;
		}
		String file = args[0];
		if(file.indexOf(".c") < 0){
			System.out.println("Incorrect input file:" + file);
			return;
		}
//		System.out.println(file);
		MiniCCompiler cc = new MiniCCompiler();
		System.out.println("Start to compile ...");
//		System.out.println(System.getProperty("user.dir"));
		cc.run(file);
		System.out.println("Compiling completed!");
	}
	
	public static void usage(){
		System.out.println("USAGE: BITMiniCC FILE_NAME.c");
	}
}
