package chorn.in.th.advantage.optional_class;

import java.util.Optional;

public class AvoidingNullChecksWithOptional {
    public static void main(String[] args) {
        String name = "John";
        Optional<String> optionalName = Optional.of(name);

        // Without Optional
        if (name != null) {
            System.out.println(name.length());
        }

        // With Optional
        optionalName.ifPresent(n -> System.out.println(n.length()));
    }
}