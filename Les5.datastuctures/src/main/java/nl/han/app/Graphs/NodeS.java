package nl.han.app.Graphs;

import java.util.ArrayList;
import java.util.List;

public class NodeS extends PathElement {

    public List<EdgeS> neighbours;
    private String label;

    public NodeS (String label){
        this.label = label;
        neighbours = new ArrayList<EdgeS>();
    }

    public void addNeigbour(EdgeS edge){
        if(this.neighbours.contains(edge)){
            return;
        }
        neighbours.add(edge);
    }

    public boolean containsNeigbour(EdgeS other){
        return this.neighbours.contains(other);
    }

    public EdgeS getNeigbour(int index){
        return this.neighbours.get(index);
    }

    EdgeS removeNeighbor(int index){
        return this.neighbours.remove(index);
    }

    public void removeNeighbor(EdgeS edge){
        this.neighbours.remove(edge);
    }

    public int getNeighborCount(){
        return this.neighbours.size();
    }

    public String getLabel(){
        return this.label;
    }

    @Override
    public String toString() {
        return "Node{" +
                "name=" + label +
                ", adj=" + neighbours +
                "}";
    }

}
