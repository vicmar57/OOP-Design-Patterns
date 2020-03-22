package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import CompositePattern.Project;
import CompositePattern.ToDo;

class BridgePatternTest {

	@Test
	void test() {
		Project pr = new Project("my proj", new ArrayList<>());
		ToDo td1 = new ToDo("do homework");
		ToDo td2 = new ToDo("wash the dishes");
		ToDo td3 = new ToDo("water the spearmint");
		pr.addToDo(td1);
		pr.addToDo(td2);
		pr.addToDo(td3);
		
		assertEquals(pr.getHTML(), "<h1>my proj</h1>\n" + 
				"	<ul>\n" + 
				"	<li>do homework</li>\n" + 
				"	<li>wash the dishes</li>\n" + 
				"	<li>water the spearmint</li>\n" + 
				"	</ul>" + 
				"");
		}

}
