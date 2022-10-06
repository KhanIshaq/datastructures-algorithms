package com.ishaqkhan.grind75;

public class MissingNumber {
    public static void main(String[] args) {

    }
    public static int missing(int[] nums) {
        int res = nums.length;
        for (int i = 0; i < res; i++) {
            res += (i - nums[i]);
        }
        return res;
    }
}
