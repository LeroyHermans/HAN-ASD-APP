package nl.han.app.Graphs;

public class EdgeS extends PathElement implements Comparable<EdgeS> {

    private NodeS to;
    private double cost;

    public EdgeS(NodeS to){
        this.to = to;
        this.cost = 0d;
    }

    public EdgeS(NodeS to, double cost){
        this.to = to;
        this.cost = cost;
    }

    public NodeS getTo() {
        return to;
    }

    public double getCost() {
        return cost;
    }

    public int compareTo(EdgeS other) {
        return Double.compare(cost, other.getCost());
    }

    @Override
    public String toString(){
        return "Edge{" +
                "dest=" + to +
                ", cost=" + cost +
                "}";
    }
}
