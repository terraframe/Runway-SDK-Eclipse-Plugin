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
		business.setCacheAlgorithm(nodeMap.getNamedItem(XMLTags.CACHE_ALGORITHM_ATTRIBUTE).getNodeValue());
		business.setCacheSize(nodeMap.getNamedItem(XMLTags.CACHE_SIZE_ATTRIBUTE).getNodeValue());
		business.setExtends(nodeMap.getNamedItem(XMLTags.EXTENDS_ATTRIBUTE).getNodeValue());
		return (MDBusiness)super.parse();
	
	}

	@Override
	protected MDBusiness getMetaData(){
		return (MDBusiness)super.getMetaData();
	}


}
