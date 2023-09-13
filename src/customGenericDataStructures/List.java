package customGenericDataStructures;

// ListNode and List class declarations.

class ListNode<T> {

    // package access members; List can access these directly
    T data; // data for this node
    ListNode<T> nextNode; // reference to the next node in the list


    // constructor creates a ListNode that refers to object
    ListNode(T object) {
        this(object, null);
    }

    // constructor creates ListNode that refers to the specified object and to the next ListNode
    ListNode(T object, ListNode<T> node) {
        data = object;
        nextNode = node;
    }

    // return reference to data in node
    T getData() {
        return data;
    }

    // return reference to next node in list
    ListNode<T> getNext() {
        return nextNode;
    }
}

public class List<T> {

}
