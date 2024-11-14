package org.example.leetcode.arrays;

public class SumDiagonal {
    public static void main(String[] args) {
        int [][] twoDimarray = {{1,2,3},{4,10,8},{4,11,9}};
        System.out.println("Diagonal Sum : "+ sumDiagonal(twoDimarray));

    }
    public static int sumDiagonal(int[][] twoDArray){
        int sum = 0;
        int size = twoDArray.length;
        for(int i=0;i<size;i++){ //====> O(n)
            sum += twoDArray[i][i];
            if(i != size-1-i)
            sum += twoDArray[i][size-1-i];
        }
        return sum;
    }
}
