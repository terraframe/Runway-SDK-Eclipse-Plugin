package runwayMdParsingClasses;

import org.w3c.dom.NamedNodeMap;

import com.runwaysdk.eclipse.plugin.runway.MDAttribute;
import com.runwaysdk.eclipse.plugin.runway.MDAttributeDecimal;
import com.runwaysdk.eclipse.plugin.runway.RunwayFactory;
import com.runwaysdk.eclipse.plugin.schema.importer.XMLTags;

public class MdAttributeDecimalParser extends MdAttributeParser {

	public MdAttributeDecimalParser(NamedNodeMap nodeMap) {
		super(RunwayFactory.eINSTANCE.createMDAttributeDecimal(), nodeMap);	
	}

	@Override
	public MDAttributeDecimal parse(){
		MDAttributeDecimal mdAttributeDecimal = getMetaData();
		mdAttributeDecimal.setDefaultValue(new Float(nodeMap.getNamedItem(XMLTags.DECIMAL_TAG).getNodeValue()));
		return (MDAttributeDecimal)super.parse();
	}

	@Override
	public MDAttributeDecimal getMetaData(){
		return (MDAttributeDecimal)super.getMetaData();

	}
}
