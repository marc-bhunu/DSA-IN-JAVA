package datastructures.recursion;

public class StringReversal {
    public static void main(String[] args) {
        System.out.println(reverse("hello mark bhunu"));
    }

    public static String reverse(String input) {
        if (input.equals("") ) {
            return "";
        } else {
            return reverse(input.substring(1)) + input.charAt(0);
        }
    }
}
