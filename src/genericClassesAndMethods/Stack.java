package genericClassesAndMethods;

// Stack generic class declaration.

public class Stack<T> {

    private final ArrayList<T> elements; // ArrayList stores stack elements

    // no-argument constructor creates a stack of the default size
    public Stack() {

        this(10); // default stack size
    }
}
