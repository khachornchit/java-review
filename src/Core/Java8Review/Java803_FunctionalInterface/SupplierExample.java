package src.Core.Java8Review.Java803_FunctionalInterface;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "Hello, World!";
        String result = supplier.get();
        System.out.println(result);
    }
}
