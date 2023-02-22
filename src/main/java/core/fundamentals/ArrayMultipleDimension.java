package core.fundamentals;

public class ArrayMultipleDimension {

	public static void main(String[] args) {
		
		String[][] stringMatrix = new String[3][5];
		System.out.println("array.length new String[3][5] = " + stringMatrix.length);

		for (int row = 0; row < 3; row++) {

			System.out.println();
			System.out.println("Row : " + row);

			for (int col = 0; col < 5; col++) {
				stringMatrix[row][col] = String.format("x[%s][%s] = %s ", row, col, row + col);
				System.out.println(stringMatrix[row][col]);
			}
		}
	}
}
