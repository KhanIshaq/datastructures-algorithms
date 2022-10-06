package com.ishaqkhan.grind75;

//153
//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
public class MinRotatedSortedArray {
    public static void main(String[] args) {
        int l = 1+(7-1)/2;
        System.out.println(l);
    }

    public static int findMin(int[] nums) {
        int len = nums.length;
        int l = 0;
        int r = len-1;
        while(l<r) {
            int m = l + (r-l) / 2;
            if(nums[m] < nums[r]) {
                r = m;
            } else {
                l = m+1;
            }
        }
        return nums[l];
    }
}
