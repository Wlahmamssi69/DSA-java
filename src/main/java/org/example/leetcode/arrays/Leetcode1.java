package org.example.leetcode.arrays;

import java.util.Arrays;
//his solution uses two nested loops to find the pair of numbers that add up to the target,
// resulting in a time complexity of O(n^2), where n is the length of the input array.
// It does not use any library or data structure.
// However, this solution is less efficient than the HashMap solution with a time complexity of O(n).
public class Leetcode1 {
    public static void main(String[] args) {
        int[] arr={3,2,4};
        System.out.println(Arrays.toString(twoSum(arr,6)));
    }

    public static int[] twoSum(int[] nums,int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                if( nums[j]+nums[i] == target)  return new int[]{i,j};
            }
        }

        return new int[]{0,0};
    }

}
