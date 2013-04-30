package com.runwaysdk.eclipse.plugin.schema.runwayxml;

import com.runwaysdk.eclipse.plugin.runway.MDAttribute;
import com.runwaysdk.system.metadata.*;


public class XMLMdAttributeFactory {


	public XMLMdAttributeFactory()
	{
		
	}

	public XMLMdAttribute getContentFromGMF(MDAttribute attribute){
		
		System.out.println("Inside XMLMdAttributeFactory");
		
		XMLMdAttribute xmlAtt = null; 

		//Try to keep these in Alphabetical Order
		if (attribute instanceof MdAttributeBlob) {
			xmlAtt = new XMLMdAttributeBlob(); 
		}

		else if (attribute instanceof MdAttributeBoolean) {
			xmlAtt = new XMLMdAttributeBoolean(); 
		}

		else if (attribute instanceof MdAttributeCharacter) {
			xmlAtt = new XMLMdAttributeCharacter(); 
		}

		else if (attribute instanceof MdAttributeDate) {
			xmlAtt = new XMLMdAttributeDate();
		}

		else if (attribute instanceof MdAttributeDateTime) {
			xmlAtt = new XMLMdAttributeDateTime();
		}
		
		else if (attribute instanceof MdAttributeDecimal) {
			xmlAtt = new XMLMdAttributeDecimal();
		}
		
		else if (attribute instanceof MdAttributeDouble) {
			xmlAtt = new XMLMdAttributeDouble();
		}
		
		else if (attribute instanceof MdAttributeEnumeration) {
			xmlAtt = new XMLMdAttributeEnumeration();
		}
		
		else if (attribute instanceof MdAttributeFloat) {
			xmlAtt = new XMLMdAttributeFloat();
		}
		
		else if (attribute instanceof MdAttributeHash) {
			xmlAtt = new XMLMdAttributeHash();
		}
		
		else if (attribute instanceof MdAttributeInteger) {
			xmlAtt = new XMLMdAttributeInteger();
		}

		else if (attribute instanceof MdAttributeLocal) {
			xmlAtt = new XMLMdAttributeLocal();
		}

		else if (attribute instanceof MdAttributeLocalCharacter) {
			xmlAtt = new XMLMdAttributeLocalCharacter();
		}

		else if (attribute instanceof MdAttributeLocalText) {
			xmlAtt = new XMLMdAttributeLocalText();
		}

		else if (attribute instanceof MdAttributeLong) {
			xmlAtt = new XMLMdAttributeLong();
		}
		
		else if (attribute instanceof MdAttributeNumber) {
			xmlAtt = new XMLMdAttributeNumber();
		}
		
		else if (attribute instanceof MdAttributeStruct) {
			xmlAtt = new XMLMdAttributeStruct();
		}

		else if (attribute instanceof MdAttributeText) {
			xmlAtt = new XMLMdAttributeText();
		}

		else if (attribute instanceof MdAttributeTime) {
			xmlAtt = new XMLMdAttributeTime();
		}

		return xmlAtt;
	}
}
