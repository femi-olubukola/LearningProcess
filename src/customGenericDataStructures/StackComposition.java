package customGenericDataStructures;

// StackComposition uses a composed List object.

public class StackComposition<T> {

    private List<T> stackList;

    // constructor
    public StackComposition() {
        stackList = new List<T>("stack");
    }

}
