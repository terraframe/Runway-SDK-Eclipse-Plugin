package runwayMDMetaClasses;

public abstract class MetaMdElement extends MetaMdEntity {
	private boolean isAbstract;
	private boolean extendable;
	
	public boolean isAbstract() {
		return isAbstract;
	}
	public void setAbstract(boolean isAbstract) {
		this.isAbstract = isAbstract;
	}
	public boolean isExtendable() {
		return extendable;
	}
	public void setExtendable(boolean extendable) {
		this.extendable = extendable;
	}
	
	
	
}
