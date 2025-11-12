package recursion_kimi.codingbat;

public class CountHi {

    public static  int countHi(String str){
        if (str.length() < 2) return 0;
        int count = 0;
        String firstHi = str.substring(0, 2);
        String restOfString = str.substring(1);

        if ( firstHi.equals("hi")) {
            count = 1 + countHi(restOfString);
        }else{
            count = countHi(restOfString);
        }
        return  count;
    }
    public static void main(String[] args) {
        System.out.println(countHi("hjjhiyuhi"));
        System.out.println(countHi(""));
        System.out.println(countHi("xcxhi"));
    }
}
