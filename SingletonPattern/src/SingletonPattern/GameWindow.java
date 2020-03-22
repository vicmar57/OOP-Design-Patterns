package SingletonPattern;

public class GameWindow {
	private static GameWindow gwinstance;
	
	public static GameWindow getInstance() {
		if(gwinstance == null) {
			System.out.println("Creating instance of game window");
			gwinstance = new GameWindow();
		} else
			System.out.println("Returning same instance");
		return gwinstance;
	}
}
