package chorn.in.th.advantage.optional_class;

import java.util.Optional;

public class DefaultValuesWithOrElse {
    public static void main(String[] args) {
        Optional<String> optionalName = Optional.ofNullable(null);

        // Without Optional
        String result1 = (optionalName.isPresent()) ? optionalName.get() : "Default";

        // With Optional
        String result2 = optionalName.orElse("Default");
    }
}