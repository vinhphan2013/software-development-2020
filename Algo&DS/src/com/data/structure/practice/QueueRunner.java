package com.data.structure.practice;

public class QueueRunner {
    public static void main(String args[]) {
        Queue queue = new Queue();
        queue.enqueue(5);
        queue.enqueue(4);
        queue.enqueue(3);
        queue.enqueue(2);
        queue.enqueue(1);
        System.out.print("Original queue -> ");
        queue.show();
        System.out.println();

        queue.dequeue();
        System.out.print("After removed ");
        queue.show();
        System.out.println();
        queue.dequeue();
        System.out.print("After removed ");
        queue.show();
        System.out.println();

        queue.enqueue(20);
        queue.enqueue(21);
        queue.enqueue(22);
        queue.show();
        System.out.println("This is the size: " + queue.getSize());
    }
}
