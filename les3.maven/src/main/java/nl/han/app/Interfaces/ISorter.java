package nl.han.app.Interfaces;

public interface ISorter<T extends Comparable<T>> {

    T[] sort(T[] arr);
}
