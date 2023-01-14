package src.Core.JavaCore.Collection.Set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetApproach {

	public static void main(String[] args) {

		Set<String> set = new HashSet<String>();

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

		System.out.println("Original Set");
		System.out.println(set);

		System.out.println("\nSorted into TreeSet");
		Set<String> treeSet = new TreeSet<String>(set);
		System.out.println(treeSet);
	}

}
