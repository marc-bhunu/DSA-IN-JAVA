package recursion_kimi.codingbat;

public class ParentBit {
    public static String parentBit(String str) {
        if (str.charAt(0) != '(') {
            return parentBit(str.substring(1));
        }
        if (str.charAt(str.length() - 1) != ')') {
            return parentBit(str.substring(0, str.length() - 1));
        }
        return  str;
    }


    public static void main(String[] args) {
        System.out.println(parentBit("xyz(abc)123"));
    }
}
