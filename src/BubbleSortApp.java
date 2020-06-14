import java.util.Arrays;

public class BubbleSortApp {
    public static void bubbleSortArray(int[] integerArray) {
        int temp;

        for(int i = 0; i < integerArray.length; i++) {
            for(int j = 1; j < integerArray.length - i; j++) {
                if (integerArray[j] < integerArray[j - 1]) {
                    temp = integerArray[j];
                    integerArray[j] = integerArray[j - 1];
                    integerArray[j - 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        //Array used for testing that sort method worked successfully
        int[] testArray = { 1, 2, 3, 3, 2, 1 };

        //Purpose: Display initial testArray to the screen, using System.out.println and Arrays.toString method
        System.out.println("Initial Array:\n" + Arrays.toString(testArray));

        //Sort testArray using bubble sort method
        bubbleSortArray(testArray);

        ////Purpose: Display initial testArray to the screen, using System.out.println and Arrays.toString method
        System.out.println("\nSorted Array:\n" + Arrays.toString(testArray));
    }
}
