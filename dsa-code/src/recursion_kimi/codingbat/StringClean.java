package recursion_kimi.codingbat;

public class StringClean {
    public static String stringClean(String str) {
        if (str.length() <= 1) return str;
        char firstChar = str.charAt(0);
        String restOfString = str.substring(1);
        if (firstChar == restOfString.charAt(0)) {
            return stringClean(restOfString);
        } else {
            return firstChar + stringClean(restOfString);
        }
    }


    public static void main(String[] args) {
        System.out.println(stringClean("yyzzza"));
        System.out.println(stringClean("abbbcdd"));
        System.out.println(stringClean("Hello"));
    }
}
