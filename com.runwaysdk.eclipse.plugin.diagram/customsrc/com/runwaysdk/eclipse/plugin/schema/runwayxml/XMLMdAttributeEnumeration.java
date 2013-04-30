package com.runwaysdk.eclipse.plugin.schema.runwayxml;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class XMLMdAttributeEnumeration extends XMLMdAttribute {

	public XMLMdAttributeEnumeration() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Element writeXML(Document dom) {
	Element xml = dom.createElement("enumeration");
	    return super.writeXML(dom, xml);
	}
		  
	@Override
	public Element writeDeleteXML(Document dom) {
	    Element xml = dom.createElement("object");
	    xml.setAttribute("type", "com.runwaysdk.system.metadata.MdAttributeEnumeration");
	    return super.writeDeleteXML(dom, xml);
	}

}
