package org.example;

import org.example.arrays.SingleDimensionArray;
import org.example.arrays.TwoDimensionArray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        1D Array Ops
        SingleDimensionArray arr =new SingleDimensionArray(10);
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

        //search an element
        System.out.println("Delete an element in Array");
        arr.deleteAtIndex(2);
        System.out.println("Array after deleting element at index 2 : ");
        System.out.println(arr.getArr()[2]);




//    2D Array Ops
        System.out.println("-------------- 2D ARRAYS ----------------");
        TwoDimensionArray twoDArray = new TwoDimensionArray(2,2);

        //inserting
        twoDArray.insert(1,0,20);
        twoDArray.insert(1,0,10);
        twoDArray.insert(2,0,20);
        //2D traverse
        System.out.println("Array traversal");
        twoDArray.traverse();
        //2D search
        System.out.println("Array search");
        twoDArray.searchIn2DArray(20);
        //2D traverse
        System.out.println("Delete a given value");
        twoDArray.deleteAtRowAndColumn(1,0);

        System.out.println("----printing the 2D Array");
        System.out.println(Arrays.deepToString(twoDArray.getArr()));
    }


}
