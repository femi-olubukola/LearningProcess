package customGenericDataStructures;

// StackInheritance extends class List.

public class StackInheritance {

    // constructor
    public StackInheritance()<T> extends List<T>{
        super("stack");
    }

    // add object to stack
    public void push(T object) {
        insertAtFront(object);
    }

}
