package JavaCore.Collection.List;

import java.util.LinkedList;

/**
 * 
 * LinkedList is implemented List and Queue
 * 
 * LinkedList is implemented as a double linked list. Its performance on add and
 * remove is better than ArrayList, but worse on get and set methods. Vector is
 * similar with ArrayList, but it is synchronized.
 *
 * LinkedList, however, also implements Queue interface which adds more methods
 * than ArrayList and Vector, such as offer(), peek(), poll(), etc.
 *
 */
public class LinkedListApproach {

	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<String>();

		linkedList.add("hello1");
		linkedList.add("hello2");
		linkedList.add("hello3");
		linkedList.add("hello4");
		linkedList.add("hello5");

		linkedList.addFirst("Header");
		linkedList.addLast("Footer");

		System.out.println(linkedList);
		System.out.println(linkedList.get(0));

		System.out.println("............");
		linkedList.set(1, "item 1 update");
		System.out.println(linkedList.get(0));
		System.out.println(linkedList.get(1));
		System.out.println(linkedList.get(2));

		linkedList.removeFirst();
		linkedList.removeFirst();
		System.out.println();
		System.out.println("print lString after remove First");
		System.out.println(linkedList);

		linkedList.addLast("Latest 1");
		linkedList.addLast("Latest 2");

		System.out.println();
		System.out.println("print All");

		linkedList.forEach(x -> {
			System.out.println(x);
		});
	}

}
