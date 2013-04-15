package runwayMdParsingClasses;

import org.w3c.dom.NamedNodeMap;

import com.runwaysdk.dataaccess.io.dataDefinition.XMLTags;
import com.runwaysdk.eclipse.plugin.runway.MDAttribute;
import com.runwaysdk.eclipse.plugin.runway.MDAttributeEnumeration;
import com.runwaysdk.eclipse.plugin.runway.MDAttributeText;
import com.runwaysdk.eclipse.plugin.runway.RunwayFactory;

public class MdAttributeTextParser extends MdAttributeParser {

	public MdAttributeTextParser(NamedNodeMap nodeMap) {
		super(RunwayFactory.eINSTANCE.createMDAttributeText(), nodeMap);
	}



	@Override
	public MDAttributeText parse(){
		MDAttributeText mdAttributeText = getMetaData();
		if(nodeMap.getNamedItem(XMLTags.TEXT_TAG) != null ){
			mdAttributeText.setDefaultValue(nodeMap.getNamedItem(XMLTags.TEXT_TAG).getNodeValue());

		}
		return (MDAttributeText)super.parse();
	}

	@Override
	public MDAttributeText getMetaData(){
		return (MDAttributeText)super.getMetaData();

	}

}
