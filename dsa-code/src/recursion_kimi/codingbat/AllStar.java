package recursion_kimi.codingbat;

public class AllStar {

    public static String allStar(String str){
        if (str.isEmpty()) return "";
        char firstChar = str.charAt(0);
        String restOfString = str.substring(1);
        if (str.length() == 1) {
            return firstChar + allStar(restOfString);
        }else{
            return  firstChar + "*" + allStar(restOfString);
        }
    }

    public static void main(String[] args) {
        System.out.println(allStar("hello"));
        System.out.println(allStar("abc"));
        System.out.println(allStar("ab"));
    }
}
