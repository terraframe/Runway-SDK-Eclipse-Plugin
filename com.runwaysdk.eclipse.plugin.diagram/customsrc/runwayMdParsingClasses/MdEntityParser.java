package runwayMdParsingClasses;


import org.w3c.dom.NamedNodeMap;

import com.runwaysdk.eclipse.plugin.runway.MDElement;
import com.runwaysdk.eclipse.plugin.runway.MDEntity;
import com.runwaysdk.eclipse.plugin.schema.importer.XMLTags;

public abstract class MdEntityParser extends MdClassParser {

	public MdEntityParser(MDElement mdElement, NamedNodeMap nodeMap){
		super(mdElement, nodeMap);
	}

	@Override
	public MDEntity parse(){
		MDEntity entity = getMetaData();

		if(nodeMap.getNamedItem(XMLTags.ENTITY_TABLE) != null){
			entity.setTable(nodeMap.getNamedItem(XMLTags.ENTITY_TABLE).getNodeValue());
		}
		else{
			System.out.println("Entity Table not defined");
		}

		if(nodeMap.getNamedItem(XMLTags.GENERATE_CONTROLLER) != null){
			entity.setGenerateController(Boolean.parseBoolean(nodeMap.getNamedItem(XMLTags.GENERATE_CONTROLLER).getNodeValue()));

		}

		if(nodeMap.getNamedItem(XMLTags.ENFORCE_SITE_MASTER_ATTRIBUTE) != null){
			entity.setEnforceSiteMaster(Boolean.parseBoolean(nodeMap.getNamedItem(XMLTags.ENFORCE_SITE_MASTER_ATTRIBUTE).getNodeValue()));

		}

		return (MDEntity)super.parse();

	}

	@Override
	protected MDEntity getMetaData(){
		return (MDEntity)super.getMetaData();
	}
}
