package com.runwaysdk.eclipse.plugin.schema.exporter;

import java.util.ArrayList;
import java.util.List;


import com.runwaysdk.eclipse.plugin.runway.MDBusiness;
import com.runwaysdk.eclipse.plugin.schema.runwayxml.XMLMdBusiness;
import com.runwaysdk.eclipse.plugin.schema.runwayxml.XMLMetadata;


public class XMLRecordFactory
{
  private static List<XMLMdBusiness> recordStore = new ArrayList<XMLMdBusiness>();
  
  public static XMLMdBusiness getXMLMdBusiness(MDBusiness biz) {
    for (int i = 0; i < recordStore.size(); ++i) {
      XMLMdBusiness xmlBiz = recordStore.get(i);
      
      if (xmlBiz.getMetadata() == biz) {
        return xmlBiz;
      }
    }
    
    XMLMdBusiness xmlBiz = new XMLMdBusiness();
    xmlBiz.setMetadata(biz);
    xmlBiz.setCrudFlag(XMLMdBusiness.UPDATE);
    recordStore.add(xmlBiz);
    return xmlBiz;
  }
  
  public static List<XMLMdBusiness> getRecords() {
    return recordStore;
  }
  
  public static void saveRecords() {
    
    System.out.println("Records in store:");
    
    for (int i = 0; i < recordStore.size(); ++i) {
      XMLMdBusiness xmlBiz = recordStore.get(i);
      
      System.out.println(xmlBiz.writeDoItXML());
    }
    
    recordStore.clear();
  }
}
