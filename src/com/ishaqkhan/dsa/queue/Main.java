package com.ishaqkhan.dsa.queue;

public class Main {

    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue(6);
        myQueue.enqueue(3);
        myQueue.getFirst();
        myQueue.getLast();
        myQueue.getLength();
        myQueue.printQueue();

        System.out.println(myQueue.dequeue().value);
        System.out.println(myQueue.dequeue().value);
        System.out.println(myQueue.dequeue());
    }
}
