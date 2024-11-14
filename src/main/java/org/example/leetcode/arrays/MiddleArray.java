package org.example.leetcode.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MiddleArray {
    public static void main(String[] args) {
        int [] array = {1,2};
        System.out.println(Arrays.toString(middle(array)));
    }

    public static int[] middle(int[] array){
            // TODO
            int[] myArray = new int[array.length-2];
            for(int i = 0;i<myArray.length;i++){
                myArray[i]= array[i+1];
            }
            return myArray;
        }

}
