package runwayMdParsingClasses;

import org.w3c.dom.NamedNodeMap;


import com.runwaysdk.eclipse.plugin.runway.MDAttributeBoolean;
import com.runwaysdk.eclipse.plugin.runway.RunwayFactory;
import com.runwaysdk.eclipse.plugin.schema.importer.XMLTags;

public class MdAttributeBooleanParser extends MdAttributeParser{

	public MdAttributeBooleanParser(NamedNodeMap nodeMap) {
		super(RunwayFactory.eINSTANCE.createMDAttributeBoolean(), nodeMap);
	}
	
	public MDAttributeBoolean parser(){
		MDAttributeBoolean mdAttributeBoolean = getMdAttribute();
		mdAttributeBoolean.setDefaultValue(Boolean.parseBoolean(nodeMap.getNamedItem(XMLTags.BOOLEAN_TAG).getNodeValue()));
		return (MDAttributeBoolean)super.parse();
	
	}
	protected MDAttributeBoolean getMdAttribute(){
		return (MDAttributeBoolean)super.getMdAttribute();
	}

}
