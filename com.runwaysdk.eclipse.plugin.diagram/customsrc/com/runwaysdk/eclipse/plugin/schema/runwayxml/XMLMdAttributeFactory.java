package com.runwaysdk.eclipse.plugin.schema.runwayxml;

import com.runwaysdk.eclipse.plugin.schema.importer.XMLTags;
import com.runwaysdk.system.metadata.MdAttribute;

public class XMLMdAttributeFactory {


	public XMLMdAttributeFactory()
	{
		
	}

	public XMLMdAttribute getContentFromGMF(MdAttribute attribute){
		String attributeName = attribute.getAttributeName();
		
		System.out.println("Inside XMLMdAttributeFactory");
		
		XMLMdAttribute xmlAtt = null; 

		//Try to keep these in Alphabetical Order
		if (attributeName == XMLTags.BLOB_TAG) {
			xmlAtt = new XMLMdAttributeBlob(); 
		}

		else if (attributeName == XMLTags.BOOLEAN_TAG) {
			xmlAtt = new XMLMdAttributeBoolean(); 
		}

		else if (attributeName == XMLTags.CHARACTER_TAG) {
			xmlAtt = new XMLMdAttributeCharacter(); 
		}

		else if (attributeName == XMLTags.DATE_TAG) {
			xmlAtt = new XMLMdAttributeDate();
		}

		else if (attributeName == XMLTags.DATETIME_TAG) {
			xmlAtt = new XMLMdAttributeDateTime();
		}
		
		else if (attributeName == XMLTags.DECIMAL_ATTRIBUTE) {
			xmlAtt = new XMLMdAttributeDecimal();
		}
		
		else if (attributeName == XMLTags.DOUBLE_TAG) {
			xmlAtt = new XMLMdAttributeDouble();
		}
		
		else if (attributeName == XMLTags.ENUMERATION_TAG) {
			xmlAtt = new XMLMdAttributeEnumeration();
		}
		
		else if (attributeName == XMLTags.FLOAT_TAG) {
			xmlAtt = new XMLMdAttributeFloat();
		}
		
		//TODO is this the right "hash" tag? 
		else if (attributeName == XMLTags.HASH_METHOD_ATTRIBUTE) {
			xmlAtt = new XMLMdAttributeHash();
		}
		
		else if (attributeName == XMLTags.INTEGER_TAG) {
			xmlAtt = new XMLMdAttributeInteger();
		}
		// Should these 3 local variants exist?
		//TODO is this the right "local" tag? 
//		else if (nodeName == XMLTags.LOCAL_TAG) {
//			contentParser = new XMLMdAttributeLocal();
//		}

		else if (attributeName == XMLTags.LOCAL_CHARACTER_TAG) {
			xmlAtt = new XMLMdAttributeLocalCharacter();
		}

		else if (attributeName == XMLTags.LOCAL_TEXT_TAG) {
			xmlAtt = new XMLMdAttributeLocalText();
		}

		else if (attributeName == XMLTags.LONG_TAG) {
			xmlAtt = new XMLMdAttributeLong();
		}
		
		//TODO is this the right "local" tag? 
//		else if (nodeName == XMLTags.NUMBER_TAG) {
//			contentParser = new XMLMdAttributeNumber();
//		}
		
		//TODO is this the right "local" tag? 
		else if (attributeName == XMLTags.STRUCT_TAG) {
			xmlAtt = new XMLMdAttributeStruct();
		}

		else if (attributeName == XMLTags.TEXT_TAG) {
			xmlAtt = new XMLMdAttributeText();
		}

		//TODO is this the right "local" tag? 
		else if (attributeName == XMLTags.TIME_TAG) {
			xmlAtt = new XMLMdAttributeTime();
		}

		return xmlAtt;
	}
}
