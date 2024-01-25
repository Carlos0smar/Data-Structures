package org.arrays;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inputObject = new Scanner(System.in);
        //print menu
        menu();
        //input value
        System.out.println("Introduce a number");
        int response = inputObject.nextInt();

        IRunner runnerObject = RunnerFactory.getRunner(response);

        runnerObject.run();

    }


    public static void menu() {
        System.out.println("1. LinkedList");
        System.out.println("2. Stacks");
        System.out.println("3. Queues");
        System.out.println("4. Trees");
        System.out.println("5. Graphs");
        System.out.println("6. 1 Sorting");
        System.out.println("7. 2 Sorting");
        System.out.println("8. 3 Sorting");
    }
}