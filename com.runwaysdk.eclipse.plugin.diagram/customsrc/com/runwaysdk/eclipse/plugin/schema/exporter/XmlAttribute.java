package com.runwaysdk.eclipse.plugin.schema.exporter;

import java.util.ArrayList;

public class XmlAttribute{
	String attributeName;
	String attributeValue;

	
	public XmlAttribute(String attributeName, String attributeValue) {
		super();
		this.attributeName = attributeName;
		this.attributeValue = attributeValue;
	}
	public String getAttributeName() {
		return attributeName;
	}
	public void setAttributename(String attributename) {
		this.attributeName = attributename;
	}
	public String getAttributeValue() {
		return attributeValue;
	}
	public void setAttributeValue(String attributeValue) {
		this.attributeValue = attributeValue;
	}
}