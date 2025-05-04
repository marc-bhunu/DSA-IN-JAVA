package algorithms.insertionsort;


import java.util.Arrays;

public class InsertionSort {

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp  = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > temp) {
                array[j+1] = array[j];
                array[j] = temp;
                j--;
            }
            System.out.println(Arrays.toString(array));
        }
    }
    public static void main(String[] args) {
        insertionSort(new int[]{5, 4, 3, 2, 1});

    }
}
