package algorithms.maxSumMinSum;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Solution {

    public int[] maxMinSum(int k, int[] arr){
        int[] result = new int[2];
        int maxTotal = 0;
        int minTotal = 0;
        Queue<Integer> minHeap = new PriorityQueue<>();
        Queue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int num: arr) {
            maxHeap.add(num);
            minHeap.add(num);
        }

        while(k != 0){
            k--;
            maxHeap.poll();
            minHeap.poll();
        }

        for (int num: maxHeap){
            maxTotal = maxTotal + num;
        }
        for (int num: minHeap){
            minTotal = minTotal + num;
        }

        result[1] = maxTotal;
        result[0] = minTotal;

        return result;
    }
}
