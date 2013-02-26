package com.runwaysdk.eclipse.plugin.wizards;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;

import org.apache.maven.shared.invoker.DefaultInvocationRequest;
import org.apache.maven.shared.invoker.DefaultInvoker;
import org.apache.maven.shared.invoker.InvocationRequest;
import org.apache.maven.shared.invoker.Invoker;
import org.apache.maven.shared.invoker.MavenInvocationException;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.dialogs.IOverwriteQuery;
import org.eclipse.ui.internal.ide.filesystem.FileSystemStructureProvider;
import org.eclipse.ui.wizards.datatransfer.ImportOperation;

import com.runwaysdk.eclipse.plugin.runway.diagram.part.Messages;
import com.runwaysdk.eclipse.plugin.runway.diagram.part.RunwayCreationWizardPage;
import com.runwaysdk.eclipse.plugin.runway.diagram.part.RunwayDiagramEditorPlugin;
import com.runwaysdk.eclipse.plugin.runway.diagram.part.RunwayDiagramEditorUtil;
import com.runwaysdk.eclipse.plugin.runway.impl.DocumentRootImpl;
import com.runwaysdk.eclipse.plugin.schema.importer.RunwayDOMParser;

public class NewRunwayProjectWizard extends Wizard implements INewWizard
{
  protected RunwayCreationWizardPage diagramModelFilePage;
  protected NewRunwayProjectWizardPage1 page1;
  protected IStructuredSelection     selection;
  
  static final String schemaFileName = "schema(0001352140861497)HelloWorld";
  private static final String schemaFileNameWithExtension = schemaFileName + ".xml";
  private static final String schemaPath = "/src/main/domain/application/" + schemaFileNameWithExtension;
  
  private static final String runwayArchetypeVersion = "0.0.2-SNAPSHOT";
  
  private static final String runway_diagram_filename = schemaFileName;
  private static final String runway_filename = runway_diagram_filename;
  private static final String diagram_files_path = "/src/main/domain/display/";
  
  public NewRunwayProjectWizard() {
    super();
    //setNeedsProgressMonitor(true);
  }
  
  @Override
  public void init(IWorkbench arg0, IStructuredSelection arg1)
  {
    this.selection = arg1;
  }
  
  @Override
  public void addPages() {
    page1 = new NewRunwayProjectWizardPage1();
    page1.setSelection(selection);
    addPage(page1);
  }
  
