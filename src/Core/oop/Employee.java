package src.core.oop;

public class Employee {
	protected String name;
	protected int age;
	protected String role;

	public String getName() {
		return name;
	}

	public Employee(String name, int age, String role) {
		super();
		this.name = name;
		this.age = age;
		this.role = role;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public void print() {
		System.out.println(this.name + ", " + this.age + ", " + this.role);
	}
}
