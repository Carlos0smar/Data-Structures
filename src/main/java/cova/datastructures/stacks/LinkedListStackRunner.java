package cova.datastructures.stacks;

import cova.datastructures.interfaces.IRunner;
import cova.datastructures.interfaces.IStructuresManager;

import java.util.Scanner;

public class LinkedListStackRunner implements IRunner, IStructuresManager {
    Scanner scanner = new Scanner(System.in);
    LinkedListStack<Integer> stackList = new LinkedListStack<>();
    boolean isRunning = true;

    @Override
    public void run() {
        while (isRunning) {
            System.out.println("Running Linked List Stack....");
            printMenu();
            System.out.println("Choose an option");
            int optionSelected = scanner.nextInt();
            options(optionSelected);
        }
    }

    @Override
    public void printMenu() {
        System.out.println("1. Push");
        System.out.println("2. Pop");
        System.out.println("3. Top");
        System.out.println("4. Show size");
        System.out.println("5. Show stack");
        System.out.println("6. Exit");
    }

    @Override
    public void options(int optionSelected) {
        int value;
        switch (optionSelected) {
            case 1:
                System.out.println("Introduce a number to add to the stack");
                value = scanner.nextInt();
                stackList.push(value);
                break;
            case 2:
                stackList.pop();
                break;
            case 3:
                System.out.println(stackList.top());
                break;
            case 4:
                System.out.println("The stack size is: " + stackList.size());
                break;
            case 5:
                stackList.print();
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
