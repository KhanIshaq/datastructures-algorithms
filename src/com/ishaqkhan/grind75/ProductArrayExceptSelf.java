package com.ishaqkhan.grind75;

//238. Product of Array Except Self
//Medium
//Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
//The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
//You must write an algorithm that runs in O(n) time and without using the division operation.
//Example 1:
//
//Input: nums = [1,2,3,4]
//Output: [24,12,8,6]
//Example 2:
//
//Input: nums = [-1,1,0,-3,3]
//Output: [0,0,9,0,0]
//Follow up: Can you solve the problem in O(1) extra space complexity? (The output array does not count as extra space for space complexity analysis.)
public class ProductArrayExceptSelf {
    public static void main(String[] args) {

    }

    public static int[] productExceptSelf(int[] nums) {
        if(nums == null || nums.length == 0)
            return nums;
        int len = nums.length;
        int[] res = new int[len];
        int prefix = 1;
        for(int i = 0;i<len;i++) {
            res[i] = prefix;
            prefix = prefix * nums[i];
        }
        int postfix = 1;
        for(int j = len-1;j>=0;j--) {
            res[j] = res[j] * postfix;
            postfix = postfix * nums[j];
        }
        return res;
    }
}
