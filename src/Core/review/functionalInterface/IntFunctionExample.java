package src.core.review.functionalInterface;

import java.util.function.IntFunction;

// Explanation
// IntFunction<R> functional interface represents a function that accepts an int-valued argument and produces a result.

public class IntFunctionExample {
    public static void main(String[] args) {
        IntFunction<String> convertIntToString = Integer::toString; // (x) -> Integer.toString(x);
        String result = convertIntToString.apply(5);
        System.out.println(result); // prints "5"

        IntFunction<Double> convertIntToDouble = (x) -> x * 1.0;
        Double doubleResult = convertIntToDouble.apply(7);
        System.out.println(doubleResult); // prints 7.0
    }
}
