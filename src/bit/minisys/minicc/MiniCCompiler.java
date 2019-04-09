package bit.minisys.minicc;

import java.io.IOException;
import java.lang.reflect.Method;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import bit.minisys.minicc.pp.MiniCCPreProcessor;
import org.python.util.PythonInterpreter;
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
		Document doc = db.parse("./config.xml");
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
	
	public void run(String cFile) throws Exception{
		
		readConfig();
		
		// step 1: preprocess
		String ppOutFile = cFile.replace(MiniCCCfg.MINICC_PP_INPUT_EXT, MiniCCCfg.MINICC_PP_OUTPUT_EXT);
		
		if(pp.skip.equals("false")){
			if(pp.type.equals("java")){
				if(!pp.path.equals("")){
					Class<?> c = Class.forName(pp.path);
					Method method = c.getMethod("run", String.class, String.class);
					method.invoke(c.newInstance(), cFile, ppOutFile);
				}else{
					MiniCCPreProcessor prep = new MiniCCPreProcessor();
					prep.run(cFile, ppOutFile);
				}
			}else if(pp.type.equals("python")){
				this.runPy(cFile, ppOutFile, pp.path);
			}else{
				this.run(cFile, ppOutFile, pp.path);
			}
		}
		
		// step 2: scan
		String scOutFile = ppOutFile.replace(MiniCCCfg.MINICC_PP_OUTPUT_EXT, MiniCCCfg.MINICC_SCANNER_OUTPUT_EXT);
		
		if(scanning.skip.equals("false")){
			if(scanning.type.equals("java")){
				if(!scanning.path.equals("")){
					Class<?> c = Class.forName(scanning.path);
					Method method = c.getMethod("run", String.class, String.class);
					method.invoke(c.newInstance(), ppOutFile, scOutFile);
				}else{
					MiniCCScanner sc = new MiniCCScanner();
					sc.run(ppOutFile, scOutFile);
				}
			}else if(pp.type.equals("python")){
				this.runPy(ppOutFile, scOutFile, scanning.path);
			}else{
				this.run(ppOutFile, scOutFile, scanning.path);
			}
		}
		
		// step 3: parser
		String pOutFile = scOutFile.replace(MiniCCCfg.MINICC_SCANNER_OUTPUT_EXT, MiniCCCfg.MINICC_PARSER_OUTPUT_EXT);
		
		if(parsing.skip.equals("false")){
			if(parsing.type.equals("java")){
				if(parsing.path != ""){
					Class<?> c = Class.forName(parsing.path);
					Method method = c.getMethod("run", String.class, String.class);
					method.invoke(c.newInstance(), scOutFile, pOutFile);
				}else{
					MiniCCParser p = new MiniCCParser();
					p.run(scOutFile, pOutFile);
				}
			}else if(pp.type.equals("python")){
				this.runPy(scOutFile, pOutFile, parsing.path);
			}else{
				this.run(scOutFile, pOutFile, parsing.path);
			}
		}
		
		// step 4: semantic
		String seOutFile = pOutFile.replace(MiniCCCfg.MINICC_PARSER_OUTPUT_EXT, MiniCCCfg.MINICC_SEMANTIC_OUTPUT_EXT);
		
		if(semantic.skip.equals("false")){
			if(semantic.type.equals("java")){
				if(!semantic.path.equals("")){
					Class<?> c = Class.forName(semantic.path);
					Method method = c.getMethod("run", String.class, String.class);
					method.invoke(c.newInstance(), pOutFile, seOutFile);
				}else{
					MiniCCSemantic se = new MiniCCSemantic();
					se.run(pOutFile, seOutFile);
				}
			}else if(pp.type.equals("python")){
				this.runPy(pOutFile, seOutFile, semantic.path);
			}else{
				this.run(pOutFile, seOutFile, semantic.path);
			}
		}

		// step 5: intermediate code generate
		String icOutFile = seOutFile.replace(MiniCCCfg.MINICC_SEMANTIC_OUTPUT_EXT, MiniCCCfg.MINICC_ICGEN_OUTPUT_EXT);
		
		if(icgen.skip.equals("false")){
			if(icgen.type.equals("java")){
				if(!icgen.path.equals("")){
					Class<?> c = Class.forName(icgen.path);
					Method method = c.getMethod("run", String.class, String.class);
					method.invoke(c.newInstance(), seOutFile, icOutFile);
				}else{
					MiniCCICGen ic = new MiniCCICGen();
					ic.run(seOutFile, icOutFile);
				}
			}else if(pp.type.equals("python")){
				this.runPy(seOutFile, icOutFile, icgen.path);
			}else{
				this.run(seOutFile, icOutFile, icgen.path);
			}
		}
		
		// step 6: optimization
		String oOutFile = icOutFile.replace(MiniCCCfg.MINICC_ICGEN_OUTPUT_EXT, MiniCCCfg.MINICC_OPT_OUTPUT_EXT);
		
		if(optimizing.skip.equals("false")){
			if(optimizing.type.equals("java")){
				if(!optimizing.path.equals("")){
					Class<?> c = Class.forName(optimizing.path);
					Method method = c.getMethod("run", String.class, String.class);
					method.invoke(c.newInstance(), icOutFile, oOutFile);
				}else{
					MiniCCOptimizer o = new MiniCCOptimizer();
					o.run(icOutFile, oOutFile);
				}
			}else if(pp.type.equals("python")){
				this.runPy(icOutFile, oOutFile, optimizing.path);
			}else{
				this.run(icOutFile, oOutFile, optimizing.path);
			}
		}

		// step 7: code generate
		String cOutFile = oOutFile.replace(MiniCCCfg.MINICC_OPT_OUTPUT_EXT, MiniCCCfg.MINICC_CODEGEN_OUTPUT_EXT);
		
		if(codegen.skip.equals("false")){
			if(codegen.type.equals("java")){
				if(!codegen.path.equals("")){
					Class<?> c = Class.forName(codegen.path);
					Method method = c.getMethod("run", String.class, String.class);
					method.invoke(c.newInstance(), oOutFile, cOutFile);
				}else{
					MiniCCCodeGen g = new MiniCCCodeGen();
					g.run(oOutFile, cOutFile);
				}
			}else if(pp.type.equals("python")){
				this.runPy(oOutFile, cOutFile, codegen.path);
			}else{
				this.run(oOutFile, cOutFile, codegen.path);
			}
		}
		
		// step 8: simulate
		if(simulating.skip.equals("false")){
			MIPSSimulator m = new MIPSSimulator();
			m.run(cOutFile);
		}
		
	}
	
	private void run(String iFile, String oFile, String path) throws IOException{
		Runtime rt = Runtime.getRuntime();//格式：exe名 输入文件 输出文件
		Process p = rt.exec(path + " " + iFile + " " + oFile);
		try {
			p.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	private void runPy(String iFile, String oFile, String path) throws IOException{
		PythonInterpreter pyi = new PythonInterpreter();//格式：Python脚本名 输入文件 输出文件
		pyi.exec(path + " " + iFile + " " + oFile);
	}
}
