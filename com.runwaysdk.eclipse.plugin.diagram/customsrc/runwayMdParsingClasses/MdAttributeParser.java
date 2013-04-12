package runwayMdParsingClasses;

import org.w3c.dom.NamedNodeMap;


import com.runwaysdk.eclipse.plugin.runway.MDAttribute;
import com.runwaysdk.eclipse.plugin.schema.importer.XMLTags;


public abstract class MdAttributeParser extends MdMetaDataParser{

	public MdAttributeParser(MDAttribute mdAttribute, NamedNodeMap nodeMap){
		super(mdAttribute, nodeMap);
	}


	@Override
	public MDAttribute parse(){
		MDAttribute mdAttribute = getMetaData();

		if(nodeMap.getNamedItem(XMLTags.NAME_ATTRIBUTE) != null){
			mdAttribute.setName(nodeMap.getNamedItem(XMLTags.NAME_ATTRIBUTE).getNodeValue());

		}

		if(nodeMap.getNamedItem(XMLTags.REQUIRED_ATTRIBUTE) != null){
			mdAttribute.setRequired(Boolean.parseBoolean(nodeMap.getNamedItem(XMLTags.REQUIRED_ATTRIBUTE).getNodeValue()));

		}

		if(nodeMap.getNamedItem(XMLTags.IMMUTABLE_ATTRIBUTE) != null){
			mdAttribute.setImmutable(Boolean.parseBoolean(nodeMap.getNamedItem(XMLTags.IMMUTABLE_ATTRIBUTE).getNodeValue()));

		}

		if(nodeMap.getNamedItem(XMLTags.NAME_ATTRIBUTE) != null){
			mdAttribute.setDisplayLabel(nodeMap.getNamedItem(XMLTags.NAME_ATTRIBUTE).getNodeValue());

		}

		return (MDAttribute)super.parse();
	}

	@Override
	protected MDAttribute getMetaData(){
		return (MDAttribute)super.getMetaData();
	}
}
