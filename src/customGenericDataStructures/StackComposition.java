package customGenericDataStructures;

// StackComposition uses a composed List object.

public class StackComposition<T> {

    private List<T> stackList;

    // constructor
    public StackComposition() {
        stackList = new List<T>("stack");
    }

    // add object to stack
    public void push(T object) {
        stackList.insertAtFront(object);
    }

    // remove object to stack
    public T pop() throws EmptyListException {
        return stackList.removeFromFront();
    }

    // determine if stack is empty
    public boolean isEmpty() {
        return stackList.isEmpty();
    }

}
