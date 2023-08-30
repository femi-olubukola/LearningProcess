package genericClassesAndMethods;

// Raw type test program.

public class RawTypeTest {

    public static void main(String[] args) {

        Double[] doubleElements = {1.1, 2.2, 3.3, 4.4, 5.5};
        Integer[] integerElements = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Stack of raw types assigned to Stack of raw types variable
        Stack rawTypeStack1 = new Stack(5);

        // Stack<Double> assigned to Stack of raw types variable
        Stack rawTypeStack2 = new Stack<Double>(5);

        // Stack of raw types assigned to Stack<Integer> variable
        Stack<Integer> integerStack = new Stack(10);

        testPush("rawTypeStack1", rawTypeStack1, doubleElements);
        testPop("rawTypeStack1", rawTypeStack1);
        testPush("rawTypeStack2", rawTypeStack2, doubleElements);
        testPop("rawTypeStack2", rawTypeStack2);
        testPush("integerStack", integerStack, integerElements);
        testPop("integerStack", integerStack);
    }
}
