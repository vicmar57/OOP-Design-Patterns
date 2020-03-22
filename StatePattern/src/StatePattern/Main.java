package StatePattern;

public class Main {

	public static void main(String[] args) {
		Gate trainStationGate =  new Gate();
		trainStationGate.pay();
		trainStationGate.payFailed();
		trainStationGate.pay();
		trainStationGate.payOK();
		trainStationGate.enter();
	}

}
