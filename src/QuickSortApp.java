public class QuickSortApp {
    public static void quickSort(int[] array, int low, int high)
    {
        if (array.length != 1)
        {
            int p = partition(array, low, high);

            // Recursively sort elements before
            // partition and after partition
            quickSort(array, low, p);
            quickSort(array, p + 1, high;
        }
    }
}
