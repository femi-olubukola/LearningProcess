package customGenericDataStructures;

// Stack manipulation program.

public class StackInheritanceTest {

    public static void main(String[] args) {

        StackInheritance<Integer> stack = new StackInheritance<>();

        // use push method
        stack.push(-1);
        stack.print();
        stack.push(0);
        stack.print();
        stack.push(1);
        stack.print();
        stack.push(5);
        stack.print();

        // remove items from stack
        try {
            int removedItem;

            while (true)
                {

                System.out.printf("%n%d popped%n", removedItem);

                }
            }
        catch (EmptyListException emptyListException) {
            emptyListException.printStackTrace();
        }
    }
}
