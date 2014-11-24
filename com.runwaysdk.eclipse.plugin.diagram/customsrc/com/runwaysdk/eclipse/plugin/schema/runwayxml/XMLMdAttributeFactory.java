package com.runwaysdk.eclipse.plugin.schema.runwayxml;

import com.runwaysdk.eclipse.plugin.runway.MDAttribute;
import com.runwaysdk.eclipse.plugin.runway.MDAttributeBlob;
import com.runwaysdk.eclipse.plugin.runway.MDAttributeBoolean;
import com.runwaysdk.eclipse.plugin.runway.MDAttributeCharacter;
import com.runwaysdk.eclipse.plugin.runway.MDAttributeDate;
import com.runwaysdk.eclipse.plugin.runway.MDAttributeDateTime;
import com.runwaysdk.eclipse.plugin.runway.MDAttributeDecimal;
import com.runwaysdk.eclipse.plugin.runway.MDAttributeDouble;
import com.runwaysdk.eclipse.plugin.runway.MDAttributeEnumeration;
import com.runwaysdk.eclipse.plugin.runway.MDAttributeFloat;
import com.runwaysdk.eclipse.plugin.runway.MDAttributeHash;
import com.runwaysdk.eclipse.plugin.runway.MDAttributeInteger;
import com.runwaysdk.eclipse.plugin.runway.MDAttributeLocal;
import com.runwaysdk.eclipse.plugin.runway.MDAttributeLocalCharacter;
import com.runwaysdk.eclipse.plugin.runway.MDAttributeLocalText;
import com.runwaysdk.eclipse.plugin.runway.MDAttributeLong;
import com.runwaysdk.eclipse.plugin.runway.MDAttributeNumber;
import com.runwaysdk.eclipse.plugin.runway.MDAttributeStruct;
import com.runwaysdk.eclipse.plugin.runway.MDAttributeText;
import com.runwaysdk.eclipse.plugin.runway.MDAttributeTime;

public class XMLMdAttributeFactory {


	public XMLMdAttributeFactory()
	{
		
	}

	public static XMLMdAttribute getContentFromGMF(MDAttribute attribute){
		
		System.out.println("Inside XMLMdAttributeFactory");
		
		XMLMdAttribute xmlAtt = null; 

		//Try to keep these in Alphabetical Order
		if (attribute instanceof MDAttributeBlob) {
			xmlAtt = new XMLMdAttributeBlob(); 
		}

		else if (attribute instanceof MDAttributeBoolean) {
			xmlAtt = new XMLMdAttributeBoolean(); 
		}

		else if (attribute instanceof MDAttributeCharacter) {
			xmlAtt = new XMLMdAttributeCharacter(); 
		}

		else if (attribute instanceof MDAttributeDate) {
			xmlAtt = new XMLMdAttributeDate();
		}

		else if (attribute instanceof MDAttributeDateTime) {
			xmlAtt = new XMLMdAttributeDateTime();
		}
		
		else if (attribute instanceof MDAttributeDecimal) {
			xmlAtt = new XMLMdAttributeDecimal();
		}
		
		else if (attribute instanceof MDAttributeDouble) {
			xmlAtt = new XMLMdAttributeDouble();
		}
		
		else if (attribute instanceof MDAttributeEnumeration) {
			xmlAtt = new XMLMdAttributeEnumeration();
		}
		
		else if (attribute instanceof MDAttributeFloat) {
			xmlAtt = new XMLMdAttributeFloat();
		}
		
		else if (attribute instanceof MDAttributeHash) {
			xmlAtt = new XMLMdAttributeHash();
		}
		
		else if (attribute instanceof MDAttributeInteger) {
			xmlAtt = new XMLMdAttributeInteger();
		}

		else if (attribute instanceof MDAttributeLocal) {
			xmlAtt = new XMLMdAttributeLocal();
		}

		else if (attribute instanceof MDAttributeLocalCharacter) {
			xmlAtt = new XMLMdAttributeLocalCharacter();
		}

		else if (attribute instanceof MDAttributeLocalText) {
			xmlAtt = new XMLMdAttributeLocalText();
		}

		else if (attribute instanceof MDAttributeLong) {
			xmlAtt = new XMLMdAttributeLong();
		}
		
		else if (attribute instanceof MDAttributeNumber) {
			xmlAtt = new XMLMdAttributeNumber();
		}
		
		else if (attribute instanceof MDAttributeStruct) {
			xmlAtt = new XMLMdAttributeStruct();
		}

		else if (attribute instanceof MDAttributeText) {
			xmlAtt = new XMLMdAttributeText();
		}

		else if (attribute instanceof MDAttributeTime) {
			xmlAtt = new XMLMdAttributeTime();
		}
		else {
		  throw new RuntimeException("Unknown instance. " + attribute.getClass().getName());
		}

		return xmlAtt;
	}
}
