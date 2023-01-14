package src.Core.JavaCore.Collection.Set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * 
 * A HashSet is unordered and unsorted Set. LinkedHashSet is the ordered version
 * of HashSet.
 *
 */
public class LinkedHashSetApproach {

	public static void main(String[] args) {

		Set<String> set = new LinkedHashSet<String>();

		set.add("Ant");
		set.add("Banana");
		set.add("Cat");
		set.add("Dog");
		set.add("Dog");
		set.add("Dog");
		set.add("Dog");
		set.add("Dog");
		set.add("Elephant");
		set.add("AntAnt");

		System.out.println(set);

		System.out.println("\nhashSet.contains(\"Example\") : " + set.contains("Example"));

		set.remove("Example");

		System.out.println("\nhashSet after remove Example : " + set);

		System.out.println("\nUse Iterator ...");
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext())
			System.out.println(iterator.next());
	}

}
