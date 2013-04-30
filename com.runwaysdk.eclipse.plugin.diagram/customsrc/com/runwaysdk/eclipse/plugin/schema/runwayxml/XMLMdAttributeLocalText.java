package com.runwaysdk.eclipse.plugin.schema.runwayxml;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class XMLMdAttributeLocalText extends XMLMdAttributeLocal {

	public XMLMdAttributeLocalText() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Element writeXML(Document dom) {
	Element xml = dom.createElement("localText");
	    return super.writeXML(dom, xml);
	}
		  
	@Override
	public Element writeDeleteXML(Document dom) {
	    Element xml = dom.createElement("object");
	    xml.setAttribute("type", "com.runwaysdk.system.metadata.MdAttributeLocalText");
	    return super.writeDeleteXML(dom, xml);
	}
}
