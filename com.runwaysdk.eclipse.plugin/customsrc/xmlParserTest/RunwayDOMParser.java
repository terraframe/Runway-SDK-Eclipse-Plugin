package xmlParserTest;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;


import org.w3c.dom.Document;

public class RunwayDOMParser {

	/**
	 * @param args
	 */
	public static void main(String[] args) {




		try {

			File fXmlFile = new File("/Users/armiller5/Documents/workspace/RunwayTemplate/doc/individual/schema(0001352140861497)HelloWorld.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(fXmlFile);
			doc.getDocumentElement().normalize();

			System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
			NodeList nList = doc.getElementsByTagName("staff");
			System.out.println("-----------------------");

			for (int temp = 0; temp < nList.getLength(); temp++) {

				Node nNode = nList.item(temp);
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {

					Element eElement = (Element) nNode;

					System.out.println("MDBusiness : " + getTagValue(XMLTags.MD_BUSINESS_TAG, eElement));
					System.out.println("Last Name : " + getTagValue("lastname", eElement));
					System.out.println("Nick Name : " + getTagValue("nickname", eElement));
					System.out.println("Salary : " + getTagValue("salary", eElement));

				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static String getTagValue(String sTag, Element eElement) {
		NodeList nlList = eElement.getElementsByTagName(sTag).item(0).getChildNodes();

		Node nValue = (Node) nlList.item(0);

		return nValue.getNodeValue();
	}

}