  @Override
  public boolean performFinish()
  {
    /*
     *  Generate the project with a mvn archetype:generate
     */
    InvocationRequest request = new DefaultInvocationRequest();
    request.setBaseDirectory(new File(page1.getLocation()));
    request.setGoals( Collections.singletonList( "archetype:generate" +
    		" -DarchetypeGroupId=com.runwaysdk" +
    		" -DarchetypeArtifactId=runwaysdk-archetype " +
    		" -DarchetypeVersion=" + runwayArchetypeVersion +
    		" -DgroupId=" + page1.getGroupId() +
    		" -DartifactId=" + page1.getArtifactId() +
    		" -Dpackage=" + page1.getPkge() +
    		" -Dversion=" + page1.getVersion()
        ) );

    Invoker invoker = new DefaultInvoker();
    invoker.setMavenHome(new File(page1.getMavenLoc() + "/../../"));
    try
    {
      invoker.execute( request );
    }
    catch (MavenInvocationException e)
    {
      e.printStackTrace();
    }
    
    
    String projectDir = page1.getLocation() + "/" + page1.getArtifactId();
    
    /**
     * Import the generated project into Eclipse.
     */
    IOverwriteQuery overwriteQuery = new IOverwriteQuery() {
      public String queryOverwrite(String file) { return ALL; }
    };
    
    ImportOperation importOperation = new ImportOperation(new Path(page1.getArtifactId()),
          new File(projectDir), new FileSystemStructureProvider(), overwriteQuery);
    importOperation.setCreateContainerStructure(false);
    try
    {
      importOperation.run(new NullProgressMonitor());
    }
    catch (InvocationTargetException e)
    {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    catch (InterruptedException e)
    {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    
    
    // This code creates a .project file (and fails if one already exists)
//    try
//    {
//      IProjectDescription description;
//      description = ResourcesPlugin.getWorkspace().loadProjectDescription(new Path(page1.getLocation() + "/" + page1.getArtifactId() + "/.project"));
//      IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(description.getName());
//      project.create(description, null);
//      project.open(null);
//    }
//    catch (CoreException e)
//    {
//      e.printStackTrace();
//    }
    
    // Attempted M2E Import integration
//    final Collection<MavenProjectInfo> projects = new ArrayList<MavenProjectInfo>();
//    projects.add(new MavenProjectInfo(page1.getArtifactId(), new File(baseDir + "/pom.xml"), new Model(), null));
//    try
//    {
//      List<IMavenProjectImportResult> results = MavenPlugin.getProjectConfigurationManager().importProjects(
//          projects, new ProjectImportConfiguration(), new NullProgressMonitor());
//    }
//    catch (CoreException e)
//    {
//      e.printStackTrace();
//    }
    
//    final IRunnableWithProgress importOperation = new IRunnableWithProgress() {
//      @Override
//      public void run(IProgressMonitor arg0) throws InvocationTargetException, InterruptedException
//      {
//        SubMonitor monitor = SubMonitor.convert(arg0, 101);
//        try {
//          List<IMavenProjectImportResult> results = MavenPlugin.getProjectConfigurationManager().importProjects(
//              projects, new ProjectImportConfiguration(), monitor.newChild(100));
//        }
//        catch (CoreException e)
//        {
//          e.printStackTrace();
//        } finally {
//          monitor.done();
//        }
//      }
//    };
    
    /*
     * Create a new diagram file in the project and open the diagram file.
     */
    final URI diagramModel = URI.createURI("platform:/resource/" + page1.getArtifactId() + diagram_files_path + runway_diagram_filename + ".runway_diagram");
    final URI domainModel = URI.createURI("platform:/resource/" + page1.getArtifactId() + diagram_files_path + runway_filename + ".runway");
    
    IRunnableWithProgress op = new WorkspaceModifyOperation(null)
    {

      protected void execute(IProgressMonitor monitor) throws CoreException, InterruptedException
      {
        Resource diagram = RunwayDiagramEditorUtil.createDiagram(diagramModel, domainModel, monitor);
        
        if (diagram != null) {
          try
          {
            RunwayDiagramEditorUtil.openDiagram(diagram);
          }
          catch (PartInitException e)
          {
            ErrorDialog.openError(getContainer().getShell(), Messages.RunwayCreationWizardOpenEditorError, null, e.getStatus());
          }
        }
        else {
          ErrorDialog.openError(getContainer().getShell(), "Error creating Runway Diagram.", null, null);
        }
      }
    };
    try
    {
      getContainer().run(false, true, op);
    }
    catch (InterruptedException e)
    {
      return false;
    }
    catch (InvocationTargetException e)
    {
      if (e.getTargetException() instanceof CoreException)
      {
        ErrorDialog.openError(getContainer().getShell(), Messages.RunwayCreationWizardCreationError, null,
            ( (CoreException) e.getTargetException() ).getStatus());
      }
      else
      {
        RunwayDiagramEditorPlugin.getInstance().logError("Error creating diagram", e.getTargetException()); //$NON-NLS-1$
      }
      return false;
    }
    
    
    /*
     * Import the HelloWorld schema.
     */
    AdapterFactory adapterFactory = RunwayDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory();
    AdapterFactoryEditingDomain editer = new AdapterFactoryEditingDomain(
        adapterFactory,
        new BasicCommandStack()
    );
    Resource resource = editer.createResource(domainModel.toPlatformString(true));
    try
    {
      // Load the file
      resource.load(null);
      
      // Retrieve the editing domain on the DocumentRoot
      EList<EObject> contents = resource.getContents();
      DocumentRootImpl documentRoot = (DocumentRootImpl) contents.get(0); //(DocumentRootImpl) diagram.getElement();
      EditingDomain editingDomain = AdapterFactoryEditingDomain.getEditingDomainFor(documentRoot);
      
      // Parse the schema and add it to GMF
      RunwayDOMParser parser = new RunwayDOMParser(editingDomain, documentRoot);
      parser.parse(projectDir + schemaPath);
      
      resource.save(null);
      
      resource.unload();
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }
    
    
    return true;
  }
  
}
