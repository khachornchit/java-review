package core.stringBuilder;

public class Replace {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("0123456789");
		sb.replace(1, 3, "Java");
		// It will replace the string at the start index and end index-1

		System.out.println(sb);
	}
}
