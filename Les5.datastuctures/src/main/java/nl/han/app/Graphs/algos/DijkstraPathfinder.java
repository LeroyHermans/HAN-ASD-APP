package nl.han.app.Graphs.algos;

import nl.han.app.Graphs.EdgeS;
import nl.han.app.Graphs.GraphS;
import nl.han.app.Graphs.NodeS;

import java.util.PriorityQueue;

public class DijkstraPathfinder extends PathFinder {

    public DijkstraPathfinder(GraphS graph) {
        super(graph);
    }

    @Override
    protected void findPath(NodeS start){
        super.findPath(start);
        PriorityQueue<EdgeS> toVisitEdges = new PriorityQueue<EdgeS>();

        int nodesSeen = 0;
        NodeS currentNode = start;
        do{
            PathNodeInfo currentNodeInfo = getNodeInfo(currentNode);
            if(currentNodeInfo.isProcessed){
                continue;
            }

            currentNodeInfo.isProcessed = true;
            nodesSeen++;

            for(EdgeS edge : currentNode.neighbours){
                NodeS neighbour = edge.getTo();
                PathNodeInfo neigbourInfo = getNodeInfo(neighbour);

                if(edge.getCost() < 0){
                    throw new IllegalStateException("Graph has negative edges");
                }

                if(neigbourInfo.dist == -1 || currentNodeInfo.dist + edge.getCost() < neigbourInfo.dist){
                    neigbourInfo.dist = currentNodeInfo.dist + edge.getCost();
                    neigbourInfo.prev = currentNode;
                    neigbourInfo.edgeToPrev = edge;
                    toVisitEdges.add(new EdgeS(neighbour, neigbourInfo.dist));
                }
            }
        }while (!toVisitEdges.isEmpty() && (currentNode = toVisitEdges.remove().getTo()) != null && nodesSeen < graph.getNodeCount());
    }
}
