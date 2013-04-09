package com.runwaysdk.eclipse.plugin.schema.runwayxml;

import org.w3c.dom.NamedNodeMap;

import com.runwaysdk.eclipse.plugin.runway.MDBusiness;
import com.runwaysdk.eclipse.plugin.runway.MetaData;
import com.runwaysdk.eclipse.plugin.runway.RunwayFactory;
import com.runwaysdk.eclipse.plugin.schema.importer.XMLTags;

public class XMLMdBusiness extends XMLMdElement
{
  public XMLMdBusiness() {
    
  }
  
  @Override
  public MDBusiness readFromXML(NamedNodeMap nodeMap) {
    setMetadata(RunwayFactory.eINSTANCE.createMDBusiness());
    
    super.readFromXML(nodeMap);
    
    MDBusiness business = (MDBusiness) getMetadata();
    business.setCacheAlgorithm(nodeMap.getNamedItem(XMLTags.CACHE_ALGORITHM_ATTRIBUTE).getNodeValue());
    business.setCacheSize(nodeMap.getNamedItem(XMLTags.CACHE_SIZE_ATTRIBUTE).getNodeValue());
    business.setExtends(nodeMap.getNamedItem(XMLTags.EXTENDS_ATTRIBUTE).getNodeValue());
    
    return business;
  }
  
  @Override
  public String writeToXML() {
    String xml = "";
    
    xml = xml + super.writeToXML();
    
    return xml;
  }
}
