package cova.assignments.towersofhanoi;

public class Main {
    static String large = "#############";
    static String medium = "  #######";
    static String small = "    ####";

    static LinkedListStack<String> firstRod = new LinkedListStack<>();
    static LinkedListStack<String> secondRod = new LinkedListStack<>();
    static LinkedListStack<String> thirdRod = new LinkedListStack<>();

    public static void main(String[] args) {

        // start
        System.out.println("Start");
        firstRod.push(large);
        firstRod.push(medium);
        firstRod.push(small);

        printRods();

        //first step

        System.out.println("first step");

        thirdRod.push(firstRod.pop());

        printRods();

        //second step
        System.out.println("second step");
        secondRod.push(firstRod.pop());

        printRods();

        //third step
        System.out.println("third step");
        secondRod.push(thirdRod.pop());

        printRods();

        //fourth step
        System.out.println("fourth step");
        thirdRod.push(firstRod.pop());
        printRods();

        //fifth step
        System.out.println("fifth step");
        firstRod.push(secondRod.pop());
        printRods();

        //sixth step
        System.out.println("sixth step");
        thirdRod.push(secondRod.pop());
        printRods();

        //seventh step
        System.out.println("seventh step");
        thirdRod.push(firstRod.pop());
        printRods();

    }

    public static void printRods() {
        System.out.println("***********");
        firstRod.printRode();
        System.out.println("----------");
        secondRod.printRode();
        System.out.println("----------");
        thirdRod.printRode();
        System.out.println("***********");
    }

}
