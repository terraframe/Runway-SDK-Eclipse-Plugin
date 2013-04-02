package com.runwaysdk.eclipse.plugin.schema.importer;

import org.w3c.dom.NamedNodeMap;

import com.runwaysdk.eclipse.plugin.runway.MDBusiness;
import com.runwaysdk.eclipse.plugin.runway.MDClass;
import com.runwaysdk.eclipse.plugin.runway.MDElement;
import com.runwaysdk.eclipse.plugin.runway.MDEntity;
import com.runwaysdk.eclipse.plugin.runway.MDType;
import com.runwaysdk.eclipse.plugin.runway.MetaData;

public class MdParsers {
	
	/**
	 * The Purpose of these classes is to parse and assign values according
	 * to their place on the Runway MD hierarchy. 
	 * 
	 * To add an object, create a function that takes its EMF object and 
	 * a NamedNodeMap, then simply parse its values, then call its parent's parser
	 * @author armiller5
	 *
	 */
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
			parseMdEntity(element, nodeMap);
		}
		
		public static void parseMdEntity(MDEntity entity, NamedNodeMap nodeMap){
			entity.setTable(nodeMap.getNamedItem(XMLTags.ENTITY_TABLE).getNodeValue());
			entity.setGenerateController(Boolean.parseBoolean(nodeMap.getNamedItem(XMLTags.GENERATE_CONTROLLER).getNodeValue()));
			entity.setEnforceSiteMaster(Boolean.parseBoolean(nodeMap.getNamedItem(XMLTags.ENFORCE_SITE_MASTER_ATTRIBUTE).getNodeValue()));
			parseMdClass(entity, nodeMap);
		}
		public static void parseMdClass(MDClass mdclass, NamedNodeMap nodeMap){
			mdclass.setPublish(Boolean.parseBoolean(nodeMap.getNamedItem(XMLTags.PUBLISH_ATTRIBUTE).getNodeValue()));
			parseMdType(mdclass, nodeMap);
		}
		public static void parseMdType(MDType type, NamedNodeMap nodeMap){
			type.setName(nodeMap.getNamedItem(XMLTags.NAME_ATTRIBUTE).getNodeValue());
			type.setExported(Boolean.parseBoolean(nodeMap.getNamedItem(XMLTags.EXPORTED_ATTRIBUTE).getNodeValue()));
			parseMetaData(type, nodeMap);
		}
		
		public static void parseMetaData(MetaData metaData, NamedNodeMap nodeMap){
			metaData.setLabel(nodeMap.getNamedItem(XMLTags.DISPLAY_LABEL_ATTRIBUTE).getNodeValue());
			metaData.setDescription(nodeMap.getNamedItem(XMLTags.DESCRIPTION_ATTRIBUTE).getNodeValue());
			metaData.setRemovable(nodeMap.getNamedItem(XMLTags.REMOVE_ATTRIBUTE).getNodeValue());

		}
		
		/**
		 * The Start of our Attribute Parsers
		 */
	}

}
