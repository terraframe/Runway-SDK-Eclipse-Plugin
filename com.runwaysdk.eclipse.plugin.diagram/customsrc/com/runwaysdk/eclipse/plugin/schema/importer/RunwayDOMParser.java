package com.runwaysdk.eclipse.plugin.schema.importer;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.runwaysdk.constants.XMLConstants;
import com.runwaysdk.eclipse.plugin.runway.DocumentRoot;
import com.runwaysdk.eclipse.plugin.runway.MDAttribute;
import com.runwaysdk.eclipse.plugin.runway.MDBusiness;
import com.runwaysdk.eclipse.plugin.runway.MDClass;
import com.runwaysdk.eclipse.plugin.runway.RunwayFactory;
import com.runwaysdk.eclipse.plugin.runway.RunwayPackage;
import com.runwaysdk.eclipse.plugin.schema.MdAttributeFactory;
import com.runwaysdk.eclipse.plugin.schema.importer.MdParsers.MdStaticParsers;

public class RunwayDOMParser
{
	// These two objects are used to modify GMF's domain model.
	private final EditingDomain editingDomain;
	private final DocumentRoot documentRoot;

	public RunwayDOMParser(EditingDomain editingDomain, DocumentRoot documentRoot) {
		this.editingDomain = editingDomain;
		this.documentRoot = documentRoot;
	}

	public void parse(String file)
	{
		try
		{
			// Create a new xml File
			File xmlFile = new File(file);

			// Obtain a parser that produces DOM object trees from XML documents.
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();

			// XSD validator
			String xsdPath = "/com.runwaysdk.eclipse.plugin.diagram/xmlFiles/datatype.xsd";
			dbFactory.setAttribute(XMLConstants.JAXP_SCHEMA_LANGUAGE, XMLConstants.W3C_XML_SCHEMA);
			dbFactory.setAttribute(XMLConstants.JAXP_SCHEMA_SOURCE, new File(xsdPath));

			// Initialization of DocumentBuilder, Document and Normalization
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(xmlFile);
			doc.getDocumentElement().normalize(); // Not sure if this method is neccessary. 

			// 1. Get all "Top Level" objects in the xmlFile using getElementsByTagName method and store them in the "mdBusinessNodeList" variable
			NodeList mdBusinessNodeList = doc.getElementsByTagName(XMLTags.MD_BUSINESS_TAG);
			
			//Example
			NodeList mdEnumNodeList = doc.getElementsByTagName(XMLTags.MD_ENUMERATION_TAG);
			
			for (int i = 0; i < mdBusinessNodeList.getLength(); i++){	

				// Get the MDBusiness node from the mdBusinessNodeList
				Node mdBusinessNode = mdBusinessNodeList.item(i);
				// 2. For each MDBusiness node, get its children (i.e. attributes) and create new children classes with the extracted information
				parseMDBusiness(mdBusinessNode);
			}
			
			/**
			 * Just doing this as an example for now...
			 */
			for (int i = 0; i < mdEnumNodeList.getLength(); i++){	
				// Get the MDBusiness node from the mdBusinessNodeList
				Node mdEnumNode = mdEnumNodeList.item(i);
				// 2. For each MDBusiness node, get its children (i.e. attributes) and create new children classes with the extracted information
				//parseMdEnum(mdEnumNode);
			}

		}
		catch (Exception e){
			e.printStackTrace();
		}
	}

	private static void printAttributes(NamedNodeMap nodeMap, String customMessage)
	{
		System.out.println(customMessage);
		for (int p = 0; p < nodeMap.getLength(); p++)
		{
			System.out.println(nodeMap.item(p).getNodeName() + " = " + nodeMap.item(p).getNodeValue());
		}

	}


	private MDBusiness newMdBusiness(NamedNodeMap attrs){
		MDBusiness biz = RunwayFactory.eINSTANCE.createMDBusiness();
		
		//Fill in Business Values
		MdStaticParsers.parseMdBusiness(biz, attrs);
		//TODO Commenting out GMF stuff for testing purposes.

		Command command = AddCommand.create(editingDomain, documentRoot, RunwayPackage.eINSTANCE.getDocumentRoot_MetaData(), biz);
		editingDomain.getCommandStack().execute(command);

		System.out.println("Business class name: " + biz.getName());

		return biz;
	}

	// Proposed newMdAttribute
	private void newMdAttribute(MDClass mdclass, String attrName, NamedNodeMap attrs) {	

		// Create a new MdAttribute and add it to the MdAttribute's container
		MDAttribute attr = MdAttributeFactory.createMdAttribute(attrName);    

		attr.setName(attrs.getNamedItem(XMLTags.NAME_ATTRIBUTE).getNodeValue());
		attr.setRequired(new Boolean(attrs.getNamedItem(XMLTags.REQUIRED_ATTRIBUTE).getNodeValue()));
		attr.setDisplayLabel(attrs.getNamedItem(XMLTags.DISPLAY_LABEL_ATTRIBUTE).getNodeValue());

		System.out.println("Attribute name: " + attrName);
		// TODO Commenting this out for testing our parser
		Command command = AddCommand.create(editingDomain, mdclass, RunwayPackage.eINSTANCE.getMDClass_Attributes(), attr);

		editingDomain.getCommandStack().execute(command);
	}
	
	/*private void parseMDAttributes(Node mdNode){
		NodeList ChildNodeList = mdNode.getChildNodes();
		
		for(int i = 0; i < ChildNodeList.getLength(); i++){
			Node ChildNode = ChildNodeList.item(i);
			
			if(ChildNode.getNodeType() == Node.ELEMENT_NODE){
				NodeList attrNodeList = ChildNode.getChildNodes();
				
			}
		}
	}*/

	private void parseMDAtrributes(Node mdNode){
		
		if (mdNode.getNodeType() == Node.ELEMENT_NODE){
			NamedNodeMap attrs = mdNode.getAttributes();

			// 2.1 Create a new MdBusiness and set the appropriate values (i.e. name, label)
			//MDBusiness biz = newMdBusiness(attrs);

			// 2.2 Get all children objects of the MDBusiness node and store them in the "mdBusinessChildNodeList" variable
			NodeList ChildNodeList = mdNode.getChildNodes();

			for (int j = 0; j < ChildNodeList.getLength(); j++){
				Node ChildNode = ChildNodeList.item(j);

				if (ChildNode.getNodeType() == Node.ELEMENT_NODE){

					NodeList attributesNodeList = ChildNode.getChildNodes();

					for (int k = 0; k < attributesNodeList.getLength(); k++)
					{
						Node attributeNode = attributesNodeList.item(k);

						if (attributeNode.getNodeType() == Node.ELEMENT_NODE)
						{
							if (ChildNode.getNodeName() == "attributes") {
								printAttributes(attributeNode.getAttributes(), "Attributes for: " + attributeNode.getNodeName() + " tag");
								NamedNodeMap attrAttrs = attributeNode.getAttributes();
								//newMdAttribute(mdclass, attributeNode.getNodeName(), attrAttrs);
							}
						}
					}
				}
			}

		}
	}

}
