package genericClassesAndMethods;

public class GenericMethodTest {

    public static void main(String[] args) {

        // create arrays of Integer, Double and Character
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};

        System.out.printf("Array integerArray contains:%n");
        printArray(integerArray); // pass an Integer array
    }
}
