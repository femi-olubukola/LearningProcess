package customGenericDataStructures;

// Class QueueTest.

public class QueueTest {

    public static void main(String[] args) {

        Queue<Integer> queue = new Queue<>();

        // use enqueue method
        queue.enqueue(-1);
        queue.print();
        queue.enqueue(0);
        queue.print();
        queue.enqueue(1);
        queue.print();
        queue.enqueue(5);
        queue.print();

        // remove objects from queue
        try {
            int removedItem;

            while (true) {

                System.out.printf("%n%d dequeued%n", removedItem);

            }
        }
        catch (EmptyListException emptyListException) {
            emptyListException.printStackTrace();
        }
    }
}
