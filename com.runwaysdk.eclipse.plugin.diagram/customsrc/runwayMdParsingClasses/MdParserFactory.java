package runwayMdParsingClasses;

import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

import com.runwaysdk.eclipse.plugin.schema.importer.XMLTags;
import com.runwaysdk.eclipse.plugin.runway.MetaData;

public class MdParserFactory {


	public MdParserFactory(){}

	
	/**
	 * The polymorphic parser 
	 * @param node
	 * @return The instantiated and parsed EMF object for that node
	 */
	public MetaData getContentFromNode(Node node){
		String nodeName = node.getNodeName();
		NamedNodeMap nodeMap = node.getAttributes();

		MdMetaDataParser contentParser = null; 

		if(nodeName == XMLTags.MD_BUSINESS_TAG){
			contentParser = new MdBusinessParser(nodeMap);
		}
		else if (nodeName == XMLTags.CHARACTER_TAG) {
			contentParser = new MdAttributeCharacterParser(nodeMap); 
		}
		else if (nodeName == XMLTags.TEXT_TAG) {
			contentParser = new MdAttributeTextParser(nodeMap);
		}
		else if (nodeName == XMLTags.DATE_TAG) {
			contentParser = new MdAttributeDateParser(nodeMap);
		}
		else if (nodeName == XMLTags.ENUMERATION_TAG) {
			contentParser = new MdAttributeEnumerationParser(nodeMap);
		}
		else if (nodeName == XMLTags.INTEGER_TAG) {
			//contentParser = new MdAttributeintParser(nodeMap);
		}


		return contentParser.parse();
	}
}
