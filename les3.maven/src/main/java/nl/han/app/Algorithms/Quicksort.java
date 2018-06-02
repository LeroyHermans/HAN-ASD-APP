package nl.han.app.Algorithms;

public class QuickSort<T extends Comparable<T>> extends Sorter<T> {

    public T[] sort(T[] arr) {
        if (arr == null || arr.length <= 1) {
            return arr;
        }
        return quickSort(arr, 0, arr.length - 1);
    }

    public String getName() {
        return "Quicksort";
    }

    private T[] quickSort(T[] arr, int low, int high) {
        T pivot = medianOfThree(arr, low, high);

        int leftIndex = low, rightIndex = high;

        while (leftIndex <= rightIndex) {
            while (arr[leftIndex].compareTo(pivot) < 0) {
                leftIndex++;
            }
            while (arr[rightIndex].compareTo(pivot) > 0) {
                rightIndex--;
            }
            if (leftIndex <= rightIndex) {
                    switchValues(arr, leftIndex, rightIndex);

                    leftIndex++;
                    rightIndex--;
            }
        }

        if (low < rightIndex) {
            quickSort(arr, low, rightIndex);
        }
        if (leftIndex < high) {
            quickSort(arr, leftIndex, high);
        }

        return arr;
    }


    private T medianOfThree(T[] arr, int low, int high) {
        int middle = (low + high) / 2;

        if (arr[low].compareTo(arr[middle]) > 0) {
            switchValues(arr, low, middle);
        }
        if (arr[low].compareTo(arr[high]) > 0) {
            switchValues(arr, low, high);
        }
        if (arr[middle].compareTo(arr[high]) > 0) {
            switchValues(arr, middle, high);
        }

        switchValues(arr, middle, high - 1);
        return arr[high - 1];
    }
}
