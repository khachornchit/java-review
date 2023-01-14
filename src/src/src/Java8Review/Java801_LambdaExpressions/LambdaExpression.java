package Java8Review.Java801_LambdaExpressions;

public class LambdaExpression {

    public static void main(String[] args) {
        LambdaExpression tester = new LambdaExpression();

        MathOperation add = (a, b) -> a + b;
        MathOperation subtract = (a, b) -> a - b;
        MathOperation multiply = (a, b) -> a * b;
        MathOperation division = (a, b) -> a / b;

        System.out.printf("10 + 5 = %d\n", tester.operate(10, 5, add));
        System.out.printf("10 - 5 = %d\n", tester.operate(10, 5, subtract));
        System.out.printf("10 * 5 = %d\n", tester.operate(10, 5, multiply));
        System.out.printf("10 / 5 = %d\n", tester.operate(10, 5, division));

        Greeting greeting = message -> System.out.println(message);
        greeting.hi("Hello, this is greeting message");
    }

    interface MathOperation {
        int operate(int a, int b);
    }

    interface Greeting {
        void hi(String message);
    }

    private int operate(int a, int b, MathOperation operation) {
        return operation.operate(a, b);
    }
}
