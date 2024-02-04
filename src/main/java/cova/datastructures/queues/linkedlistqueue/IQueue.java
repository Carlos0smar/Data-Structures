package cova.datastructures.queues.linkedlistqueue;

public interface IQueue<E> {

    /**
     * Returns the number of elements in the queue.
     *
     * @return number of elements in the queue
     */
    int size();

    /**
     * Tests whether the queue is empty.
     *
     * @return true if the queue is empty, false if the queue is not empty
     */
    boolean isEmpty();

    /**
     * Inserts an element at the end of the queue.
     *
     * @param e the element to be inserted
     */
    void enqueue(E e);

    /**
     * Removes the first element of the queue.
     *
     * @return the element that was removed
     */
    E dequeue();

    /**
     * Returns, but does not remove, the first element of the queue.
     *
     * @return the first element of the queue (or null if empty)
     */
    E first();

    /**
     * Prints the queue
     */
    void printQueue();
}
