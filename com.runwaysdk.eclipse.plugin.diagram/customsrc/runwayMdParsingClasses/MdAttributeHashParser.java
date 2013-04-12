package runwayMdParsingClasses;

import org.w3c.dom.NamedNodeMap;

import com.runwaysdk.eclipse.plugin.runway.MDAttribute;
import com.runwaysdk.eclipse.plugin.runway.MDAttributeFloat;
import com.runwaysdk.eclipse.plugin.runway.MDAttributeHash;
import com.runwaysdk.eclipse.plugin.runway.RunwayFactory;
import com.runwaysdk.eclipse.plugin.schema.importer.XMLTags;

public class MdAttributeHashParser extends MdAttributeParser {

	public MdAttributeHashParser(NamedNodeMap nodeMap) {
		super(RunwayFactory.eINSTANCE.createMDAttributeHash(), nodeMap);
		// TODO Auto-generated constructor stub
	}



	@Override
	public MDAttributeHash parse(){
		MDAttributeHash mdAttributeHash = getMetaData();
		mdAttributeHash.setDefaultValue(nodeMap.getNamedItem(XMLTags.HASH_TAG).getNodeValue());
		return (MDAttributeHash)super.parse();
	}

	@Override
	public MDAttributeHash getMetaData(){
		return (MDAttributeHash)super.getMetaData();

	}
}
