package JavaCore.Collection.List;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * List is an ordered sequence of elements, however set is distinct list of
 * element which is unordered. So, use list for storing non-unique objects as
 * per insertion order and use set for storing unique objects in random order
 *
 * ArrayList is implemented only List
 * 
 * ArrayList is implemented as a resize-able array. As more elements are added to
 * ArrayList, its size is increased dynamically. It's elements can be accessed
 * directly by using the get and set methods, since ArrayList is essentially an
 * array.
 * 
 */
public class ArrayListApproach {

	public static <E> void main(String[] args) {

		int count = 5;
		List<String> list = new ArrayList<String>();

		// Initial list
		for (int i = 1; i <= count; i++) {
			list.add(String.format("A%s", i));
			list.add(String.format("B%s", i));
		}

		System.out.println("Original list");
		System.out.println(list);

		// Remove element at index 1
		list.remove(1);
		System.out.println("\nList after remove at index 1");
		System.out.println(list);

		System.out.println("\nPrinting elements one by one");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
	}

}
