package xmlParserTest;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import xmlRunwayMetaObject.RunwayAttribute;
import xmlRunwayMetaObject.RunwayObject;

/**
 * A simple XML SAX parser designed to handle Runway XML
 * @author armiller5
 *
 */
public class RunwayXMLHandler extends DefaultHandler {

	public RunwayXMLHandler(){
		super();
	}
	
	Writer writer = null;
	List<RunwayObject> allRunwayObjects = new ArrayList<RunwayObject>();

	public void startElement(String uri, String localName,String qName, 
			Attributes attributes) throws SAXException {
		try {
			File file = new File("/Users/armiller5/Documents/Runway-Eclipse-Plugin/XMLPARSE.txt");
			writer = new BufferedWriter(new FileWriter(file));

			writer.write("Start of our write file: ");

		//	System.out.println("Start Element :" + qName);


			if (qName.equalsIgnoreCase(XMLTags.MD_BUSINESS_TAG)) {
				writer.write("HERE IS OUR BUSINESS TAG: ");
				System.out.println("HERE IS OUR BUSINESS TAG!");
				String name = attributes.getValue(XMLTags.NAME_ATTRIBUTE);
				String label = attributes.getValue(XMLTags.DISPLAY_LABEL_ATTRIBUTE);
				System.out.println("Name of Business Tag: " + name);
				System.out.println("Label of Business Tag: " + attributes.getValue(XMLTags.DISPLAY_LABEL_ATTRIBUTE));
				RunwayObject tempObject = new RunwayObject(name, label);
				
			}

			if (qName.equalsIgnoreCase(XMLTags.ATTRIBUTES_TAG)) {
				System.out.println("HERE IS OUR Attribute TAG!");

				RunwayAttribute tempAttribute = new RunwayAttribute();

			}

			if (qName.equalsIgnoreCase(XMLTags.MD_METHOD_TAG)) {
				writer.write("Found this element!/n");
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

	}


	public void endElement(String uri, String localName,
			String qName) throws SAXException {

		if (qName.equalsIgnoreCase(XMLTags.MD_BUSINESS_TAG)) {
			System.out.println("End MDBusiness Tag");
		}

	}

	public void endDocument(){
		try {
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
