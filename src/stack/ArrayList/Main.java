package stack.ArrayList;

public class Main {

    public static void main(String[] args) {
        Stack<Character> stackList = new Stack<Character>();

        stackList.push('a');
        stackList.push('b');
        stackList.push('c');
        stackList.push('d');
        System.out.println(stackList.peek() + " I peeked");
        stackList.pop();
        stackList.printAll();
    }
    
}
