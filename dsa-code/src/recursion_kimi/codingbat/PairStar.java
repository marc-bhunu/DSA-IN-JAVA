package recursion_kimi.codingbat;

public class PairStar {

    public static  String  pairStar(String str){
        if (str.length() == 0) return "";
        if (str.length() == 1) return str.substring(0);
        char firstChar = str.charAt(0);
        String restOfString = str.substring(1);
        if (firstChar == restOfString.charAt(0)) {
           return String.valueOf(firstChar)  + "*" + pairStar(restOfString);
        }else{
            return String.valueOf(firstChar) + pairStar(restOfString);
        }
    }
    public static void main(String[] args) {
        System.out.println(pairStar("hello"));
        System.out.println(pairStar("xxyy"));
        System.out.println(pairStar("aaaa"));
        System.out.println(pairStar(""));
    }
}
