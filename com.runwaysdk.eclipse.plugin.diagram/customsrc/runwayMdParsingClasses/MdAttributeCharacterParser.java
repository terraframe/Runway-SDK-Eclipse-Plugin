package runwayMdParsingClasses;

import org.w3c.dom.NamedNodeMap;


import com.runwaysdk.eclipse.plugin.runway.MDAttributeCharacter;
import com.runwaysdk.eclipse.plugin.runway.RunwayFactory;
import com.runwaysdk.eclipse.plugin.schema.importer.XMLTags;

public class MdAttributeCharacterParser extends MdAttributeParser{

	public MdAttributeCharacterParser(NamedNodeMap nodeMap) {
		super(RunwayFactory.eINSTANCE.createMDAttributeCharacter(), nodeMap);
	}

	@Override
	public MDAttributeCharacter parse(){
		MDAttributeCharacter mdAttributeCharacter = getMetaData();
		if(nodeMap.getNamedItem(XMLTags.CHARACTER_TAG) != null){
			mdAttributeCharacter.setDefaultValue((nodeMap.getNamedItem(XMLTags.CHARACTER_TAG).getNodeValue()).charAt(0));
		}


		
		System.out.println("Value not present in Attribute Character");

		return (MDAttributeCharacter)super.parse();

	}

	@Override
	protected MDAttributeCharacter getMetaData(){
		return (MDAttributeCharacter)super.getMetaData();
	}

}