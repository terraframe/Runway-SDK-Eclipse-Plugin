package xmlParserTest;
import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

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
			
	
			for(int i = 0; i < mdBusinessNodeList.getLength(); i++){
				Node mdBusinessNode = mdBusinessNodeList.item(i);
				
				if (mdBusinessNode.getNodeType() == Node.ELEMENT_NODE) {
					NodeList mdBusinessChildNodeList = mdBusinessNode.getChildNodes();
					
					printAttributes(mdBusinessNode.getAttributes(), "MDBusiness Tag Attributes Information");
					for(int j = 0; j < mdBusinessChildNodeList.getLength(); j++){
						Node mdBusinessChildNode = mdBusinessChildNodeList.item(j);
						
						if (mdBusinessChildNode.getNodeType() == Node.ELEMENT_NODE){
							
							NodeList mdBusinessGrandChildNodeList = mdBusinessChildNode.getChildNodes();
							
							//System.out.println(mdBusinessChildNode.getNodeName());
							printAttributes(mdBusinessChildNode.getAttributes(), "Attributes for: "  + mdBusinessChildNode.getNodeName() + " tag");
							for(int k = 0; k < mdBusinessGrandChildNodeList.getLength(); k++){
								Node mdBusinessGrandChildNode = mdBusinessGrandChildNodeList.item(k);
								
								if (mdBusinessGrandChildNode.getNodeType() == Node.ELEMENT_NODE){
									printAttributes(mdBusinessGrandChildNode.getAttributes(), "Attributes for: " + mdBusinessGrandChildNode.getNodeName() + " tag");
								}
							}
							
						}
					}
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void printAttributes(NamedNodeMap nodeMap, String customMessage){
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

}

