package org.example.leetcode.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

//O(n) Time complexity , O(n) space complexity
public class MiddleArray {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,10,8};
        System.out.println(Arrays.toString(middle(array))); // ========> O(1) Time Complexity
    }


    public static int[] middle(int[] array){
            // TODO
            int[] myArray = new int[array.length-2]; // ========> O(n) Space complexity
            for(int i = 0;i<myArray.length;i++){ // ========> O(n) TC
                myArray[i]= array[i+1];
            }
            return myArray;
        }

}
