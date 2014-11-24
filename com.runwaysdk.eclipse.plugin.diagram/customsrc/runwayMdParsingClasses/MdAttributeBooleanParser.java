package runwayMdParsingClasses;

import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

import com.runwaysdk.eclipse.plugin.runway.MDAttributeBoolean;
import com.runwaysdk.eclipse.plugin.runway.RunwayFactory;

public class MdAttributeBooleanParser extends MdAttributeParser{

	public MdAttributeBooleanParser(NamedNodeMap nodeMap) {
		super(RunwayFactory.eINSTANCE.createMDAttributeBoolean(), nodeMap);
	}
	
	@Override
	public MDAttributeBoolean parse(){
		MDAttributeBoolean mdAttributeBoolean = getMetaData();
		
		Node defaultValue = nodeMap.getNamedItem("defaultValue");
        
        if (defaultValue != null)
        {
          mdAttributeBoolean.setDefaultValue(Boolean.parseBoolean(defaultValue.getNodeValue()));
        }
		
		return (MDAttributeBoolean)super.parse();
	}
	
	@Override
	protected MDAttributeBoolean getMetaData(){
		return (MDAttributeBoolean)super.getMetaData();
	}

}
