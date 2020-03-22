package BridgePattern;

public class Main {

	public static void main(String[] args) {
		Artist a = new Artist("John Doe");
		LongForm lf = new LongForm(new ArtistResource(a));
		
		System.out.println(lf.show());
	}
}
