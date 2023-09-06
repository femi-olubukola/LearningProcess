package genericClassesAndMethods;

// Wildcard test program.

public class WildcardTest {

    public static void main(String[] args) {

        // create, initialize and output ArrayList of Integers, then
        // display total of the elements
        Integer[] integers = {1, 2, 3, 4, 5};
        ArrayList<Integer> integerList = new ArrayList<>();

        // insert elements in integerList
        for (Integer element : integers)
            integerList.add(element);

        System.out.printf("integerList contains: %s%n", integerList);
        System.out.printf("Total of the elements in integerList: %.0f%n%n", sum(integerList));
    }
}
