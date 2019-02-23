package pluto.java8.exception;

import java.util.function.BiConsumer;

/**
 * 
 * @author pluto
 *
 */
public class ExceptionHandling {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5 };
		int key = 0;

		process(numbers, key, (v, k) -> System.out.println(String.format("%s + %s = %s", v, k, v + k)));
		process(numbers, key, wrapLambda((v, k) -> System.out.println(v / k)));
	}

	/**
	 * 
	 * @param numbers
	 * @param key
	 */
	private static void process(int[] numbers, int key, BiConsumer<Integer, Integer> consumer) {
		for (int i : numbers) {
			consumer.accept(i, key);
		}
	}

	/**
	 * 
	 * @param consumer
	 * @return
	 */
	private static BiConsumer<Integer, Integer> wrapLambda(BiConsumer<Integer, Integer> consumer) {
		return (v, k) -> {
			try {
				consumer.accept(v, k);
			} catch (Exception e) {
				System.out.println("Exception caught in lambda !");
			}
		};
	}

}
