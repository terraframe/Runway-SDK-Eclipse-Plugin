package com.runwaysdk.eclipse.plugin.wizards;

import java.util.Vector;

import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardContainer;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

import com.runwaysdk.eclipse.plugin.runway.diagram.part.RunwayCreationWizard;

public class RunwayCreationWizardWithFinishListeners extends RunwayCreationWizard
{
  private Vector<OnPerformFinishListenerIF> listeners = new Vector<OnPerformFinishListenerIF>();

  @Override
  public boolean performFinish()
  {
    // Notify Listeners
    for (int i = 0; i < this.listeners.size(); ++i) {
      listeners.get(i).onPerformFinish();
    }
    
    return super.performFinish();
  }
  
  public void addFinishListener(OnPerformFinishListenerIF listener)
  {
    this.listeners.add(listener);
  }

  public interface OnPerformFinishListenerIF {
    public void onPerformFinish();
  }
  
}
