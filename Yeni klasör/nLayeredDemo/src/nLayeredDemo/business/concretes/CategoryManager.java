package nLayeredDemo.business.concretes;

import java.util.List;

import nLayeredDemo.business.abstracts.CategoryService;
import nLayeredDemo.core.utilities.logger.ILogger;
import nLayeredDemo.dataAccess.abstracts.ICategoryDao;
import nLayeredDemo.entities.concretes.Category;

public class CategoryManager implements CategoryService {

	private ICategoryDao _categoryDao;
	private List<ILogger> _loggers;
	
	public CategoryManager(ICategoryDao categoryDao,List<ILogger> loggers) {
		_categoryDao = categoryDao;
		_loggers = loggers;
	}
	
	@Override
	public void add(Category category) throws Throwable {
		if (checkCategoryName(category.getName())) {
			throw new Exception("Category Name Error");
		}
		_categoryDao.add(category);
		
		for (ILogger logger : _loggers) {
			logger.log(" log success");
		}
		
	}

	
   private boolean checkCategoryName(String name) {
		//simüle edildi
		return true;
		
	}


}
