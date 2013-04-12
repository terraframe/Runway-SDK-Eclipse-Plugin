package runwayMdParsingClasses;

import org.w3c.dom.NamedNodeMap;

import com.runwaysdk.eclipse.plugin.runway.MDAttribute;
import com.runwaysdk.eclipse.plugin.runway.MDAttributeFloat;
import com.runwaysdk.eclipse.plugin.runway.MDAttributeInteger;
import com.runwaysdk.eclipse.plugin.runway.RunwayFactory;
import com.runwaysdk.eclipse.plugin.schema.importer.XMLTags;

public class MdAttributeFloatParser extends MdAttributeParser {

	public MdAttributeFloatParser(NamedNodeMap nodeMap) {
		super(RunwayFactory.eINSTANCE.createMDAttributeFloat(), nodeMap);
		// TODO Auto-generated constructor stub
	}



	@Override
	public MDAttributeFloat parse(){
		MDAttributeFloat mdAttributeFloat = getMetaData();
		mdAttributeFloat.setDefaultValue(new Float(nodeMap.getNamedItem(XMLTags.FLOAT_TAG).getNodeValue()));
		return (MDAttributeFloat)super.parse();
	}

	@Override
	public MDAttributeFloat getMetaData(){
		return (MDAttributeFloat)super.getMetaData();

	}
}
