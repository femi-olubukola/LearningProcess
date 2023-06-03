package genericCollections;

// Collections methods addAll, frequency and disjoint.

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class Algorithms2 {

    public static void main(String[] args) {

        // initialize list1 and list2
        String[] colors = {"red", "white", "yellow", "blue"};
        List<String> list1 = Arrays.asList(colors);
        ArrayList<String> list2 = new ArrayList<>();

        list2.add("black"); // add "black" to the end of list2
        list2.add("red"); // add "red" to the end of list2
        list2.add("green"); // add "green" to the end of list2

        System.out.print("Before addAll, list2 contains: ");

        // display elements in list2
        for (String s : list2)
            System.out.printf("%s ", s);

        System.out.printf("%nAfter addAll, list2 contains: ");

        // display elements in list2
        for (String s : list2)
            System.out.printf("%s ", s);


        System.out.printf("list1 and list2 %s elements in common%n",
                (disjoint ? "do not have" : "have"));

    }
}
