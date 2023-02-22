package sample.predicate;

import data.MockData;
import model.Person;

import java.util.List;
import java.util.function.Predicate;

public class DataProcessing {

    public static void main(String[] args) {
        List<Person> list = MockData.getPersonDataList();
        list.sort((p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

        printCondition("list all", list, p -> true);
        printCondition("last name start with W", list, p -> p.getLastName().startsWith("W"));
        printCondition("first name start with D", list, p -> p.getFirstName().startsWith("D"));
    }

    private static void printCondition(
            String title,
            List<Person> list,
            Predicate<Person> predicate
    ) {
        System.out.println(title + "...");

        for (Person p : list) {
            if (predicate.test(p)) {
                System.out.println(p);
            }
        }

        System.out.println();
    }
}
