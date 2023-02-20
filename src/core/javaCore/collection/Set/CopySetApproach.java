package src.core.javaCore.collection.Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CopySetApproach {

	public static String[] Method1NativeConvert(Set<String> set) {

		String[] arrayOfString = new String[set.size()];

		int index = 0;
		for (String str : set)
			arrayOfString[index++] = str;

		return arrayOfString;
	}

	public static String[] setToArray(Set<String> set) {
		return set.toArray(new String[0]);
	}

	public static String[] copyOf(Set<String> set) {
		return Arrays.copyOf(set.toArray(), set.size(), String[].class);
	}

	public static String[] systemArrayCopy(Set<String> set) {
		String[] arrayOfString = new String[set.size()];
		System.arraycopy(set.toArray(), 0, arrayOfString, 0, set.size());
		return arrayOfString;
	}

	public static String[] stream(Set<String> set) {
		return set.stream().toArray(String[]::new);
	}

	public static void main(String[] args) {

		Set<String> set = new HashSet<>(Arrays.asList("Ant", "Banana", "Cat"));

		System.out.println("Set of String: " + set);

		System.out.println("\n1 : Native convert");
		System.out.println(Arrays.toString(Method1NativeConvert(set)));

		System.out.println("\n2 : Set.toArray()");
		System.out.println(Arrays.toString(setToArray(set)));

		System.out.println("\n3 : Arrays.copyOf()");
		System.out.println(Arrays.toString(copyOf(set)));

		System.out.println("\n4 : System.arrayCopy()");
		System.out.println(Arrays.toString(systemArrayCopy(set)));

		System.out.println("\n5 : Set.stream().toArray()");
		System.out.println(Arrays.toString(stream(set)));
	}
}
