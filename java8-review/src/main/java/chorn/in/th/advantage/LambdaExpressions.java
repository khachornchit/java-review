package chorn.in.th.advantage;

import java.util.Arrays;
import java.util.List;

public class LambdaExpressions {
    public static void main(String[] args) {

        // Before Java 8
        List<String> list = Arrays.asList("Java", "is", "awesome");
        for (String s : list) {
            System.out.println(s);
        }

        // With Lambda Expressions
        list.forEach(s -> System.out.println(s));
    }
}
