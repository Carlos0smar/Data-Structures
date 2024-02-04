package cova.datastructures.linkedlists.linkedlist;


public interface ILinkedList {
    /**
     * Returns the number of elements in the list
     *
     * @return the nunmber of elements in the list
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
    Node first();

    /**
     * Returns but does not remove the last element of the list
     *
     * @return the last element of the list
     */
    Node last();

    /**
     * Adds an element to the front of the list
     *
     * @param data is the element to be added
     */
    void addFirst(int data);

    /**
     * Adds an element to the end of the list
     *
     * @param data is the element to be added
     */
    void addLast(int data);

    /**
     * Removes the first element from the list
     */
    void removeFirst();

    /**
     * Removes the last element from the list
     */
    void removeLast();
}
