package org.example.leetcode.arrays;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,6};
        System.out.println("the missing number : "+findMissingNumber(array));

    }
    public static int findMissingNumber(int[] arr) {
        int size = arr.length;
        int sum = 0;
        for(int i=0;i<size;i++){
            sum+=arr[i];
        }
        //calculate the first natural number to size
        int sumOfNaturalNumbers = ((size+1)*(size+2))/2;
        return sumOfNaturalNumbers - sum;
    }


}
