package src.Core.Java8Review.Java803_FunctionalInterface;

import java.util.function.IntConsumer;

// Explanation
// IntConsumer functional interface represents an operation that accepts
// a single int-valued argument and returns no result.

public class IntConsumerExample {
    public static void main(String[] args) {
        IntConsumer printSquare = (x) -> System.out.println(x * x);
        printSquare.accept(5); // prints 25
        printSquare.accept(7); // prints 49
    }
}
