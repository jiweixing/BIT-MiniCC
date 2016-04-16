package bit.minisys.minicc;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import bit.minisys.minicc.assembler.MiniCCAssembler;
import bit.minisys.minicc.codegen.MiniCCCodeGen;
import bit.minisys.minicc.optimizer.MiniCCOptimizer;
import bit.minisys.minicc.scanner.LexAnalyse;
import bit.minisys.minicc.scanner.MiniCCScanner;
import bit.minisys.minicc.parser.MiniCCParser;
import bit.minisys.minicc.pp.MiniCCPreProcessor;
import bit.minisys.minicc.simulator.MIPSSimulator;

public class MiniCCompiler {
	
	public void run(String cFile) throws IOException, ParserConfigurationException, SAXException{
		
		// step 1: preprocess
		String ppOutFile = cFile.replace(MiniCCCfg.MINICC_PP_INPUT_EXT, MiniCCCfg.MINICC_PP_OUTPUT_EXT);
		MiniCCPreProcessor pp = new MiniCCPreProcessor();
		pp.run(cFile, ppOutFile);
		
		// step 2: lexanalyse
		String sOutFile = ppOutFile.replace(MiniCCCfg.MINICC_PP_OUTPUT_EXT, MiniCCCfg.MINICC_SCANNER_OUTPUT_EXT);
		MiniCCScanner s = new MiniCCScanner();
		s.run(ppOutFile, sOutFile);
		
		// step 3: parser
		String pOutFile = sOutFile.replace(MiniCCCfg.MINICC_SCANNER_OUTPUT_EXT, MiniCCCfg.MINICC_PARSER_OUTPUT_EXT);
		MiniCCParser p = new MiniCCParser();
		p.run(sOutFile, pOutFile);
		
		// step 4: code generate
		String cOutFile = pOutFile.replace(MiniCCCfg.MINICC_PARSER_OUTPUT_EXT, MiniCCCfg.MINICC_CODEGEN_OUTPUT_EXT);
		MiniCCCodeGen g = new MiniCCCodeGen();
		g.run(pOutFile, cOutFile);
				
		// step 5: optimization
		String oOutFile = cOutFile.replace(MiniCCCfg.MINICC_CODEGEN_OUTPUT_EXT, MiniCCCfg.MINICC_OPT1_OUTPUT_EXT);
		MiniCCOptimizer o = new MiniCCOptimizer();
		o.run(cOutFile, oOutFile);

		// step 6: assemble
		String aOutFile = oOutFile.replace(MiniCCCfg.MINICC_OPT1_OUTPUT_EXT, MiniCCCfg.MINICC_ASSEMBLER_OUTPUT_EXT);
		MiniCCAssembler a = new MiniCCAssembler();
		a.run(oOutFile, aOutFile);
		
		// step 7: simulate
		MIPSSimulator m = new MIPSSimulator();
		m.run(aOutFile);
		
	}
}
