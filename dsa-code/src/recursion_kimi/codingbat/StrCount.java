package recursion_kimi.codingbat;

public class StrCount {
    public static int strCount(String str, String sub){
        if (str.length()  < sub.length()) return  0;
        String firstWord = str.substring(0, sub.length());
        String restOfString = str.substring(sub.length());
        if (firstWord.equals(sub)) {
            return 1 + strCount(restOfString, sub);
        }else{
            return strCount(firstWord.substring(1) +  restOfString, sub);
        }
    }
    public static void main(String[] args) {
        System.out.println(strCount("catcowcat", "cat"));
        System.out.println(strCount("catcowcat", "cow"));
        System.out.println(strCount("catcowcat", "dog"));
        System.out.println(strCount("cacatcowcat", "cat"));
    }
}
