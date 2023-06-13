package lambdasAndStreams;

// Demonstrating lambdas and streams with an array of Strings.

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;


public class ArraysAndStreams2 {

    public static void main(String[] args) {

        String[] strings =
                {"Red", "orange", "Yellow", "green", "Blue", "indigo", "Violet"};

        // display original strings
        System.out.printf("Original strings: %s%n", Arrays.asList(strings));

        // strings in uppercase
        System.out.printf("strings in uppercase: %s%n",
                Arrays.stream(strings)
                        .map(String::toUpperCase)
                        .collect(Collectors.toList()));

    }
}
