package recursion_kimi.codingbat;

public class StrCopies {

    public static boolean strCopies(String str, String sub, int n){
        if (n == 0)return  true;
        if (str.length() < sub.length())return false;
        String firstWord = str.substring(0, sub.length());
        String restOfString = str.substring(sub.length());
        if (firstWord.equals(sub)) {
            return  strCopies(firstWord.substring(1) + restOfString, sub, n-1);
        }else{
            return strCopies(firstWord.substring(1) +  restOfString, sub, n);
        }
    }
    public static void main(String[] args) {
        System.out.println(strCopies("catcowcat", "cat", 2));
        System.out.println(strCopies("catcowcat", "cow", 2));
        System.out.println(strCopies("catcowcat", "cow", 1));
    }
}
