package algorithms.bubblesort;

import java.util.Arrays;

public class BubbleSrt {

    private static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                System.out.println("j = " + j);
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }

            }
        }
    }
    public static void main(String[] args) {
        int[] array = new int[] { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
}
