package org.example.arrays;

import java.util.Arrays;

public class TwoDimensionArray {
        //declare reference
        int[][] arr = null;

        //Customized constructor
        public TwoDimensionArray(int row,int col){
            arr= new int[row][col];
            for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr[0].length;j++){

                    arr[i][j] = Integer.MIN_VALUE;
                }
            }
            System.out.println(Arrays.deepToString(arr));
        }

        //getter
        public int[][] getArr(){
            return arr;
        }

    //inserting
    public void insert(int row,int col , int value){
        try{
            if(arr[row][col] == Integer.MIN_VALUE){
                arr[row][col]= value;
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
            for(int j =0; j<arr[0].length;j++){
            System.out.print(arr[i][j] + " ");
            }
        }
    }

    //Search in Array
    public void searchIn2DArray(int valueToSearch) {
        //Linear search
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == valueToSearch) {
                    System.out.println("value " + valueToSearch + " is found At the index of :  " + i + " and " + j);
                    return;
                }
            }

        }

        System.out.println("value " + valueToSearch + " is not found");

    }

    //deleting an element : O(1) Time Complexity
    public void deleteAtRowAndColumn(int row,int col){
        try{
            arr[row][col] = Integer.MIN_VALUE;
            System.out.println("value At : "+ row +" row and "+col+" col is deleted successfully");

        }catch (IndexOutOfBoundsException e){
            System.out.println("Index is not accessible ");
        }

    }

}



