package SingletonPattern;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GameWindowTest {

	@Test
	void test() {
		GameWindow gw = GameWindow.getInstance();
		GameWindow gw1 = GameWindow.getInstance();
		
		assertEquals(gw1, gw);
	}

}
