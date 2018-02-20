package nl.han.app.Algorithms;

import nl.han.app.Interfaces.ISort;

public class Quicksort implements ISort {

    private int[] numbers;

    public int[] sort(int[] input) {
        if (input == null || input.length == 0) {
            return input;
        }
        this.numbers = input;
        quickSort(0, input.length - 1);
        return numbers;
    }

    private void quickSort(int low, int high) {
        int pivot = medianOfThree(low, high);
        int i = low, j = high - 1;

        while (i <= j) {
            while (numbers[i] < pivot) {
                i++;
            }
            while (numbers[j] > pivot) {
                j--;
            }
            if (i <= j) {
                swapValues(i, j);
                i++;
                j--;
            }
        }
        // Recursion
        if (low < j) {
            quickSort(low, j);
        }
        if (i < high) {
            quickSort(i, high);
        }
    }

    private int medianOfThree(int low, int high) {
        int middle = (low + high) / 2;

        if (numbers[low] > numbers[middle]) {
            swapValues(low, middle);
        }
        if (numbers[low] > numbers[high]) {
            swapValues(low, high);
        }
        if (numbers[middle] > numbers[high]) {
            swapValues(middle, high);
        }

        swapValues(middle, high - 1);
        return numbers[high - 1];
    }

    private void swapValues(int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }
}
