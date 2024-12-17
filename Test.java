import dataStructures.Queue;
import dataStructures.Stack;

public class Test {
    public static void main(String[] args) {
        // Stack operations
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        System.out.println("Popped from stack: " + stack.pop());

        // Queue operations
        Queue queue = new Queue();
        queue.enqueue(100);
        queue.enqueue(200);
        System.out.println("Dequeued from queue: " + queue.dequeue());
    }
}
