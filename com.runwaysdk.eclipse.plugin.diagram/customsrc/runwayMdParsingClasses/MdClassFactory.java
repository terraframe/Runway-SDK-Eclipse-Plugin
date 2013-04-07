package runwayMdParsingClasses;

import org.w3c.dom.NamedNodeMap;

import com.runwaysdk.eclipse.plugin.runway.MDType;
import com.runwaysdk.eclipse.plugin.schema.importer.XMLTags;

public class MdClassFactory {

	public static MDType createMDType(String attrName, NamedNodeMap nodeMap){
		if (attrName == XMLTags.MD_BUSINESS_TAG) {
			MdBusinessParser businessParser = new MdBusinessParser(nodeMap);
			return businessParser.parse();
		}

		return null;

	}


}
