package cova.assignments.towersofhanoi;

public interface IList<E> {
    int size();
    boolean isEmpty();
    void push(E e);
    E top();
    E pop();

}
