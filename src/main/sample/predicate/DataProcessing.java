package sample.predicate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

import sample.model.Person;

public class DataProcessing {

    public static void main(String[] args) {
        List<Person> list = Arrays.asList(
                new Person("James", "Smith", 24),
                new Person("John", "Johnson", 34),
                new Person("Robert", "Williams", 28),
                new Person("Michael", "Brown", 39),
                new Person("David", "Jones", 19));

        list.sort((p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

        printCondition("Predicate - list all", list, p -> true);
        printCondition("Predicate - last name start with W", list, p -> p.getLastName().startsWith("W"));
        printCondition("Predicate - first name start with D", list, p -> p.getFirstName().startsWith("D"));
    }

    private static void printCondition(
            String title,
            List<Person> list,
            Predicate<Person> predicate
    ) {
        System.out.println(title + "...");

        for (Person p : list) {
            if (predicate.test(p)) {
                System.out.println(p.formatPerson());
            }
        }

        System.out.println();
    }
}
