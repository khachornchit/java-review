package JavaCore.StringBuilder;

public class Delete {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder("0123456789");
		sb.delete(1, 3);
		System.out.println(sb);
	}

}
