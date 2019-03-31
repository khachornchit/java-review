package pluto.java8;

import pluto.features.*;

public class TypeInference {

	public static void main(String[] args) {
		printString(s -> String.format("Length of %s = %s", s, s.length()));
	}

	public static void printString(IString s) {
		System.out.println(s.getString("Hello Lambda"));
	}

}