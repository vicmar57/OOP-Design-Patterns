package CompositePattern;

public class ToDo implements ToDoList {
	private String text;
	
	public ToDo(String text) {
		this.text = text;
	}
	
	@Override
	public String getHTML() {
		return this.text;
	}

}
