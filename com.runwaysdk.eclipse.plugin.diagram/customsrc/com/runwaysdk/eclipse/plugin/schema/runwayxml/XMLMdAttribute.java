package com.runwaysdk.eclipse.plugin.schema.runwayxml;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

abstract public class XMLMdAttribute extends XMLMetadata
{

  public XMLMdAttribute()
  {
    // TODO Auto-generated constructor stub
  }

  @Override
  public Element writeXML(Document dom)
  {
    Element xml = dom.createElement("mdAttribute");
    return super.writeXML(dom, xml);
  }

  @Override
  public Element writeDeleteXML(Document dom)
  {
    Element xml = dom.createElement("object");
    xml.setAttribute("type", "com.runwaysdk.system.metadata.MdAttribute");
    return super.writeDeleteXML(dom, xml);
  }

}
