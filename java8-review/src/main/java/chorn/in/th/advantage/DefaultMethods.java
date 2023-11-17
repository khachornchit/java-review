package chorn.in.th.advantage;

interface MyInterface {
    void myMethod();

    default void defaultMethod() {
        System.out.println("Default implementation");
    }
}

public class DefaultMethods {
    public static void main(String[] args) {
        MyInterface myInterface = () -> System.out.println("Hello");
        myInterface.defaultMethod();
        myInterface.myMethod();
    }
}
