package linkedliststests;

import cova.datastructures.linkedlists.linkedlist.ILinkedList;
import cova.datastructures.linkedlists.linkedlist.LinkedList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LinkedLIstTests {

    // Testing the size of the list

    // Empty list
    @Test
    public void onInitSizeIsZero() {
        ILinkedList list = new LinkedList();
        Assertions.assertEquals(0, list.size());
    }

    // List with one element
    @Test
    public void onAddFirstSizeIsOne() {
        ILinkedList list = new LinkedList();
        list.addFirst(1);
        Assertions.assertEquals(1, list.size());
    }

    // List with a deleted element
    @Test
    public void onRemoveFirstSizeIsZero() {
        ILinkedList list = new LinkedList();
        list.addFirst(1);
        list.removeFirst();
        Assertions.assertEquals(0, list.size());
    }


    // Testing if the list is empty

    // list with no elements
    @Test
    public void onInitIsEmpty() {
        ILinkedList list = new LinkedList();
        Assertions.assertTrue(list.isEmpty());
    }

    //list with one element
    @Test
    public void onAddFirstIsNotEmpty() {
        ILinkedList list = new LinkedList();
        list.addFirst(1);
        Assertions.assertFalse(list.isEmpty());
    }

    //list with one element removed
    @Test
    public void onRemoveFirstIsEmpty() {
        ILinkedList list = new LinkedList();
        list.addFirst(1);
        list.removeFirst();
        Assertions.assertTrue(list.isEmpty());
    }

    // Testing the first element of the list
    @Test
    public void onAddFirstFirstIsOne() {
        ILinkedList list = new LinkedList();
        list.addFirst(1);
        Assertions.assertEquals(1, list.first().data);
    }

    //Testing the last element of the list
    @Test
    public void onAddTwoElementsLastIsTwo() {
        ILinkedList list = new LinkedList();
        list.addFirst(1);
        list.addLast(2);
        Assertions.assertEquals(2, list.last().data);
    }

    //Testing removal of first element
    @Test
    public void onRemovalOfFirstElement() {
        ILinkedList list = new LinkedList();
        list.addFirst(1);
        list.addLast(2);
        list.removeFirst();
        Assertions.assertNotEquals(1, list.first().data);

    }

    //Testing removal of first element
    @Test
    public void onRemovalOfLastElement(){
        ILinkedList list = new LinkedList();
        list.addFirst(1);
        list.addLast(2);
        list.addLast(3);
        list.removeLast();
        Assertions.assertNotEquals(3, list.last().data);
    }
}
