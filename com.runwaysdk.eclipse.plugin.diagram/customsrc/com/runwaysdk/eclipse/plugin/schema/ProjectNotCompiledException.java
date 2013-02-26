package com.runwaysdk.eclipse.plugin.schema;

public class ProjectNotCompiledException extends Exception
{
  private static final long serialVersionUID = 2542935384526436668L;

  public ProjectNotCompiledException(String description) {
    super(description);
  }
}
