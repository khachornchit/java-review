package src.core.review.optionalClass;

import java.util.Optional;

public class OptionalClass {

    public static void main(String[] args) {
        Integer value1 = null;
        Integer value2 = 10;

        // This produce NullPointerException
//        System.out.printf("value1+value2 = %d", value1 + value2);

        Optional<Integer> a = Optional.empty();
        Optional<Integer> b = Optional.of(value2);
        System.out.println(sum(a, b));
    }

    public static Integer sum(Optional<Integer> a, Optional<Integer> b) {
        System.out.printf("First parameter is present: %b\n", a.isPresent());
        System.out.printf("Second parameter is present: %b\n", b.isPresent());

        Integer value1 = a.orElse(0);
        Integer value2 = b.orElseGet(() -> 0);
        return value1 + value2;
    }
}
