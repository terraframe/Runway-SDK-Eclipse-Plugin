package runwayMdParsingClasses;

import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

import com.runwaysdk.eclipse.plugin.runway.MDAttributeText;
import com.runwaysdk.eclipse.plugin.runway.RunwayFactory;

public class MdAttributeTextParser extends MdAttributeParser
{

  public MdAttributeTextParser(NamedNodeMap nodeMap)
  {
    super(RunwayFactory.eINSTANCE.createMDAttributeText(), nodeMap);
  }

  @Override
  public MDAttributeText parse()
  {
    MDAttributeText mdAttributeText = getMetaData();
    
    Node defaultValue = nodeMap.getNamedItem("defaultValue");
    if (defaultValue != null)
    {
      mdAttributeText.setDefaultValue(defaultValue.getNodeValue());
    }
    
    return (MDAttributeText) super.parse();
  }

  @Override
  public MDAttributeText getMetaData()
  {
    return (MDAttributeText) super.getMetaData();

  }

}
