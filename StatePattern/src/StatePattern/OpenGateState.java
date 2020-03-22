package StatePattern;

public class OpenGateState implements IGateState {
	Gate gate;
	
	public OpenGateState(Gate g) {
		this.gate = g;
	}
	
	@Override
	public void enter() {
		//let user in, holding the gate open for 3 seconds
		try {
			System.out.println("OpenGateState:: enter()");
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.gate.changeState(new ClosedGateState(this.gate));
		System.out.println("OpenGateState:: enter() - 3s passed.. closing gate");
	}

	@Override
	public void pay() {
		//stay open
		System.out.println("OpenGateState:: pay()");
		this.gate.changeState(new OpenGateState(this.gate));
	}

	@Override
	public void payOK() {
		//payment already processed, leave gate open
		System.out.println("OpenGateState:: payOK()");
		this.gate.changeState(new OpenGateState(this.gate));
	}

	@Override
	public void payFailed() {
		//payment already processed, leave gate open
		System.out.println("OpenGateState:: payFailed()");
		this.gate.changeState(new OpenGateState(this.gate));
	}

}
