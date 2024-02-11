package cova.datastructures.trees;

import cova.datastructures.interfaces.IRunner;
import cova.datastructures.interfaces.IStructuresManager;
import java.util.Scanner;
public class BinaryTreeRunner implements IRunner, IStructuresManager {
    Scanner scanner = new Scanner(System.in);
    boolean isRunning = true;
    BinaryTree tree = new BinaryTree();
    @Override
    public void run() {
        while (isRunning){
            System.out.println("Trees running....");
            System.out.println("Choose an option");
            printMenu();
            int optionSelected = scanner.nextInt();
            options(optionSelected);
        }

    }

    @Override
    public void printMenu() {
        System.out.println("1. Insert");
        System.out.println("2. Search");
        System.out.println("3. Height");
        System.out.println("4. Delete");
        System.out.println("5. InOrder");
        System.out.println("6. PreOrder");
        System.out.println("7. PostOrder");
        System.out.println("8. Size");
        System.out.println("9. Exit");
    }

    @Override
    public void options(int optionSelected) {
        int value;
        switch(optionSelected){
            case 1:
                System.out.println("Introduce the value to insert");
                value = scanner.nextInt();
                tree.insert(value);
                break;
            case 2:
                System.out.println("Introduce the value to search");
                value = scanner.nextInt();
                tree.search(value);
                break;
            case 3:
                System.out.println(tree.height());
                break;
            case 4:
                System.out.println("Introduce the value to delete");
                value = scanner.nextInt();
                tree.delete(value);
                break;
            case 5:
                int[] inOrder = tree.inOrder();
                for (int i = 0; i<inOrder.length; i++){
                    System.out.print(inOrder[i] + " ");
                }
                System.out.println();
                break;
            case 6:
                int[] preOrder = tree.preOrder();
                for (int i = 0; i<preOrder.length; i++){
                    System.out.print(preOrder[i] + " ");
                }
                System.out.println();
                break;
            case 7:
                int[] postOrder = tree.postOrder();
                for (int i = 0; i<postOrder.length; i++){
                    System.out.print(postOrder[i] + " ");
                }
                System.out.println();
                break;
            case 8:
                System.out.println("The size is: " + tree.size());
                break;
            case 9:
                isRunning = false;
                break;
        }

    }
}
