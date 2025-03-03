package stack;


public class Main {
   public static void main(String[] args) {
    Stack stack = new Stack(34);
    stack.push(4);
    stack.push(88);
    stack.push(90);
    System.out.println("I got poped "+ stack.pop().value);

    stack.printStack();
   }
}
