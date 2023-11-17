package chorn.in.th.string_builder;

public class Delete {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder("0123456789");
		sb.delete(1, 3); // It will delete the char at index from 1 to less than 3
		System.out.println(sb);
	}

}
