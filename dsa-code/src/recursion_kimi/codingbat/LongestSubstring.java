package recursion_kimi.codingbat;

public class LongestSubstring {
    static int strDist(String str, String sub){
        if (str.length() < sub.length()) {
            return 0;
        }
        if (str.startsWith(sub) && str.endsWith(sub)) {
            return str.length();
        }
        if (!str.startsWith(sub)) {
            return strDist(str.substring(1), sub);
        }
        if (!str.endsWith(sub)) {
            return strDist(str.substring(0, str.length() - 1), sub);
        }

        return  0;
    }

    public static void main(String[] args) {
        System.out.println(strDist("catcowcat", "cat"));
        System.out.println(strDist("catcowcat", "cow"));
        System.out.println(strDist("catcowcat", "cow"));
    }
}
