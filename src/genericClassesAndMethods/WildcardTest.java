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


        // create, initialize and output ArrayList of Doubles, then
        // display total of the elements
        Double[] doubles = {1.1, 3.3, 5.5};
        ArrayList<Double> doubleList = new ArrayList<>();

        // insert elements in doubleList
        for (Double element : doubles)
            doubleList.add(element);

        System.out.printf("doubleList contains: %s%n", doubleList);
        System.out.printf("Total of the elements in doubleList: %.1f%n%n", sum(doubleList));
    }
}
