package sample.model;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String formatPerson() {
        return String.format("%s %s, age = %s", this.firstName, this.lastName, this.age);
    }

    public void printPerson() {
        System.out.println(this.formatPerson());
    }

    public void printFirstName() {
        System.out.println(this.firstName);
    }

}
