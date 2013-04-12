package runwayMdParsingClasses;

import org.w3c.dom.NamedNodeMap;

import com.runwaysdk.eclipse.plugin.schema.importer.XMLTags;
import com.runwaysdk.eclipse.plugin.runway.MDAttributeDouble;
import com.runwaysdk.eclipse.plugin.runway.RunwayFactory;

public class MdAttributeDoubleParser extends MdAttributeParser {

	public MdAttributeDoubleParser(NamedNodeMap nodeMap) {
		super(RunwayFactory.eINSTANCE.createMDAttributeDouble(), nodeMap);
		// TODO Auto-generated constructor stub
	}



	@Override
	public MDAttributeDouble parse(){
		MDAttributeDouble mdAttributeDouble = getMetaData();
		mdAttributeDouble.setDefaultValue(new Double(nodeMap.getNamedItem(XMLTags.DOUBLE_TAG).getNodeValue()));
		return (MDAttributeDouble)super.parse();
	}

	@Override
	public MDAttributeDouble getMetaData(){
		return (MDAttributeDouble)super.getMetaData();

	}
}



