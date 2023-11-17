package chorn.in.th.sample.iteration;

import java.util.List;

import chorn.in.th.model.MockData;
import chorn.in.th.model.Person;

public class Iteration {

    public static void main(String[] args) {
        List<Person> list = MockData.getPersonDataList();
        list.forEach(Person::printPerson);
    }

}
