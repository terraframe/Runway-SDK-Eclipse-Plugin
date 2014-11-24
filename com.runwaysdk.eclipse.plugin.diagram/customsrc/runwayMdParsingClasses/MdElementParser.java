package runwayMdParsingClasses;

import org.w3c.dom.NamedNodeMap;

import com.runwaysdk.eclipse.plugin.runway.MDElement;
import com.runwaysdk.eclipse.plugin.schema.importer.XMLTags;

public abstract class MdElementParser extends MdEntityParser{

	public MdElementParser(MDElement mdElement, NamedNodeMap nodeMap) {
		super(mdElement, nodeMap);
	}

	@Override
	public MDElement parse(){
		MDElement element = getMetaData();
		if(nodeMap.getNamedItem(XMLTags.EXTENDABLE_ATTRIBUTE) != null){
			element.setExtendable(Boolean.parseBoolean(nodeMap.getNamedItem(XMLTags.EXTENDABLE_ATTRIBUTE).getNodeValue()));
		}
		else{
			System.out.println(XMLTags.EXTENDABLE_ATTRIBUTE + " is not defined");
		}
		
		if(nodeMap.getNamedItem(XMLTags.ABSTRACT_ATTRIBUTE) != null){
			element.setIsAbstract(Boolean.parseBoolean(nodeMap.getNamedItem(XMLTags.ABSTRACT_ATTRIBUTE).getNodeValue()));

		}
		else{
			System.out.println("ABSTRACT_ATTRIBUTE" + " is not defined");
		}
		return (MDElement)super.parse();
	}

	@Override
	protected MDElement getMetaData(){
		return (MDElement)super.getMetaData();
	}
}
