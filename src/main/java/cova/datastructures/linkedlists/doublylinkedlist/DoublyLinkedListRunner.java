package cova.datastructures.linkedlists.doublylinkedlist;

import cova.datastructures.interfaces.IStructuresManager;
import cova.datastructures.interfaces.IRunner;

import java.util.Scanner;


public class DoublyLinkedListRunner<T> implements IRunner, IStructuresManager {

    public DoublyLinkedList<Integer> doublyList = new DoublyLinkedList<>();
    public boolean exit = false;
    @Override
    public void run() {
        System.out.println("Running Doubly Linked List....");

        while (!exit) {
            printMenu();
            int optionValue = inputValue().nextInt();
            options(optionValue);
        }
    }

    @Override
    public void printMenu() {
        System.out.println("1. Add first");
        System.out.println("2. Add last");
        System.out.println("3. Remove first");
        System.out.println("4. Remove last");
        System.out.println("5. Print list");
        System.out.println("6. Exit");

    }

    @Override
    public void options(int optionSelected) {
        int value;
        switch (optionSelected){
            case 1:
                System.out.println("Introduce a number to add to the list");
                value = inputValue().nextInt();
                doublyList.addFirst(value);
                break;
            case 2:
                System.out.println("Introduce a number to add to the list");
                value = inputValue().nextInt();
                doublyList.addLast(value);
                break;
            case 3:
                doublyList.removeFirst();
                break;
            case 4:
                doublyList.removeLast();
                break;
            case 5:
                doublyList.printList();
                break;
            case 6:
                exit = true;
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
    }

    public Scanner inputValue() {
        return new Scanner(System.in);
    }

}
