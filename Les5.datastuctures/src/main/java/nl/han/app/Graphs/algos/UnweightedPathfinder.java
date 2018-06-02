package nl.han.app.Graphs.algos;

import nl.han.app.Graphs.EdgeS;
import nl.han.app.Graphs.GraphS;
import nl.han.app.Graphs.NodeS;

import java.util.LinkedList;
import java.util.Queue;

public class UnweightedPathfinder extends PathFinder {

    public UnweightedPathfinder(GraphS graph) {
        super(graph);
    }

    @Override
    protected void findPath(NodeS start){
        super.findPath(start);

        Queue<NodeS> q = new LinkedList<NodeS>();
        NodeS currentNode = start;
        do{
            PathNodeInfo currentNodeInfo = getNodeInfo(currentNode);
            for(EdgeS edge : currentNode.neighbours){
                NodeS neigbour = edge.getTo();
                PathNodeInfo neigbourInfo = getNodeInfo(neigbour);

                if(neigbourInfo.dist == -1){
                    neigbourInfo.dist = currentNodeInfo.dist + 1;
                    neigbourInfo.edgeToPrev = edge;
                    neigbourInfo.prev = currentNode;
                    q.add(neigbour);
                }
            }
        } while (!q.isEmpty() && (currentNode = q.remove()) != null);
    }
}
