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
    }
}
