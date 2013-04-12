package runwayMdParsingClasses;

import org.w3c.dom.NamedNodeMap;

import com.runwaysdk.eclipse.plugin.schema.importer.XMLTags;
import com.runwaysdk.eclipse.plugin.runway.MDAttribute;
import com.runwaysdk.eclipse.plugin.runway.MDAttributeDouble;
import com.runwaysdk.eclipse.plugin.runway.MDAttributeEnumeration;
import com.runwaysdk.eclipse.plugin.runway.RunwayFactory;

public class MdAttributeEnumerationParser extends MdAttributeParser {

	public MdAttributeEnumerationParser(NamedNodeMap nodeMap) {
		super(RunwayFactory.eINSTANCE.createMDAttributeEnumeration(), nodeMap);
		// TODO Auto-generated constructor stub
	}



	@Override
	public MDAttributeEnumeration parse(){
		MDAttributeEnumeration mdAttributeEnumeration = getMetaData();
		mdAttributeEnumeration.setDefaultValue(nodeMap.getNamedItem(XMLTags.ENUMERATION_TAG).getNodeValue());
		return (MDAttributeEnumeration)super.parse();
	}

	@Override
	public MDAttributeEnumeration getMetaData(){
		return (MDAttributeEnumeration)super.getMetaData();

	}
}
