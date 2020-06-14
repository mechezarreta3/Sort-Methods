public class MergeSortApp {
    /**
     * Recursize method that takes in an array as a parameter.
     * If the array has a size of 1 or less, it returns the array.
     * Otherwise, it divides the array into two arrays, and uses a helper method that takes two arrays as arguments. The
     * two arrays are passed into mergeSort, and the returned result is passed to the helper method.
     * @param a: This is the original array passed to the method.
     * @return : returns an array of size 1, or returns two arrays, passed through mergeSort, and then merged.
     */
    public static int[] mergeSortArray(int[] a){
        //arraySize is used to store the size of the array
        int arraySize = a.length;

        //Recursive method base condition: if arraySize is less than or = 1, return array
        if (arraySize <= 1) {
            return a;
        }

        //Create new int array variables
        //The size of the new arrays equate to the size of the original array
        int[] b = new int[arraySize/2];
        int[] c = new int[arraySize - b.length];

        //fill array b with first half of original array
        for (int i = 0; i < b.length; i++) {
            b[i] = a[i];
        }

        //fill array c with the second half of original array
        for (int i = 0; i < c.length; i++) {
            c[i] = a[i + b.length];
        }

        //merge the arrays returned by mergeSort(b) and mergeSort(c)
        return mergeArray(mergeSortArray(b), mergeSortArray(c));
    }
}
