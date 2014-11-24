package com.runwaysdk.eclipse.plugin.schema.runwayxml;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.runwaysdk.eclipse.plugin.runway.MDAttribute;

abstract public class XMLMdClass extends XMLMdType
{
  protected Map<String, XMLMdAttribute> attributes = new HashMap<String, XMLMdAttribute>();
  
  public XMLMdClass()
  {
    // TODO Auto-generated constructor stub
  }

  @Override
  public Element writeXML(Document dom, Element xml)
  {
    Iterator<XMLMdAttribute> attrs = attributes.values().iterator();
    
    Element attrsTag = dom.createElement("attributes");
    xml.appendChild(attrsTag);
    
    while (attrs.hasNext()) {
      XMLMdAttribute attr = attrs.next();
      
      Element xmlAttr = attr.writeXML(dom);
      attrsTag.appendChild(xmlAttr);
    }
    
    return super.writeXML(dom, xml);
  }

  @Override
  public Element writeDeleteXML(Document dom, Element xml)
  {
    return super.writeDeleteXML(dom, xml);
  }
  
  public void addAttribute(XMLMdAttribute attr) {
    attributes.put(((MDAttribute) attr.getMetadata()).getName(), attr);
  }
  
  public Map<String, XMLMdAttribute> getAttributes() {
    return attributes;
  }
  
  public XMLMdAttribute getXMLMdAttribute(String key) {
    return attributes.get(key);
  }
}
