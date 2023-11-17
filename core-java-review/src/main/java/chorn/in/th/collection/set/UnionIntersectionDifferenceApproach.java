package chorn.in.th.collection.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UnionIntersectionDifferenceApproach {

    public static void main(String[] args) {
        Set<Integer> setA = new HashSet<>(Arrays.asList(1, 3, 2, 4, 8, 9, 0));
        Set<Integer> setB = new HashSet<>(Arrays.asList(1, 3, 7, 5, 4, 0, 7, 5));

        System.out.println("a : " + setA);
        System.out.println("b : " + setB);

        // Union with addAll method
        Set<Integer> union = new HashSet<Integer>(setA);
        union.addAll(setB);
        System.out.println("Union : " + union);

        // Intersection with retainAll method 
        Set<Integer> intersection = new HashSet<Integer>(setA);
        intersection.retainAll(setB);
        System.out.println("Intersection : " + intersection);

        // Difference using removeAll method 
        Set<Integer> difference = new HashSet<Integer>(setA);
        difference.removeAll(setB);
        System.out.println("Difference : " + difference);
    }

}
