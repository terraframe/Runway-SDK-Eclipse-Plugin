package runwayMdParsingClasses;

import org.w3c.dom.NamedNodeMap;

import com.runwaysdk.eclipse.plugin.runway.MDBusiness;
import com.runwaysdk.eclipse.plugin.runway.MDElement;
import com.runwaysdk.eclipse.plugin.runway.RunwayFactory;
import com.runwaysdk.eclipse.plugin.schema.importer.XMLTags;
import com.runwaysdk.system.metadata.MdBusiness;

public class MdBusinessParser extends MdElementParser {

	public MdBusinessParser(NamedNodeMap nodeMap){
		super(RunwayFactory.eINSTANCE.createMDBusiness(), nodeMap);
	}

	@Override
	public MDBusiness parse(){
		MDBusiness business = getMetaData();
		System.out.print("Inside MdBusinessParser");
		// The code starts breaking here.
		if(nodeMap.getNamedItem(XMLTags.CACHE_ALGORITHM_ATTRIBUTE) != null){
			business.setCacheAlgorithm(nodeMap.getNamedItem(XMLTags.CACHE_ALGORITHM_ATTRIBUTE).getNodeValue());
		}else{
			System.out.println("CACHE_ALGORITHM_ATTRIBUTE is not defined.");
		}
		
		if(nodeMap.getNamedItem(XMLTags.CACHE_SIZE_ATTRIBUTE) != null){
			business.setCacheAlgorithm(nodeMap.getNamedItem(XMLTags.CACHE_ALGORITHM_ATTRIBUTE).getNodeValue());
		}else{
			System.out.println("CACHE_SIZE_ATTRIBUTE is not defined.");
		}
		
		if(nodeMap.getNamedItem(XMLTags.EXTENDS_ATTRIBUTE) != null){
			business.setExtends(nodeMap.getNamedItem(XMLTags.EXTENDS_ATTRIBUTE).getNodeValue());
		}else{
			System.out.println("EXTENDS_ATTRIBUTE is not defined.");
		}
		
		return (MDBusiness)super.parse();
	
	}

	@Override
	protected MDBusiness getMetaData(){
		return (MDBusiness)super.getMetaData();
	}


}
