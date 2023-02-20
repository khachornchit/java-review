package src.java8.functionalInterface;

import java.util.function.IntUnaryOperator;

// Explanation
// IntUnaryOperator functional interface represents an operation
// on a single int-valued operand that produces an int-valued result.

public class IntUnaryOperatorExample {

    public static void main(String[] args) {
        IntUnaryOperator square = (x) -> x * x;
        int result = square.applyAsInt(5);
        System.out.println(result); // prints 25

        IntUnaryOperator increment = (x) -> x + 1;
        result = increment.applyAsInt(7);
        System.out.println(result); // prints 8
    }
}
