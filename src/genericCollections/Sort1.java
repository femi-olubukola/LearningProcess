package genericCollections;

// Collections method sort.

import java.util.List;
import java.util.Arrays;
    public class Sort1 {

        public static void main(String[] args) {
            String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

            // Create and display a list containing the suits array elements
            List<String> list = Arrays.asList(suits);
            System.out.printf("Unsorted array elements: %s%n", list);

            System.out.printf("Sorted array elements: %s%n", list);
    }
}
