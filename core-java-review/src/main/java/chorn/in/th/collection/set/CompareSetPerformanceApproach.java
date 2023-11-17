package chorn.in.th.collection.set;

// Java program to demonstrate difference between 
// HashSet, LinkedHashSet and TreeSet 
// according to insertion order and insertion time 

// When to use HashSet, TreeSet and LinkedHashSet in Java:
// HashSet: If you don�t want to maintain insertion order but want store unique objects.
// LinkedHashSet: If you want to maintain insertion order of elements then you can use LinkedHashSet. FIFO
// TreeSet: If you want to sort the elements according to some Comparator then use TreeSet.

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

class CompareSetPerformanceApproach {

	private static void insertionOrder() {
		LinkedHashSet<String> linkSet = new LinkedHashSet<>();
		TreeSet<String> treeSet = new TreeSet<>();
		HashSet<String> hashSet = new HashSet<String>();

		for (String str : Arrays.asList("Ant", "Banana", "Cat", "Dog", "Elephant", "Fish")) {
			hashSet.add(str);
			linkSet.add(str);
			treeSet.add(str);
		}

		System.out.println("HashSet :" + hashSet);
		System.out.println("LinkedHashSet :" + linkSet);
		System.out.println("TreeSet :" + treeSet);

		System.out.println();
	}

	private static void insertionTime() {

		HashSet<Integer> numbersHS = new HashSet<>();
		long startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			numbersHS.add(i);
		}
		long endTime = System.nanoTime();
		System.out.printf("HashSet insert 1,000 elements in %,d sec.%n", endTime - startTime);

		LinkedHashSet<Integer> numbersLLS = new LinkedHashSet<>();

		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			numbersLLS.add(i);
		}
		endTime = System.nanoTime();
		System.out.printf("LinkedHashSet insert 1,000 elements in %,d sec.%n", endTime - startTime);

		TreeSet<Integer> numbersTS = new TreeSet<>();

		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			numbersTS.add(i);
		}
		endTime = System.nanoTime();
		System.out.printf("TreeSet insert 1,000 elements in %,d sec.%n", endTime - startTime);

		System.out.println();
	}

	private static void deletion() {

		HashSet<Integer> deletionHS = new HashSet<>();

		for (int i = 0; i < 10000; i++) {
			deletionHS.add(i);
		}

		long startingTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			deletionHS.remove(i);
		}

		long endedTime = System.nanoTime();
		System.out.printf("HashSet deleted 1,000 elements in %,d sec.%n", Math.abs(startingTime - endedTime));

		LinkedHashSet<Integer> deletionLLS = new LinkedHashSet<>();

		for (int i = 0; i < 10000; i++) {
			deletionLLS.add(i);
		}
		startingTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			deletionLLS.remove(i);
		}

		endedTime = System.nanoTime();
		System.out.printf("LinkedHashSet deleted 1,000 elements in %,d sec.%n", Math.abs(startingTime - endedTime));

		TreeSet<Integer> deletionTS = new TreeSet<>();

		for (int i = 0; i < 10000; i++) {
			deletionTS.add(i);
		}

		startingTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			deletionTS.remove(i);
		}

		endedTime = System.nanoTime();
		System.out.printf("TreeSet deleted 1,000 elements in %,d sec.%n", Math.abs(startingTime - endedTime));
		System.out.println();
	}

	public static void main(String[] args) {
		insertionOrder();
		insertionTime();
		deletion();
	}
}
