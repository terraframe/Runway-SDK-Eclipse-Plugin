package xmlParserTest;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.NamedNodeMap;
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
			File fXmlFile = new File("../com.runwaysdk.eclipse.plugin/doc/HelloWorld.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(fXmlFile);
			doc.getDocumentElement().normalize();

			System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
			NodeList mdBusinessNodeList = doc.getElementsByTagName(XMLTags.MD_BUSINESS_TAG);
			System.out.println("-----------------------");

			for (int i = 0; i < mdBusinessNodeList.getLength(); i++) {

				Node mdBusinessNode = mdBusinessNodeList.item(i);
				NodeList mdBusinessChildNodeList = mdBusinessNode.getChildNodes();

				//Get MDBusiness Attribute Information
				printAttribtues(mdBusinessNode.getAttributes(), "MDBusiness Attribute Information");

				for (int j = 0; j < mdBusinessChildNodeList.getLength(); j++) {
					Node child = mdBusinessChildNodeList.item(j);
					System.out.println(child.getNodeName());
					NodeList mdBusinessGrandChildNodeList = child.getChildNodes();
					
					
					//Something is breaking here. Has to do with #text
					//FIXME 
					for (int k = 0; k < mdBusinessGrandChildNodeList.getLength(); k++) {
						Node grandChild = mdBusinessGrandChildNodeList.item(k);
						if (grandChild.getNodeName() == "#text") return;
						printAttribtues(grandChild.getAttributes(), "Attributes for: " + grandChild.getNodeName());

						String grandChildMessage = grandChild.getNodeName() == null ? "GRAND CHILD NAME NULL" : grandChild.getNodeName();
						System.out.println(grandChildMessage);

					}

				}
				//System.out.println("Attribute : " + getTagValue(XMLTags.ATTRIBUTES_TAG, eElement));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void printAttribtues(NamedNodeMap nodeMap, String customMessage){
		System.out.println(customMessage);
		for (int p = 0; p < nodeMap.getLength(); p++) {
			System.out.println(nodeMap.item(p).getNodeName() + " = "
					+ nodeMap.item(p).getNodeValue());
		}
		
	}
	
	private static String getTagValue(String sTag, Element eElement) {
		NodeList nlList = eElement.getElementsByTagName(sTag).item(0).getChildNodes();

		Node nValue = (Node) nlList.item(0);

		return nValue.getNodeValue();
	}

	private static String getTagValueExperimental(String sTag, Node node) {

		return null;
	}

}

