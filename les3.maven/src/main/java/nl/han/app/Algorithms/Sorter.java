package nl.han.app.Algorithms;

import nl.han.app.Interfaces.ISorter;

public abstract class Sorter<T extends Comparable<T>> implements ISorter<T>{

    public abstract T[] sort(T[] arr);
    public abstract String getName();

    protected <T> T[] switchValues(T[] array, int index1, int index2){
        T tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
        return array;
    }
}
