package org.example.leetcode.arrays;


//remove duplicate from sorted array ==> return length of
public class Leetcode26 {
    public static void main(String[] args) {
        int[] arr={1,1,1,4,4,4,4,9,9};
        System.out.println(removeDuplicates(arr));
    }
    public static int removeDuplicates(int[] nums){
        if(nums.length==0)return 0;
        int count=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]) count++;
        }

        return count;
    }
}
