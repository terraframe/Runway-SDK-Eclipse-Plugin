package runwayMdParsingClasses;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.w3c.dom.DOMException;
import org.w3c.dom.NamedNodeMap;

import com.runwaysdk.eclipse.plugin.runway.MDAttributeDateTime;
import com.runwaysdk.eclipse.plugin.runway.RunwayFactory;
import com.runwaysdk.eclipse.plugin.schema.importer.XMLTags;

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
		try {
			mdAttributeDateTime.setDefaultValue(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").
					parse(nodeMap.getNamedItem(XMLTags.DATETIME_TAG).getNodeValue()));
		} catch (DOMException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return (MDAttributeDateTime)super.parse();


	}

	@Override
	public MDAttributeDateTime getMetaData(){
		return (MDAttributeDateTime)super.getMetaData();
	}

}
