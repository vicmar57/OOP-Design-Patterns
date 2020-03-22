package ProxyPattern;

public class Main {

	public static void main(String[] args) {
		LazyBookParser bp = new LazyBookParser("The Story of Alice in wonderland: .....");
		System.out.println(bp.getNumPages());
	}

}
