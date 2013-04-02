package com.runwaysdk.eclipse.plugin.schema.importer;

import org.w3c.dom.NamedNodeMap;

import com.runwaysdk.eclipse.plugin.runway.MDBusiness;
import com.runwaysdk.eclipse.plugin.runway.MDElement;

public class MdParsers {
	public static class MdStaticParsers{
		public static void parseMdBusiness(MDBusiness business, NamedNodeMap nodeMap){
			business.setCacheAlgorithm(nodeMap.getNamedItem(XMLTags.CACHE_ALGORITHM_ATTRIBUTE).getNodeValue());
			business.setCacheSize(nodeMap.getNamedItem(XMLTags.CACHE_SIZE_ATTRIBUTE).getNodeValue());
			business.setExtends(nodeMap.getNamedItem(XMLTags.EXTENDS_ATTRIBUTE).getNodeValue());
			parseMdElement(business, nodeMap);
		}
		
		
		
		public static void parseMdElement(MDElement element, NamedNodeMap nodeMap){
			element.setExtendable(Boolean.parseBoolean(nodeMap.getNamedItem(XMLTags.EXTENDABLE_ATTRIBUTE).getNodeValue()));
			element.setIsAbstract(Boolean.parseBoolean(nodeMap.getNamedItem(XMLTags.ABSTRACT_ATTRIBUTE).getNodeValue()));
			
		}
		
		
	}

}
