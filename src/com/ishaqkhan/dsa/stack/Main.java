package com.ishaqkhan.dsa.stack;

public class Main {

    public static void main(String[] args) {
        MyStack myStack = new MyStack(4);
        myStack.getTop();
        myStack.getHeight();

        myStack.push(7);
        myStack.push(10);
        myStack.push(22);
        myStack.printStack();
        myStack.pop();
        myStack.printStack();
    }
}
