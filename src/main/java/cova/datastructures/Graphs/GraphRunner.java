package cova.datastructures.Graphs;

import cova.datastructures.interfaces.IRunner;
import cova.datastructures.interfaces.IStructuresManager;
import java.util.Scanner;
public class GraphRunner implements IRunner, IStructuresManager {
    boolean isRunning = true;
    Scanner scanner = new Scanner(System.in);

    Graph graph = new Graph();
    @Override
    public void run() {
        while (isRunning) {
            System.out.println("Running Graph....");
            printMenu();
            int optionSelected = scanner.nextInt();
            options(optionSelected);
        }
    }

    @Override
    public void printMenu() {
        System.out.println("1. Add Node");
        System.out.println("2. Add Edge");
        System.out.println("3. Check Edge");
        System.out.println("4. print Graph");
        System.out.println("5. Exit");
    }

    @Override
    public void options(int optionSelected) {
        int src;
        int dest;
        switch (optionSelected) {
            case 1:
                System.out.println("Introduce a node to add to the graph");
                String nodeValue = scanner.next();
                Node node = new Node(nodeValue);
                graph.addNode(node);
                break;
            case 2:
                System.out.println("Introduce a source node");
                src = scanner.nextInt();

                System.out.println("Introduce a destination node");
                dest = scanner.nextInt();

                graph.addEdge(src, dest);
                break;
            case 3:
                System.out.println("Introduce a source node");
                src = scanner.nextInt();

                System.out.println("Introduce a destination node");
                dest = scanner.nextInt();

                graph.checkEdge(src, dest);
                break;
            case 4:
                graph.print();
                break;
            case 5:
                isRunning = false;
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
    }
}
