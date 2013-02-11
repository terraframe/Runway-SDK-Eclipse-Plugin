package com.runwaysdk.eclipse.plugin.wizards;

import java.io.File;
import java.util.Collections;

import org.apache.maven.shared.invoker.DefaultInvocationRequest;
import org.apache.maven.shared.invoker.DefaultInvoker;
import org.apache.maven.shared.invoker.InvocationRequest;
import org.apache.maven.shared.invoker.Invoker;
import org.apache.maven.shared.invoker.MavenInvocationException;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

import com.runwaysdk.eclipse.plugin.runway.diagram.part.RunwayCreationWizardPage;

public class NewRunwayProjectWizard extends Wizard implements INewWizard
{
  protected RunwayCreationWizardPage diagramModelFilePage;
  protected NewRunwayProjectWizardPage1 page1;
  protected IStructuredSelection     selection;
  
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
    // Generate the project with a mvn archetype:generate
    InvocationRequest request = new DefaultInvocationRequest();
    request.setBaseDirectory(new File(page1.getLocation()));
    request.setGoals( Collections.singletonList( "archetype:generate" +
    		" -DarchetypeGroupId=com.runwaysdk " +
    		" -DarchetypeArtifactId=runwaysdk-archetype " +
    		" -DarchetypeVersion=0.0.2-SNAPSHOT " +
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
    
    
    String baseDir = page1.getLocation() + "/" + page1.getArtifactId();
    
    // Import the generated project into Eclipse
//    final Collection<MavenProjectInfo> projects = new ArrayList<MavenProjectInfo>();
//    projects.add(new MavenProjectInfo(page1.getArtifactId(), new File(baseDir + "/pom.xml"), new Model(), null));
//    try
//    {
//      List<IMavenProjectImportResult> results = MavenPlugin.getProjectConfigurationManager().importProjects(
//          projects, new ProjectImportConfiguration(), monitor.newChild(100));
//    }
//    catch (CoreException e)x
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
    
    try
    {
      IProjectDescription description;
      description = ResourcesPlugin.getWorkspace().loadProjectDescription(new Path(page1.getLocation() + "/" + page1.getArtifactId() + "/.project"));
      IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(description.getName());
      project.create(description, null);
      project.open(null);
    }
    catch (CoreException e)
    {
      e.printStackTrace();
    }
    
//    IOverwriteQuery overwriteQuery = new IOverwriteQuery() {
//          public String queryOverwrite(String file) { return ALL; }
//    };
//    
//    String baseDir = page1.getLocation() + "/" + page1.getArtifactId();
//    System.out.println("baseDir = " + baseDir);
//    ImportOperation importOperation = new ImportOperation(new Path(page1.getArtifactId()),
//          new File(baseDir), new FileSystemStructureProvider(), overwriteQuery);
//    importOperation.setCreateContainerStructure(false);
//    try
//    {
//      importOperation.run(new NullProgressMonitor());
//    }
//    catch (InvocationTargetException e)
//    {
//      // TODO Auto-generated catch block
//      e.printStackTrace();
//    }
//    catch (InterruptedException e)
//    {
//      // TODO Auto-generated catch block
//      e.printStackTrace();
//    }
    
    
    return true;
  }
  
}
