package recursion_kimi.codingbat;

public class Count11 {
    public static int count11(String str){
        if(str.length() < 2) return 0;
        String first11 = str.substring(0, 2);
        String restOfString  = str.substring(2);
        if (first11.equals("11")) {
            return  1 + count11(restOfString);
        }else{
            return   count11(first11.substring(1) +  restOfString);
        }
    }
    public static void main(String[] args) {
        System.out.println(count11("11abc11"));
        System.out.println(count11("abc11x11x11"));
        System.out.println(count11("111"));
    }
}
