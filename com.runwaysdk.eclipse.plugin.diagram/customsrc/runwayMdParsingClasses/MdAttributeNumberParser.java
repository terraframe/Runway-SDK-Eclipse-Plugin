package runwayMdParsingClasses;

import org.w3c.dom.NamedNodeMap;

import com.runwaysdk.eclipse.plugin.runway.MDAttribute;
import com.runwaysdk.eclipse.plugin.runway.MDAttributeFloat;
import com.runwaysdk.eclipse.plugin.runway.MDAttributeNumber;
import com.runwaysdk.eclipse.plugin.runway.RunwayFactory;
import com.runwaysdk.eclipse.plugin.schema.importer.XMLTags;

public class MdAttributeNumberParser extends MdAttributeParser {

	public MdAttributeNumberParser(NamedNodeMap nodeMap) {
		super(RunwayFactory.eINSTANCE.createMDAttributeNumber(), nodeMap);
	}



	@Override
	public MDAttributeNumber parse(){
		MDAttributeNumber mdAttributeNumber = getMetaData();
		mdAttributeNumber.setDefaultValue(new Double(nodeMap.getNamedItem(XMLTags.DOUBLE_TAG).getNodeValue()));
		return (MDAttributeNumber)super.parse();
	}

	@Override
	public MDAttributeNumber getMetaData(){
		return (MDAttributeNumber)super.getMetaData();

	}
}
