package com.runwaysdk.eclipse.plugin.schema.exporter;

import java.util.EventObject;
import java.util.List;
import java.util.Map.Entry;

import org.eclipse.core.commands.operations.OperationHistoryFactory;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.change.FeatureChange;
import org.eclipse.emf.transaction.ResourceSetChangeEvent;
import org.eclipse.emf.transaction.ResourceSetListener;
import org.eclipse.emf.transaction.ResourceSetListenerImpl;
import org.eclipse.emf.transaction.Transaction;
import org.eclipse.emf.transaction.TransactionChangeDescription;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.document.IDiagramDocument;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.document.IDocument;


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
    
    Transaction tran = event.getTransaction();
    if (tran != null) {
      TransactionChangeDescription changeDesc = tran.getChangeDescription();
      EMap<EObject, EList<FeatureChange>> changeMap = changeDesc.getObjectChanges();
      
      for (int i = 0; i < changeMap.size(); ++i) {
        Entry<EObject, EList<FeatureChange>> mapEntry = changeMap.get(i);
        
        EObject obj = mapEntry.getKey();
        EList<FeatureChange> changes = mapEntry.getValue();
        
        System.out.println(i + " : " + obj + " = {");
        
        for (int j = 0; j < changes.size(); ++j) {
          FeatureChange change = changes.get(j);
          System.out.println("  " + j + " : " + change);
        }
        System.out.println("}");
      }
    }
    /*
    for (int i = 0; i < notes.size(); ++i) {
      Notification note = notes.get(i);
      
      Object feature = note.getFeature();
      Object newValue = note.getNewValue();
      
      System.out.println("feature = " + feature + "; newValue = " + newValue);
      
      if (feature instanceof EReference) {
        if (newValue instanceof MDBusiness && note.getEventType() == 1) {
          MDBusiness mdBiz = (MDBusiness) newValue;
          System.out.println("New MDBusiness detected. mdBiz.name = " + mdBiz.getName());
        }
      }
      else if (feature instanceof EAttribute) {
        EAttribute attr = (EAttribute) feature;
        
        if (attr.getEContainingClass().getInstanceClass().isAssignableFrom(com.runwaysdk.eclipse.plugin.runway.MDBusiness.class)) {
          
        }
        
//        EAttribute EAt = (EAttribute) newValue;
        int x = 1;
//          System.out.println("Change of name: " + EAt.getName() + feature.getClass().getName() + feature.getClass().get);
      }
    }
    */
    super.resourceSetChanged(event);
  }
  
  
  // Requires custom hook in RunwayDocumentProvider
  public static void onDocumentSave(IDocument document) {
    if (document instanceof IDiagramDocument) {
      IDiagramDocument diaDoc = (IDiagramDocument) document;
      TransactionalEditingDomain editDomain = diaDoc.getEditingDomain();
      
      CommandStack stack = editDomain.getCommandStack();
      System.out.println(stack.toString());
    }
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
