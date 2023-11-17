package chorn.in.th.sample;

import chorn.in.th.model.MockData;
import chorn.in.th.model.Person;
import chorn.in.th.model.IPersonCondition;

import java.util.List;

public class DataProcessing {

    public static void main(String[] args) {
        List<Person> list = MockData.getPersonDataList();
        list.sort((p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

        printCondition("Lambda list all", list, p -> true);
        printCondition("Lambda last name prefix W", list, p -> p.getLastName().startsWith("W"));
        printCondition("Lambda first name prefix D", list, p -> p.getFirstName().startsWith("D"));
    }

    private static void printCondition(String title, List<Person> list, IPersonCondition condition) {
        System.out.println(title + "...");

        for (Person p : list) {
            if (condition.test(p)) {
                System.out.println(p);
            }
        }

        System.out.println();
    }
}
