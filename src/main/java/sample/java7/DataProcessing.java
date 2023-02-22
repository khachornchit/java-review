package sample.java7;

import java.util.Comparator;
import java.util.List;

import data.MockData;
import model.IPersonCondition;
import model.Person;

public class DataProcessing {

    public static void main(String[] args) {
        List<Person> list = MockData.getPersonDataList();

        list.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });

        printList(list);
        printList(list, "J");
        printCondition("Java7 - Sort by last name & last name prefix is S", list, new IPersonCondition() {
            @Override
            public boolean test(Person p) {
                return p.getLastName().startsWith("W");
            }
        });

        printCondition("Java7 - Sort by last name & first name prefix is D", list, new IPersonCondition() {

            @Override
            public boolean test(Person p) {
                return p.getFirstName().startsWith("D");
            }
        });
    }

    private static void printList(List<Person> list) {
        System.out.println("Java7 - Sort by last name" + "...");

        for (Person p : list) {
            System.out.println(p);
        }

        System.out.println();
    }

    private static void printList(List<Person> list, String prefix) {
        System.out.println("Java7 - Sort by last name & prefix is J" + "...");

        for (Person p : list) {
            if (p.getFirstName().startsWith(prefix)) {
                System.out.println(p);
            }
        }

        System.out.println();
    }

    private static void printCondition(
            String title,
            List<Person> list,
            IPersonCondition condition
    ) {
        System.out.println(title + "...");

        for (Person p : list) {
            if (condition.test(p)) {
                System.out.println(p);
            }
        }

        System.out.println();
    }

}
