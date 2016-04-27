package bit.minisys.minicc;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import bit.minisys.minicc.codegen.MiniCCCodeGen;
import bit.minisys.minicc.icgen.MiniCCICGen;
import bit.minisys.minicc.optimizer.MiniCCOptimizer;
import bit.minisys.minicc.scanner.MiniCCScanner;
import bit.minisys.minicc.semantic.MiniCCSemantic;
import bit.minisys.minicc.parser.MiniCCParser;
import bit.minisys.minicc.pp.MiniCCPreProcessor;
//import bit.minisys.minicc.scanner.MiniCCScannerInternal;
import bit.minisys.minicc.simulator.MIPSSimulator;

public class MiniCCompiler {
	MiniCCCfg pp = new MiniCCCfg();
	MiniCCCfg scanning = new MiniCCCfg();
	MiniCCCfg parsing = new MiniCCCfg();
	MiniCCCfg semantic = new MiniCCCfg();
	MiniCCCfg icgen = new MiniCCCfg();
	MiniCCCfg optimizing = new MiniCCCfg();
	MiniCCCfg codegen = new MiniCCCfg();
	MiniCCCfg simulating = new MiniCCCfg();
	
	private void readConfig() throws ParserConfigurationException, SAXException, IOException{
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document doc = db.parse(".\\config.xml");
//		System.out.println("path: " + path);
		NodeList nodeList = doc.getElementsByTagName("phase");
		for (int i = 0; i < nodeList.getLength(); i++){
			Element temp = (Element) nodeList.item(i);
//			System.out.println(temp.getAttribute("type") +  temp.getAttribute("path"));
			switch(temp.getAttribute("name")){
			case "pp":
				pp.type = temp.getAttribute("type");
				pp.path = temp.getAttribute("path");
				pp.skip = temp.getAttribute("skip");
				break;
			case "scanning":
				scanning.type = temp.getAttribute("type");
				scanning.path = temp.getAttribute("path");
				scanning.skip = temp.getAttribute("skip");
				break;
			case "parsing":
				parsing.type = temp.getAttribute("type");
				parsing.path = temp.getAttribute("path");
				parsing.skip = temp.getAttribute("skip");
				break;
			case "semantic":
				semantic.type = temp.getAttribute("type");
				semantic.path = temp.getAttribute("path");
				semantic.skip = temp.getAttribute("skip");
				break;
			case "icgen":
				icgen.type = temp.getAttribute("type");
				icgen.path = temp.getAttribute("path");
				icgen.skip = temp.getAttribute("skip");
				break;
			case "optimizing":
				optimizing.type = temp.getAttribute("type");
				optimizing.path = temp.getAttribute("path");
				optimizing.skip = temp.getAttribute("skip");
				break;
			case "codegen":
				codegen.type = temp.getAttribute("type");
				codegen.path = temp.getAttribute("path");
				codegen.skip = temp.getAttribute("skip");
				break;
			case "simulating":
				simulating.type = temp.getAttribute("type");
				simulating.path = temp.getAttribute("path");
				simulating.skip = temp.getAttribute("skip");
				break;
			}
		}
	}
	
	public void run(String cFile) throws IOException, ParserConfigurationException, SAXException{
		
		readConfig();
		
		// step 1: preprocess
		String ppOutFile = cFile.replace(MiniCCCfg.MINICC_PP_INPUT_EXT, MiniCCCfg.MINICC_PP_OUTPUT_EXT);
		MiniCCPreProcessor prep = new MiniCCPreProcessor();
		if(pp.skip.equals("false")){
			if(pp.type.equals("java")){
				prep.run(cFile, ppOutFile);
			}else{
				this.run(cFile, ppOutFile, pp.path);
			}
		}
		
		// step 2: scan
		String scOutFile = ppOutFile.replace(MiniCCCfg.MINICC_PP_OUTPUT_EXT, MiniCCCfg.MINICC_SCANNER_OUTPUT_EXT);
		MiniCCScanner sc = new MiniCCScanner();
		if(scanning.skip.equals("false")){
			if(scanning.type.equals("java")){
				sc.run(ppOutFile, scOutFile);
			}else{
				this.run(ppOutFile, scOutFile, scanning.path);
			}
		}
		
		// step 3: parser
		String pOutFile = scOutFile.replace(MiniCCCfg.MINICC_SCANNER_OUTPUT_EXT, MiniCCCfg.MINICC_PARSER_OUTPUT_EXT);
		MiniCCParser p = new MiniCCParser();
		if(parsing.skip.equals("false")){
			if(parsing.type.equals("java")){
				p.run(scOutFile, pOutFile);
			}else{
				this.run(scOutFile, pOutFile, parsing.path);
			}
		}
		
		// step 4: semantic
		String seOutFile = pOutFile.replace(MiniCCCfg.MINICC_PARSER_OUTPUT_EXT, MiniCCCfg.MINICC_SEMANTIC_OUTPUT_EXT);
		MiniCCSemantic se = new MiniCCSemantic();
		if(semantic.skip.equals("false")){
			if(semantic.type.equals("java")){
				se.run(pOutFile, seOutFile);
			}else{
				this.run(pOutFile, seOutFile, semantic.path);
			}
		}

		// step 5: intermediate code generate
		String icOutFile = seOutFile.replace(MiniCCCfg.MINICC_SEMANTIC_OUTPUT_EXT, MiniCCCfg.MINICC_ICGEN_OUTPUT_EXT);
		MiniCCICGen ic = new MiniCCICGen();
		if(icgen.skip.equals("false")){
			if(icgen.type.equals("java")){
				ic.run(seOutFile, icOutFile);
			}else{
				this.run(seOutFile, icOutFile, icgen.path);
			}
		}
		
		// step 6: optimization
		String oOutFile = icOutFile.replace(MiniCCCfg.MINICC_ICGEN_OUTPUT_EXT, MiniCCCfg.MINICC_OPT_OUTPUT_EXT);
		MiniCCOptimizer o = new MiniCCOptimizer();
		if(optimizing.skip.equals("false")){
			if(optimizing.type.equals("java")){
				o.run(icOutFile, oOutFile);
			}else{
				this.run(icOutFile, oOutFile, optimizing.path);
			}
		}

		// step 7: code generate
		String cOutFile = oOutFile.replace(MiniCCCfg.MINICC_OPT_OUTPUT_EXT, MiniCCCfg.MINICC_CODEGEN_OUTPUT_EXT);
		MiniCCCodeGen g = new MiniCCCodeGen();
		if(codegen.skip.equals("false")){
			if(codegen.type.equals("java")){
				g.run(oOutFile, cOutFile);
			}else{
				this.run(oOutFile, cOutFile, codegen.path);
			}
		}
		
		// step 8: simulate
		MIPSSimulator m = new MIPSSimulator();
		if(simulating.skip.equals("false")){
			m.run(cOutFile);
		}
		
	}
	
	private void run(String iFile, String oFile, String path) throws IOException{
		Runtime rt = Runtime.getRuntime();//格式：exe名 输入文件 输出文件
		rt.exec(path + " " + iFile + " " + oFile);
	}
}
