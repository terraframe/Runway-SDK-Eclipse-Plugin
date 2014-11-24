package runwayMdParsingClasses;

import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

import com.runwaysdk.eclipse.plugin.runway.MDAttributeEnumeration;
import com.runwaysdk.eclipse.plugin.runway.RunwayFactory;

public class MdAttributeEnumerationParser extends MdAttributeParser
{

  public MdAttributeEnumerationParser(NamedNodeMap nodeMap)
  {
    super(RunwayFactory.eINSTANCE.createMDAttributeEnumeration(), nodeMap);
    // TODO Auto-generated constructor stub
  }

  @Override
  public MDAttributeEnumeration parse()
  {
    MDAttributeEnumeration mdAttributeEnumeration = getMetaData();
    
    Node defaultValue = nodeMap.getNamedItem("defaultValue");
    if (defaultValue != null)
    {
      mdAttributeEnumeration.setDefaultValue(defaultValue.getNodeValue());
    }
    
    return (MDAttributeEnumeration) super.parse();
  }

  @Override
  public MDAttributeEnumeration getMetaData()
  {
    return (MDAttributeEnumeration) super.getMetaData();

  }
}
