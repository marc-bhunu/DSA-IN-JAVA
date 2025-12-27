package recursion_kimi.codingbat;

public class CountHi2 {

    public static int countHi2(String str) {
        if (str.length() < 2) return 0;
        if (str.startsWith("xhi") ) {
            return countHi2(str.substring(3));
        }
        if (str.startsWith("hi")) {
            return  1 + countHi2(str.substring(2));
        }
        return countHi2(str.substring(1));
    }
    public static void main(String[] args) {
        System.out.println(countHi2("ahixhi"));
        System.out.println(countHi2("ahibhi"));
        System.out.println(countHi2("xhixhi"));
    }
}
