package com.runwaysdk.eclipse.plugin.schema.exporter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.swt.widgets.Shell;

import com.runwaysdk.eclipse.plugin.runway.MDBusiness;
import com.runwaysdk.eclipse.plugin.runway.diagram.part.RunwayDiagramEditorPlugin;
import com.runwaysdk.eclipse.plugin.schema.SchemaUtil;
import com.runwaysdk.eclipse.plugin.schema.runwayxml.XMLMdBusiness;


public class XMLRecordFactory
{
  private static List<XMLMdBusiness> recordStore = new ArrayList<XMLMdBusiness>();
  
  /**
   * This method will search for an existing XMLMdBusiness that wraps the given
   * MDBusiness and will return one if it already exists in the record store. If
   * none such object exists it will create a new one, store it in the record
   * store (for future requests), and return it.
   * 
   * @param biz
   * @return
   */
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
  
  public static boolean validateRecords() {
    Shell shell = RunwayDiagramEditorPlugin.getInstance().getWorkbench()
    .getActiveWorkbenchWindow().getActivePage().getActivePart().getSite().getShell();
    
    Iterator<XMLMdBusiness> iterator = recordStore.iterator();
    while (iterator.hasNext())
    {
      XMLMdBusiness record = iterator.next();
      
//      if (!record.hasXMLAttributes()) {
//        iterator.remove();
//        continue;
//      }
      
//      if (record.getXMLAttribute("name") == null || record.getXMLAttribute("name") == "") {
//        throw new RuntimeException("The document you are trying to save is invalid. You must specify a name for all Runway classes.");
//      }
    }
    
    return true;
  }
  
  public static List<XMLMdBusiness> getRecords() {
    return recordStore;
  }
  
  public static void clearRecordStore() {
    recordStore.clear();
  }
  
}
