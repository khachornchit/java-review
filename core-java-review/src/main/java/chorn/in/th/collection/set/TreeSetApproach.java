package chorn.in.th.collection.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetApproach {

	public static void main(String[] args) {

		Set<String> setOfAnimals = new HashSet<String>();

		setOfAnimals.add("Ant");
		setOfAnimals.add("Banana");
		setOfAnimals.add("Cat");
		setOfAnimals.add("Dog");
		setOfAnimals.add("Dog");
		setOfAnimals.add("Dog");
		setOfAnimals.add("Dog");
		setOfAnimals.add("Dog");
		setOfAnimals.add("Elephant");
		setOfAnimals.add("AntAnt");

		System.out.println("Original Set");
		System.out.println(setOfAnimals);

		System.out.println("\nSorted into TreeSet");
		Set<String> treeSet = new TreeSet<String>(setOfAnimals);
		System.out.println(treeSet);
	}

}
