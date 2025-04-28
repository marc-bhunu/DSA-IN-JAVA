package datastructures.queues.TwoStacks;

public class Main {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.enqueue(3);
        myQueue.enqueue(4);
        myQueue.enqueue(44);

        myQueue.printAll();
    }
}
