package xmlRunwayMetaObject;

import java.util.ArrayList;
import java.util.List;


/**
 * A meta-runway object class. Using this so that when parsing XML, we can create these meta-classes to organize object attributes and methods
 * @author armiller5
 *
 */
public class RunwayObject {
	
	private String _name; 
	private String _label;
	private List<RunwayMethod> _methods;
	private List<RunwayAttribute> _attributes;
	
	public RunwayObject(String name, String label ){
		_name = name;
		_label = label;
		_methods = new ArrayList<RunwayMethod>();
		_attributes = new ArrayList<RunwayAttribute>();
		
	}
	
	public List<RunwayMethod> getMethods(){
		return _methods;
	}
	
	public List<RunwayAttribute> getAttributes(){
		return _attributes;
	}
	
	public void addAttribute(RunwayAttribute runwayAttribute){
		_attributes.add(runwayAttribute);
	}
	
	public void addMethod(RunwayMethod runwayMethod){
		_methods.add(runwayMethod);
	}
	
	public String getLabel(){
		return _label;
	}
	
	public String getName(){
		return _name;
	}
	

}
