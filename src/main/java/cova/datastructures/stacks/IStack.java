package cova.datastructures.stacks;

public interface IStack<E> {
    /**
     * Returns the number of elements in the stack.
     *
     * @return number of elements in the stack
     */
    int size();

    /**
     * Tests whether the stack is empty.
     *
     * @return true if the stack is empty, false if the stack is not empty
     */
    boolean isEmpty();

    /**
     * Inserts an element at the top of the stack.
     *
     * @param e the element to be inserted
     */
    void push(E e);

    /**
     * Removes the top element of the stack.
     *
     * @return the element that was removed
     */
    E pop();

    /**
     * Returns, but does not remove, the element at the top of the stack.
     *
     * @return top element of the stack (or null if empty)
     */
    E top();


}
