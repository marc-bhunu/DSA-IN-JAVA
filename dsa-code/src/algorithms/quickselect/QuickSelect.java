package algorithms.quickselect;

import java.util.Random;

public class QuickSelect {
    int[] nums;

    public QuickSelect(int[] nums) {
        this.nums = nums;
    }

    public int select(int firstIndex, int lastIndex, int k) {
        return quickSelect(firstIndex, lastIndex, k - 1);
    }

    private int quickSelect(int firstIndex, int lastIndex, int k) {
        int pivotIndex = pivot(firstIndex, lastIndex);
        if (pivotIndex > k) {
            return quickSelect(firstIndex, pivotIndex - 1, k);
        } else if (pivotIndex < k) {
            return quickSelect(pivotIndex + 1, lastIndex, k);
        }
        return nums[pivotIndex];
    }

    private int pivot(int firstIndex, int lastIndex) {
        int pivotIndex = new Random().nextInt(lastIndex - firstIndex + 1) + firstIndex;
        swap(lastIndex, pivotIndex);
        for (int i = firstIndex; i < lastIndex; i++) {
            if (nums[i] < nums[lastIndex]) {
                swap(i, firstIndex);
                firstIndex++;
            }
        }
        swap(lastIndex, firstIndex);
        return firstIndex;
    }

    private void swap(int lastIndex, int pivotIndex) {
        int temp = nums[pivotIndex];
        nums[pivotIndex] = nums[lastIndex];
        nums[lastIndex] = temp;
    }


}
