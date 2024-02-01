package cova.datastructures.stacks;

public interface IStack <E>{
    int size();
    boolean isEmpty();
    void push(E e);
    E top();
    E pop();

}
