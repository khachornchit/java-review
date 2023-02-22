package sample.streams;

import data.MockData;
import model.Person;

import java.util.List;

public class Streams {

    public static void main(String[] args) {
        List<Person> list = MockData.getPersonDataList();
        long count = list.parallelStream()
                .filter(p -> p.getLastName().startsWith("J"))
                .count();

        System.out.println(count);

        list.parallelStream()
                .filter(p -> p.getLastName().startsWith("J"))
                .forEach(Person::printFirstName);
    }

}
