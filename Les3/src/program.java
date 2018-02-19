public class program {

    public static void main(String[] args) {
        int[] arrayToSort = new int[]{3,1,14,6,18,45,20,66};
        Mergesort sorter = new Mergesort();
        sorter.sort(arrayToSort);
        printArray(arrayToSort);
    }

    private static void printArray(int[] arrayToPrint){
        for(int i = 0; i < arrayToPrint.length; i++){
            System.out.println(arrayToPrint[i]);
        }
    }
}
