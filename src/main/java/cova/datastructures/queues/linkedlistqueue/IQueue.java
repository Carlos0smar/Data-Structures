package cova.datastructures.queues.linkedlistqueue;

public interface IQueue<E> {
    int size();
    boolean isEmpty();
    void enqueue(E e);
    E dequeue();
    E first();
    void printQueue();
}
