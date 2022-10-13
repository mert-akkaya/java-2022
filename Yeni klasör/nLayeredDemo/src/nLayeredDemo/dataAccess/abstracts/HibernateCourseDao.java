package nLayeredDemo.dataAccess.abstracts;

import nLayeredDemo.entities.concretes.Course;

public class HibernateCourseDao implements ICourseDao {

	@Override
	public void add(Course course) {
		
		System.out.println("Course added by hibernate");
		
	}

}
