package data;

import model.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MockData {
    public static List<Person> getPersonDataList() {
        return Arrays.asList(
                new Person("James", "Smith", 24),
                new Person("John", "Johnson", 34),
                new Person("Robert", "Williams", 28),
                new Person("Michael", "Brown", 39),
                new Person("David", "Jones", 19));
    }

    public static List<String> getNameList() {
        return Arrays.asList("Mahesh", "Suresh", "Ramesh", "Naresh", "Kal-push");
    }
}