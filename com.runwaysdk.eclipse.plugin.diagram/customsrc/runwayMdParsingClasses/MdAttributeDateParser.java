package runwayMdParsingClasses;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

import org.w3c.dom.DOMException;
import org.w3c.dom.NamedNodeMap;

import com.runwaysdk.eclipse.plugin.runway.MDAttributeDate;
import com.runwaysdk.eclipse.plugin.runway.RunwayFactory;
import com.runwaysdk.eclipse.plugin.schema.importer.XMLTags;

public class MdAttributeDateParser extends MdAttributeParser {

	public MdAttributeDateParser(NamedNodeMap nodeMap){
		super(RunwayFactory.eINSTANCE.createMDAttributeDate(), nodeMap);
	}
	
	/**
	 * TODO Make sure this is the correct way to set dates
	 */

	@Override
	public MDAttributeDate parse(){
		MDAttributeDate mdAttributeDate = getMetaData();
		try {
			mdAttributeDate.setDefaultValue(new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH).parse(nodeMap.getNamedItem(XMLTags.DATE_TAG).getNodeValue()));
		} catch (DOMException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return (MDAttributeDate)super.parse();


	}

	@Override
	protected MDAttributeDate getMetaData(){
		return (MDAttributeDate)super.getMetaData();
	}


}
