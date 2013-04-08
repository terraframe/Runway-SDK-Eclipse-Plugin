package runwayMdParsingClasses;

import org.w3c.dom.NamedNodeMap;


import com.runwaysdk.eclipse.plugin.runway.MDAttribute;
import com.runwaysdk.eclipse.plugin.schema.importer.XMLTags;

public class MdAttributeParser {
	MDAttribute mdAttribute;
	NamedNodeMap nodeMap;

	public MdAttributeParser(MDAttribute mdAttribute, NamedNodeMap nodeMap){
		this.nodeMap = nodeMap;
		this.mdAttribute = mdAttribute;
	}


	public MDAttribute parse(){
		mdAttribute.setName(nodeMap.getNamedItem(XMLTags.NAME_ATTRIBUTE).getNodeValue());
		mdAttribute.setRequired(Boolean.parseBoolean(nodeMap.getNamedItem(XMLTags.REQUIRED_ATTRIBUTE).getNodeValue()));
		mdAttribute.setImmutable(Boolean.parseBoolean(nodeMap.getNamedItem(XMLTags.IMMUTABLE_ATTRIBUTE).getNodeValue()));
		mdAttribute.setDisplayLabel(nodeMap.getNamedItem(XMLTags.NAME_ATTRIBUTE).getNodeValue());
		return this.mdAttribute;
	}

	protected MDAttribute getMdAttribute(){
		return this.mdAttribute;
	}
}
