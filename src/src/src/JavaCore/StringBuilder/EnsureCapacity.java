package JavaCore.StringBuilder;

/**
 * 
 * The ensureCapacity() method of StringBuilder class ensures that the given
 * capacity is the minimum to the current capacity. If it is greater than the
 * current capacity, it increases the capacity by (oldcapacity*2)+2. For example
 * if your current capacity is 16, it will be (16*2)+2=34.
 *
 */
public class EnsureCapacity {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder();
		System.out.println(sb.capacity());

		sb.append("01234567890");
		System.out.println(sb.capacity());

		sb.append("01234567890");
		System.out.println(sb.capacity());

		sb.ensureCapacity(10);
		System.out.println(sb.capacity());

		sb.ensureCapacity(50);
		System.out.println(sb.capacity());
	}

}
