package runwayMdParsingClasses;

import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

import com.runwaysdk.eclipse.plugin.runway.MDAttributeDouble;
import com.runwaysdk.eclipse.plugin.runway.RunwayFactory;

public class MdAttributeDoubleParser extends MdAttributeParser
{

  public MdAttributeDoubleParser(NamedNodeMap nodeMap)
  {
    super(RunwayFactory.eINSTANCE.createMDAttributeDouble(), nodeMap);
    // TODO Auto-generated constructor stub
  }

  @Override
  public MDAttributeDouble parse()
  {
    MDAttributeDouble mdAttributeDouble = getMetaData();
    
    Node defaultValue = nodeMap.getNamedItem("defaultValue");
    if (defaultValue != null)
    {
      mdAttributeDouble.setDefaultValue(new Double(defaultValue.getNodeValue()));
    }
    
    return (MDAttributeDouble) super.parse();
  }

  @Override
  public MDAttributeDouble getMetaData()
  {
    return (MDAttributeDouble) super.getMetaData();

  }
}
