package org.example.arrays;

import java.util.Arrays;

public class SingleDimensionArray {
    //declare reference
    int[] arr = null;

//instantiation
    public SingleDimensionArray(int size){
        arr= new int[size];
        for(int i=0;i<size;i++){
            arr[i] = Integer.MIN_VALUE;
        }
        System.out.println(//    Instantiation : create an array ; and allocate memory
                Arrays.toString(arr));
    }

    //getter
    public int[] getArr(){
        return arr;
    }
 //inserting
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


     //Array Traversal
    public void traverse(){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    //Search in Array
    public void searchInArray(int valueToSearch){
        //Linear search
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == valueToSearch){
                System.out.println("value " + valueToSearch + " is found At the index of :  "+i);
                return;
            }
        }
        System.out.println("value " + valueToSearch + " is not found");

    }

    //deleting an element : O(1) Time Complexity
    public void deleteAtIndex(int valueToDeleteIndex){
        try{
            arr[valueToDeleteIndex] = Integer.MIN_VALUE;

        }catch (IndexOutOfBoundsException e){
            System.out.println("Index is not accessible ");
        }

    }
}
