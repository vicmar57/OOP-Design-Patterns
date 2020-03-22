package ProxyPattern;

public class LazyBookParser implements IBookParser {
	private BookParser bp = null;
	private String book = null;
	
	public LazyBookParser(String book) {
		this.book = book;
	}
	
	@Override
	public int getNumPages() {
		if (bp == null) {
			System.out.println("Creating book parser");
			bp =  new BookParser(this.book);
		}
		return bp.getNumPages();
	}

}
