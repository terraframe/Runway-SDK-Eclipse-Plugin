package runwayMdParsingClasses;

import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

import com.runwaysdk.eclipse.plugin.runway.MDAttributeLong;
import com.runwaysdk.eclipse.plugin.runway.RunwayFactory;

public class MdAttributeLongParser extends MdAttributeParser {

  public MdAttributeLongParser(NamedNodeMap nodeMap) {
    super(RunwayFactory.eINSTANCE.createMDAttributeLong(), nodeMap);
  }



  @Override
  public MDAttributeLong parse(){
    Node defaultValue = nodeMap.getNamedItem("defaultValue");
    
    MDAttributeLong mdAttributeLong= getMetaData();
    if (defaultValue != null)
    {
      mdAttributeLong.setDefaultValue(new Long(defaultValue.getNodeValue()));
    }

    return (MDAttributeLong) super.parse();
  }

  @Override
  public MDAttributeLong getMetaData(){
    return (MDAttributeLong)super.getMetaData();
  }
}
