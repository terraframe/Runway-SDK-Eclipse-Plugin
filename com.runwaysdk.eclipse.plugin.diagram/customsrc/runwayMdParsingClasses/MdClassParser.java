package runwayMdParsingClasses;


import org.w3c.dom.NamedNodeMap;

import com.runwaysdk.eclipse.plugin.runway.MDClass;
import com.runwaysdk.eclipse.plugin.schema.importer.XMLTags;

public abstract class MdClassParser extends MdTypeParser {
	
	
	public MdClassParser(MDClass mdClass, NamedNodeMap nodeMap){
		super(mdClass, nodeMap);
	}
	

	public MDClass parse(){
		MDClass mdClass = getMdClass();
		mdClass.setPublish(Boolean.parseBoolean(nodeMap.getNamedItem(XMLTags.PUBLISH_ATTRIBUTE).getNodeValue()));
		return (MDClass)super.parse();
		
	}
	
	protected MDClass getMdClass(){
		return (MDClass)super.getMdType();
	}
}
