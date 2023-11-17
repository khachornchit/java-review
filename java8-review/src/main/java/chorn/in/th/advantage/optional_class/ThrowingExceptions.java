package chorn.in.th.advantage.optional_class;

import java.util.NoSuchElementException;
import java.util.Optional;

public class ThrowingExceptions {
    public static void main(String[] args) {
        Optional<String> optionalName = Optional.ofNullable(null);

        // Without Optional
        if (!optionalName.isPresent()) {
            throw new NoSuchElementException("Name not present");
        }

        // With Optional
        String result = optionalName.orElseThrow(() -> new NoSuchElementException("Name not present"));

    }
}
