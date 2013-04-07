package com.runwaysdk.eclipse.plugin.schema.importer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

import org.w3c.dom.DOMException;
import org.w3c.dom.NamedNodeMap;

import com.runwaysdk.eclipse.plugin.runway.MDAttribute;
import com.runwaysdk.eclipse.plugin.runway.MDAttributeBlob;
import com.runwaysdk.eclipse.plugin.runway.MDAttributeBoolean;
import com.runwaysdk.eclipse.plugin.runway.MDAttributeCharacter;
import com.runwaysdk.eclipse.plugin.runway.MDAttributeDate;
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

		public static void parseMdAttribute(MDAttribute attribute, NamedNodeMap nodeMap){
			attribute.setName(nodeMap.getNamedItem(XMLTags.NAME_ATTRIBUTE).getNodeValue());
			attribute.setRequired(Boolean.parseBoolean(nodeMap.getNamedItem(XMLTags.REQUIRED_ATTRIBUTE).getNodeValue()));
			attribute.setImmutable(Boolean.parseBoolean(nodeMap.getNamedItem(XMLTags.IMMUTABLE_ATTRIBUTE).getNodeValue()));
			attribute.setDisplayLabel(nodeMap.getNamedItem(XMLTags.NAME_ATTRIBUTE).getNodeValue());
			parseMetaData(attribute, nodeMap);
		}

		//Not sure if this is the right way to capture a blob...
		public static void parseMdAttributeBlob(MDAttributeBlob attributeBlob, NamedNodeMap nodeMap){
			attributeBlob.setDefaultValue((nodeMap.getNamedItem(XMLTags.BLOB_TAG).getNodeValue()).getBytes());
			parseMdAttribute(attributeBlob, nodeMap);
		}

		public static void parseMdAttributeBoolean(MDAttributeBoolean attributeBoolean, NamedNodeMap nodeMap){
			attributeBoolean.setDefaultValue(Boolean.parseBoolean(nodeMap.getNamedItem(XMLTags.BOOLEAN_TAG).getNodeValue()));
			parseMdAttribute(attributeBoolean, nodeMap);
		}

		//Not sure if this is the right way to get a char
		public static void parseMdAttributeCharacter(MDAttributeCharacter attributeCharacter, NamedNodeMap nodeMap){
			attributeCharacter.setDefaultValue((nodeMap.getNamedItem(XMLTags.BOOLEAN_TAG).getNodeValue()).charAt(0));
			parseMdAttribute(attributeCharacter, nodeMap);
		}

		public static void parseMdAttributeDate(MDAttributeDate attributeDate, NamedNodeMap nodeMap){
			try {
				attributeDate.setDefaultValue(new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH).parse(nodeMap.getNamedItem(XMLTags.DATE_TAG).getNodeValue()));
			} catch (DOMException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally{
				parseMdAttribute(attributeDate, nodeMap);
			}
		}


	}

}
