package recursion_kimi.codingbat;

public class BunnyEars {

    public static int bunnyEars(int n){
        if (n == 0) {
            return  0;
        }
        return 2 + bunnyEars(n -1);
    }

    public static void main(String[] args) {
        System.out.println(bunnyEars(4));
    }
}
