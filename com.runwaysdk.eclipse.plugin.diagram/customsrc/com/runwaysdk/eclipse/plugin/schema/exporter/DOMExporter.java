package com.runwaysdk.eclipse.plugin.schema.exporter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.runwaysdk.eclipse.plugin.schema.runwayxml.XMLMdBusiness;
import com.runwaysdk.eclipse.plugin.schema.runwayxml.XMLMetadata;

public class DOMExporter {
	
    private Document dom;
    private Element version;
    private Element doIt;
    private Element doItCreate;
    private Element doItUpdate;
    private Element doItDelete;
    private Element undoIt;
    private Element undoItCreate;
    private Element undoItUpdate;
    private Element undoItDelete;

	public static void main(String[] args) {
		
		List<XmlAttribute> attributes = new ArrayList<XmlAttribute>();
		List<XmlElement> elements = new ArrayList<XmlElement>();
		
		XmlAttribute attTest = new XmlAttribute("name", "value");
		XmlAttribute attTest2 = new XmlAttribute("name2", "value2");
		attributes.add(attTest);
		attributes.add(attTest2);
		
		XmlElement eleTest =  new XmlElement("XmlName", null, attributes);
		XmlElement eleTest2 =  new XmlElement("XmlName2", eleTest, attributes);
		elements.add(eleTest);
		elements.add(eleTest2);
		
		System.out.println(elements.size());

		String fileName = "garbledMen.xml";
//		writeMdBusiness(fileName, elements);
		
	}
	
	// This method is called when the user saves the document.
	public static void doExport() {
		// Generates an empty Runway XML file
		DOMExporter instance = new DOMExporter();
		String fileName = "garbledMen";
		instance.generateEmptySchema(fileName);
		
		List<XMLMdBusiness> records = XMLRecordFactory.getRecords();
		for (int i = 0; i < records.size(); i++) {
			XMLMdBusiness record = records.get(i);
			Element el = record.writeDoItXML(instance.dom);
			if (record.getCrudFlag() == XMLMetadata.CREATE) {
				el.appendChild(instance.doItCreate);
			} else if (record.getCrudFlag() == XMLMetadata.UPDATE) {
				el.appendChild(instance.doItUpdate);
			} else if (record.getCrudFlag() == XMLMetadata.DELETE) {
				el.appendChild(instance.doItDelete);
			}
		}
        try {
            Transformer tr = TransformerFactory.newInstance().newTransformer();
            tr.setOutputProperty(OutputKeys.INDENT, "yes");
            tr.setOutputProperty(OutputKeys.METHOD, "xml");
            tr.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            tr.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
            tr.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");

            // send DOM to file
            tr.transform(new DOMSource(instance.dom), 
                                 new StreamResult(new FileOutputStream(fileName)));
        } catch (TransformerException te) {
            System.out.println(te.getMessage());
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }


    static Document elementBuilder(Document dom, String elementName, List<XmlAttribute> attributeList, XmlElement parent) {
    	Element elementBuilder = dom.createElement(elementName);
    	for (int j = 0; j < attributeList.size(); j++) {
    		elementBuilder.setAttribute(attributeList.get(j).getAttributeName(),
    				attributeList.get(j).getAttributeValue());
    	}
    	if (parent != null) {
    		// i need to change parent from XmlElement to Element
 //   		elementBuilder.getNodeName(); // Just test code
    		
    		String parentName = parent.getElementName(); // Get's the parents name

    		//Where do I set the parents id?
    		//This assumes that the node's name is its id. Which is false.
    		Element parentId = dom.getElementById(parentName); // Get's the parents unique id?

    		parentId.appendChild(elementBuilder); // Should append the child to the parent in the dom
    		
    	} else {
    		// Declares the Element as the root node 
   			dom.appendChild(elementBuilder);
    	}
    	return dom;
    }

	public void generateEmptySchema (String filename) {
	    Document dom;

	    // instance of a DocumentBuilderFactory
	    DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
	    try {
	        // use factory to get an instance of document builder
	        DocumentBuilder db = dbf.newDocumentBuilder();
	        // create instance of DOM
	        dom = db.newDocument();
	        
	        // create data elements and place them in the structure
	        version = dom.createElement("version");
	        version.setAttribute("xsi:noNamespaceSchemaLocation", "../../profiles/version_gis.xsd");
	        version.setAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");

	        doIt = dom.createElement("doIt");
	        version.appendChild(doIt);

	        doItCreate = dom.createElement("create");
	        doIt.appendChild(doItCreate);

	        doItUpdate = dom.createElement("update");
	        doIt.appendChild(doItUpdate);

	        doItDelete = dom.createElement("delete");
	        doIt.appendChild(doItDelete);

	        undoIt = dom.createElement("undoIt");
	        version.appendChild(undoIt);

	        undoItCreate = dom.createElement("create");
	        doIt.appendChild(undoItCreate);

	        undoItUpdate = dom.createElement("update");
	        doIt.appendChild(undoItUpdate);

	        undoItDelete = dom.createElement("delete");
	        undoIt.appendChild(undoItDelete);

	        dom.appendChild(version);

	    } catch (ParserConfigurationException pce) {
	        System.out.println("UsersXML: Error trying to instantiate DocumentBuilder " + pce);
	    }
	}

	
    
    
    
    
/*	public static void writeMdBusiness(String filename, String name, String display) {
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
	        version.appendChild(doIt);

	        Element create = dom.createElement("create");
	        doIt.appendChild(create);

	        Element mdBusiness = dom.createElement("mdBusiness");
	        mdBusiness.setAttribute("name", "com.terraframe.runwaytemplate.HelloWorld");
	        mdBusiness.setAttribute("label", "HelloWorld");
	        create.appendChild(mdBusiness);

	        Element attributes = dom.createElement("attributes");
	        mdBusiness.appendChild(attributes);
	        
	        Element character = dom.createElement("char");
	        character.setAttribute("name", "greeting");
	        character.setAttribute("required", "true");
	        character.setAttribute("label", "Greeting");
	        character.setAttribute("size", "50");
	        attributes.appendChild(character);

	        Element mdMethod = dom.createElement("mdMethod");
	        mdBusiness.appendChild(mdMethod);

	        Element update = dom.createElement("update");
	        doIt.appendChild(update);

	        Element undoIt = dom.createElement("undoIt");
	        version.appendChild(undoIt);

	        Element delete = dom.createElement("delete");
	        undoIt.appendChild(delete);

	        Element object = dom.createElement("object");
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
	                                 new StreamResult(new FileOutputStream(filename)));

	        } catch (TransformerException te) {
	            System.out.println(te.getMessage());
	        } catch (IOException ioe) {
	            System.out.println(ioe.getMessage());
	        }
	    } catch (ParserConfigurationException pce) {
	        System.out.println("UsersXML: Error trying to instantiate DocumentBuilder " + pce);
	    }
	} */
	
}
