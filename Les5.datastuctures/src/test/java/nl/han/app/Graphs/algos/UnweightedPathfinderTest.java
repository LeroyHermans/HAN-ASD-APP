package nl.han.app.Graphs.algos;

import nl.han.app.Graphs.GraphS;
import org.junit.Test;

import static org.junit.Assert.*;

public class UnweightedPathfinderTest {

    @Test
    public void testFindPath() throws Exception {
        GraphS abcdGrah = new GraphS();

        abcdGrah.addEdge("A", "B", 2);
        abcdGrah.addEdge("B", "C", 2);

        abcdGrah.addEdge("A", "C", 6);

        UnweightedPathfinder finder = new UnweightedPathfinder(abcdGrah);
        finder.findPath(abcdGrah.getNode("A"));

        assertEquals("A->6.0->C", finder.getPathString(abcdGrah.getNode("C")));
    }

    @Test
    public void testFindPathMinimal() throws Exception {
        GraphS abcdGrah = new GraphS();

        abcdGrah.addEdge("A", "B", 3);
        abcdGrah.addEdge("B", "C", 6);
        abcdGrah.addEdge("A", "C", 2);

        UnweightedPathfinder finder = new UnweightedPathfinder(abcdGrah);
        finder.findPath(abcdGrah.getNode("A"));

        assertEquals("A->2.0->C", finder.getPathString(abcdGrah.getNode("C")));
    }

    @Test
    public void testFindPathHuge() throws Exception {
        GraphS abcdGrah = new GraphS();

        abcdGrah.addEdge("A", "B", 1);
        abcdGrah.addEdge("B", "C", 2);
        abcdGrah.addEdge("C", "D", 3);
        abcdGrah.addEdge("D", "E", 4);
        abcdGrah.addEdge("E", "F", 5);
        abcdGrah.addEdge("F", "G", 6);
        abcdGrah.addEdge("A", "D", 100);
        abcdGrah.addEdge("D", "F", 6);
        abcdGrah.addEdge("F", "D", 7);
        abcdGrah.addEdge("B", "A", 9);
        abcdGrah.addEdge("C", "F", 9);

        UnweightedPathfinder finder = new UnweightedPathfinder(abcdGrah);
        finder.findPath(abcdGrah.getNode("A"));

        assertEquals("A->100.0->D->6.0->F", finder.getPathString(abcdGrah.getNode("F")));
    }

    @Test(expected = PathNotFoundException.class)
    public void testFindPathNotFound() throws Exception {
        GraphS abcdGrah = new GraphS();

        abcdGrah.addEdge("A", "B", 3);
        abcdGrah.addEdge("B", "C", 6);
        abcdGrah.addEdge("D", "E", 2);

        UnweightedPathfinder finder = new UnweightedPathfinder(abcdGrah);
        finder.findPath(abcdGrah.getNode("A"));

        finder.getPathString(abcdGrah.getNode("E"));
    }
}