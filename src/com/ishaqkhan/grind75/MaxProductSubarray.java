package com.ishaqkhan.grind75;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

//https://leetcode.com/problems/maximum-product-subarray/
//152. Maximum Product Subarray
//Given an integer array nums, find a contiguous non-empty subarray within the array that has the largest product, and return the product.
//The test cases are generated so that the answer will fit in a 32-bit integer.
//A subarray is a contiguous subsequence of the array.
//Example 1:
//Input: nums = [2,3,-2,4]
//Output: 6
//Explanation: [2,3] has the largest product 6.
//Example 2:
//
//Input: nums = [-2,0,-1]
//Output: 0
//Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
public class MaxProductSubarray {
    //all positives [1,2,3] the product 1,2,6 is increasing
    //all negative [-1,-2,-3] the product -1,2,-6 is increasing & descreasing
    //we need to calculate or consider two values
    // min and max product of an element

    //Two pointer approach left pointer and right pointer
    public static void main(String[] args) {
        //int[] nums = new int[] {2,3,-2,4};
        int[] nums = new int[] {-2,0,-1};
        System.out.println(maxProduct(nums));
    }

    public static int maxProduct(int[] nums) {
        int len = nums.length;
        int curMax = 1;
        int curMin = 1;
        int maxProd = nums[0];
        for(int i = 0;i<len;i++) {
            //initializing back to one
            if(nums[i] == 0) {
                curMax = 1;
                curMin = 1;
                continue;
            }
            int e = nums[i];
            int temp = curMax;
            curMax = Math.max(curMax * e, Math.max(curMin*e, e));
            curMin = Math.min(temp * e, Math.min(curMin*e,e));
            maxProd = Math.max(maxProd, curMax);
        }
        return maxProd;
    }

    public int maxProduct2(int[] A) {
        int n = A.length, res = A[0], l = 0, r = 0;
        for (int i = 0; i < n; i++) {
            l =  (l == 0 ? 1 : l) * A[i];
            r =  (r == 0 ? 1 : r) * A[n - 1 - i];
            res = Math.max(res, Math.max(l, r));
        }
        return res;
    }
}
