package chorn.in.th.fundamentals;

public class StringConcatenation {

	public static void main(String[] args) {
		int a = 100;
		int b = 200;
		
		double d1 = 20.1;
		double d2 = 23.5;

		String x = "Hello";
		String y = "World";

		System.out.println(a + b);
		System.out.println(x + y);
		System.out.println(a + b + x + y);
		System.out.println(a + x + b + y);
		System.out.println(d1 + d2);
		System.out.println(d1 + d2 + x + y);
		System.out.println("d1+d2 = " + (d1 + d2));
	}

}
