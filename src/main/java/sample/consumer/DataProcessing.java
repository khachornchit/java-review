package sample.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import data.MockData;
import model.Person;

public class DataProcessing {

    public static void main(String[] args) {
        List<Person> list = MockData.getPersonDataList();
        list.sort((p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

        printCondition("Java8 - Lambda list all",
                list,
                p -> true,
                Person::printPerson);

        printCondition("Java8 - Lambda last name prefix W",
                list,
                p -> p.getLastName().startsWith("W"),
                Person::printPerson);

        printCondition("Java8 - Lambda first name prefix D",
                list,
                p -> p.getFirstName().startsWith("D"),
                Person::printPerson);
    }

    private static void printCondition(
            String title,
            List<Person> list,
            Predicate<Person> predicate,
            Consumer<Person> consumer
    ) {

        System.out.println(title + "...");

        for (Person p : list) {
            if (predicate.test(p)) {
                consumer.accept(p);
            }
        }

        System.out.println();
    }
}
