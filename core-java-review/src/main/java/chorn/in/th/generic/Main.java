package chorn.in.th.generic;

public class Main {

	public static void main(String[] args) {
		// string type
		Node<String> nodeString = new Node<String>();
		nodeString.setData("Hello");
		System.out.printf("%s \n", nodeString.getData());

		// integer type
		Node<Integer> nodeInteger = new Node<Integer>();
		nodeInteger.setData(99);
		System.out.printf("%s \n", nodeInteger.getData());

		// customer type
		Node<Customer> nodeCustomer = new Node<Customer>();
		nodeCustomer.setData(new Customer("Lisa", "Elegance"));
		nodeCustomer.getData().displayString();
	}

}
