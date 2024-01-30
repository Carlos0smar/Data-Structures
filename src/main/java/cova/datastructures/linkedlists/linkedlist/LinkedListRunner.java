package cova.datastructures.linkedlists.linkedlist;

import cova.datastructures.interfaces.IRunner;
import cova.datastructures.interfaces.IMenu;
import cova.datastructures.interfaces.IOptions;


import java.util.Scanner;


public class LinkedListRunner implements IRunner, IMenu, IOptions {

    public LinkedList list = new LinkedList();
    boolean exit = false;


    @Override
    public void run() {
        System.out.println("Running Linked List....");

        while (!exit) {

            printMenu();
            int optionValue = inputValue().nextInt();
            options(optionValue);
        }
    }

    @Override
    public void options(int optionValue) {
        int value;

        switch (optionValue) {
            case 1:
                System.out.println("Introduce a number to add at list");
                value = inputValue().nextInt();
                list.addFirst(value);
                break;
            case 2:
                System.out.println("Introduce a number to add at list");
                value = inputValue().nextInt();
                list.addLast(value);
                break;
            case 3:
                list.removeFirst();
                break;
            case 4 :
                list.removeLast();
                break;
            case 5:
                list.print();
                break;
            case 6:
                exit = true;
                break;
        }
    }

    @Override
    public void printMenu() {
        System.out.println("1. Add First");
        System.out.println("2. Add Last");
        System.out.println("3. Remove First");
        System.out.println("4. Remove Last");
        System.out.println("5. Show list");
        System.out.println("6. Exit");

    }


    public Scanner inputValue() {
        return new Scanner(System.in);
    }


}
