package cova.datastructures.linkedlists;

import cova.datastructures.NullRunner;
import cova.datastructures.interfaces.IRunner;
import cova.datastructures.linkedlists.doublylinkedlist.DoublyLinkedListRunner;
import cova.datastructures.linkedlists.linkedlist.LinkedListRunner;
import java.util.Scanner;


public class GeneralLinkedListsRunner implements IRunner{
    boolean isRunning = true;
    Scanner scanner= new Scanner(System.in);
    @Override
    public void run() {
        while (isRunning){
            printMenu();
            int optionSelected = scanner.nextInt();
            if (optionSelected == 3){
                isRunning = false;
                break;
            }
            IRunner runner = options(optionSelected);
            runner.run();
        }

    }


    public void printMenu() {
        System.out.println("1. Singly Linked List");
        System.out.println("2. Doubly Linked List");
        System.out.println("3. Exit");
    }


    public static IRunner options(int optionSelected) {
        switch (optionSelected) {
            case 1:
                return new LinkedListRunner();
            case 2:
                return new DoublyLinkedListRunner<>();
            default:
                return new NullRunner();
        }
    }
}
