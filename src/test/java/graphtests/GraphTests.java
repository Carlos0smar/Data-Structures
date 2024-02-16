package graphtests;

import cova.datastructures.Graphs.Graph;
import cova.datastructures.Graphs.Node;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GraphTests {

    Graph graph = new Graph();

    @Test
    public void testOnAddNodes() {
        Node nodeA = new Node("A");
        Node nodeB = new Node("B");
        Node nodeC = new Node("C");
        Node nodeD = new Node("D");

        graph.addNode(nodeA);
        graph.addNode(nodeB);
        graph.addNode(nodeC);
        graph.addNode(nodeD);

        String[] expectedNodes = {"A", "B", "C", "D"};

        Node[] nodesReturned = graph.getNodes();

        String[] nodesValues= new String[4];

        for(int i = 0; i < nodesReturned.length; i++){
            nodesValues[i] = nodesReturned[i].data;
        }

        Assertions.assertArrayEquals(expectedNodes, nodesValues);

    }

    @Test
    public void testOnAddEdgges(){
        // source 0
        Node nodeA = new Node("A");
        // source 1
        Node nodeB = new Node("B");
        // source 2
        Node nodeC = new Node("C");
        // source 3
        Node nodeD = new Node("D");

        graph.addNode(nodeA);
        graph.addNode(nodeB);
        graph.addNode(nodeC);
        graph.addNode(nodeD);

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(0, 2);
        graph.addEdge(2, 0);
        graph.addEdge(1, 3);

        Assertions.assertTrue(graph.checkEdge(0, 1));
        Assertions.assertTrue(graph.checkEdge(1, 2));
        Assertions.assertTrue(graph.checkEdge(0, 2));
        Assertions.assertTrue(graph.checkEdge(2, 0));
        Assertions.assertTrue(graph.checkEdge(1, 3));

    }
}
