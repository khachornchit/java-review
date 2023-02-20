package src.core.review.functionalInterface;

import java.util.function.ObjLongConsumer;

public class ObjLongConsumerExample {

    public static void main(String[] args) {
        ObjLongConsumer<String> printLengthAndValue = (s, l) -> System.out.println("String: " + s + ", Length: " + s.length());
        printLengthAndValue.accept("Hellooooooo", 5);
        // prints "String: Hello, Length: 5"
    }
}
