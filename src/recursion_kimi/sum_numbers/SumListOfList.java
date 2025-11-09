package recursion_kimi.sum_numbers;

import java.util.ArrayList;
import java.util.List;

public class SumListOfList {

    public static int sumNums(List<List<Integer>> lists, int[] size, int[] sum){
        if(size[0] == 0){
            return sum[0];
        }
        List<Integer> currentList = lists.get(lists.size() - size[0]);
        for(int num : currentList){
            sum[0] += num;
        }
        size[0]--;
        return sumNums(lists, size, sum);
    }

    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(List.of(1,2,3,4,5));
        list.add(List.of(5,4,5));
        list.add(List.of());
        int [] size = {list.size()};
        int[] sum = {0};
        System.out.println(sumNums(list, size, sum));
    }
}
