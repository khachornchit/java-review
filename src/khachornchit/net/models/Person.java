package khachornchit.net.models;

/**
 * 
 * @author pluto
 *
 */
public class Person {
	private String firstName;
	private String lastName;
	private int age;

	/**
	 * 
	 * @param firstName
	 * @param lastName
	 * @param age
	 */
	public Person(String firstName, String lastName, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	/**
	 * 
	 * @return
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * 
	 * @param firstName
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * 
	 * @return
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * 
	 * @param lastName
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * 
	 * @return
	 */
	public int getAge() {
		return age;
	}

	/**
	 * 
	 * @param age
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * 
	 * @return
	 */
	public String formatPerson() {
		return String.format("%s %s, age = %s", this.firstName, this.lastName, this.age);
	}

	/**
	 * 
	 */
	public void printPerson() {
		System.out.println(this.formatPerson());
	}

	public void printFirstName() {
		System.out.println(this.firstName);
	}

}
