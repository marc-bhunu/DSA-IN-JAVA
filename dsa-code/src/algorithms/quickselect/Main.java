package algorithms.quickselect;

public class Main {
    static void main() {
        int[] nums = {10, -1, 55, 10, 8, 1};
        QuickSelect quickSelect = new QuickSelect(nums);
        System.out.println(quickSelect.select(0, nums.length - 1, 2));
    }
}
