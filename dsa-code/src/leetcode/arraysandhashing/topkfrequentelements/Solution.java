package leetcode.arraysandhashing.topkfrequentelements;

import java.util.*;

public class Solution {

    public int[] topKFrequent(int[] nums, int k) {
        if (nums.length == k) return nums;

        Map<Integer, Integer> map = new HashMap<>();
        for (int num: nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        Queue<Integer> minHeap = new PriorityQueue<>((n1, n2) -> map.get(n1)  - map.get(n2));
        for (Map.Entry<Integer, Integer> entry: map.entrySet()){
            minHeap.add(entry.getKey());
            if (minHeap.size()  > k) minHeap.remove();
        }

        int[] result = new int[k];
        for (int i = 0; i < k; i++){
            result[i] = minHeap.remove();
        }

        return result;
    }
}
