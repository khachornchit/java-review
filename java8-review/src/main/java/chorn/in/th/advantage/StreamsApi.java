package chorn.in.th.advantage;

import java.util.Arrays;
import java.util.List;

public class StreamsApi {
    public static void main(String[] args) {
        List<String> myList = Arrays.asList("Java", "is", "streamlined");

        long count = myList.stream()
                .filter(s -> s.length() > 2)
                .count();

        System.out.println(count); // Output: 2

        // Example: Filtering and mapping with streams
        List<String> words = Arrays.asList("Java", "is", "streamlined", "and", "powerful");

        // Using traditional for loop
        for (String word : words) {
            if (word.length() > 3) {
                System.out.println(word.toUpperCase());
            }
        }

        // Using streams
        words.stream()
                .filter(word -> word.length() > 3)
                .map(String::toUpperCase)
                .forEach(System.out::println);

    }
}
