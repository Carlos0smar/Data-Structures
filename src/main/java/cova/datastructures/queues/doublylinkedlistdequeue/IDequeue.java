package cova.datastructures.queues.doublylinkedlistdequeue;

public interface IDequeue<E> {
    /**
     * Returns the number of elements in the deque.
     *
     * @return number of elements in the deque
     */
    int size();

    /**
     * Tests whether the deque is empty.
     *
     * @return true if the deque is empty, false if the deque is not empty
     */
    boolean isEmpty();

    /**
     * Inserts an element at the front of the deque.
     *
     * @param e the element to be inserted
     */
    void addFirst(E e);

    /**
     * Inserts an element at the back of the deque.
     *
     * @param e the element to be inserted
     */
    void addLast(E e);

    /**
     * Removes the first element of the deque.
     *
     * @return the element that was removed
     */
    E removeFirst();

    /**
     * Removes the last element of the deque.
     *
     * @return the element that was removed
     */
    E removeLast();

    /**
     * Returns, but does not remove, the first element of the deque.
     *
     * @return the first element of the deque (or null if empty)
     */
    E first();

    /**
     * Returns, but does not remove, the last element of the deque.
     *
     * @return the last element of the deque (or null if empty)
     */
    E last();
}
