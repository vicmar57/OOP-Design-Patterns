package StatePattern;

public class ProcessingPayGateState implements IGateState {
	Gate gate;
	
	public ProcessingPayGateState(Gate g) {
		this.gate = g;
	}
	
	@Override
	public void enter() {
		System.out.println("ProcessingPayGateState:: enter()");
		this.gate.changeState(new ProcessingPayGateState(this.gate));
	}

	@Override
	public void pay() {
		//process payment again
		System.out.println("ProcessingPayGateState:: pay()");
		this.gate.changeState(new ProcessingPayGateState(this.gate));
	}

	@Override
	public void payOK() {
		//let user in
		System.out.println("ProcessingPayGateState:: payOK()");
		this.gate.changeState(new OpenGateState(this.gate));
	}

	@Override
	public void payFailed() {
		System.out.println("ProcessingPayGateState:: payFailed()");
		this.gate.changeState(new ClosedGateState(this.gate));
	}

}
