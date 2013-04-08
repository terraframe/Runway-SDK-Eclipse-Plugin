package com.runwaysdk.eclipse.plugin.schema.exporter;

import java.util.ArrayList;
import java.util.List;

import runwayMdParsingClasses.XMLMdBusiness;
import runwayMdParsingClasses.XMLMetadata;

import com.runwaysdk.eclipse.plugin.runway.MDBusiness;


public class XMLRecordFactory
{
  private static List<XMLMdBusiness> record = new ArrayList<XMLMdBusiness>();
  
  public static XMLMdBusiness getXMLMdBusiness(MDBusiness biz) {
    for (int i = 0; i < record.size(); ++i) {
      XMLMdBusiness xmlBiz = record.get(i);
      
      if (xmlBiz.getMetadata() == biz) {
        return xmlBiz;
      }
    }
    
    XMLMdBusiness xmlBiz = new XMLMdBusiness();
    xmlBiz.setMetadata(biz);
    xmlBiz.setCrudFlag(XMLMdBusiness.UPDATE);
    record.add(xmlBiz);
    return xmlBiz;
  }
  
  public static void saveRecords() {
    
    System.out.println("Records in store:");
    
    for (int i = 0; i < record.size(); ++i) {
      XMLMdBusiness xmlBiz = record.get(i);
      
      System.out.println(xmlBiz.writeToXML());
    }
  }
}
