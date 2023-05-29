package genericCollections;

// Lists, LinkedLists and ListIterators.

import java.util.List;
import java.util.LinkedList;
//import java.util.ListIterator;

public class ListTest {

    public static void main(String[] args) {

        // add colors elements to list1
        String[] colors =
                {"black", "yellow", "green", "blue", "violet", "silver"};
        List<String> list1 = new LinkedList<>();

        for (String color : colors)
            list1.add(color);

        // add colors2 elements to list2
        String[] colors2 =
                {"gold", "white", "brown", "blue", "gray", "silver"};
        List<String> list2 = new LinkedList<>();

        for (String color : colors2)
            list2.add(color);

        list1.addAll(list2); // concatenate lists
        list2 = null; // release resources
        printList(list1); // print list1 elements

        convertToUppercaseStrings(list1); // convert to uppercase string
        printList(list1); // print list1 elements

        System.out.printf("%nDeleting elements 4 to 6...");
        removeItems(list1, 4, 7); // remove items 4-6 from list
        printList(list1); // print list1 elements
        printReversedList(list1); // print list in reverse order
    }
}
