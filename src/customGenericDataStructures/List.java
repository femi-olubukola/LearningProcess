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

    private ListNode<T> firstNode;
    private ListNode<T> lastNode;
    private String name; // string like "list" used in printing

    // constructor creates empty List with "list" as the name
    public List() {
        this("list");
    }

    // constructor creates an empty List with a name
    public List(String listName) {
        name = listName;
        firstNode = lastNode = null;
    }

    // insert item at front of list
    public void insertAtFront(T insertItem) {
        if (isEmpty()) // firstNode and lastNode refer to same object
            firstNode = lastNode = new ListNode<T>(insertItem);
        else // firstNode refers to new node
        firstNode = new ListNode<T>(insertItem, firstNode);
    }

    // insert item at end of list
    public void insertAtBack(T insertItem) {
        if (isEmpty()) // firstNode and lastNode refer to same object
            firstNode = lastNode = new ListNode<T>(insertItem);
        else // lastNode's nextNode refers to new node
        lastNode = lastNode.nextNode = new ListNode<T>(insertItem);
    }

    // remove first node from List
    public T removeFromFront() throws EmptyListException {
        if (isEmpty()) // throw exception if List is empty
            throw new EmptyListException(name);

        T removedItem = firstNode.data; // retrieve data being removed

        // update references firstNode and lastNode
        if (firstNode == lastNode)
            firstNode = lastNode = null;
        else
        firstNode = firstNode.nextNode;

        return removedItem; // return removed node data
    }

}
