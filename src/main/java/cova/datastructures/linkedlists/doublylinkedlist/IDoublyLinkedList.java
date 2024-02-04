package cova.datastructures.linkedlists.doublylinkedlist;

public interface IDoublyLinkedList<E> {
    /**
     * Returns the number of elements in the list
     *
     * @return the number of elements in the list
     */
    int size();

    /**
     * Tests whether the list is empty
     *
     * @return true if the list is empty and false if the list is not empty
     */
    boolean isEmpty();

    /**
     * Returns but does not remove the first element of the list
     *
     * @return the first element of the list
     */
    E first();

    /**
     * Returns but does not remove the last element of the list
     *
     * @return the last element of the list
     */
    E last();

    /**
     * Adds an element to the front of the list
     *
     * @param e is the element to be added
     */
    void addFirst(E e);

    /**
     * Adds an element to the end of the list
     *
     * @param e is the element to be added
     */
    void addLast(E e);

    /**
     * Removes the first element from the list
     */
    void removeFirst();

    /**
     * Removes the last element from the list
     */
    void removeLast();

}
