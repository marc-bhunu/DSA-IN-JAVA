package recursion_kimi.codingbat;

public class CountX {

    public static int countX(String str) {
        if (str.isEmpty()) {
            return 0;
        }
        char firstChar = str.charAt(0);
        int count = 0;
        String restOfString = str.substring(1);
        if (firstChar == 'x') {
            count = 1 + countX(restOfString);
        } else {
            count = countX(restOfString);
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(countX("xivx"));
        System.out.println(countX("xixxx"));
        System.out.println(countX("hihi"));
    }

}
