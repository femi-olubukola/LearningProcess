package genericCollections;

// Collections method sort with a custom Comparator object.

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class Sort3 {

    public static void main(String[] args) {

        List<Time2> list = new ArrayList<>(); // create List


        // output List elements
        System.out.printf("Unsorted array elements:%n%s%n", list);

        // sort in order using a comparator
        Collections.sort(list, new TimeComparator());

        // output List elements
        System.out.printf("Sorted list elements:%n%s%n", list);
    }

}