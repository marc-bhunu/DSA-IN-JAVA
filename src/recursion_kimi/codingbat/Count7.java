package recursion_kimi.codingbat;

public class Count7 {

    public static int count7(int n){
        if (n == 7) return 1;
        if (n < 10) return  0;
        int countSeven = 0;
        if(n % 10 == 7){
            countSeven++;
        }
        return countSeven + count7(n / 10);
    }
    public static void main(String[] args) {
        System.out.println(count7(717));
        System.out.println(count7(717787787));
        System.out.println(count7(999));
        System.out.println(count7(999098));
    }
}
