package runwayMdParsingClasses;


import org.w3c.dom.NamedNodeMap;

import com.runwaysdk.eclipse.plugin.runway.MDElement;
import com.runwaysdk.eclipse.plugin.runway.MDEntity;
import com.runwaysdk.eclipse.plugin.schema.importer.XMLTags;

public abstract class MdEntityParser extends MdClassParser {

	public MdEntityParser(MDElement mdElement, NamedNodeMap nodeMap){
		super(mdElement, nodeMap);
	}
	
	public MDEntity parse(){
		MDEntity entity = getMdType();
		entity.setTable(nodeMap.getNamedItem(XMLTags.ENTITY_TABLE).getNodeValue());
		entity.setGenerateController(Boolean.parseBoolean(nodeMap.getNamedItem(XMLTags.GENERATE_CONTROLLER).getNodeValue()));
		entity.setEnforceSiteMaster(Boolean.parseBoolean(nodeMap.getNamedItem(XMLTags.ENFORCE_SITE_MASTER_ATTRIBUTE).getNodeValue()));
		return (MDEntity)super.parse();
		}
	
	protected MDEntity getMdType(){
		return (MDEntity)super.getMdType();
	}
}
