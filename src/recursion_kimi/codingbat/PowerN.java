package recursion_kimi.codingbat;

public class PowerN {

    public static int powerN(int base, int n){
        if (n == 1) return  base;
        return base * powerN(base, n -1);
    }

    public static void main(String[] args) {
        System.out.println(powerN(4, 3));
    }

}
