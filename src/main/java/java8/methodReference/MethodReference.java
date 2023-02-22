package java8.methodReference;

import data.MockData;

import java.util.ArrayList;
import java.util.List;

public class MethodReference {
    public static void main(String[] args) {

        List<String> names = MockData.getNameList();
        names.sort(String::compareTo);
        System.out.println(names);

        names.forEach(System.out::println);
    }
}