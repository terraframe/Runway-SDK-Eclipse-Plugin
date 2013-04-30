package com.runwaysdk.eclipse.plugin.schema.exporter;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.transaction.ResourceSetChangeEvent;
import org.eclipse.emf.transaction.ResourceSetListener;
import org.eclipse.emf.transaction.ResourceSetListenerImpl;
import org.eclipse.emf.transaction.TransactionalEditingDomain;

import com.runwaysdk.eclipse.plugin.runway.MDAttribute;
import com.runwaysdk.eclipse.plugin.runway.MDBusiness;
import com.runwaysdk.eclipse.plugin.schema.runwayxml.XMLMdAttribute;
import com.runwaysdk.eclipse.plugin.schema.runwayxml.XMLMdBusiness;
import com.runwaysdk.eclipse.plugin.schema.runwayxml.XMLMetadata;


// This class requires custom changes to generated GMF source:
// in RunwayDocumentProvider.java, insert:
// //
// ModelOperationListener.registerListeners(editingDomain);
// //
// on line 201 (right before return in createEditingDomain), and:
// //
// ModelOperationListener.onDocumentSave();
// //
// on line 621 (first line of doSaveDocument)


public class ModelOperationListener extends ResourceSetListenerImpl implements ResourceSetListener
{
  private static boolean shouldListen = true;
  
  public ModelOperationListener()
  {
  }
  
  public static void stopListening() {
    shouldListen = false;
  }
  
  public static void resumeListening() {
    shouldListen = true;
  }
  
  public static void registerListeners(TransactionalEditingDomain editDomain) {
    ModelOperationListener that = new ModelOperationListener();
    editDomain.addResourceSetListener(that);
  }
  
  @Override
  public void resourceSetChanged(ResourceSetChangeEvent event)
  {
    if (!shouldListen) { return; }
    
    List<Notification> notes = event.getNotifications();
    
    for (int i = 0; i < notes.size(); ++i) {
      Notification note = notes.get(i);
      
      Object feature = note.getFeature();
      Object newValue = note.getNewValue();
      
      if (feature instanceof EReference) {
        
        // The GMF Notification system spits out two different notifications each with an MDBusiness/MDAttribute in it.
        // The only difference I can find between the events is the event type: add vs set
        
        if (newValue instanceof MDBusiness && note.getEventType() == Notification.ADD) {
          // New MdBusiness is created
          MDBusiness mdBiz = (MDBusiness) newValue;
          
          XMLRecordFactory.getXMLMdBusiness(mdBiz).setCrudFlag(XMLMetadata.CREATE);
        }
        else if (newValue instanceof MDAttribute && note.getEventType() == Notification.ADD) {
          // New MdAttribute is created
          MDBusiness mdBiz = (MDBusiness) note.getNotifier();
          XMLMdBusiness xmlMdBiz = XMLRecordFactory.getXMLMdBusiness(mdBiz);
          
          MDAttribute mdAttr = (MDAttribute) newValue;
          XMLMdAttribute xmlMdAttr = null; // get from factory
          
          xmlMdAttr.setMetadata(mdAttr);
          xmlMdBiz.addAttribute(xmlMdAttr);
        }
      }
      else if (feature instanceof EAttribute) {
        EAttribute attr = (EAttribute) feature;
        
        if (note.getNotifier() instanceof MDBusiness) {
          // MdBusiness is updated
          XMLMdBusiness xmlBiz = XMLRecordFactory.getXMLMdBusiness((MDBusiness) note.getNotifier());
          xmlBiz.setXMLAttribute(attr.getName(), newValue.toString());
          
          // TODO: If they changed the name of the MdBusiness then we need to delete the old and create a new
        }
        else if (note.getNotifier() instanceof MDAttribute) {
          // MDAttribute is updated
          MDAttribute mdAttr = (MDAttribute) note.getNotifier();
          XMLMdBusiness xmlBiz = XMLRecordFactory.getXMLMdBusiness((MDBusiness) mdAttr.eContainer());
          XMLMdAttribute xmlAttr = xmlBiz.getXMLMdAttribute(mdAttr.getName());
          
          xmlAttr.setXMLAttribute(attr.getName(), newValue.toString());
          
//          System.out.println("feature = " + feature + "; newValue = " + newValue);
        }
      }
    }
    /*
    Transaction tran = event.getTransaction();
    if (tran != null) {
      TransactionChangeDescription changeDesc = tran.getChangeDescription();
      EMap<EObject, EList<FeatureChange>> changeMap = changeDesc.getObjectChanges();
      
      for (int i = 0; i < changeMap.size(); ++i) {
        Entry<EObject, EList<FeatureChange>> mapEntry = changeMap.get(i);
        
        EObject modifiedObject = mapEntry.getKey();
        EList<FeatureChange> changes = mapEntry.getValue();
        
        if (modifiedObject instanceof DocumentRoot) {
          
        }
        else if (modifiedObject instanceof MDClass) {
          
        }
        
        System.out.println(i + " : " + modifiedObject + " = {");
        
        for (int j = 0; j < changes.size(); ++j) {
          FeatureChange change = changes.get(j);
          System.out.println("  " + j + " : " + change);
        }
        System.out.println("}");
      }
    }
    */
    
    super.resourceSetChanged(event);
  }
  
  // Requires custom hook in RunwayDocumentProvider
  public static void onDocumentSave() {
    if (!shouldListen) { return; }
    
    DOMExporter.doExport();
  }

  /*
  @Override
  public Command transactionAboutToCommit(ResourceSetChangeEvent event) throws RollbackException
  {
    System.out.println("Received pre change event:" + event.toString());
    return super.transactionAboutToCommit(event);
  }
  */
}
