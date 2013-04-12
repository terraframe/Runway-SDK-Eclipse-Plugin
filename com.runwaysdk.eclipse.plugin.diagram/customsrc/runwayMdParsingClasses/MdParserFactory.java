package runwayMdParsingClasses;

import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.runwaysdk.dataaccess.io.dataDefinition.XMLTags;
import com.runwaysdk.eclipse.plugin.runway.MDBusiness;
import com.runwaysdk.eclipse.plugin.runway.MetaData;

public class MdParserFactory {


	public MdParserFactory(){}

	public MetaData getContentFromNode(Node node){
		String nodeName = node.getNodeName();
		NamedNodeMap nodeMap = node.getAttributes();

		MetaData content = null; 

		if(nodeName == XMLTags.MD_BUSINESS_TAG){
			content = getMdBusiness(nodeMap);
		}


		return content;
	}

	private MDBusiness getMdBusiness(NamedNodeMap nodeMap){
		MdBusinessParser businessParser = new MdBusinessParser(nodeMap);
		return businessParser.parse();
	}


	//private MDAttributeBlob getMdAttributeBlob(NamedNodeMap nodeMap){
	//}

}
