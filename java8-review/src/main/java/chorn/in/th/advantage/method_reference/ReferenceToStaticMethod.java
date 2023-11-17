package chorn.in.th.advantage.method_reference;

import java.util.Arrays;
import java.util.List;

class MyUtils {
    public static String staticMethod(String string) {
        return string;
    }
}

public class ReferenceToStaticMethod {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // Lambda expression
        names.forEach(s -> System.out.println(MyUtils.staticMethod(s)));

        // Static method reference
        names.forEach(MyUtils::staticMethod);

    }
}
