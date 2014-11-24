package runwayMdParsingClasses;

import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

import com.runwaysdk.eclipse.plugin.runway.MDAttributeNumber;
import com.runwaysdk.eclipse.plugin.runway.RunwayFactory;

public class MdAttributeNumberParser extends MdAttributeParser
{

  public MdAttributeNumberParser(NamedNodeMap nodeMap)
  {
    super(RunwayFactory.eINSTANCE.createMDAttributeNumber(), nodeMap);
  }

  @Override
  public MDAttributeNumber parse()
  {
    MDAttributeNumber mdAttributeNumber = getMetaData();
    
    Node defaultValue = nodeMap.getNamedItem("defaultValue");
    if (defaultValue != null)
    {
      mdAttributeNumber.setDefaultValue(new Double(defaultValue.getNodeValue()));
    }
    
    return (MDAttributeNumber) super.parse();
  }

  @Override
  public MDAttributeNumber getMetaData()
  {
    return (MDAttributeNumber) super.getMetaData();

  }
}
