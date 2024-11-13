package org.example;

import org.example.arrays.ArrayInsertion;

public class Main {
    public static void main(String[] args) {
        ArrayInsertion arr =new ArrayInsertion(10);
        arr.insert(1,9);
        arr.insert(2,9);
        arr.insert(10,9);
        arr.insert(2,9);
        arr.insert(3,9);
    }
}