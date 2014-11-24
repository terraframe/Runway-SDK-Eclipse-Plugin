package runwayMdParsingClasses;

import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

import com.runwaysdk.eclipse.plugin.runway.MDAttributeBlob;
import com.runwaysdk.eclipse.plugin.runway.RunwayFactory;

public class MdAttributeBlobParser extends MdAttributeParser{
	
	public MdAttributeBlobParser(NamedNodeMap nodeMap){
		super(RunwayFactory.eINSTANCE.createMDAttributeBlob(), nodeMap);
	}
	
	@Override
	public MDAttributeBlob parse(){
		MDAttributeBlob mdAttributeBlob = getMetaData();
		
		Node defaultValue = nodeMap.getNamedItem("defaultValue");
	    
	    if (defaultValue != null)
	    {
	      mdAttributeBlob.setDefaultValue(defaultValue.getNodeValue().getBytes());
	    }
		
		return (MDAttributeBlob)super.parse();
	
	}
	protected MDAttributeBlob getMetaData(){
		return (MDAttributeBlob)super.getMetaData();
	}

}
