package recursion_kimi.codingbat;

public class Count8 {
    public static int count8(int n ){
        if (n == 0) return  0;
        int lastDigit = n % 10;
        int nextDigit = (n / 10) % 10;
        if (lastDigit == 8) {
            if (nextDigit == 8) {
                return  2 + count8(n / 10);
            }else{
                return 1 + count8(n / 10);
            }
        }else{
            return count8(n / 10);
        }

    }
    public static void main(String[] args) {
        System.out.println(count8(8888));
        System.out.println(count8(12388));
    }
}
