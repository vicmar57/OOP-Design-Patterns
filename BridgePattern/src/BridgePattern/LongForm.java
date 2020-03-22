package BridgePattern;

public class LongForm extends View {
	public LongForm(IResource r) {
		super(r);
		// TODO Auto-generated constructor stub
	}

	public String show() {
		String html = this.resource.title() + " " + this.resource.snippet() + " " + this.resource.url();
		return html;
	}
}
