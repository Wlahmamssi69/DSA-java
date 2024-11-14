package org.example.leetcode.arrays;

import java.util.Arrays;

public class BestScore {
    public static void main(String[] args) {
        int[] array = {99,90,90,99,98,80,99,79,100};
        System.out.println(Arrays.toString(bestTwoScore(array)));

    }

    public static int[] bestTwoScore(int[]array){
        int best1score = 0,best2score=0;
         for(int i =0;i<array.length;i++){
                 if(array[i]> best1score){
                     best2score = best1score;
                     best1score = array[i];
                 }
             }

         return new int[]{best1score, best2score};
    }



}
