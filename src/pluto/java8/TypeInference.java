package pluto.java8;

import pluto.features.*;

/**
 * 
 * @author pluto
 *
 */
public class TypeInference {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		printString(s -> String.format("Length of %s = %s", s, s.length()));
	}

	/**
	 * 
	 * @param s
	 */
	public static void printString(IString s) {
		System.out.println(s.getString("Hello Lambda"));
	}

}