package runwayMDMetaClasses;

public abstract class MetaMdType extends MetaMetaData {

	private String typeName;
	private String packageName;
	private String displayLabel;
	private String baseClass;
	private String baseSource;
	private String dtoClass;
	private String dtoSoruce;
	
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public String getPackageName() {
		return packageName;
	}
	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}
	public String getDisplayLabel() {
		return displayLabel;
	}
	public void setDisplayLabel(String displayLabel) {
		this.displayLabel = displayLabel;
	}
	public String getBaseClass() {
		return baseClass;
	}
	public void setBaseClass(String baseClass) {
		this.baseClass = baseClass;
	}
	public String getBaseSource() {
		return baseSource;
	}
	public void setBaseSource(String baseSource) {
		this.baseSource = baseSource;
	}
	public String getDtoClass() {
		return dtoClass;
	}
	public void setDtoClass(String dtoClass) {
		this.dtoClass = dtoClass;
	}
	public String getDtoSoruce() {
		return dtoSoruce;
	}
	public void setDtoSoruce(String dtoSoruce) {
		this.dtoSoruce = dtoSoruce;
	}

	
	
}
