package nLayeredDemo.dataAccess.abstracts;

import nLayeredDemo.entities.concretes.Instructor;

public class JdbcInstructorDao implements IInstructorDao {

	@Override
	public void add(Instructor instructor) {
		System.out.println("Instructor added by JDBC");
		
	}

}
