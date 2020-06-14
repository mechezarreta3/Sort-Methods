import java.util.Arrays;

public class QuickSortApp {

    public static void quickSortArray(int[] array) {
        int lowIdx = 0;
        int highIdx = array.length - 1;
        quickSortArray(array, lowIdx, highIdx);
    }

    public static void quickSortArray(int[] array, int low, int high) {
        if (low < high) {
            int p = partition(array, low, high);

            // Recursively sort elements before pivot point
            // and after pivot point
            quickSortArray(array, low, p);
            quickSortArray(array, p + 1, high);
        }
    }

    public static int partition(int[] array, int low, int high) {
        int pivotIdx = low;

        for (int i = low + 1; i <= high; i++) {
            if(array[i] < array[low]) {
                pivotIdx++;
                int temp = array[i];
                array[i] = array[pivotIdx];
                array[pivotIdx] = temp;
            }
        }
        int temp = array[low];
        array[low] = array[pivotIdx];
        array[pivotIdx] = temp;

        return pivotIdx;
    }

    public static void main(String[] args) {
        //Array used for testing that sort method worked successfully
        int[] testArray = { 1, 2, 3, 3, 2, 1 };

        //Display initial testArray to the screen, using System.out.println and Arrays.toString method
        System.out.println("Initial Array:\n" + Arrays.toString(testArray));

        //Sort testArray using quick sort method
        quickSortArray(testArray);

        //Display sorted testArray to the screen, using System.out.println and Arrays.toString method
        System.out.println("\nSorted Array:\n" + Arrays.toString(testArray));
    }
}
