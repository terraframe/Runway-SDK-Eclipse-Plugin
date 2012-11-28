package xmlParserTest;

import java.io.IOException;

import  javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.File;
import java.io.Writer;
import java.io.FileNotFoundException;

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

			DefaultHandler handler = new DefaultHandler() {

				Writer writer = null;



				public void startElement(String uri, String localName,String qName, 
						Attributes attributes) throws SAXException {
					try {
						File file = new File("/Users/armiller5/Documents/Runway-Eclipse-Plugin/XMLPARSE.txt");
						writer = new BufferedWriter(new FileWriter(file));


						System.out.println("Start Element :" + qName);

						if (qName.equalsIgnoreCase("FIRSTNAME")) {
							writer.write("Found this element!/n");
						}

						if (qName.equalsIgnoreCase(XMLTags.MD_BUSINESS_TAG)) {
							writer.write("HERE IS OUR BUSINESS TAG!!/n");
						}

						if (qName.equalsIgnoreCase("NICKNAME")) {
							writer.write("Found this element!/n");
						}
					}
					catch (FileNotFoundException e) {
						e.printStackTrace();
					} catch (IOException e) {
						e.printStackTrace();
					}
					finally {
						try {
							if (writer != null) {
								writer.close();
							}
						} catch (IOException e) {
							e.printStackTrace();
						}
					}

				}


				public void endElement(String uri, String localName,
						String qName) throws SAXException {

					System.out.println("End Element :" + qName);

				}

				public void characters(char ch[], int start, int length) throws SAXException {

					System.out.println("-----Tag value----------->"+new String(ch, start, length));

				}

			};

			saxParser.parse("c:\\file.xml", handler);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
