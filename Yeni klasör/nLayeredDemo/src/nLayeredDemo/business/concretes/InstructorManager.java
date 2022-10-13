package nLayeredDemo.business.concretes;

import java.util.List;

import nLayeredDemo.business.abstracts.InstructorService;
import nLayeredDemo.core.utilities.logger.ILogger;
import nLayeredDemo.dataAccess.abstracts.IInstructorDao;
import nLayeredDemo.entities.concretes.Instructor;

public class InstructorManager implements InstructorService {

	private IInstructorDao _instructorDao;
	
	private List<ILogger> _loggers;
	
	public InstructorManager (IInstructorDao instructorDao,List<ILogger> loggers) {
		
		_instructorDao = instructorDao;
		_loggers = loggers;

	}
	@Override
	public void add(Instructor instructor) {
		
		_instructorDao.add(instructor);
		for (ILogger logger : _loggers) {
			logger.log(" log success");
		}
	}

}
