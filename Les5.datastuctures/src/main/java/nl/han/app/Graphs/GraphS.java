package nl.han.app.Graphs;

import nl.han.app.Graphs.Interfaces.IGraphS;

import java.util.*;

public class GraphS implements IGraphS {

    protected Map<String, NodeS> nodes = new HashMap<String, NodeS>();

    public NodeS getAndAddNode(String name){
        NodeS node = nodes.get(name);
        if (node == null) {
            node = new NodeS(name);
            nodes.put(name, node);
        }
        return node;
    }

    public NodeS getNode(String nodeName) {
        NodeS node = nodes.get(nodeName);
        if (node == null) {
            throw new NoSuchElementException("Start node not found");
        }
        return node;
    }

    public int getNodeCount() {
        return nodes.size();
    }

    public void addEdge(String source, String dest, double cost) {
        NodeS start = getAndAddNode(source);
        NodeS end = getAndAddNode(dest);
        start.addNeigbour(new EdgeS(end, cost));
    }

    public boolean isConnected() {
        if (nodes.size() <= 1) {
            return true;
        }
        Collection<NodeS> connectedNodes = new ArrayList<NodeS>();
        connectedNodes.add((NodeS) nodes.values().toArray()[0]);

        boolean addedOne;
        do {
            addedOne = false;
            for (NodeS checkingNode : nodes.values()) {
                for (EdgeS edge : checkingNode.neighbours) {
                    //if you fall in the group of connected nodes,
                    //add all the nodes that are referenced by it
                    if (connectedNodes.contains(checkingNode)) {
                        if (!connectedNodes.contains(edge.getTo())) {
                            connectedNodes.add(edge.getTo());
                            addedOne = true;
                        }
                    } else {
                        //go through all the connected nodes
                        //and see if there is an node that the current
                        //edge references. So yes, add it
                        for (NodeS connectedNode : connectedNodes) {
                            if (edge.getTo() == connectedNode) {
                                if (!connectedNodes.contains(checkingNode)) {
                                    connectedNodes.add(checkingNode);
                                    addedOne = true;
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        } while (addedOne);

        return connectedNodes.size() == nodes.size();
    }

}
