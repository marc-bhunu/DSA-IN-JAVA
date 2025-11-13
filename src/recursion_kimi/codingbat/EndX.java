package recursion_kimi.codingbat;

public class EndX {

    public static String endX(String str){
        if (str.length() == 1) return str;
        char firstChar = str.charAt(0);
        String restOfString = str.substring(1);
        if (firstChar == 'x') {
            return endX(restOfString) + firstChar;
        }else{
            return firstChar + endX(restOfString);
        }
    }


    public static void main(String[] args) {
        System.out.println(endX("xxre"));
        System.out.println(endX("xxhixx"));
        System.out.println(endX("xhixhix"));
    }
}
