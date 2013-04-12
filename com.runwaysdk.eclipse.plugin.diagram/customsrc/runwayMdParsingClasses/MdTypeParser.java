package runwayMdParsingClasses;

import org.w3c.dom.NamedNodeMap;

import com.runwaysdk.eclipse.plugin.runway.MDType;
import com.runwaysdk.eclipse.plugin.schema.importer.XMLTags;

public abstract class MdTypeParser extends MdMetaDataParser {


	public MdTypeParser(MDType mdType, NamedNodeMap nodeMap){
		super(mdType, nodeMap);
	}

	@Override
	public MDType parse(){

		MDType mdType = getMetaData();
		
		if(nodeMap.getNamedItem(XMLTags.NAME_ATTRIBUTE) != null){
			mdType.setName(nodeMap.getNamedItem(XMLTags.NAME_ATTRIBUTE).getNodeValue());

		}
		if(nodeMap.getNamedItem(XMLTags.EXPORTED_ATTRIBUTE) != null){
			mdType.setExported(Boolean.parseBoolean(nodeMap.getNamedItem(XMLTags.EXPORTED_ATTRIBUTE).getNodeValue()));

		}


		return (MDType)super.parse();
	}

	@Override
	protected MDType getMetaData(){
		return (MDType)super.metaData
				;
	}
}
