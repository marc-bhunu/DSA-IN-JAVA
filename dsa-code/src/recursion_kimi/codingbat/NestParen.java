package recursion_kimi.codingbat;

public class NestParen {
    public static boolean nestParen(String str) {
        if(str.isEmpty())return true;
        char firstChar = str.charAt(0);
        char lastChar = str.charAt(str.length() - 1);
        if (firstChar == '(' && lastChar == ')') {
            return nestParen(str.substring(1, str.length() - 1));
        }
        return  false;
    }

    public static void main(String[] args) {
        System.out.println(nestParen("(())"));
        System.out.println(nestParen("(((x))"));
        System.out.println(nestParen("((()))"));
    }
}
