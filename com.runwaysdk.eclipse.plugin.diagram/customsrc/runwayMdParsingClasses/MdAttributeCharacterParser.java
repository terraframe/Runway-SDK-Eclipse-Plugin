package runwayMdParsingClasses;

import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

import com.runwaysdk.eclipse.plugin.runway.MDAttributeCharacter;
import com.runwaysdk.eclipse.plugin.runway.RunwayFactory;

public class MdAttributeCharacterParser extends MdAttributeParser{

	public MdAttributeCharacterParser(NamedNodeMap nodeMap) {
		super(RunwayFactory.eINSTANCE.createMDAttributeCharacter(), nodeMap);
	}

	@Override
	public MDAttributeCharacter parse(){
		MDAttributeCharacter mdAttributeCharacter = getMetaData();
		
		Node defaultValue = nodeMap.getNamedItem("defaultValue");
        
        if (defaultValue != null)
        {
          mdAttributeCharacter.setDefaultValue(defaultValue.getNodeValue().charAt(0));
        }
		
		return (MDAttributeCharacter)super.parse();

	}

	@Override
	protected MDAttributeCharacter getMetaData(){
		return (MDAttributeCharacter)super.getMetaData();
	}

}