package runwayMdParsingClasses;

import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

import com.runwaysdk.eclipse.plugin.runway.MDAttributeInteger;
import com.runwaysdk.eclipse.plugin.runway.RunwayFactory;

public class MdAttributeIntegerParser extends MdAttributeParser
{

  public MdAttributeIntegerParser(NamedNodeMap nodeMap)
  {
    super(RunwayFactory.eINSTANCE.createMDAttributeInteger(), nodeMap);
  }

  @Override
  public MDAttributeInteger parse()
  {
    MDAttributeInteger mdAttributeInteger = getMetaData();
    
    Node defaultValue = nodeMap.getNamedItem("defaultValue");
    if (defaultValue != null)
    {
      mdAttributeInteger.setDefaultValue(new Integer(defaultValue.getNodeValue()));
    }
    
    return (MDAttributeInteger) super.parse();
  }

  @Override
  public MDAttributeInteger getMetaData()
  {
    return (MDAttributeInteger) super.getMetaData();

  }
}
