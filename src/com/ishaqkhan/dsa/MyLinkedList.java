package com.ishaqkhan.dsa;

public class MyLinkedList {
    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;
        Node(int value) {
            this.value = value;
        }
    }

    public MyLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList() {
        Node temp = head;
        while(temp != null) {
            System.out.println("" + temp.value);
            temp = temp.next;
        }
    }

    public void getHead() {
        System.out.println("Head : "+ head.value);
    }

    public void getTail() {
        System.out.println("Tail : "+ tail.value);
    }

    public void getLength() {
        System.out.println("Length : "+ length);
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if(length == 0) { // head == null && tail == null
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public Node remove(int index) {
        if(index < 0 || index >= length)
            return null;
        if(index == 0)
            return removeFirst();
        if(index == length - 1)
            return removeLast();

        Node prev = get(index-1); // O(n)
        Node temp = prev.next; // O(1)
        prev.next = temp.next;
        temp.next = null;
        length--;
        return temp;
    }

    public Node removeFirst() {
        if(length == 0)
            return null;
        Node temp = head;
        head = temp.next;
        temp.next = null;
        length--;
        if(length == 0)
            tail = null;
        return temp;
    }

    public Node removeLast() {
        if(length == 0)
            return null;
        Node temp = head;
        Node prev = head;
        while(temp.next != null) {
            prev = temp;
            temp = temp.next;
        }
        tail = prev;
        tail.next = null;
        length--;
        if(length == 0) {
            head = null;
            tail = null;
        }
        return tail;
    }

    public void reverse() {
        Node temp = head;
        head = tail;
        tail = temp;

        Node after = temp.next;
        Node before = null;

        for(int i = 0;i<length; i++) {
            after = temp.next;
            temp.next = before; // will point to null
            before = temp;
            temp = after;
        }
    }

    public Node get(int index) {
        if (index < 0 || index >= length) return null;
        Node temp = head;
        for(int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public boolean set(int index, int value) {
        Node temp = get(index);
        if(temp != null){
            temp.value = value;
            return true;
        }
        return false;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }
}
