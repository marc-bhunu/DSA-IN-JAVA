package recursion_kimi.codingbat;

public class DoubleX {
    public static boolean doubleX(String str){
        if (str.length() < 2) return false;
        if (str.startsWith("xx")) {
            return true;
        }else{
        return  doubleX(str.substring(1));
        }
    }
    public static void main(String[] args) {
        System.out.println(doubleX("xpxxpx"));
        System.out.println(doubleX("pdefdxyx"));
        System.out.println(doubleX("pdefdxx"));
    }
}
