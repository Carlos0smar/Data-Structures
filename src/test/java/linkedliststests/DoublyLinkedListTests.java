package linkedliststests;

import cova.datastructures.linkedlists.doublylinkedlist.DoublyLinkedList;
import cova.datastructures.linkedlists.doublylinkedlist.IDoublyLinkedList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DoublyLinkedListTests {

    // Testing the size of the list

    // Empty list
    @Test
    public void onInitSizeIsZero() {
        IDoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        Assertions.assertEquals(0, list.size());
    }

    // List with one element
    @Test
    public void onAddFirstSizeIsOne() {
        IDoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.addFirst(1);
        Assertions.assertEquals(1, list.size());
    }

    // List with a deleted element
    @Test
    public void onRemoveFirstSizeIsZero() {
        IDoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.addFirst(1);
        list.removeFirst();
        Assertions.assertEquals(0, list.size());
    }


    // Testing if the list is empty

    // list with no elements
    @Test
    public void onInitIsEmpty() {
        IDoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        Assertions.assertTrue(list.isEmpty());
    }

    //list with one element
    @Test
    public void onAddFirstIsNotEmpty() {
        IDoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.addFirst(1);
        Assertions.assertFalse(list.isEmpty());
    }

    //list with one element removed
    @Test
    public void onRemoveFirstIsEmpty() {
        IDoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.addFirst(1);
        list.removeFirst();
        Assertions.assertTrue(list.isEmpty());
    }

    // Testing the first element of the list
    @Test
    public void onAddFirstFirstIsOne() {
        IDoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.addFirst(1);
        Assertions.assertEquals(1, list.first());
    }

    //Testing the last element of the list
    @Test
    public void onAddTwoElementsLastIsTwo() {
        IDoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.addFirst(1);
        list.addLast(2);
        Assertions.assertEquals(2, list.last());
    }

    //Testing removal of first element
    @Test
    public void onRemovalOfFirstElement() {
        IDoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.addFirst(1);
        list.addLast(2);
        list.removeFirst();
        Assertions.assertNotEquals(1, list.first());

    }

    //Testing removal of first element
    @Test
    public void onRemovalOfLastElement(){
        IDoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.addFirst(1);
        list.addLast(2);
        list.addLast(3);
        list.removeLast();
        Assertions.assertNotEquals(3, list.last());
    }
}
