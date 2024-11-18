package org.example.leetcode.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MaxProduct {
    public static void main(String[] args) {
        int[] arr={30,20,40,60,20,80};
        System.out.println(Arrays.toString(maxProduct(arr)));
    }

    public static String[] maxProduct(int[] intArray) {
        // TODO
        int max=intArray[0];
        int maxBis=0;
        for(int i=0;i<intArray.length;i++){
            if(intArray[i]>max){
                maxBis = max;
                max = intArray[i];
            }
        }
        return new String[]{Integer.toString(maxBis),Integer.toString(max)};
    }
}
