package nl.han.app.Algorithms;

public class Range {

    int low;
    int high;
    int length;

    public Range(int low, int high) {
        this.low = low;
        this.high = high;
        this.length = high - low + 1;
    }
}
