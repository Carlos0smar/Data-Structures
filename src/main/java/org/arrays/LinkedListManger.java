package org.arrays;

public class LinkedListManger implements IRunner{

    @Override
    public void run() {
        System.out.println("Running Linked List....");
        printMenu();
    }
    @Override
    public void printMenu() {
        System.out.println("Add");
        System.out.println("Remove");
        System.out.println("Search");

    }

}
