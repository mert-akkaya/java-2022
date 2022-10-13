package nLayeredDemo.dataAccess.abstracts;

import nLayeredDemo.entities.concretes.Category;

public class HibernateCategoryDao implements ICategoryDao {

	@Override
	public void add(Category category) {
		System.out.println("Category added by hibernate");
		
	}

}
