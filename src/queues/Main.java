package queues;

public class Main {

    public static void main(String[] args) {
        Queue queue = new Queue(100);
        queue.enqueue(9000);
        queue.enqueue(2);
        queue.enqueue(400);
        queue.enqueue(600);
        queue.enqueue(230);
        
        queue.printQueue();
        queue.dequeue();

    }
    
}
