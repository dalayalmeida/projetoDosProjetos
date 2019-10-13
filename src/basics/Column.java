package basics;

public class Column {

	private String type;
	private String name;
	private Table ref;
	
	
	
	public Table getRef() {
		return ref;
	}
	public void setRef(Table ref) {
		this.ref = ref;
	}
	public Column(String type, String name) {
		this.type = type;
		this.name = name;
	}
	public Column() {
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
