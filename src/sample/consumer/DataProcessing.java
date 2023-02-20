package src.sample.consumer;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import src.sample.model.Person;

public class DataProcessing {

    public static void main(String[] args) {
        List<Person> list = Arrays.asList(
                new Person("James", "Smith", 24), new Person("John", "Johnson", 34),
                new Person("Robert", "Williams", 28), new Person("Michael", "Brown", 39),
                new Person("David", "Jones", 19));

        Collections.sort(list, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

        printCondition("Java8 Java8Sample.Consumer - Lambda list all", list, p -> true, c -> c.printPerson());

        printCondition("Java8 Java8Sample.Consumer - Lambda last name prefix W", list, p -> p.getLastName().startsWith("W"),
                c -> c.printPerson());

        printCondition("Java8 Java8Sample.Consumer - Lambda first name prefix D", list, p -> p.getFirstName().startsWith("D"),
                c -> c.printPerson());
    }

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
