package chorn.in.th.advantage.functional_interface;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "Hello, World!";
        String result = supplier.get();
        System.out.println(result);
    }
}
