package CompositePattern;

import java.util.ArrayList;

public class Main {
	public static void main(String [] args ) {
		Project pr = new Project("my proj", new ArrayList<>());
		ToDo td1 = new ToDo("do homework");
		ToDo td2 = new ToDo("wash the dishes");
		ToDo td3 = new ToDo("water the spearmint");
		pr.addToDo(td1);
		pr.addToDo(td2);
		pr.addToDo(td3);
		
		System.out.println(pr.getHTML());
	}
}
