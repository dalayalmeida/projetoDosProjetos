package test;

import basics.Column;
import basics.Project;
import basics.Table;
import basics.Types;
import databaseGen.DatabaseGen;

public class DatabaseTest {

	public static void main(String[] args) {
		
		Project profs = new Project();
		
		Table professores = new Table();
		
		Column nomeP = new Column();
		nomeP.setName("nomeP");
		nomeP.setType(Types.text);
		Column telefoneP = new Column();
		telefoneP.setName("telefoneP");
		telefoneP.setType(Types.text);
		
		professores.addColumn(nomeP);
		professores.addColumn(telefoneP);
		professores.setName("professores");
		
		Table alunos = new Table();
		
		Column nomeA = new Column();
		nomeA.setName("nomeA");
		nomeA.setType(Types.text);
		Column telefoneA = new Column();
		telefoneA.setName("telefoneA");
		telefoneA.setType(Types.text);
		Column professor = new Column();
		professor.setName("professor");
		professor.setType(Types.integer);
		professor.setRef(professores);
		
		alunos.addColumn(nomeA);
		alunos.addColumn(telefoneA);
		alunos.addColumn(professor);
		alunos.setName("alunos");
		
		profs.setName("profsTeste");
		profs.addTable(alunos);
		profs.addTable(professores);
		
		DatabaseGen d = new DatabaseGen();
		System.out.println(d.generate(profs, ""));
		

	}

}
