package recursion_kimi.codingbat;

public class Array6 {

    public  static boolean array6(int[] nums, int index){
        if (index > nums.length - 1) return  false;
        boolean result = false;
        if (nums[index] == 6){
            result = true;
        }else{
           result = array6(nums, index + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr ={1,6,4};
        int[] arr2 ={1,66,4, 33,2, 6};
        int[] arr4 ={6};
        int[] arr3 ={1,10,4};
        System.out.println(array6(arr, 0));
        System.out.println(array6(arr2, 0));
        System.out.println(array6(arr3, 0));
        System.out.println(array6(arr4, 0));
    }
}
