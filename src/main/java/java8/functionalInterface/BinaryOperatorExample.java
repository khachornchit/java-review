package java8.functionalInterface;

import java.util.Arrays;
import java.util.function.BinaryOperator;

//Explanation
// BinaryOperator<T> functional interface represents an operation upon two operands of the same type,
// producing a result of the same type as the operands.

public class BinaryOperatorExample {
    public static void main(String[] args) {
        BinaryOperator<Integer> add = Integer::sum; // (a, b) -> a + b;
        int result = add.apply(1, 2);
        System.out.println(result); // prints 3

        BinaryOperator<String> array = (a, b) -> Arrays.toString(Arrays.asList(a, b).toArray());
        String hello = array.apply("Hello1", "Hello2");
        System.out.printf(hello);
    }
}
