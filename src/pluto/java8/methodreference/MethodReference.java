package pluto.java8.methodreference;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import pluto.models.Person;

public class MethodReference {

	public static void main(String[] args) {
		Thread tLambda = new Thread(() -> printMessage());
		tLambda.start();

		Thread t = new Thread(MethodReference::printMessage);
		t.start();

		List<Person> list = Arrays.asList(new Person("James", "Smith", 24), new Person("John", "Johnson", 34),
				new Person("Robert", "Williams", 28), new Person("Michael", "Brown", 39),
				new Person("David", "Jones", 19));

		printCondition("Print list all ... Reference Method", list, p -> true, Person::printPerson);

		printCondition("Print list all ... Lambda", list, p -> true, p -> p.printPerson());
	}

	/**
	 * No argument method
	 */
	public static void printMessage() {
		System.out.println("Hello");
	}

	/**
	 * 
	 * @param title
	 * @param list
	 * @param predicate
	 * @param consumer
	 */
	private static void printCondition(String title, List<Person> list, Predicate<Person> predicate,
			Consumer<Person> consumer) {
		System.out.println(title + "...");

		for (Person p : list) {
			if (predicate.test(p)) {
				consumer.accept(p);
			}
		}

		System.out.println();
	}

}