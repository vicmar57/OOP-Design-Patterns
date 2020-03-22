package StatePattern;

public class Gate {
	public IGateState state;
	
	public Gate() {
		this.state = new ClosedGateState(this);
	}
	
	public void enter() {
		this.state.enter();
	}
	
	public void pay() {
		this.state.pay();
	}
	
	public void payOK() {
		this.state.payOK();
	}
	
	public void payFailed() {
		this.state.payFailed();
	}
	
	public void changeState(IGateState s) {
		this.state = s;
	}
}
