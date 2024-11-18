package org.example.leetcode.arrays;

public class ContainsDuplicates {


    public static void main(String[] args) {
        int[] arr={3,2,4};
        System.out.println((isUnique(arr)));
    }
    public static boolean isUnique(int[] intArray) {
        // TODO
        int n = intArray.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (intArray[i] == intArray[j])
                    return false;
            }
        }
        return true;
    }
}
