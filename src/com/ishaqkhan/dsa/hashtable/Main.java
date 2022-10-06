package com.ishaqkhan.dsa.hashtable;

public class Main {
    public static void main(String[] args) {
        HashTable myHashTable = new HashTable();
        myHashTable.printTable();

        myHashTable.set("ball", 100);
        myHashTable.set("bat", 200);
        myHashTable.set("wicket", 300);
        myHashTable.set("bails", 400);
        myHashTable.set("grass", 500);
        myHashTable.printTable();
        System.out.println(myHashTable.get("grass"));
        System.out.println(myHashTable.get("board"));
        System.out.println(myHashTable.keys().toString());
    }
}
