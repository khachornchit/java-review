package src.core.javaCore.fundamentals;

public class Conditions {

	public static void main(String[] args) {
		int a = 30;
		int b = 40;
		int c = 90;
		int d = 48;

		if (b > a && c > d) {
			System.out.println("b>a & c> d");
		} else {
			System.out.println("b<a | c<d");
		}

		switch (a) {
		case 10:
			System.out.println("a=" + a);
			break;

		default:
			System.out.println("default a=" + a);
			break;
		}
	}

}
