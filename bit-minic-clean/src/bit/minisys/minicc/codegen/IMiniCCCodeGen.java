package bit.minisys.minicc.codegen;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

public interface IMiniCCCodeGen {
	public void run(String iFile, String oFile) throws IOException, ParserConfigurationException, SAXException;
}
