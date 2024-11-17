package org.example.leetcode.arrays;

//best days to buy and sell stocks
public class Leetcode121 {

    public static void main(String[] args) {
        int[] arr={1,1,1,4,4,4,4,9,9};
        System.out.println(maxProfit(arr));
    }
    public static int maxProfit(int[] prices) {
        int dayToBuy=0,profit=0;

        for(int i=1;i<prices.length;i++){
            if(prices[i] < prices[dayToBuy]){
                dayToBuy = i;
            }
            if(prices[i]-prices[dayToBuy]>profit){
                profit = prices[i]-prices[dayToBuy];
            }
        }

        return profit;
    }
}
