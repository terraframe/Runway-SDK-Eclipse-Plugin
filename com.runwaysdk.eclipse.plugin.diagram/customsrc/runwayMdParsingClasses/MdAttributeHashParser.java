package runwayMdParsingClasses;

import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

import com.runwaysdk.eclipse.plugin.runway.MDAttributeHash;
import com.runwaysdk.eclipse.plugin.runway.RunwayFactory;

public class MdAttributeHashParser extends MdAttributeParser
{

  public MdAttributeHashParser(NamedNodeMap nodeMap)
  {
    super(RunwayFactory.eINSTANCE.createMDAttributeHash(), nodeMap);
  }

  @Override
  public MDAttributeHash parse()
  {
    MDAttributeHash mdAttributeHash = getMetaData();
    
    Node defaultValue = nodeMap.getNamedItem("defaultValue");
    if (defaultValue != null)
    {
      mdAttributeHash.setDefaultValue(defaultValue.getNodeValue());
    }
    
    return (MDAttributeHash) super.parse();
  }

  @Override
  public MDAttributeHash getMetaData()
  {
    return (MDAttributeHash) super.getMetaData();

  }
}
