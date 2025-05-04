package algorithms.selectionsort;

import java.util.Arrays;

public class SelectionSort {


    public static  void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                swap(arr, i, minIndex);
            }
        }
    }
    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7, 6 ,5, 4, 3, 2, 1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
   }

}
