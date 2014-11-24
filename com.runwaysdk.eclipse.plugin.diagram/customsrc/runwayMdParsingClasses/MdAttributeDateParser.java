package runwayMdParsingClasses;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

import org.w3c.dom.DOMException;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

import com.runwaysdk.eclipse.plugin.runway.MDAttributeDate;
import com.runwaysdk.eclipse.plugin.runway.RunwayFactory;

public class MdAttributeDateParser extends MdAttributeParser
{

  public MdAttributeDateParser(NamedNodeMap nodeMap)
  {
    super(RunwayFactory.eINSTANCE.createMDAttributeDate(), nodeMap);
  }

  /**
   * TODO Make sure this is the correct way to set dates
   */

  @Override
  public MDAttributeDate parse()
  {
    MDAttributeDate mdAttributeDate = getMetaData();

    try
    {
      Node defaultValue = nodeMap.getNamedItem("defaultValue");
      
      if (defaultValue != null)
      {
        mdAttributeDate.setDefaultValue(new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH).parse(defaultValue.getNodeValue()));
      }
    }
    catch (DOMException e)
    {
      e.printStackTrace();
    }
    catch (ParseException e)
    {
      e.printStackTrace();
    }

    return (MDAttributeDate) super.parse();

  }

  @Override
  protected MDAttributeDate getMetaData()
  {
    return (MDAttributeDate) super.getMetaData();
  }

}
