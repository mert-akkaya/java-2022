package nLayeredDemo.entities.concretes;

public class Course {
	private int id;
	private String name;
	private String description;
	private Category category;
	private Instructor instructor;
	
	public Course() {
	}

	public Course(int id, String name, String description, Category category,Instructor instructor) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.category = category;
		this.instructor = instructor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}
}
