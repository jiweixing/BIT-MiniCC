package bit.minisys.minicc.parser;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

public interface MiniCCParserInter {
	public void run(String iFile, String oFile) throws ParserConfigurationException, SAXException, IOException;
}
