package nl.han.app.Graphs;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GraphSTest {


    /**
     *     -> C
     *   A      -> D
     *     -> B
     */
    private GraphS abcdGraph;

    /**
     *     -> C
     *   A      -> D  <- E
     *     -> B
     *  /\
     *  |
     *  F
     */
    private GraphS abcdefGraph;

    /**
     *    a -> b
     *
     *    q
     */
    private GraphS abqGraph;

    @Before
    public void SetUp(){
        abcdGraph = new GraphS();
        abcdGraph.addEdge("A", "B", 3);
        abcdGraph.addEdge("B", "D", 6);
        abcdGraph.addEdge("A", "C", 6);
        abcdGraph.addEdge("C", "D", 2);

        abcdefGraph = new GraphS();
        abcdefGraph.addEdge("A", "B", 3);
        abcdefGraph.addEdge("B", "D", 6);
        abcdefGraph.addEdge("A", "C", 6);
        abcdefGraph.addEdge("C", "D", 2);
        abcdefGraph.addEdge("F", "A", 5);
        abcdefGraph.addEdge("E", "D", 4);

        abqGraph = new GraphS();
        abqGraph.addEdge("A", "B", 10);
        abqGraph.getAndAddNode("Q");
    }

    @Test
    public void testIsConnectedStrong(){
        assertTrue(abcdGraph.isConnected());
    }

    @Test
    public void testIsConnectedWeak() {
        assertTrue(abcdefGraph.isConnected());
    }

    @Test
    public void testIsConnectedNot(){
        assertFalse(abqGraph.isConnected());
    }
}