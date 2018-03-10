package nl.han.app.Graphs.algos;

import nl.han.app.Graphs.EdgeS;
import nl.han.app.Graphs.GraphS;
import nl.han.app.Graphs.NodeS;
import nl.han.app.Graphs.PathElement;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public abstract class PathFinder {

    protected Map<NodeS, PathNodeInfo> pathInformation = null;
    protected NodeS startNode = null;
    protected GraphS graph;

    public PathFinder(GraphS graph){
        this.graph = graph;
        pathInformation = new HashMap<NodeS, PathNodeInfo>();
    }

    protected void findPath(NodeS start){
        this.startNode = start;
        pathInformation.clear();
    }

    public PathElement[] getPath(NodeS dest) throws PathNotFoundException {
        if(startNode == null){
            throw new IllegalStateException("findPath() not run yet");
        }

        LinkedList<PathElement> elements = new LinkedList<PathElement>();
        elements.add(dest);

        NodeS currentNode = dest;

        while (currentNode != null && currentNode != startNode){
            PathNodeInfo destInfo = getNodeInfo(currentNode);

            if(destInfo.dist == -1){
                throw new PathNotFoundException();
            }

            elements.addFirst(destInfo.edgeToPrev);
            elements.addFirst(destInfo.prev);

            currentNode = destInfo.prev;
        }

        return elements.toArray(new PathElement[elements.size()]);
    }

    public String getPathString(NodeS dest) throws PathNotFoundException{
        PathElement[] path = getPath(dest);

        StringBuilder builder = new StringBuilder();
        for(int i = 0; ; i++){
            if(path[i] instanceof EdgeS){
                builder.append(((EdgeS)path[i]).getCost());
            } else if (path[i] instanceof NodeS){
                builder.append(((NodeS)path[i]).getLabel());
            }
            if(i + 1 == path.length){
                return builder.toString();
            }
            builder.append("->");
        }
    }

    protected PathNodeInfo getNodeInfo(NodeS currentNode) {
        if(pathInformation.containsKey(currentNode)){
            return pathInformation.get(currentNode);
        }
        PathNodeInfo pathNodeInfo = new PathNodeInfo();
        pathInformation.put(currentNode, pathNodeInfo);
        return pathNodeInfo;
    }
}
