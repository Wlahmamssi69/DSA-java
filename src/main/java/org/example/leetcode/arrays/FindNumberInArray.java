package org.example.leetcode.arrays;

import java.util.Arrays;

public class FindNumberInArray {

    public static void main(String[] args) {
        int[] arr={3,2,4};
        System.out.println((searchInArray(arr,4)));
    }
    public static int searchInArray(int[] intArray, int valueToSearch) {
        // TODO
        for(int i=0;i<intArray.length;i++){
            if(intArray[i]==valueToSearch){
                return i;
            }
        }
        return -1;
    }
}
