package runwayMdParsingClasses;

import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

import com.runwaysdk.eclipse.plugin.runway.MDAttributeDecimal;
import com.runwaysdk.eclipse.plugin.runway.RunwayFactory;

public class MdAttributeDecimalParser extends MdAttributeParser
{

  public MdAttributeDecimalParser(NamedNodeMap nodeMap)
  {
    super(RunwayFactory.eINSTANCE.createMDAttributeDecimal(), nodeMap);
  }

  @Override
  public MDAttributeDecimal parse()
  {
    MDAttributeDecimal mdAttributeDecimal = getMetaData();

    Node defaultValue = nodeMap.getNamedItem("defaultValue");

    if (defaultValue != null)
    {
      mdAttributeDecimal.setDefaultValue(new Float(defaultValue.getNodeValue()));
    }

    return (MDAttributeDecimal) super.parse();
  }

  @Override
  public MDAttributeDecimal getMetaData()
  {
    return (MDAttributeDecimal) super.getMetaData();

  }
}
