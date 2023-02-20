package src.core.collection.Set;

import java.util.EnumSet;

public class EnumSetApproach {
	enum Definition {
		CODE, LEARN, CONTRIBUTE, QUIZ, MCQ
	};

	public static void main(String[] args) {

		// Creating a set
		EnumSet<Definition> set1, set2, set3, set4;

		// Adding elements
		set1 = EnumSet.of(Definition.QUIZ, Definition.CONTRIBUTE, Definition.LEARN, Definition.CODE);

		set2 = EnumSet.complementOf(set1);

		set3 = EnumSet.allOf(Definition.class);

		set4 = EnumSet.range(Definition.CODE, Definition.CONTRIBUTE);

		System.out.println("Set 1: " + set1);
		System.out.println("Set 2: " + set2);
		System.out.println("Set 3: " + set3);
		System.out.println("Set 4: " + set4);
	}

}
