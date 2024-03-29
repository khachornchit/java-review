package chorn.in.th.map;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * A HashMap however, store items in "key/value" pairs, and you can access them
 * by an index of another type (e.g. a String)
 *
 */
public class HashMapApproach {

	static void createHashMap(int[] numbers) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		Integer count = 0;
		for (int number : numbers) {
			count = map.get(number);

			if (map.get(number) == null) {
				map.put(number, 1);
			} else {
				map.put(number, ++count);
			}
		}

		synchronized (map) {
			if (!map.containsKey(null)) {
				map.put(null, 1000);
			}
		}

		System.out.println(map);
	}

	public static void main(String[] args) {
		int[] numbers = { 10, 34, 5, 10, 3, 5, 10 };
		createHashMap(numbers);
	}
}
