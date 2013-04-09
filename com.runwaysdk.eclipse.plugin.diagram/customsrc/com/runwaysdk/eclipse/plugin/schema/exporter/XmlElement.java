package com.runwaysdk.eclipse.plugin.schema.exporter;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Element;

public class XmlElement {
	String elementName;
	XmlElement childOf;
    List<XmlAttribute> attributeList;

    public XmlElement(String elementName, XmlElement childOf, List<XmlAttribute> attributeList) {
		super();
		this.elementName = elementName;
		this.childOf = childOf; // TODO: This is wrong
		this.attributeList = attributeList;
	}

    public XmlElement(String elementName, List<XmlAttribute> attributeList) {
		super();
		this.elementName = elementName;
		this.attributeList = attributeList;
	}

    public String getElementName() {
		return elementName;
	}
	public void setElementName(String elementName) {
		this.elementName = elementName;
	}
	public XmlElement getChildOf() {
		return childOf;
	}
	public void setChildOf(XmlElement childOf) {
		this.childOf = childOf;
	}
	public List<XmlAttribute> getAttributeList() {
		return attributeList;
	}
	public void setAttributeList(List<XmlAttribute> attributeList) {
		this.attributeList = attributeList;
	}
}