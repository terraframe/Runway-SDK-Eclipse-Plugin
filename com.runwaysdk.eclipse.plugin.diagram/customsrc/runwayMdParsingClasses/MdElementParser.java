package runwayMdParsingClasses;

import org.w3c.dom.NamedNodeMap;

import com.runwaysdk.eclipse.plugin.runway.MDElement;
import com.runwaysdk.eclipse.plugin.schema.importer.XMLTags;

public abstract class MdElementParser extends MdEntityParser{

	public MdElementParser(MDElement mdElement, NamedNodeMap nodeMap) {
		super(mdElement, nodeMap);
	}

	public MDElement parse(){
		MDElement element = getMetaData();
		element.setExtendable(Boolean.parseBoolean(nodeMap.getNamedItem(XMLTags.EXTENDABLE_ATTRIBUTE).getNodeValue()));
		element.setIsAbstract(Boolean.parseBoolean(nodeMap.getNamedItem(XMLTags.ABSTRACT_ATTRIBUTE).getNodeValue()));
		return (MDElement)super.parse();
	}

	@Override
	protected MDElement getMetaData(){
		return (MDElement)super.getMetaData();
	}
}
