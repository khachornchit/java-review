package pluto.java8.iteration;

import java.util.Arrays;
import java.util.List;

import pluto.models.Person;

public class Iteration {

	public static void main(String[] args) {
		List<Person> list = Arrays.asList(new Person("James", "Smith", 24), new Person("John", "Johnson", 34),
				new Person("Robert", "Williams", 28), new Person("Michael", "Brown", 39),
				new Person("David", "Jones", 19));

		list.forEach(Person::printPerson);
	}

}