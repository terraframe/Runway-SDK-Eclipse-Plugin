package com.runwaysdk.eclipse.plugin.schema.runwayxml;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class XMLMdAttributeCharacter extends XMLMdAttribute {

	public XMLMdAttributeCharacter() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Element writeXML(Document dom) {
	Element xml = dom.createElement("char");
	    return super.writeXML(dom, xml);
	}
		  
	@Override
	public Element writeDeleteXML(Document dom) {
	    Element xml = dom.createElement("object");
	    xml.setAttribute("type", "com.runwaysdk.system.metadata.MdAttributeCharacter");
	    return super.writeDeleteXML(dom, xml);
	}

}
