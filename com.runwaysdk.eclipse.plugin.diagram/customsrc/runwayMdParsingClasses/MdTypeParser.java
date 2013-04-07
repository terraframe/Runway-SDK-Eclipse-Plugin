package runwayMdParsingClasses;

import org.w3c.dom.NamedNodeMap;

import com.runwaysdk.eclipse.plugin.runway.MDType;
import com.runwaysdk.eclipse.plugin.schema.importer.XMLTags;

public abstract class MdTypeParser {
	MDType mdType;
	NamedNodeMap nodeMap;

	public MdTypeParser(MDType mdType, NamedNodeMap nodeMap){
		this.nodeMap = nodeMap;
		this.mdType = mdType;
	}


	public MDType parse(){

		mdType.setName(nodeMap.getNamedItem(XMLTags.NAME_ATTRIBUTE).getNodeValue());
		mdType.setExported(Boolean.parseBoolean(nodeMap.getNamedItem(XMLTags.EXPORTED_ATTRIBUTE).getNodeValue()));

		//Parse MetaData stuff
		
		mdType.setLabel(nodeMap.getNamedItem(XMLTags.DISPLAY_LABEL_ATTRIBUTE).getNodeValue());
		mdType.setDescription(nodeMap.getNamedItem(XMLTags.DESCRIPTION_ATTRIBUTE).getNodeValue());
		mdType.setRemovable(nodeMap.getNamedItem(XMLTags.REMOVE_ATTRIBUTE).getNodeValue());
		return this.mdType;
	}

	protected MDType getMdType(){
		return this.mdType;
	}
}
