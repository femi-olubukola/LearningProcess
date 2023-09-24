package customGenericDataStructures;

// Class EmptyListException declaration.

public class EmptyListException extends RuntimeException {

    // constructor
    public EmptyListException() {
        this("List"); // call other EmptyListException constructor
    }
}
