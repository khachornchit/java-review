package chorn.in.th.sample.method_reference;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import chorn.in.th.model.MockData;
import chorn.in.th.model.Person;

public class MethodReference {

    public static void main(String[] args) {
        Thread tLambda = new Thread(() -> printMessage());
        tLambda.start();

        Thread t = new Thread(MethodReference::printMessage);
        t.start();

        List<Person> list = MockData.getPersonDataList();
        printCondition("Reference Method", list, p -> true, Person::printPerson);
        printCondition("Lambda", list, p -> true, p -> p.printPerson());
    }

    public static void printMessage() {
        System.out.println("Java8Sample.Hello");
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
