package runwayMdParsingClasses;

import org.w3c.dom.NamedNodeMap;

import com.runwaysdk.eclipse.plugin.runway.MDAttributeBlob;
import com.runwaysdk.eclipse.plugin.runway.RunwayFactory;
import com.runwaysdk.eclipse.plugin.schema.importer.XMLTags;

public class MdAttributeBlobParser extends MdAttributeParser{
	
	public MdAttributeBlobParser(NamedNodeMap nodeMap){
		super(RunwayFactory.eINSTANCE.createMDAttributeBlob(), nodeMap);
	}
	
	@Override
	public MDAttributeBlob parse(){
		MDAttributeBlob mdAttributeBlob = getMetaData();
		mdAttributeBlob.setDefaultValue((nodeMap.getNamedItem(XMLTags.BLOB_TAG).getNodeValue()).getBytes());
		return (MDAttributeBlob)super.parse();
	
	}
	protected MDAttributeBlob getMetaData(){
		return (MDAttributeBlob)super.getMetaData();
	}

}
