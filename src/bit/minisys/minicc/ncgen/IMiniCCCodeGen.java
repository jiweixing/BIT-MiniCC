package bit.minisys.minicc.ncgen;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

public interface IMiniCCCodeGen {
	/*
	 * @return String the path of the output file
	 * @param iFile input file path
	 * @param type architecture
	 */
	public String run(String iFile, String type) throws Exception;
}
