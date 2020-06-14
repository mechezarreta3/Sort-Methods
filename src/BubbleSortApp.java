public class BubbleSortApp {
    public static int[] bubbleSortArray(int[] integerArray) {
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

        return integerArray;
    }
}
