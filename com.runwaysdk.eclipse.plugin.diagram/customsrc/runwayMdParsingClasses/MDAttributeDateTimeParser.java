package runwayMdParsingClasses;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

import org.w3c.dom.DOMException;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

import com.runwaysdk.eclipse.plugin.runway.MDAttributeDateTime;
import com.runwaysdk.eclipse.plugin.runway.RunwayFactory;

public class MDAttributeDateTimeParser extends MdAttributeParser {

	public MDAttributeDateTimeParser(NamedNodeMap nodeMap) {
		super(RunwayFactory.eINSTANCE.createMDAttributeDateTime(), nodeMap);
	}

	/**
	 * TODO Make sure this is the right way to parse Datetime
	 */
	@Override
	public MDAttributeDateTime parse(){
		MDAttributeDateTime mdAttributeDateTime = getMetaData();
		
		try
	    {
		  Node defaultValue = nodeMap.getNamedItem("defaultValue");
	      
	      if (defaultValue != null)
	      {
	        mdAttributeDateTime.setDefaultValue(new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH).parse(defaultValue.getNodeValue()));
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
		
		return (MDAttributeDateTime)super.parse();


	}

	@Override
	public MDAttributeDateTime getMetaData(){
		return (MDAttributeDateTime)super.getMetaData();
	}

}
