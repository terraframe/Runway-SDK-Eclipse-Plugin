package runwayMdParsingClasses;

import org.w3c.dom.NamedNodeMap;

import com.runwaysdk.eclipse.plugin.runway.MDAttribute;
import com.runwaysdk.eclipse.plugin.runway.MDAttributeLong;
import com.runwaysdk.eclipse.plugin.runway.MDAttributeNumber;
import com.runwaysdk.eclipse.plugin.runway.RunwayFactory;
import com.runwaysdk.eclipse.plugin.schema.importer.XMLTags;

public class MdAttributeLongParser extends MdAttributeParser {

	public MdAttributeLongParser(NamedNodeMap nodeMap) {
		super(RunwayFactory.eINSTANCE.createMDAttributeLong(), nodeMap);
	}



	@Override
	public MDAttributeLong parse(){
		MDAttributeLong mdAttributeLong= getMetaData();
		mdAttributeLong.setDefaultValue(new Long(nodeMap.getNamedItem(XMLTags.DOUBLE_TAG).getNodeValue()));
		return (MDAttributeLong)super.parse();
	}

	@Override
	public MDAttributeLong getMetaData(){
		return (MDAttributeLong)super.getMetaData();

	}
}
