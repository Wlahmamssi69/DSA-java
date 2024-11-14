package org.example.arrays;

import java.util.Arrays;

public class TwoDimentionArrayCreation {
    public static void main(String[] args) {

//        Step1 : create ref
        int[][] int2DArray;
//        Step2 : Instantiate ;Allocate memory ; in memory 2D array are stored as a linear array
        int2DArray = new int[2][2];
//        Step 3 : Initialization
        int2DArray[0][0] = 10 ;
        int2DArray[0][1] = 20 ;
        int2DArray[1][0] = 30 ;
        int2DArray[1][1] = 40 ;
//        All in One Step
        String [][] s2DArray = {{"A","B"},{"C","D"}};

//        printing 2D Array
        System.out.println(Arrays.deepToString(int2DArray));
        System.out.println(Arrays.deepToString(s2DArray));


    }
}
