package com.ishaqkhan.grind75;

import java.util.Arrays;
import java.util.List;

//121. Easy
//Best to Buy and Sell Stock
//Stock Price = 7,1,5,3,6,4
//Profit = 5
public class BuySellStock {
    //Logic = Buy Low and Sell High
    // Left is buy
    // right is when we sell
    //initialize left as 0, right as 1 (LEFT + 1)
    // if right value is less than left increment right index, increment left index
    // if left pointer is less than right pointer then leave it at same place
    //Sliding Window Logic
    //Two pointers solution
    // TC = O(n)
    //SC = O(1) as these are pointers


    public static void main(String[] args) {
        int[] p = new int[] {7,1,3,5,6,4};
        System.out.println(maxProfit(p));
    }
    public static int maxProfit(int[] prices) {
        int left = 0;
        int right = left+1;
        int maxProfit = 0;
        int len = prices.length;
        for(int i = 0; i<len; i++) {
            if(prices[left] < prices[right]) {
                int profit = prices[right] - prices[left];
                maxProfit = Math.max(maxProfit, profit);
            }
            else {
                left = right;
            }
            right++;
        }
        return maxProfit;
    }
}
