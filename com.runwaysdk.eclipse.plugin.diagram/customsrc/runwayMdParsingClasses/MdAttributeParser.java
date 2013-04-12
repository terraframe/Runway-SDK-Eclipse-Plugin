package runwayMdParsingClasses;

import org.w3c.dom.NamedNodeMap;


import com.runwaysdk.eclipse.plugin.runway.MDAttribute;
import com.runwaysdk.eclipse.plugin.schema.importer.XMLTags;


public class MdAttributeParser extends MdMetaDataParser{

	public MdAttributeParser(MDAttribute mdAttribute, NamedNodeMap nodeMap){
		super(mdAttribute, nodeMap);
	}


	public MDAttribute parse(){
		MDAttribute mdAttribute = getMetaData();
		mdAttribute.setName(nodeMap.getNamedItem(XMLTags.NAME_ATTRIBUTE).getNodeValue());
		mdAttribute.setRequired(Boolean.parseBoolean(nodeMap.getNamedItem(XMLTags.REQUIRED_ATTRIBUTE).getNodeValue()));
		mdAttribute.setImmutable(Boolean.parseBoolean(nodeMap.getNamedItem(XMLTags.IMMUTABLE_ATTRIBUTE).getNodeValue()));
		mdAttribute.setDisplayLabel(nodeMap.getNamedItem(XMLTags.NAME_ATTRIBUTE).getNodeValue());
		return (MDAttribute)super.parse();
	}

	@Override
	protected MDAttribute getMetaData(){
		return (MDAttribute)super.getMetaData();
	}
}
