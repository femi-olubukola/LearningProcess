package genericClassesAndMethods;

// Passing generic Stack objects to generic methods.

public class StackTest2 {

    public static void main(String[] args) {

        Double[] doubleElements = {1.1, 2.2, 3.3, 4.4, 5.5};
        Integer[] integerElements = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Create a Stack<Double> and a Stack<Integer>
        Stack<Double> doubleStack = new Stack<>(5);
        Stack<Integer> integerStack = new Stack<>();

        // push elements of doubleElements onto doubleStack
        testPush("doubleStack", doubleStack, doubleElements);
        testPop("doubleStack", doubleStack); // pop from doubleStack

        // push elements of integerElements onto integerStack
        testPush("integerStack", integerStack, integerElements);
        testPop("integerStack", integerStack); // pop from integerStack
    }

    // generic method testPush pushes elements onto a Stack
    public static <T> void testPush(String name , Stack<T> stack,
                                    T[] elements) {

        System.out.printf("%nPushing elements onto %s%n", name);

        // push elements onto Stack
        for (T element : elements) {
            System.out.printf("%s ", element);
            stack.push(element); // push element onto stack
        }
    }
}
