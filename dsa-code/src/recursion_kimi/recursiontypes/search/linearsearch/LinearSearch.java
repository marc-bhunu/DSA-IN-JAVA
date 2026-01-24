package recursion_kimi.recursiontypes.search.linearsearch;

public class LinearSearch {

    static int iterative_search(int[] container, int item){
        for (int i = 0; i < container.length; i++) {
            if (container[i] == item) {
                return i;
            }
        }
        return  -1;
    }

    static int recursive_search(int[] container, int item){
        return helper(0, container, item);
    }

    private static int helper(int i, int[] container, int item) {
        if (i == container.length) return  - 1;
        if (container[i] == item) return i;
        return helper( i + 1, container, item);
    }


    static void main() {
        System.out.println(iterative_search(new int[]{1, 2, 3}, 3));
        System.out.println(recursive_search(new int[]{1, 2, 3}, 3));
    }
}
