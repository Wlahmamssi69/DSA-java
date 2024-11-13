package org.example.arrays;

import java.util.Arrays;

public class ArrayInsertion {
    int[] arr;

//
    public ArrayInsertion(int size){
        arr= new int[size];
        for(int i=0;i<size;i++){
            arr[i] = Integer.MIN_VALUE;
        }
        System.out.println(//    Instantiation : create an array ; and allocate memory
                Arrays.toString(arr));
    }
     public void insert(int location , int value){
       try{

           if(arr[location] == Integer.MIN_VALUE){
               arr[location] = value;
               System.out.println("Successfully inserted");
           }else {
               System.out.println("This cell is already occupied!");
           }
           }catch(IndexOutOfBoundsException e){
               System.out.println("Invalid index to access array");
           }

     }

}
