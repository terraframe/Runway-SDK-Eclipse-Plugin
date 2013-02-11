package com.runwaysdk.eclipse.plugin.runway;

import com.runwaysdk.eclipse.model.runway.MDAttribute;
import com.runwaysdk.eclipse.model.runway.RunwayFactory;

public class MdAttributeFactory
{
  public static MDAttribute createMdAttribute(String attrName) {
    if (attrName == "char") {
      return RunwayFactory.eINSTANCE.createMdAttributeCharacter();
    }
    else if (attrName == "text") {
      return RunwayFactory.eINSTANCE.createMdAttributeText();
    }
    
    return null;
  }
}
