package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import BridgePattern.Artist;
import BridgePattern.ArtistResource;
import BridgePattern.LongForm;

class BridgePatternTest {

	@Test
	void test() {
		Artist a = new Artist("John Doe");
		LongForm lf = new LongForm(new ArtistResource(a));
		
		assertEquals(lf.show(), "John Doe artist's bio here https://some_artist_website");
	}
}
