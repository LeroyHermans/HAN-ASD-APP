package nl.han.app.Algorithms;

public class MergeSort<T extends Comparable<T>> extends Sorter<T> {


    public T[] sort(T[] arr) {
        if (arr == null || arr.length == 0) {
            return arr;
        }
        mergeSort(arr, new Range(0, arr.length - 1));
        return arr;
    }

    private void mergeSort(T[] arr, Range range) {
        if (range.length <= 1) {
            return;
        }
        if (range.length == 2) {
            // There are only two elements, switch them if necessary and return.
            if (arr[range.low].compareTo(arr[range.high]) > 0) {
                switchValues(arr, range.low, range.high);
            }
            return;
        }

        // split the array in two.
        Range leftSide = new Range(range.low, range.low + range.length / 2);
        Range rightSide = new Range(range.low + range.length / 2 + 1, range.high);

        // recursion.
        mergeSort(arr, leftSide);
        mergeSort(arr, rightSide);

        // merge.
        merge(arr, leftSide, rightSide);
    }

    private void merge(T[] arr, Range left, Range right) {
        Object[] helper = new Object[left.length + right.length];

        int leftIndex = 0, rightIndex = 0;

        for (int i = 0; i < helper.length; i++) {
            if (leftIndex >= left.length) { // Left is empty. Take from right.
                helper[i] = arr[right.low + rightIndex];
                rightIndex++;
            } else if (rightIndex >= right.length) { // Right is empty. Take from left.
                helper[i] = arr[left.low + leftIndex];
                leftIndex++;
            } else if (arr[left.low + leftIndex].compareTo(arr[right.low + rightIndex]) <= 0) { // Left is lowest. Take from left.
                helper[i] = arr[left.low + leftIndex];
                leftIndex++;
            } else { // Right is lowest. Take from Right.
                helper[i] = arr[right.low + rightIndex];
                rightIndex++;
            }
        }

        for (int i = 0; i < helper.length; i++) {
            arr[left.low + i] = (T) helper[i];
        }
    }

    public String getName() {
        return "Mergesort";
    }
}

