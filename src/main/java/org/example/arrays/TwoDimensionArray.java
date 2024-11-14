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



}



