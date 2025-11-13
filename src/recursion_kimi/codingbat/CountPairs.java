package recursion_kimi.codingbat;

public class CountPairs {

    public static int countPairs(String str) {
        if (str.length() < 3) return 0;
        String firstPair = str.substring(0, 3);
        String restOfString = str.substring(1);
        if (firstPair.charAt(0) == firstPair.charAt(2)) {
             return  1 + countPairs(restOfString);
        }else{
             return countPairs(restOfString);
        }
    }
    public static void main(String[] args) {
        System.out.println(countPairs("axa"));
        System.out.println(countPairs("axax"));
        System.out.println(countPairs("axbx"));
        System.out.println(countPairs("AxAxA"));
    }
}
