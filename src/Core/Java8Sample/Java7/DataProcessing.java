package src.Core.Java8Sample.Java7;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import src.Core.Java8Sample.Features.IPersonCondition;
import src.Core.Java8Sample.Model.Person;

/**
 * @author pluto
 */
public class DataProcessing {

    public static void main(String[] args) {
        List<Person> list = Arrays.asList(new Person("James", "Smith", 24), new Person("John", "Johnson", 34),
                new Person("Robert", "Williams", 28), new Person("Michael", "Brown", 39),
                new Person("David", "Jones", 19));

        Collections.sort(list, new Comparator<Person>() {

            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });

        printList("Java8Sample.Java7 - Sort by last name", list);
        printList("Java8Sample.Java7 - Sort by last name & prefix is J", list, "J");
        printCondition("Sort by last name & last name prefix is S", list, new IPersonCondition() {

            @Override
            public boolean test(Person p) {
                return p.getLastName().startsWith("W");
            }
        });

        printCondition("Java8Sample.Java7 - Sort by last name & first name prefix is D", list, new IPersonCondition() {

            @Override
            public boolean test(Person p) {
                return p.getFirstName().startsWith("D");
            }
        });
    }

    private static void printList(String title, List<Person> list) {
        System.out.println(title + "...");

        for (Person p : list) {
            System.out.println(p.formatPerson());
        }

        System.out.println();
    }

    private static void printList(String title, List<Person> list, String prefix) {
        System.out.println(title + "...");

        for (Person p : list) {
            if (p.getFirstName().startsWith(prefix)) {
                System.out.println(p.formatPerson());
            }
        }

        System.out.println();
    }

    private static void printCondition(String title, List<Person> list, IPersonCondition condition) {
        System.out.println(title + "...");

        for (Person p : list) {
            if (condition.test(p)) {
                System.out.println(p.formatPerson());
            }
        }

        System.out.println();
    }

}
