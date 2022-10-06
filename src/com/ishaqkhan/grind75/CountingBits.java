package com.ishaqkhan.grind75;

import java.util.Arrays;

// q
public class CountingBits {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(counting(5)));
    }

    public static int[] counting(int n) {
        int[] dp = new int[n+1];
        int offset = 1;
        for(int i = 1; i<n+1; i++) {
            if(offset * 2 == i) {
                offset = i;
            }
            dp[i] = 1 + dp[i-offset ];
        }
        return dp;
    }
}
