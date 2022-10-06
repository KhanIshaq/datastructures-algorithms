package com.ishaqkhan.dsa.stack;

import com.ishaqkhan.dsa.DoublyLinkedList;

//Both pushing onto and popping from a Stack is O(1).
public class MyStack {
    private Node top;
    private int height;

    class Node {
        Node next;
        int value;
        Node(int value) {
            this.value = value;
        }
    }

    public MyStack(int value) {
        Node newNode = new Node(value);
        top = newNode;
        height = 1;
    }

    public void printStack() {
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getTop() {
        System.out.println("Top: " + top.value);
    }

    public void getHeight() {
        System.out.println("Height: " + height);
    }

    public void push(int value) {
        Node newNode = new Node(value);
        if(height == 0)
            top = newNode;
        else {
            newNode.next = top;
            top = newNode;
        }
        height++;

    }

    public Node pop() {
        if(height == 0) return null;
        Node temp = top;
        top = top.next;
        temp.next = null;

        height--;
        return temp;
    }
}
