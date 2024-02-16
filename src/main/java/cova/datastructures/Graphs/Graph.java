package cova.datastructures.Graphs;

import java.util.ArrayList;
import java.util.LinkedList;

public class Graph {
    ArrayList<LinkedList<Node>> alist;

    public Graph() {
        alist = new ArrayList<>();
    }
    public Graph(int v) {
        alist = new ArrayList<>();
    }
    public void addNode(Node node) {
        LinkedList<Node> currentList = new LinkedList<>();
        currentList.add(node);
        alist.add(currentList);
    }

    public void addEdge(int src, int dest) {
        LinkedList<Node> currentList = alist.get(src);
        Node detNode = alist.get(dest).get(0);
        currentList.add(detNode);
    }

    public boolean checkEdge(int src, int dest) {
        LinkedList<Node> currentList = alist.get(src);
        Node detNode = alist.get(dest).get(0);

        for(Node node : currentList) {
            if(node.equals(detNode)) {
                return true;
            }
        }
        return false;
    }

    public Node[] getNodes() {
        Node[] nodes = new Node[alist.size()];
        for(int i = 0; i < alist.size(); i++) {
            nodes[i] = alist.get(i).get(0);
        }
        return nodes;
    }

    public void print() {
        for(LinkedList<Node> currentList : alist) {
            for(Node node : currentList) {
                System.out.print(node.data + " -> ");
            }
            System.out.println();
        }
    }
}
