package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import StatePattern.ClosedGateState;
import StatePattern.Gate;

class StatePatternTest {

	@Test
	void test() {
		Gate trainStationGate =  new Gate();
		trainStationGate.pay();
		trainStationGate.payFailed();
		trainStationGate.pay();
		trainStationGate.payOK();
		trainStationGate.enter();
		assertEquals(true, ClosedGateState.class.isInstance(trainStationGate.state));
	}

}
