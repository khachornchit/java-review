package JavaCore.StringBuilder;

/**
 * The capacity() method of StringBuilder class returns the current capacity of
 * the Builder. The default capacity of the Builder is 16. If the number of
 * character increases from its current capacity, it increases the capacity by
 * (oldcapacity*2)+2. For example if your current capacity is 16, it will be
 * (16*2)+2=34.
 *
 */
public class Capacity {

	public static void main(String[] args) {

		// Default
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.capacity());

		// Append 10 characters
		sb.append("0123456789");
		System.out.println(sb.capacity());

		// Append more than 16 characters
		sb.append("The capacity() method of StringBuilder class returns the current capacity of the Builder.");
		System.out.println(sb.capacity());

	}

}
