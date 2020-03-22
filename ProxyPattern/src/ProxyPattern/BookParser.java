package ProxyPattern;

public class BookParser implements IBookParser{
	String book;
	public BookParser(String bookContent) {
		this.book = bookContent;
		try {
			Thread.sleep(5000); //expensive computation
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public int getNumPages() {
		return 100;
	}
}
