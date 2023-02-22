package sample.iteration;

import java.util.List;

import data.MockData;
import model.Person;

public class Iteration {

    public static void main(String[] args) {
        List<Person> list = MockData.getPersonDataList();
        list.forEach(Person::printPerson);
    }

}
