package com.runwaysdk.eclipse.plugin.runway;


public class MdAttributeFactory
{
  public static MDAttribute createMdAttribute(String attrName) {
    if (attrName == "char") {
      return RunwayFactory.eINSTANCE.createMDAttributeCharacter();
    }
    else if (attrName == "text") {
      return RunwayFactory.eINSTANCE.createMDAttributeText();
    }
    
    return null;
  }
}
