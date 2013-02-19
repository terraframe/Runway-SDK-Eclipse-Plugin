package runwayMDMetaClasses;

public abstract class MetaMdEntity extends MetaMdClass {
	
	private String tableName;
	private String querySource;
	private String queryClass;
	private String queryDTOSource;
	private String queryDTOClass;
	
	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	public String getQuerySource() {
		return querySource;
	}
	public void setQuerySource(String querySource) {
		this.querySource = querySource;
	}
	public String getQueryClass() {
		return queryClass;
	}
	public void setQueryClass(String queryClass) {
		this.queryClass = queryClass;
	}
	public String getQueryDTOSource() {
		return queryDTOSource;
	}
	public void setQueryDTOSource(String queryDTOSource) {
		this.queryDTOSource = queryDTOSource;
	}
	public String getQueryDTOClass() {
		return queryDTOClass;
	}
	public void setQueryDTOClass(String queryDTOClass) {
		this.queryDTOClass = queryDTOClass;
	}
	
	
	
	
}
