package CompositePattern;

import java.util.List;

public class Project implements ToDoList {
	String title;
	List <ToDoList> todos;
	
	public Project(String title, List <ToDoList> todos) {
		this.title = title;
		this.todos = todos;
	}
	
	public void addToDo(ToDo td) {
		this.todos.add(td);
	}
	
	@Override
	public String getHTML() {
		StringBuilder html = new StringBuilder("<h1>");		
		html.append(this.title);
		html.append("</h1>\n\t<ul>\n\t");
		for (ToDoList toDo : todos) {
			html.append("<li>");
			html.append(toDo.getHTML());
			html.append("</li>\n\t");
		}
		html.append("</ul>");
		return html.toString();
	}

}
