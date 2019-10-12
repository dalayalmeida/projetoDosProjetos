package basics;

import java.util.LinkedList;

public class Project {

	LinkedList<Table> tables = new LinkedList<>();
	String name;
	
	
	public Project(LinkedList<Table> tables, String name) {
		super();
		this.tables = tables;
		this.name = name;
	}
	public LinkedList<Table> getTables() {
		return tables;
	}
	public void setTables(LinkedList<Table> tables) {
		this.tables = tables;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}
