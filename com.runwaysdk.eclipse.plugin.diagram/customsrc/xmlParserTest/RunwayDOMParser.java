package xmlParserTest;

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

import com.runwaysdk.eclipse.plugin.runway.DocumentRoot;
import com.runwaysdk.eclipse.plugin.runway.MDAttribute;
import com.runwaysdk.eclipse.plugin.runway.MDBusiness;
import com.runwaysdk.eclipse.plugin.runway.MdAttributeFactory;
import com.runwaysdk.eclipse.plugin.runway.RunwayFactory;
import com.runwaysdk.eclipse.plugin.runway.RunwayPackage;

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
      File fXmlFile = new File(file);
      DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
      DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
      Document doc = dBuilder.parse(fXmlFile);
      doc.getDocumentElement().normalize();

      System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
      NodeList mdBusinessNodeList = doc.getElementsByTagName(XMLTags.MD_BUSINESS_TAG);
      System.out.println("-----------------------");

      for (int i = 0; i < mdBusinessNodeList.getLength(); i++)
      {
        Node mdBusinessNode = mdBusinessNodeList.item(i);

        if (mdBusinessNode.getNodeType() == Node.ELEMENT_NODE)
        {
          NamedNodeMap attrs = mdBusinessNode.getAttributes();
          
          // Create a new MdBusiness
          MDBusiness biz = newMdBusiness();
          biz.setClassName(attrs.getNamedItem("name").getNodeValue());
          biz.setDisplayLabel(attrs.getNamedItem("label").getNodeValue());
          
          NodeList mdBusinessChildNodeList = mdBusinessNode.getChildNodes();

          printAttributes(mdBusinessNode.getAttributes(), "MDBusiness Tag Attributes Information");
          for (int j = 0; j < mdBusinessChildNodeList.getLength(); j++)
          {
            Node mdBusinessChildNode = mdBusinessChildNodeList.item(j);

            if (mdBusinessChildNode.getNodeType() == Node.ELEMENT_NODE)
            {
              
              NodeList mdBusinessGrandChildNodeList = mdBusinessChildNode.getChildNodes();
              
              System.out.println(mdBusinessChildNode.getNodeName());
              printAttributes(mdBusinessChildNode.getAttributes(), "Attributes for: " + mdBusinessChildNode.getNodeName() + " tag");
              for (int k = 0; k < mdBusinessGrandChildNodeList.getLength(); k++)
              {
                Node mdBusinessGrandChildNode = mdBusinessGrandChildNodeList.item(k);

                System.out.println("Reading grand child node '" + mdBusinessChildNode.getNodeName() + "'");
                
                if (mdBusinessGrandChildNode.getNodeType() == Node.ELEMENT_NODE)
                {
                  if (mdBusinessChildNode.getNodeName() == "attributes") {
                    printAttributes(mdBusinessGrandChildNode.getAttributes(), "Attributes for: " + mdBusinessGrandChildNode.getNodeName() + " tag");
                    NamedNodeMap attrAttrs = mdBusinessGrandChildNode.getAttributes();
                    MDAttribute attr = newMdAttribute(biz, mdBusinessGrandChildNode.getNodeName());
                    attr.setName(attrAttrs.getNamedItem("name").getNodeValue());
                    attr.setRequired(new Boolean(attrAttrs.getNamedItem("required").getNodeValue()));
                    attr.setDisplayLabel(attrAttrs.getNamedItem("label").getNodeValue());
                  }
                }
              }

            }
          }
        }
      }

    }
    catch (Exception e)
    {
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

  private static String getTagValue(String sTag, Element eElement)
  {
    NodeList nlList = eElement.getElementsByTagName(sTag).item(0).getChildNodes();

    Node nValue = (Node) nlList.item(0);

    return nValue.getNodeValue();
  }

  private MDBusiness newMdBusiness()
  {
    MDBusiness biz = RunwayFactory.eINSTANCE.createMDBusiness();
//    biz.setClassName("Book");
//    biz.setDisplayLabel("This is a book.");
    Command command = AddCommand.create(editingDomain, documentRoot, RunwayPackage.eINSTANCE.getDocumentRoot_MdBusinesses(), biz);
    editingDomain.getCommandStack().execute(command);
    
    return biz;
  }
  
  private MDAttribute newMdAttribute(MDBusiness biz, String attrName) {
 // Create a new MdAttribute and add it to the MdBusiness's container
    MDAttribute attr = MdAttributeFactory.createMdAttribute(attrName);
//    attr.setName("isANovel");
//    attr.setDefaultValue(false);
    Command command = AddCommand.create(editingDomain, biz, RunwayPackage.eINSTANCE.getMDBusiness_Attributes(), attr);
    editingDomain.getCommandStack().execute(command);
    
    return attr;
  }

}
