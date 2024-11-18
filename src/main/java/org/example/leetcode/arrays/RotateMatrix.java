package org.example.leetcode.arrays;

import java.util.Arrays;

public class RotateMatrix {

    public static void main(String[] args) {
        int[][]  arr2D={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.deepToString(rotateMatrix(arr2D)));
    }
    public static int [][] rotateMatrix(int[][] matrix) {
        int value=0;
        for (int i=0;i<matrix.length;i++){
            for(int j =0;j<matrix[0].length;j++){
                value = matrix[i][j];
                matrix[i][j] = matrix[j][matrix[0].length-1-i];
            }
        }
        return matrix;

    }
}
