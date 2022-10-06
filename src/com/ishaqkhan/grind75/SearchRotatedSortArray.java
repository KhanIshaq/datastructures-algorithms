package com.ishaqkhan.grind75;
//https://leetcode.com/problems/search-in-rotated-sorted-array/
//Example 1:
//
//Input: nums = [4,5,6,7,0,1,2], target = 0
//Output: 4
//Example 2:
//
//Input: nums = [4,5,6,7,0,1,2], target = 3
//Output: -1
//Example 3:
//
//Input: nums = [1], target = 0
//Output: -1
public class SearchRotatedSortArray {
    public static void main(String[] args) {

    }

    public static int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while(l<=r) {
            int m = l + (r - l) / 2;
            if(nums[m] == target)
                return m;

            if(nums[m] < nums[r]) {
                if(target < nums[m] || target > nums[r]) {
                    r = m;
                } else {
                    l = m + 1;
                }
            } else {
                if (target > nums[m] || target < nums[l]) {
                    l = m+1;
                } else  {
                    r = m;
                }
            }
        }
        return -1;
    }
}
