package chorn.in.th.advantage.optional_class;

import java.util.Optional;

public class ChainingOptionalMethods {
    public static void main(String[] args) {
        String name = "John";
        Optional<String> optionalName = Optional.ofNullable(name);

        // Without Optional
        if (name != null && name.length() > 3) {
            System.out.println(name.toUpperCase());
        }

        // With Optional
        optionalName.filter(n -> n.length() > 3)
                .map(String::toUpperCase)
                .ifPresent(System.out::println);

    }
}
