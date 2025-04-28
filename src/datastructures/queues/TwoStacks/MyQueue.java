package datastructures.queues.TwoStacks;

import java.util.Stack;

public class MyQueue {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public MyQueue() {
    }

    public void enqueue(int value) {

        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }

        stack1.push(value);

        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }

    }

    public void printAll(){
        for (int i = stack1.size() -1; i >= 0; i--) {
            System.out.println(stack1.get(i));
        }
    }

    public void dequeue(){
        System.out.println(stack1.pop());
    }

    public void pop(){
        System.out.println(stack1.pop());
    }

     public void peek(){
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());   
    
    }
}
