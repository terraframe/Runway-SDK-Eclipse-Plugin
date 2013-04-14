package com.runwaysdk.eclipse.plugin.schema.exporter;

import java.io.File;
import java.net.URL;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.transaction.ResourceSetChangeEvent;
import org.eclipse.emf.transaction.ResourceSetListener;
import org.eclipse.emf.transaction.ResourceSetListenerImpl;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.document.IDocument;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.part.FileEditorInput;

import com.runwaysdk.eclipse.plugin.runway.MDBusiness;
import com.runwaysdk.eclipse.plugin.runway.diagram.part.RunwayDiagramEditorPlugin;
import com.runwaysdk.eclipse.plugin.runway.diagram.part.RunwayDocumentProvider;
import com.runwaysdk.eclipse.plugin.schema.runwayxml.XMLMdBusiness;
import com.runwaysdk.eclipse.plugin.schema.runwayxml.XMLMetadata;


// This class requires custom changes to generated GMF source:
// in RunwayDocumentProvider.java, insert:
// //
// ModelOperationListener myListen = new ModelOperationListener();
// editingDomain.addResourceSetListener(myListen);
// //
// starting at line 199.


public class ModelOperationListener extends ResourceSetListenerImpl implements ResourceSetListener
{
  public ModelOperationListener()
  {
  }
  
  public static void registerListeners(TransactionalEditingDomain editDomain) {
    ModelOperationListener that = new ModelOperationListener();
    editDomain.addResourceSetListener(that);
  }
  
  @Override
  public void resourceSetChanged(ResourceSetChangeEvent event)
  {
    List<Notification> notes = event.getNotifications();
    
    for (int i = 0; i < notes.size(); ++i) {
      Notification note = notes.get(i);
      
      Object feature = note.getFeature();
      Object newValue = note.getNewValue();
      
      System.out.println("feature = " + feature + "; newValue = " + newValue);
      
      if (feature instanceof EReference) {
        if (newValue instanceof MDBusiness && note.getEventType() == 1) {
          MDBusiness mdBiz = (MDBusiness) newValue;
          
          XMLRecordFactory.getXMLMdBusiness(mdBiz).setCrudFlag(XMLMetadata.CREATE);
        }
      }
      else if (feature instanceof EAttribute) {
        EAttribute attr = (EAttribute) feature;
        
        if (note.getNotifier() instanceof MDBusiness) {
          XMLMdBusiness xmlBiz = XMLRecordFactory.getXMLMdBusiness((MDBusiness) note.getNotifier());
          xmlBiz.setXMLAttribute(attr.getName(), newValue.toString());
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
  public static void onDocumentSave(IDocument document, Object element, RunwayDocumentProvider docProvider) {
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
