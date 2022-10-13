package nLayeredDemo.UI;

import java.util.ArrayList;
import java.util.List;

import nLayeredDemo.business.concretes.CategoryManager;
import nLayeredDemo.business.concretes.CourseManager;
import nLayeredDemo.business.concretes.InstructorManager;
import nLayeredDemo.core.utilities.logger.DatabaseLogger;
import nLayeredDemo.core.utilities.logger.FileLogger;
import nLayeredDemo.core.utilities.logger.ILogger;
import nLayeredDemo.core.utilities.logger.SmsLogger;
import nLayeredDemo.dataAccess.abstracts.HibernateCategoryDao;
import nLayeredDemo.dataAccess.abstracts.JdbcCourseDao;
import nLayeredDemo.dataAccess.abstracts.JdbcInstructorDao;
import nLayeredDemo.entities.concretes.Category;
import nLayeredDemo.entities.concretes.Course;
import nLayeredDemo.entities.concretes.Instructor;

public class Main {

	public static void main(String[] args) throws Throwable {
		
		Instructor instructor = new Instructor(1,"Engin","Demiroð");

		Category category = new Category(1, "All");
		Category category2 = new Category(2, "Programming");

		Course course = new Course(1, "(2022) Yazýlým Geliþtirici Yetiþtirme Kampý","Course",category2,instructor);
		Course course2 = new Course(1, "(2022) Senior Level Yazýlým Geliþtirici Yetiþtirme Kampý","Course",category2,instructor);

		List<ILogger> loggers = new ArrayList<ILogger>();
		loggers.add(new DatabaseLogger());
		loggers.add(new FileLogger());
		loggers.add(new SmsLogger());
		
		InstructorManager instructorManager = new InstructorManager(new JdbcInstructorDao(),loggers);
		
		instructorManager.add(instructor);
		
		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(),loggers);
		
		categoryManager.add(category);
		categoryManager.add(category2);
		
		CourseManager courseManager = new CourseManager(new JdbcCourseDao(),loggers);
		
		courseManager.add(course);
		courseManager.add(course2);
	}

}
