package nl.han.app.Graphs.algos;

import nl.han.app.Graphs.EdgeS;
import nl.han.app.Graphs.NodeS;

public class PathNodeInfo {
    public double dist;
    public EdgeS edgeToPrev;
    public NodeS prev;
    public int scratch;
    public boolean isProcessed;

    public PathNodeInfo(){
        reset();
    }

    public void reset() {
        this.dist = -1;
        this.prev = null;
        this.scratch = 0;
        this.isProcessed = false;
        this.edgeToPrev = null;
    }

    @Override
    public String toString() {
        return "PathNodeInfo{" +
                "dist=" + dist +
                ", prev=" + prev +
                ", edgeToPrev=" + edgeToPrev +
                ", scratch=" + scratch +
                ", isProcessed=" + isProcessed +
                "}";
    }
}
