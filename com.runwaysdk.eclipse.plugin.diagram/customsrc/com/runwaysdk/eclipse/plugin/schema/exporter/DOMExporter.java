package com.runwaysdk.eclipse.plugin.schema.exporter;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;
import org.w3c.dom.*;

import java.io.FileOutputStream;
import java.io.IOException;

public class DOMExporter {

	private static String role1 = "";

	public static void main(String[] args) {
		String fileName = "garbledMan.xml";
		saveToXML(fileName);
	}
	
	public static void saveToXML(String xml) {
	    Document dom;

	    // instance of a DocumentBuilderFactory
	    DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
	    try {
	        // use factory to get an instance of document builder
	        DocumentBuilder db = dbf.newDocumentBuilder();
	        // create instance of DOM
	        dom = db.newDocument();


	        // create data elements and place them in the structure
	        Element version = dom.createElement("version");
	        version.setAttribute("xsi:noNamespaceSchemaLocation", "../../profiles/version_gis.xsd");
	        version.setAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");

	        Element doIt = dom.createElement("doIt");
	        doIt.appendChild(dom.createTextNode(role1));
	        version.appendChild(doIt);

	        Element create = dom.createElement("create");
	        create.appendChild(dom.createTextNode(role1));
	        doIt.appendChild(create);

	        Element mdBusiness = dom.createElement("mdBusiness");
	        mdBusiness.appendChild(dom.createTextNode(role1));
	        mdBusiness.setAttribute("name", "com.terraframe.runwaytemplate.HelloWorld");
	        mdBusiness.setAttribute("label", "HelloWorld");
	        create.appendChild(mdBusiness);

	        Element attributes = dom.createElement("attributes");
	        attributes.appendChild(dom.createTextNode(role1));
	        mdBusiness.appendChild(attributes);
	        
	        Element character = dom.createElement("char");
	        character.appendChild(dom.createTextNode(role1));
	        character.setAttribute("name", "greeting");
	        character.setAttribute("required", "true");
	        character.setAttribute("label", "Greeting");
	        character.setAttribute("size", "50");
	        attributes.appendChild(character);

	        Element mdMethod = dom.createElement("mdMethod");
	        mdMethod.appendChild(dom.createTextNode(role1));
	        mdBusiness.appendChild(mdMethod);

	        Element update = dom.createElement("update");
	        update.appendChild(dom.createTextNode(role1));
	        doIt.appendChild(update);

	        Element undoIt = dom.createElement("undoIt");
	        undoIt.appendChild(dom.createTextNode(role1));
	        version.appendChild(undoIt);

	        Element delete = dom.createElement("delete");
	        delete.appendChild(dom.createTextNode(role1));
	        undoIt.appendChild(delete);

	        Element object = dom.createElement("object");
	        object.appendChild(dom.createTextNode(role1));
	        object.setAttribute("key", "com.terraframe.runwaytemplate.HelloWorld");
	        object.setAttribute("type", "com.runwaysdk.system.metadata.MdBusiness");
	        delete.appendChild(object);

	        dom.appendChild(version);

	        try {
	            Transformer tr = TransformerFactory.newInstance().newTransformer();
	            tr.setOutputProperty(OutputKeys.INDENT, "yes");
	            tr.setOutputProperty(OutputKeys.METHOD, "xml");
	            tr.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
	            tr.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
	            tr.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");

	            // send DOM to file
	            tr.transform(new DOMSource(dom), 
	                                 new StreamResult(new FileOutputStream(xml)));

	        } catch (TransformerException te) {
	            System.out.println(te.getMessage());
	        } catch (IOException ioe) {
	            System.out.println(ioe.getMessage());
	        }
	    } catch (ParserConfigurationException pce) {
	        System.out.println("UsersXML: Error trying to instantiate DocumentBuilder " + pce);
	    }
	}

	
}
