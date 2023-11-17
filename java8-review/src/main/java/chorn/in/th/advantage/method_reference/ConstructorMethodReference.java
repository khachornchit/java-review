package chorn.in.th.advantage.method_reference;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Arrays;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
class Person {
    private String name;
}

public class ConstructorMethodReference {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // Lambda expression
        List<Person> persons_lambda = names.stream()
                .map(name -> new Person(name))
                .toList();

        // Constructor reference
        List<Person> persons_reference = names.stream()
                .map(Person::new)
                .toList();
    }
}
