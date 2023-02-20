package src.core.javaCore.collection.Set;

import java.util.concurrent.ConcurrentSkipListSet;

/**
 * 
 * The ConcurrentSkipListSet class in Java is a part of the Java Collection
 * Framework and implements the Collection interface and the AbstractSet class.
 * It provides a scalable and concurrent version of NavigableSet in Java. The
 * implementation of ConcurrentSkipListSet is based on ConcurrentSkipListMap.
 * The elements in ConcurrentSkipListSet are sorted by default in their natural
 * ordering.
 *
 */
public class ConcurrentSkipListSetLastApproach {

	public static void main(String[] args) {

		ConcurrentSkipListSet<Integer> set = new ConcurrentSkipListSet<Integer>();

		set.add(78);
		set.add(64);
		set.add(12);
		set.add(45);
		set.add(8);

		System.out.println(set);

		ConcurrentSkipListSet<Integer> cloneSet = set.clone();
		System.out.println("\ncloneSet :  " + cloneSet);
		System.out.println("\nMaximum value set.last() : " + set.last());
		System.out.println("\nThe first element of the set: " + set.pollFirst());

		if (set.contains(9)) {
			System.out.println("9 is present in the set.");
		} else {
			System.out.println("9 is not present in the set.");
		}

		System.out.println("\nset.size() : " + set.size());

		ConcurrentSkipListSet<Integer> removeSet = new ConcurrentSkipListSet<Integer>();
		removeSet.add(64);
		removeSet.add(78);

		set.removeAll(removeSet);
		System.out.println("\nset.removeAll(removeSet) : " + set);

		set.clear();
		System.out.println("\nset.clear() : " + set);
	}

}
