package src.core.generic;

public class Main {

	public static void main(String[] args) {
		Node<String> nodeString = new Node<String>();
		nodeString.setData("Hello");
		System.out.printf("%s \n", nodeString.getData());

		Node<Integer> nodeInteger = new Node<Integer>();
		nodeInteger.setData(99);
		System.out.printf("%s \n", nodeInteger.getData());

		Node<Customer> nodeCustomer = new Node<Customer>();
		nodeCustomer.setData(new Customer("Lisa", "Elegance"));
		nodeCustomer.getData().displayString();
	}

}
