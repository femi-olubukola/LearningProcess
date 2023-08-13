package genericClassesAndMethods;

// Stack generic class declaration.

public class Stack<T> {

    private final ArrayList<T> elements; // ArrayList stores stack elements


    // no-argument constructor creates a stack of the default size
    public Stack() {
        this(10); // default stack size
    }

    // constructor creates a stack of the specified number of elements
    public Stack(int capacity) {
        int initCapacity = capacity > 0 ? capacity : 10; // validate
        elements = new ArrayList<T>(initCapacity); // create ArrayList
    }

    // push element onto stack
    public void push(T pushValue) {
        elements.add(pushValue); // place pushValue on Stack
    }
}
