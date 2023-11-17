package chorn.in.th.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListApproach {

	public static <E> void main(String[] args) {

		int count = 5;
		List<String> list = new ArrayList<>();

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
        for (String s : list) {
            System.out.print(s + " ");
        }
	}
}
