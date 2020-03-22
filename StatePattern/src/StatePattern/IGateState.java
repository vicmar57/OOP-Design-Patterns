package StatePattern;

public interface IGateState {
	void enter();
	void pay();
	void payOK();
	void payFailed();
}
