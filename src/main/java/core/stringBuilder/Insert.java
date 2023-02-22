package core.stringBuilder;

public class Insert {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("0123456789");
		sb.insert(3, "Java"); // It will insert the Java start from index 3
		System.out.println(sb);
	}
}
