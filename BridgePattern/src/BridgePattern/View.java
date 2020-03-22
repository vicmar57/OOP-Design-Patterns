package BridgePattern;

public abstract class View {
	IResource resource;
	
	public View(IResource r) {
		this.resource = r;
	}
	
	public abstract String show();
}