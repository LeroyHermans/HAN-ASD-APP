package nl.han.app.Algorithms;

public class QuickSort<T extends Comparable<T>> extends Sorter<T> {

    public T[] sort(T[] arr) {
        if(arr == null || arr.length == 0){
            return arr;
        }
        return quickSort(arr, new Range(0, arr.length-1));
    }

    private T[] quickSort(T[] arr, Range range) {
        T pivot = arr[range.low+(range.high-range.low)/2];

        int leftIndex = range.low, rightIndex = range.high;

        while(leftIndex <= rightIndex){
            while (arr[leftIndex].compareTo(pivot) < 0){
                leftIndex++;
            }
            while(arr[rightIndex].compareTo(pivot) < 0){
                rightIndex--;
            }
            if(leftIndex <= rightIndex){
                if(arr[leftIndex].compareTo(arr[rightIndex]) != 0){
                    switchValues(arr, leftIndex, rightIndex);

                    leftIndex++;
                    rightIndex--;
                }
            }
        }

        if(range.low < rightIndex){
            quickSort(arr, new Range(range.low, rightIndex));
        }
        if(leftIndex < range.high){
            quickSort(arr, new Range(leftIndex, range.high));
        }

        return arr;
    }

    public String getName() {
        return "Quicksort";
    }
}
