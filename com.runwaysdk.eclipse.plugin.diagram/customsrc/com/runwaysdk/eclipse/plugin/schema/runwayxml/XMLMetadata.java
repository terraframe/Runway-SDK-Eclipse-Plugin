package com.runwaysdk.eclipse.plugin.schema.runwayxml;

import java.util.HashMap;
import java.util.Map;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;

import com.runwaysdk.eclipse.plugin.runway.MetaData;
import com.runwaysdk.eclipse.plugin.runway.MDType;

abstract public class XMLMetadata
{
  private Map<String, String> xmlAttributes = new HashMap<String, String>();

  private MetaData            metadata;

  public static final int     UNMODIFIED    = 0;

  public static final int     CREATE        = 1;

  public static final int     UPDATE        = 2;

  public static final int     DELETE        = 3;

  private int                 crudFlag      = UNMODIFIED;

  public XMLMetadata()
  {
  }

  public void setXMLAttribute(String key, String value)
  {
    xmlAttributes.put(key, value);
  }

  public String getXMLAttribute(String key)
  {
    return xmlAttributes.get(key);
  }
  
  public boolean hasXMLAttributes() {
    return !xmlAttributes.isEmpty();
  }

  public MetaData readFromXML(NamedNodeMap nodeMap)
  {
    MetaData metadata = getMetadata();

    // TODO : set attributes

    return metadata;
  }

  /**
   * This function returns XML that is valid under a create or an update tag.
   */
  public Element writeXML(Document dom, Element xml)
  {
    Object[] keys = xmlAttributes.keySet().toArray();
    for (int i = 0; i < keys.length; ++i)
    {
      String key = (String) keys[i];
      xml.setAttribute(key, xmlAttributes.get(key));
    }
    
    if (!xmlAttributes.containsKey("name")) {
      xml.setAttribute("name", ((MDType) metadata).getName());
    }

    return xml;
  }
  
  abstract public Element writeXML(Document dom);

  /**
   * This function returns XML that is valid under a delete tag.
   */
  protected Element writeDeleteXML(Document dom, Element xml)
  {
    xml.setAttribute("key", ((MDType) metadata).getName());

    return xml;
  }
  
  abstract public Element writeDeleteXML(Document dom);

  /**
   * This function returns XML that is valid for an undo update.
   */
  public Element writeUndoUpdateXML(Document dom, Element xml)
  {
    // TODO
    return null;
  }
  
  public MetaData getMetadata()
  {
    return metadata;
  }
  
  public void setMetadata(MetaData mdBiz)
  {
    this.metadata = mdBiz;
  }

  public int getCrudFlag()
  {
    return crudFlag;
  }

  public void setCrudFlag(int crudFlag)
  {
    this.crudFlag = crudFlag;
  }

}
