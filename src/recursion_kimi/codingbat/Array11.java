package recursion_kimi.codingbat;

public class Array11 {
    public  static int array11(int[] nums,int index){
        int result;
        if (index > nums.length-1) return 0;
        if (nums[index] == 11) {
            result  = 1 + array11(nums, index + 1);
        }else{
            result = array11(nums, index + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 11};
        int[] nums2 = {11, 11};
        int[] nums3 = {1, 2, 3, 4};
        System.out.println(array11(nums,0));
        System.out.println(array11(nums2,0));
        System.out.println(array11(nums3,0));
    }
}
