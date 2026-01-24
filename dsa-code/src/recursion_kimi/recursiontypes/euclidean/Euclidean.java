package recursion_kimi.recursiontypes.euclidean;


//if b divide a  == 0 then gcd(a, b) = b;
//otherwise gcd(a, b) = (b, a mod b);
//assume that a >= b
public class Euclidean {
    static int gcd(int a, int b){
        if (a % b == 0) {
            return b ;
        }else{
            return gcd(b, a % b);
        }
    }

    static  int gcd_recursive(int a, int b){
        while(b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    static void main() {
        System.out.println(gcd(1071, 462));
        System.out.println(gcd_recursive(1071, 462));
    }
}
