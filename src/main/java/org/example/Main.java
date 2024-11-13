package org.example;

import org.example.arrays.ArrayInsertion;

public class Main {
    public static void main(String[] args) {
        ArrayInsertion arr =new ArrayInsertion(10);
        //insertion
        arr.insert(1,9);
        arr.insert(2,2);
        arr.insert(10,9);
        arr.insert(2,3);
        arr.insert(3,4);
        //traversing
        System.out.println("Array Traversal");
        arr.traverse();
        //search an element
        System.out.println("Search an element in Array");
        arr.searchInArray(4);
        arr.searchInArray(0);

    }
}