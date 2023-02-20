package src.core.javaCore.fundamentals;

public class ArrayMuttipleDimension {

	public static void main(String[] args) {
		
		String x[][] = new String[3][5];
		System.out.println("array.length new String[3][5] = " + x.length);

		for (int row = 0; row < 3; row++) {

			System.out.println();
			System.out.println("Row : " + row);

			for (int col = 0; col < 5; col++) {
				x[row][col] = String.format("x[%s][%s] = %s ", row, col, row + col);

				System.out.println(x[row][col]);
			}
		}
	}
}
