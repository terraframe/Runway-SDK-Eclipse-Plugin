package runwayMDMetaClasses;

public abstract class MetaMdClass extends MetaMdType {
	
	private String publish;
	private String stubSource;
	private String stubClass;
	private String stubDTOSource;
	private String stubDTOclass;
	
	public String getPublish() {
		return publish;
	}
	public void setPublish(String publish) {
		this.publish = publish;
	}
	public String getStubSource() {
		return stubSource;
	}
	public void setStubSource(String stubSource) {
		this.stubSource = stubSource;
	}
	public String getStubClass() {
		return stubClass;
	}
	public void setStubClass(String stubClass) {
		this.stubClass = stubClass;
	}
	public String getStubDTOSource() {
		return stubDTOSource;
	}
	public void setStubDTOSource(String stubDTOSource) {
		this.stubDTOSource = stubDTOSource;
	}
	public String getStubDTOclass() {
		return stubDTOclass;
	}
	public void setStubDTOclass(String stubDTOclass) {
		this.stubDTOclass = stubDTOclass;
	}
	
	
	

}
