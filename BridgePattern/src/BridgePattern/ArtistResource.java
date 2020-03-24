package BridgePattern;

public class ArtistResource implements IMediaResource {
	Artist artist;
	
	public ArtistResource(Artist a) {
		this.artist = a;
	}
	@Override
	public String snippet() {
		return this.artist.bio();
	}

	@Override
	public String title() {
		return this.artist.getName();
	}

	@Override
	public String url() {
		return this.artist.getWebsite();
	}

}
