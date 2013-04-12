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

		metaData.setLabel(nodeMap.getNamedItem(XMLTags.DISPLAY_LABEL_ATTRIBUTE).getNodeValue());
		metaData.setDescription(nodeMap.getNamedItem(XMLTags.DESCRIPTION_ATTRIBUTE).getNodeValue());
		metaData.setRemovable(nodeMap.getNamedItem(XMLTags.REMOVE_ATTRIBUTE).getNodeValue());
		return metaData;
	}


	protected MetaData getMetaData(){
		return metaData;
	}

}
