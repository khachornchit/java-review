package core.map;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 
 * Important : Keeping the insertion order in both LinkedHashmap and
 * LinkedHashset have additional associated costs, both in terms of spending
 * additional CPU cycles and needing more memory. If you do not need the
 * insertion order maintained, it is recommended to use the lighter-weight
 * HashSet and HashMap instead.
 *
 */
public class LinkedHashMapApproach {

	public static void main(String[] args) {
		Map<String, Integer> linkedHashMap = new LinkedHashMap<String, Integer>();

		linkedHashMap.put("Ant", 1);
		linkedHashMap.put("Cat", 8);
		linkedHashMap.put("Banana", 4);
		linkedHashMap.put("Dog", 12);
		linkedHashMap.put(null, 15);

		System.out.println(linkedHashMap);
		System.out.println("Dog = " + linkedHashMap.get("Dog"));
	}

}
