package nLayeredDemo.business.concretes;

import java.util.List;

import nLayeredDemo.business.abstracts.CourseService;
import nLayeredDemo.core.utilities.logger.ILogger;
import nLayeredDemo.dataAccess.abstracts.ICourseDao;
import nLayeredDemo.entities.concretes.Course;

public class CourseManager implements CourseService {

	
	private ICourseDao _courseDao;
	private List<ILogger> _loggers;
	
	public CourseManager(ICourseDao courseDao,List<ILogger> loggers) {
		_courseDao = courseDao;
		_loggers = loggers;
	}
	@Override
	public void add(Course course) throws Throwable  {
		if (checkCourseName(course.getName())) {
			throw new Exception("Course Name error");
		}
		_courseDao.add(course);
		
		for (ILogger logger : _loggers) {
			logger.log(" log success");
		}
		
	}
	
	private boolean checkCourseName(String name) {
		//simüle edildi
		return true;
		
	}
	
	private boolean checkCoursePrice(double price) {
		//simüle edildi
		return true;
	}

}
