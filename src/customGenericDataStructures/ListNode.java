package customGenericDataStructures;

class ListNode<T> {

    // package access members; List can access these directly
    T data; // data for this node
    ListNode<T> nextNode; // reference to the next node in the list


    // constructor creates a ListNode that refers to object
    ListNode(T object) {
        this(object, null);
    }


}
