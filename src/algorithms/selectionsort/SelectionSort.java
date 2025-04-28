package algorithms.selectionsort;

import java.util.Arrays;

public class SelectionSort {


   public static void selectionSort(int[] array) {
       int n = array.length;
       for (int i = 0; i <  n - 1; i++) {
           int minIndex = i;
           for (int j =  i + 1; j < n; j++) {
               if (array[j] < array[minIndex]) {
                   minIndex = j;
               }
           }
           if (minIndex != i) {
               int temp = array[minIndex];
                array[minIndex] = array[i];
                array[i] = temp;
           }
       }
   }

    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7, 6 ,5, 4, 3, 2, 1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
   }

}
