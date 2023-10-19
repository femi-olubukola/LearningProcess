package customGenericDataStructures;

// Queue uses class List.

public class Queue {

    private List<T> queueList;

    // constructor
    public Queue() {
        queueList = new List<T>("queue");
    }

    // add object to queue
    public void enqueue(T object) {
        queueList.insertAtBack(object);
    }

    // remove object from queue
    public T dequeue() throws EmptyListException {
        return queueList.removeFromFront();
    }

    // determine if queue is empty
    public boolean isEmpty() {
        return queueList.isEmpty();
    }
}
