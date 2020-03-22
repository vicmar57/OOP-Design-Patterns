package StatePattern;

public class ClosedGateState implements IGateState {
	Gate gate;
	
	public ClosedGateState(Gate g) {
		this.gate = g;
	}
	
	@Override
	public void enter() {
		//let user in, holding the gate open for 3 seconds
		System.out.println("ClosedGateState:: enter()");
		this.gate.changeState(new ClosedGateState(this.gate));
	}

	@Override
	public void pay() {
		//process payment
		System.out.println("ClosedGateState:: pay()");
		this.gate.changeState(new ProcessingPayGateState(this.gate));
	}

	@Override
	public void payOK() {
		//let user in
		System.out.println("ClosedGateState:: payOK()");
		this.gate.changeState(new ClosedGateState(this.gate));
	}

	@Override
	public void payFailed() {
		System.out.println("ClosedGateState:: payFailed()");
		this.gate.changeState(new ClosedGateState(this.gate));
	}

}
