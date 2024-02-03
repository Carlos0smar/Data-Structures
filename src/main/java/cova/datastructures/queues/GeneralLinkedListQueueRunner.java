package cova.datastructures.queues;

import cova.datastructures.NullRunner;
import cova.datastructures.interfaces.IRunner;
import cova.datastructures.queues.doublylinkedlistdequeue.DoublyLinkedLIstDequeueRunner;
import cova.datastructures.queues.linkedlistqueue.LinkedListQueue;
import cova.datastructures.queues.linkedlistqueue.LinkedListQueueRunner;

import java.util.Scanner;

public class GeneralLinkedListQueueRunner implements IRunner {
    boolean isRunning = true;
    Scanner scanner = new Scanner(System.in);

    @Override
    public void run() {
        while (isRunning) {
            System.out.println("Choose an option");
            menu();
            int inputValue = scanner.nextInt();
            if (inputValue == 3) {
                isRunning = false;
                break;
            }
            IRunner objectSelected = options(inputValue);
            objectSelected.run();
        }
    }

    public void menu() {
        System.out.println("1. Linked List Queue");
        System.out.println("2. Doubly Linked List Dequeue");
        System.out.println("3. Exit");
    }

    public IRunner options(int inputValue) {
        switch (inputValue) {
            case 1:
                return new LinkedListQueueRunner();
            case 2:
                return new DoublyLinkedLIstDequeueRunner();
            default:
                return new NullRunner();
        }
    }
}
