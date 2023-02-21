package sample.streams;

import java.util.Arrays;
import java.util.List;

import sample.model.Person;

public class Streams {

    public static void main(String[] args) {
        List<Person> list = Arrays.asList(
                new Person("James", "Smith", 24),
                new Person("John", "Johnson", 34),
                new Person("Robert", "Williams", 28),
                new Person("Michael", "Brown", 39),
                new Person("David", "Jones", 19));

        long count = list.parallelStream()
                .filter(p -> p.getLastName().startsWith("J"))
                .count();

        System.out.println(count);

        list.parallelStream()
                .filter(p -> p.getLastName().startsWith("J"))
                .forEach(Person::printFirstName);
    }

}
