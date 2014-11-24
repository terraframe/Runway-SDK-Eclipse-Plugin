package runwayMdParsingClasses;

import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

import com.runwaysdk.eclipse.plugin.runway.MDAttributeFloat;
import com.runwaysdk.eclipse.plugin.runway.RunwayFactory;

public class MdAttributeFloatParser extends MdAttributeParser
{

  public MdAttributeFloatParser(NamedNodeMap nodeMap)
  {
    super(RunwayFactory.eINSTANCE.createMDAttributeFloat(), nodeMap);
  }

  @Override
  public MDAttributeFloat parse()
  {
    MDAttributeFloat mdAttributeFloat = getMetaData();
    
    Node defaultValue = nodeMap.getNamedItem("defaultValue");
    if (defaultValue != null)
    {
      mdAttributeFloat.setDefaultValue(new Float(defaultValue.getNodeValue()));
    }
    
    return (MDAttributeFloat) super.parse();
  }

  @Override
  public MDAttributeFloat getMetaData()
  {
    return (MDAttributeFloat) super.getMetaData();

  }
}
