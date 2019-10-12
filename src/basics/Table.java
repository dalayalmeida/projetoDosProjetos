package basics;

import java.util.LinkedList;

public class Table {

	LinkedList<Column> columns = new LinkedList<Column>();
	String name;
	
	public Table(LinkedList<Column> columns, String name) {
		this.columns = columns;
		this.name = name;
	}
	public LinkedList<Column> getColumns() {
		return columns;
	}
	public void setColumns(LinkedList<Column> columns) {
		this.columns = columns;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}
