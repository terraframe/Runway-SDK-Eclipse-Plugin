package com.runwaysdk.eclipse.plugin.schema.importer;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import runwayMdParsingClasses.MdParserFactory;

import com.runwaysdk.constants.XMLConstants;
import com.runwaysdk.eclipse.plugin.runway.DocumentRoot;
import com.runwaysdk.eclipse.plugin.runway.MDAttribute;
import com.runwaysdk.eclipse.plugin.runway.MDClass;
import com.runwaysdk.eclipse.plugin.runway.MetaData;
import com.runwaysdk.eclipse.plugin.runway.RunwayPackage;

public class RunwayDOMParser
{
	// These two objects are used to modify GMF's domain model.
	private final EditingDomain editingDomain;
	private final DocumentRoot documentRoot;
	private MdParserFactory factory = new MdParserFactory();


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
			
			NodeList doItList = doc.getElementsByTagName(XMLTags.DO_IT_TAG);

			parseDoItNode(doItList);
			System.out.println("Done!!");


		}
		catch (Exception e){
			e.printStackTrace();
		}
	}

	private void parseDoItNode(NodeList doIt) {
		/*if(doIt.getLength() == 1){
			System.out.println("There is " + doIt.getLength() + " doIt");
			Node doItNode = doIt.item(0);
			if(doItNode.getNodeType() == Node.ELEMENT_NODE){
				System.out.println("Checking type of DoItNode");
				NodeList createNodeList = doItNode.getChildNodes();
				System.out.println("<createNodeList> has " + createNodeList.getLength() + " children");
				for(int i = 0; i < createNodeList.getLength(); i++){
					System.out.println("Inside <create> child #" + i);
					Node createNode = createNodeList.item(i);
					System.out.println(createNode.getNodeName());
					if(createNode.getNodeName().equals(XMLTags.CREATE_TAG)){
						System.out.println("Inside <create> tag");
						if(createNode.getNodeType() == Node.ELEMENT_NODE){
							System.out.println("Checking nodetype of CreateNode");
							parseCreateNode(createNode);
						}
					}
				}
			}
		}*/
		if(doIt.getLength() == 1){
			System.out.println("There is " + doIt.getLength() + " doIt");
			Element doItNode = (Element)doIt.item(0);
			NodeList doItChildren = doItNode.getChildNodes();
			System.out.println("<doIt> has " + doItChildren.getLength() + " children");
			for(int i = 0; i < doItChildren.getLength(); i++){
				Node createNode = doItChildren.item(i);
				if(createNode instanceof Element){
					System.out.println("Here");
					System.out.println(createNode.getNodeName());
					if(createNode.getNodeName().equals(XMLTags.CREATE_TAG)){
						System.out.println("Inside <"+createNode.getNodeName()+">");
						parseCreateNode(createNode);
					}
				}else{
					System.out.println("Not an element node");
				}
			}
		}
		
	}

	private void parseCreateNode(Node createNode) {
		NodeList mdNodeList = createNode.getChildNodes();
		// 1. Go through each element of the list
		for(int i = 0; i < mdNodeList.getLength(); i++){
			Node mdNode = mdNodeList.item(i);
			if(mdNode instanceof Element){
				System.out.println("mdNode#" + i);
				System.out.println(mdNode.getNodeName());
				System.out.println(mdNode.getAttributes().getNamedItem(XMLTags.NAME_ATTRIBUTE).getNodeValue());
				System.out.println("LOOK HERE");
				MetaData mdNodeObject = factory.getContentFromNode(mdNode);
				System.out.println("DONE CREATING Medata");
				if((MDClass)mdNodeObject instanceof MDClass){
					System.out.println("Inside an MDClass");
					NodeList attributeList = mdNode.getChildNodes();
					for(int j = 0; j < attributeList.getLength(); j++){
						Node attributeNode = attributeList.item(j);
						if(attributeNode instanceof Element){
							System.out.println("About to read <attributes>");
							List<MDAttribute> mdAttributeList = parseAttributeNode(attributeNode);
							linkAttributes((MDClass)mdNodeObject, mdAttributeList);
							System.out.println("Done linking attribtues!!!!!!!!!!!!!!!!");
						}
						else{
							System.out.println("Not an element node");
						}
					}
				}else{
					System.out.println("mdNodeObject is not an instance of MDClass");
				}
			}else{
				System.out.println("Not an element node");
			}
		}
	}


	private List<MDAttribute> parseAttributeNode(Node attrNode) {
		NodeList attrList = attrNode.getChildNodes();
		List<MDAttribute> mdAttributeList = new ArrayList<MDAttribute>();
		
		for (int i = 0; i < attrList.getLength(); i++){
			Node attribute = attrList.item(i);
			if(attribute.getNodeType() == Node.ELEMENT_NODE){
				mdAttributeList.add((MDAttribute) factory.getContentFromNode(attribute));
			}
		}
		return mdAttributeList;
		
	}
	
	private void linkAttributes(MDClass mdClass, List<MDAttribute> mdAttributeList){
		for(int i = 0; i < mdAttributeList.size(); i++){
			MDAttribute mdAttribute = mdAttributeList.get(i);
			Command command = AddCommand.create(editingDomain, mdClass, RunwayPackage.eINSTANCE.getMDClass_Attributes(), mdAttribute);
			editingDomain.getCommandStack().execute(command);
		}
	}

    /*private MDBusiness newMdBusiness(NamedNodeMap attrs){
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
	}*/

}
