package chorn.in.th.collection.set;

import java.util.HashSet;
import java.util.Set;

public class SetApproach {

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
        
        System.out.println(setOfAnimals);
  
        System.out.println("\nhashSet.contains(\"Dog\") : " + setOfAnimals.contains("Dog"));
        
        setOfAnimals.remove("Dog");
        
        System.out.println("\nhashSet after remove Dog : " + setOfAnimals);
        
        System.out.println("\nUse Iterator ...");
		for (String s : setOfAnimals) System.out.println(s);
	}
}
