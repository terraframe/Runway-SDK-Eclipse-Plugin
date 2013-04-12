package runwayMdParsingClasses;

import org.w3c.dom.NamedNodeMap;

import com.runwaysdk.eclipse.plugin.runway.MDAttribute;
import com.runwaysdk.eclipse.plugin.runway.MDAttributeDouble;
import com.runwaysdk.eclipse.plugin.runway.MDAttributeInteger;
import com.runwaysdk.eclipse.plugin.runway.RunwayFactory;
import com.runwaysdk.eclipse.plugin.schema.importer.XMLTags;

public class MdAttributeIntegerParser extends MdAttributeParser {

	public MdAttributeIntegerParser(NamedNodeMap nodeMap){
		super(RunwayFactory.eINSTANCE.createMDAttributeInteger(), nodeMap);
		// TODO Auto-generated constructor stub
	}



	@Override
	public MDAttributeInteger parse(){
		MDAttributeInteger mdAttributeInteger = getMetaData();
		mdAttributeInteger.setDefaultValue(new Integer(nodeMap.getNamedItem(XMLTags.INTEGER_TAG).getNodeValue()));
		return (MDAttributeInteger)super.parse();
	}

	@Override
	public MDAttributeInteger getMetaData(){
		return (MDAttributeInteger)super.getMetaData();

	}
}
