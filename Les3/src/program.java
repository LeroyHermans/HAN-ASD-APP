public class program {

    public static void main(String[] args) {
        int[] arrayToMergeSort = new int[]{3, 1, 14, 6, 18, 45, 20, 66};
        Mergesort mergsSorter = new Mergesort();
        mergsSorter.sort(arrayToMergeSort);
        printArray(arrayToMergeSort);

        System.out.println("");

        int[] arrayToInsertionSort = new int[]{3, 1, 14, 6, 18, 45, 20, 66};
        int[] insertionSortOutput = Insertionsort.doInsertionSort(arrayToInsertionSort);
        printArray(insertionSortOutput);

        System.out.println("");

        int[] arrayToQuickSort = new int[]{3, 1, 14, 6, 18, 45, 20, 66};
        Quicksort quickSorter = new Quicksort();
        quickSorter.sort(arrayToQuickSort);
        printArray(arrayToQuickSort);
    }

    private static void printArray(int[] arrayToPrint) {
        for (int i = 0; i < arrayToPrint.length; i++) {
            System.out.println(arrayToPrint[i]);
        }
    }
}
