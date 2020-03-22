package BridgePattern;

public class Artist {
	private String name;
	
	
	public Artist(String name) {
			this.name = name;
		// TODO Auto-generated constructor stub
	}

	public String bio() {
		return "artist's bio here";
	}

	public String getName() {
		return this.name;
	}
	

	public String getWebsite() {
		return "https://some_artist_website";
	}
}
