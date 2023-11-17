package chorn.in.th.advantage;

@FunctionalInterface
interface MyFunctionalInterface {
    void myMethod();
}

public class FunctionalInterfaces {

    public static void main(String[] args) {

        // Using a lambda expression
        MyFunctionalInterface functionalInterface = () -> System.out.println("Executing myMethod");

        functionalInterface.myMethod();
    }
}
