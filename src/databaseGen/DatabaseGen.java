package databaseGen;

import basics.Column;
import basics.Project;
import basics.Table;

public class DatabaseGen {

	
	
	public String generate(Project p, String location) {
		String base = "";
		String refs = "";
		base = base + "CREATE DATABASE "+p.getName()+"  CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;\nUSE "+p.getName()+"; \n\n";
		
		for(Table t : p.getTables()) {
			base = base + "CREATE TABLE " + t.getName()+"(\nid INT PRIMARY KEY NOT NULL AUTO_INCREMENT,\n";
			for(Column c : t.getColumns()) {
				base = base + c.getName()+" "+c.getType()+",\n";
				if(c.getRef()!=null) {
					refs = refs + "ALTER TABLE " + t.getName()+
							"\r\nADD FOREIGN KEY ("+c.getName()+") REFERENCES "+c.getRef().getName()+"(id);\n\n";
				}
			}
			base = base.substring(0, base.length() - 2)+"\n";
			base = base +");\n\n";
		}
		
		base = base + refs;
		return base;
		
	}
}
