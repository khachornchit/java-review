package java8.methodReference;

import java.util.ArrayList;
import java.util.List;

public class MethodReference {
    public static void main(String[] args) {

        List<String> names = new ArrayList<String>();
        names.add("Mahesh");
        names.add("Suresh");
        names.add("Ramesh");
        names.add("Naresh");
        names.add("Kalpesh");

        names.sort(String::compareTo);
        System.out.println(names);

        names.forEach(System.out::println);
    }
}