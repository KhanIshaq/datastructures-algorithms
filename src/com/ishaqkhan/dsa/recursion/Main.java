package com.ishaqkhan.dsa.recursion;

public class Main {

    public static void main(String[] args) {
        method1();
    }

    public static void method1() {
        method2();
        System.out.println("one");
    }

    private static void method2() {
        method3();
        System.out.println("two");
    }

    private static void method3() {
        System.out.println("three");
    }
}
