package src.core.javaCore.stringCompare;

public class StringCompare {

	public static void main(String[] args) {

		// Group1
		String group1 = new String("0123456789");

		// Group2
		String group2 = new String("012345");

		// Group3
		String group3_1 = new String("0123A");
		String group3_2 = new String("0123a");

		// Group4
		String group4_1 = new String("A");
		String group4_2 = new String("B");

		System.out.println("group1 == group 2 : " + group1.equals(group2));

		// Comparing for String 3 = String 4
		System.out.println("group3_1 == group3_2 : " + group3_1.equals(group3_2));

		System.out.println();
		System.out.println("group3_1 == group3_2 (Ignore Case) : " + group3_1.equalsIgnoreCase(group3_2));

		System.out.println();
		System.out.println("Comparing " + group1 + " and " + group3_2 + " : " + group1.equals(group3_2));

		System.out.println();
		System.out.println("compareTo()");
		System.out.println("group1.compareTo(group1) : " + group1.compareTo(group1));

		System.out.println("group1.compareTo(group2) : " + group1.compareTo(group2));

		System.out.println("group2.compareTo(group1) : " + group2.compareTo(group1));

		System.out.println("group1.compareTo(group3_1) : " + group1.compareTo(group3_1));

		System.out.println("group4_1.compareTo(group4_2) : " + group4_1.compareTo(group4_2));
	}

}
