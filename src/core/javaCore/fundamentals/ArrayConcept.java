package src.core.javaCore.fundamentals;

public class ArrayConcept {

	public static void main(String[] args) {
		
		int i[] = new int[5];
		double d[] = new double[10];
		boolean b[] = new boolean[10];
		String s[] = new String[10];

		for (int j = 0; j < 5; j++) {
			i[j] = (j + 10) * (j + 1);
			d[j] = i[j] + 0.25;
			b[j] = true;
			s[j] = "Hello " + j;

			System.out.println(String.format("i[%s] = %s", j, i[j]));
		}

//		Mixed object array
		Object obj[] = new Object[10];
		obj[0] = "Hello1";
		obj[1] = true;
		obj[2] = 30.8;
		obj[3] = 1000;
		obj[4] = "Hello4";
		obj[5] = false;

		for (int j = 0; j < 5; j++) {
			System.out.println(String.format("obj[%s] = %s", j, obj[j]));
		}
	}

}
