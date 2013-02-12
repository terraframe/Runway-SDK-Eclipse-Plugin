package com.runwaysdk.eclipse.plugin.wizards;

import java.io.File;
import java.net.URL;

import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.preference.DirectoryFieldEditor;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Composite;

public class NewRunwayProjectWizardPage1 extends WizardPage
{
  private Composite base;
  private StringFieldEditor projectField;
  private DirectoryFieldEditor locationField;
  private StringFieldEditor artifactIdField;
  private boolean artifactIdFieldIsUnchanged = true;
  private StringFieldEditor groupIdField;
  private StringFieldEditor versionField;
  private StringFieldEditor packageField;
  private StringFieldEditor mavenLocField;
  protected String projectName = "";
  protected String location = "";
  protected String mavenLoc = "";
  protected String artifactId = "";
  protected String groupId = "com.example";
  protected String version = "0.0.1-SNAPSHOT";
  protected String pkge = "com.example";
  protected String baseDir = "";
  protected IStructuredSelection selection;
  
  public NewRunwayProjectWizardPage1() {
    super("New Runway Project Wizard");
    setTitle("New Runway Project Wizard");
    setDescription("Crates a new Runway project.");
  }
  
  @Override
  public void createControl(final Composite parent) {
    
    // http://help.eclipse.org/indigo/index.jsp?topic=%2Forg.eclipse.platform.doc.isv%2Freference%2Fapi%2Forg%2Feclipse%2Fjface%2Fpreference%2Fpackage-summary.html
    // http://www.eclipse.org/articles/article.php?file=Article-Understanding-Layouts/index.html
    
    base = new Composite(parent, SWT.NULL);
    RowLayout rowLayout = new RowLayout();
    rowLayout.wrap = false;
    rowLayout.pack = false;
    rowLayout.justify = true;
    rowLayout.type = SWT.VERTICAL;
    rowLayout.marginLeft = 5;
    rowLayout.marginTop = 5;
    rowLayout.marginRight = 5;
    rowLayout.marginBottom = 5;
    rowLayout.spacing = 0;
    base.setLayout(rowLayout);
    
    final Composite projectFieldBase = new Composite(base, SWT.NONE);
    projectField = new StringFieldEditor("ProjectName", "Project Name", projectFieldBase);
    projectField.setEmptyStringAllowed(false);
    projectField.setLabelText("Project Name");
    projectField.setStringValue(projectName);
    projectField.setPropertyChangeListener(new IPropertyChangeListener() {
        @Override
        public void propertyChange(PropertyChangeEvent event) {
            if (event.getProperty().equals("field_editor_value")) {
                projectName = (String)event.getNewValue();
                
                if (artifactIdFieldIsUnchanged) {
                  artifactId = projectName.replace(" ", "-").toLowerCase();
                  artifactIdField.setStringValue(artifactId);
                  artifactIdFieldIsUnchanged = true;
                }
            }
        }
    });
    
    
//    final Button setWorkspace = new Button(base, SWT.CHECK);
//    setWorkspace.setText("Use default workspace");
//    setWorkspace.setSelection(true);
    
    URL url = Platform.getInstanceLocation().getURL();
    location = new File(url.getPath()).getAbsolutePath();
    
    final Composite locationFieldBase = new Composite(base, SWT.NONE);
//    locationFieldBase.setLayout(new GridLayout());
//    locationFieldBase.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
    
    locationField = new DirectoryFieldEditor("BaseDir", "Base Directory", locationFieldBase);
    locationField.setStringValue(location);
//    locationField.fillIntoGrid( locationFieldBase, locationField.getNumberOfControls() );
    locationField.setEmptyStringAllowed( false );
//    locationField.setEnabled(false, locationFieldBase);

//    setWorkspace.addSelectionListener(new SelectionAdapter() {
//        @Override
//        public void widgetSelected(final SelectionEvent e) {
//          locationField.setEnabled(!setWorkspace.getSelection(), locationFieldBase);
//          parent.layout();
//        }
//    });

    locationField.setPropertyChangeListener(new IPropertyChangeListener() {
        @Override
        public void propertyChange(PropertyChangeEvent event) {
            if (event.getProperty().equals("field_editor_value")) {
                location = (String)event.getNewValue();
            }
        }
    });
    
    
    
    final Composite mavenComposite = new Composite(base, SWT.NONE);
//    mavenComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
    
    mavenLocField = new StringFieldEditor("MavenLoc", "Maven Executable Location", mavenComposite); 
    mavenLocField.setEmptyStringAllowed(false);
    mavenLoc = findMavenLoc();
    mavenLocField.setStringValue(mavenLoc);
    mavenLocField.setPropertyChangeListener(new IPropertyChangeListener() {
        @Override
        public void propertyChange(PropertyChangeEvent event) {
            if (event.getProperty().equals("field_editor_value")) {
                mavenLoc = (String)event.getNewValue();
            }
        }
    });
    
    artifactIdField = new StringFieldEditor("ArtifactId", "Artifact Id", mavenComposite); 
    artifactIdField.setEmptyStringAllowed(false);
    artifactIdField.setStringValue(artifactId);
    artifactIdField.setPropertyChangeListener(new IPropertyChangeListener() {
        @Override
        public void propertyChange(PropertyChangeEvent event) {
            if (event.getProperty().equals("field_editor_value")) {
                artifactId = (String)event.getNewValue();
                artifactIdFieldIsUnchanged = false;
            }
        }
    });
    
    groupIdField = new StringFieldEditor("groupId", "Group Id", mavenComposite); 
    groupIdField.setEmptyStringAllowed(false);
    groupIdField.setStringValue(groupId);
    groupIdField.setPropertyChangeListener(new IPropertyChangeListener() {
        @Override
        public void propertyChange(PropertyChangeEvent event) {
            if (event.getProperty().equals("field_editor_value")) {
                groupId = (String)event.getNewValue();
            }
        }
    });
    
    versionField = new StringFieldEditor("Version", "Version", mavenComposite); 
    versionField.setEmptyStringAllowed(false);
    versionField.setStringValue(version);
    versionField.setPropertyChangeListener(new IPropertyChangeListener() {
        @Override
        public void propertyChange(PropertyChangeEvent event) {
            if (event.getProperty().equals("field_editor_value")) {
                version = (String)event.getNewValue();
            }
        }
    });
    
    packageField = new StringFieldEditor("Package", "Package", mavenComposite); 
    packageField.setEmptyStringAllowed(false);
    packageField.setStringValue(pkge);
    packageField.setPropertyChangeListener(new IPropertyChangeListener() {
        @Override
        public void propertyChange(PropertyChangeEvent event) {
            if (event.getProperty().equals("field_editor_value")) {
                pkge = (String)event.getNewValue();
            }
        }
    });
    
    base.setEnabled(true);
    base.setVisible(true);
    base.update();
    setControl(base);
    setPageComplete(true);
  }
  
