package cova.assignments.towersofhanoi;

import java.util.Scanner;


public class TowersOfHanoi {
    static int paso = 0;


    public static void hanoi(int n, LinkedListStack<Integer> firstRod, LinkedListStack<Integer> thirdRod, LinkedListStack<Integer> secondRod) {
        if (n > 0) {
            // Move n-1 discs from firstRod to secondRod using thirdRod as secondRod
            hanoi(n - 1, firstRod, secondRod, thirdRod);

            // Move the disc n from firstRod to thirdRod
            moveDisc(firstRod, thirdRod, secondRod);

            // Move n-1 discs from secondRod to thirdRod using firstRod as secondRod
            hanoi(n - 1, secondRod, thirdRod, firstRod);
        }
    }


    public static void moveDisc(LinkedListStack<Integer> firstRod, LinkedListStack<Integer> thirdRod, LinkedListStack<Integer> secondRod) {
        int disc = firstRod.pop();
        thirdRod.push(disc);
        paso++;
        System.out.println("Step " + paso + ": Move disc " + disc + " from " + firstRod.getRodName() + " to " + thirdRod.getRodName());
        printRodsStates(firstRod, secondRod, thirdRod);
    }

    public static void printRodsStates(LinkedListStack<Integer> firstRod, LinkedListStack<Integer> secondRod, LinkedListStack<Integer> thirdRod) {

        System.out.println("First Rod");

        if (firstRod.getRodName().equals("First Rod")) {
            firstRod.printRode();

        } else if (secondRod.getRodName().equals("First Rod")) {
            secondRod.printRode();

        } else if (thirdRod.getRodName().equals("First Rod")) {
            thirdRod.printRode();
        }

        System.out.println("------------");

        System.out.println("Second Rod");

        if (firstRod.getRodName().equals("Second Rod")) {
            firstRod.printRode();

        } else if (secondRod.getRodName().equals("Second Rod")) {
            secondRod.printRode();

        } else if (thirdRod.getRodName().equals("Second Rod")) {
            thirdRod.printRode();
        }

        System.out.println("------------");

        System.out.println("Third Rod");

        if (firstRod.getRodName().equals("Third Rod")) {
            firstRod.printRode();

        } else if (secondRod.getRodName().equals("Third Rod")) {
            secondRod.printRode();

        } else if (thirdRod.getRodName().equals("Third Rod")) {
            thirdRod.printRode();
        }

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of discs: ");
        int numDiscs = scanner.nextInt();

        LinkedListStack<Integer> firstRod = new LinkedListStack<>();
        LinkedListStack<Integer> secondRod = new LinkedListStack<>();
        LinkedListStack<Integer> thirdRod = new LinkedListStack<>();

        firstRod.setRodName("First Rod");
        secondRod.setRodName("Second Rod");
        thirdRod.setRodName("Third Rod");

        // Fill the first tower with discs
        for (int i = numDiscs; i > 0; i--) {
            firstRod.push(i);
        }

        // Initial State of the Towers
        System.out.println("Estado inicial de las Torres:");
        printRodsStates(firstRod, secondRod, thirdRod);

        // solve the Towers of Hanoi
        hanoi(numDiscs, firstRod, thirdRod, secondRod);

        // Final State of the Towers
        System.out.println("Estado final de las Torres:");
        printRodsStates(firstRod, secondRod, thirdRod);

        scanner.close();
    }


}
