package src.core.javaCore.stringBuilder;

public class Replace {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("0123456789");
		sb.replace(1, 3, "Java");
		System.out.println(sb);
		
	}

}
