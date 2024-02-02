package cova.datastructures.queues;

import cova.datastructures.interfaces.IRunner;
import cova.datastructures.interfaces.IStructuresManager;
import java.util.Scanner;

public class DoublyLinkedLIstDequeueRunner implements IRunner, IStructuresManager {
    private DoublyLinkedListDequeue<Integer> dequeue = new DoublyLinkedListDequeue<>();
    Scanner scanner = new Scanner(System.in);
    boolean isRunning = true;


    @Override
    public void run() {
        while (isRunning) {
            System.out.println("Dequeue is running.... ");
            System.out.println("Choose an option");
            printMenu();
            int optionSelected = scanner.nextInt();
            options(optionSelected);
        }
    }

    @Override
    public void printMenu() {
        System.out.println("1. Add First");
        System.out.println("2. Add Last");
        System.out.println("3. Remove First");
        System.out.println("4. Remove Last");
        System.out.println("5. Show First");
        System.out.println("6. Show Last");
        System.out.println("7. Size");
        System.out.println("8. Print Dequeue");
        System.out.println("9. Exit");
    }

    @Override
    public void options(int optionSelected) {
        int value;
        switch (optionSelected) {
            case 1:
                System.out.println("Enter the value to add");
                value = scanner.nextInt();
                dequeue.addFirst(value);
                break;
            case 2:
                System.out.println("Enter the value to add");
                value = scanner.nextInt();
                dequeue.addLast(value);
                break;
            case 3:
                System.out.println("The value removed is: " + dequeue.removeFirst());
                break;
            case 4:
                System.out.println("The value removed is: " + dequeue.removeLast());
                break;
            case 5:
                System.out.println("The first value is: " + dequeue.first());
                break;
            case 6:
                System.out.println("The last value is: " + dequeue.last());
                break;
            case 7:
                System.out.println("The size is: " + dequeue.size());
                break;
            case 8:
                dequeue.print();
                break;
            case 9:
                isRunning = false;
                break;
        }
    }
}