  public String findMavenLoc() {
    String mavenHomePath = System.getProperty("maven.home");
    
    if (mavenHomePath == null) {
      return findExecutableOnPath("mvn").getAbsolutePath();
    }
    
    return mavenHomePath;
  }
  
  private static File findExecutableOnPath(String executableName)
  {
    String systemPath = System.getenv("PATH");
    String[] pathDirs = systemPath.split(File.pathSeparator);

    File fullyQualifiedExecutable = null;
    for (String pathDir : pathDirs)
    {
      File file = new File(pathDir, executableName);
      if (file.isFile())
      {
        fullyQualifiedExecutable = file;
        break;
      }
    }
    return fullyQualifiedExecutable;
  }
  
  public String getProjectName()
  {
    return projectName;
  }
  
  public String getArtifactId()
  {
    return artifactId;
  }

  public String getGroupId()
  {
    return groupId;
  }

  public String getVersion()
  {
    return version;
  }

  public String getPkge()
  {
    return pkge;
  }
  
  public String getLocation()
  {
    return location;
  }
  
  public String getMavenLoc()
  {
    return mavenLoc;
  }

  public IStructuredSelection getSelection()
  {
    return selection;
  }

  public void setSelection(IStructuredSelection selection)
  {
    this.selection = selection;
  }
}
