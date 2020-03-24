package BridgePattern;

public abstract class View {
	IMediaResource resource;
	
	public View(IMediaResource r) {
		this.resource = r;
	}
	
	public abstract String show();
}