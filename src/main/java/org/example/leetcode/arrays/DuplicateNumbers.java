package org.example.leetcode.arrays;

import java.util.Arrays;

public class DuplicateNumbers {

    public static void main(String[] args) {
        int[] array = {1,1,2,3,3,4,6,6};
        System.out.println(Arrays.toString(removeDuplicateNumbers(array)));
    }
    public static int[] removeDuplicateNumbers(int[] arr){
        int j=0;
        for(int i=1;i<arr.length;i++){
            System.out.println("i = "+i);
            if(arr[i] != arr[j]){
                System.out.println(arr[i] + "--"+arr[j]);
                j++;
                arr[j]=arr[i];

                System.out.println("----j = "+j);
            }

        }
        int[] uniqueArray = new int[j+1];
        for(int k=0;k<uniqueArray.length;k++){
            uniqueArray[k] = arr[k];
        }
        return uniqueArray ;
    }
}
