package com.runwaysdk.eclipse.plugin.runway;

import xmlParserTest.XMLTags;


public class MdAttributeFactory
{
  public static MDAttribute createMdAttribute(String attrName) {
    if (attrName == XMLTags.CHARACTER_TAG) {
      return RunwayFactory.eINSTANCE.createMDAttributeCharacter();
    }
    else if (attrName == XMLTags.TEXT_TAG) {
      return RunwayFactory.eINSTANCE.createMDAttributeText();
    }
    else if (attrName == XMLTags.DATE_TAG) {
        return RunwayFactory.eINSTANCE.createMDAttributeDate();
    }
    else if (attrName == XMLTags.ENUMERATION_TAG) {
        return RunwayFactory.eINSTANCE.createMDAttributeEnumeration();
    }
    else if (attrName == XMLTags.INTEGER_TAG) {
        return RunwayFactory.eINSTANCE.createMDAttributeInteger();
    }
    
    return null;
  }
}
