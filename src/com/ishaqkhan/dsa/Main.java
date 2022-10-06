package com.ishaqkhan.dsa;

import java.util.HashMap;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        MyLinkedList myLinkedList = new MyLinkedList(6);
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();
        myLinkedList.append(7);
        myLinkedList.append(11);
        myLinkedList.append(13);
        myLinkedList.reverse();
        myLinkedList.printList();
        //Pointers
//
//
//        int num1 = 11;
//        int num2 = num1; // only at the time of initialization
//        //call by value
//        num1 =22;
//        System.out.println("num1 = "+ num1);
//        System.out.println("num2 = "+ num2);
//
//        HashMap<String, Integer> map1 = new HashMap<>();
//        HashMap<String, Integer> map2 = new HashMap<>();
//        HashMap<String, Integer> map3= new HashMap<>();
//
//        map1.put("value", 11);
//        map2 = map1;
//        map1.put("value", 22);
//
//        map3.put("value", 33);
//        map2 = map3;
//        map1 = map2;
//        System.out.println("map1 "+ map1);
//        System.out.println("map2 "+ map2);
//        System.out.println("map3 "+ map3);
//        System.out.println("Hello World!");
        //print2Items(10);
        //print3Items(10);
    }

    /*
     * n + n = 2n simplify to n
     */
    public static void printItems(int n) {

        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
        for (int j = 0; j < n; j++) {
            System.out.println(j);
        }
    }

    //a + b = O(a+b)
    public static void printItems(int a, int b){
        for (int i = 0; i < a; i++) {
            System.out.println(i);
        }
        for (int j = 0; j < b; j++) {
            System.out.println(j);
        }
    }

    /*
     * 1st Case:
     * O(n2)
     * 2nd Case:
     * O(n2 + n) = O(n2) when n get larger then n is negligble
     */
    public static void print2Items(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(i + " " + j);
            }
        }
        for (int k = 0; k < n; k++) {
            System.out.println(k);
        }
    }
/*
 * O(n3) simplify and it becomes O(n2)
 *
 */
    public static void print3Items(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    System.out.println(i + " " + j + " " + k);
                }
            }
        }
    }

    // As n grows the number of operations remains constant in this situation
    public static int addItems(int n){
        //return n + n;
        return n + n + n;
    }



}
