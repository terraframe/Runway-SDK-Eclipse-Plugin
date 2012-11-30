package xmlParserTest;

import java.io.IOException;

import  javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * Just a way to get XML parsing up and running/testing
 * @author armiller5
 *
 */
public class XMLStarterTest {

	/**
	 * @param args
	 * @throws ParserConfigurationException 
	 * @throws IOException 
	 * @throws SAXException 
	 */
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {

		try {

			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser saxParser = factory.newSAXParser();

			DefaultHandler handler = new RunwayXMLHandler();

			saxParser.parse("/Users/armiller5/Documents/workspace/RunwayTemplate/doc/individual/schema(0001352140861497)HelloWorld.xml", handler);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
