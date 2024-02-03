package cova.datastructures.queues.linkedlistqueue;

import cova.datastructures.interfaces.IRunner;
import cova.datastructures.interfaces.IStructuresManager;
import java.util.Scanner;
public class LinkedListQueueRunner implements IRunner, IStructuresManager {
    Scanner scanner = new Scanner(System.in);
    LinkedListQueue<Integer> linkedListQueue = new LinkedListQueue<>();
    boolean isRunning = true;
    @Override
    public void run() {
        while (isRunning){
            System.out.println("Choose an option");
            printMenu();
            int optionChosen = scanner.nextInt();
            options(optionChosen);
        }
    }

    @Override
    public void printMenu() {
        System.out.println("1. Enqueue");
        System.out.println("2. First");
        System.out.println("3. Size");
        System.out.println("4. Dequeue");
        System.out.println("5. Print Queue");
        System.out.println("6. Exit");
    }

    @Override
    public void options(int optionSelected) {
        int value;
        switch (optionSelected) {
            case 1:
                System.out.println("Enter a number");
                value = scanner.nextInt();
                linkedListQueue.enqueue(value);
                break;
            case 2:
                System.out.println("The first element is: " + linkedListQueue.first());
                break;
            case 3:
                System.out.println("The size of the queue is: " + linkedListQueue.size());
                break;
            case 4:
                System.out.println("The element " + linkedListQueue.dequeue() + " was deleted");
                break;
            case 5:
                linkedListQueue.printQueue();
                break;
            case 6:
                isRunning = false;
                break;
            default:
                System.out.println("Invalid option");
                break;
        }

    }
}
