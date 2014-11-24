package runwayMdParsingClasses;

import org.w3c.dom.NamedNodeMap;

import com.runwaysdk.eclipse.plugin.runway.MetaData;
import com.runwaysdk.eclipse.plugin.schema.importer.XMLTags;

public class MdMetaDataParser {
	MetaData metaData;
	NamedNodeMap nodeMap;

	public MdMetaDataParser(MetaData metaData, NamedNodeMap nodeMap){
		this.nodeMap = nodeMap;
		this.metaData = metaData;
	}

	public MetaData parse(){

		if(nodeMap.getNamedItem(XMLTags.DISPLAY_LABEL_ATTRIBUTE) != null){
			metaData.setLabel(nodeMap.getNamedItem(XMLTags.DISPLAY_LABEL_ATTRIBUTE).getNodeValue());
		}
		if(nodeMap.getNamedItem(XMLTags.DESCRIPTION_ATTRIBUTE) != null){
			metaData.setDescription(nodeMap.getNamedItem(XMLTags.DESCRIPTION_ATTRIBUTE).getNodeValue());

		}
		if(nodeMap.getNamedItem(XMLTags.REMOVE_ATTRIBUTE) != null){
			metaData.setRemovable(nodeMap.getNamedItem(XMLTags.REMOVE_ATTRIBUTE).getNodeValue());

		}

		return metaData;
	}


	protected MetaData getMetaData(){
		return metaData;
	}

}
