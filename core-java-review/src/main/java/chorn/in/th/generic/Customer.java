package chorn.in.th.generic;

public class Customer {
    String firstName;
    String lastName;

    public Customer(String firstName, String lastName) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Customer [firstName=" + firstName + ", lastName=" + lastName + "]";
    }

    public void displayString() {
        System.out.println(this);
    }
}
