package datastructures.recursion;

public class DecimalToBinary {
    public static void main(String[] args) {
        System.out.println(decimalToBinary(240, ""));
    }

    static String decimalToBinary(int decimal, String result) {
        if (decimal == 0) {
            return result;
        }
        result = decimal % 2 + result;
        return decimalToBinary(decimal / 2, result);
    }
}
