public class QuickSortApp {
    public static void quickSortArray(int[] array, int low, int high) {
        if (array.length != 1) {
            int p = partition(array, low, high);

            // Recursively sort elements before pivot point
            // and after pivot point
            quickSortArray(array, low, p);
            quickSortArray(array, p + 1, high);
        }
    }

    public static int partition(int[] array, int low, int high) {
        int p = low;
        int temp;

        for (int i = low + 1; i < high; i++) {
            if(array[i] < array[low]) {
                p++;
                temp = array[i];
                array[i] = array[low];
                array[low] = temp;
            }
        }
        temp = array[low];
        array[low] = array[p];
        array[p] = temp;

        return p;
    }
}
