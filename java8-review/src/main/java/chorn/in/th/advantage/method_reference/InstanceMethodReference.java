package chorn.in.th.advantage.method_reference;

import java.util.Arrays;
import java.util.List;

public class InstanceMethodReference {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // Lambda expression
        names.sort((s1, s2) -> s1.compareToIgnoreCase(s2));

        // Instance method reference
        names.sort(String::compareToIgnoreCase);

    }
}
