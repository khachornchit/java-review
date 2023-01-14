package Java8Sample.Exception;

import java.util.function.BiConsumer;

/**
 * @author pluto
 */
public class ExceptionHandling {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int key = 0;

        process(numbers, key, (v, k) -> System.out.println(String.format("%s + %s = %s", v, k, v + k)));
        process(numbers, key, wrapLambda((v, k) -> System.out.println(v / k)));
    }

    private static void process(int[] numbers, int key, BiConsumer<Integer, Integer> consumer) {
        for (int i : numbers) {
            consumer.accept(i, key);
        }
    }

    private static BiConsumer<Integer, Integer> wrapLambda(BiConsumer<Integer, Integer> consumer) {
        return (v, k) -> {
            try {
                consumer.accept(v, k);
            } catch (Exception e) {
                System.out.println("Java8Sample.Exception caught in lambda !");
            }
        };
    }

}
