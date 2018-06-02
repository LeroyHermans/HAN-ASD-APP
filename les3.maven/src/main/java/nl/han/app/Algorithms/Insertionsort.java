package nl.han.app.Algorithms;

public class InsertionSort<T extends Comparable<T>> extends Sorter<T> {

    @Override
    public T[] sort(T[] arr) {
        if (arr == null || arr.length <= 1) {
            return arr;
        }

        for (int pointer = 1; pointer < arr.length; pointer++) {
            if (arr[pointer].compareTo(arr[pointer - 1]) < 0) {
                for (int subpointer = pointer; subpointer > 0; subpointer--) {
                    if (arr[subpointer].compareTo(arr[subpointer - 1]) < 0) {
                        switchValues(arr, subpointer, subpointer - 1);
                    } else {
                        break;
                    }
                }
            }
        }
        return arr;
    }

    @Override
    public String getName() {
        return "InsertionSort";
    }

}