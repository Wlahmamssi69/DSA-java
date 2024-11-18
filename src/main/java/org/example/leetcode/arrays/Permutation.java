package org.example.leetcode.arrays;

public class Permutation {
    public static void main(String[] args) {
        int[] nums1={1,2,6,8,7,4} ;
        int[] nums2={4,1,2,6,8,7} ;
        System.out.println(permutation(nums1,nums2));
    }



        public static boolean permutation(int[] array1, int[] array2){
            // TODO
            if(array1.length!=array2.length) return false;
            if(array1[array1.length-1]!=array2[0]) return false;
            for (int i=1;i<array2.length-1;i++){
                if(array1[i] != array2[i+1]){
                    return false;
                }
            }
            if(array1[array1.length-1]==array2[0]) return true;
            return false;
        }


}
