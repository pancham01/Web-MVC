package learning.spring.mvc.model;

public class Employee {
	
	private int id;
	private String name,department;
	private int age;
	
	
	
	public Employee(int id, String name, String department, int age) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.age = age;
	}


	public Employee() {
		super();
		// TODO Auto-generated constructor stub
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
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", department=" + department + ", age=" + age + "]";
	}
	
}
