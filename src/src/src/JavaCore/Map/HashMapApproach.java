package JavaCore.Map;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * A HashMap however, store items in "key/value" pairs, and you can access them
 * by an index of another type (e.g. a String)
 *
 */
public class HashMapApproach {

	static void createHashMap(int numbers[]) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		Integer count = 0;
		for (int i = 0; i < numbers.length; i++) {
			count = map.get(numbers[i]);

			if (map.get(numbers[i]) == null) {
				map.put(numbers[i], 1);
			} else {
				map.put(numbers[i], ++count);
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
		int numbers[] = { 10, 34, 5, 10, 3, 5, 10 };
		createHashMap(numbers);
	}
}
