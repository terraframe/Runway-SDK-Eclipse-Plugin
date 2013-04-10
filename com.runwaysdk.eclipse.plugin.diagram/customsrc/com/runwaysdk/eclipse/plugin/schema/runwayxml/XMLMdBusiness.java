package com.runwaysdk.eclipse.plugin.schema.runwayxml;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;

import com.runwaysdk.eclipse.plugin.runway.MDBusiness;
import com.runwaysdk.eclipse.plugin.runway.RunwayFactory;
import com.runwaysdk.eclipse.plugin.schema.importer.XMLTags;

public class XMLMdBusiness extends XMLMetadata
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
  public Element writeDoItXML(Document dom) {
    Element xml = dom.createElement("MdBusiness");
    this.setDoItExport(xml);
    return super.writeDoItXML(dom);
  }
}
