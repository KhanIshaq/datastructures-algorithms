package com.ishaqkhan.grind75;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/contains-duplicate/
//217. Contains Duplicate
//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
public class ContainsDuplicate {
    public static void main(String[] args) {

    }

    //Brute Force = compare the first element with all the other elements
    //Perform a sort and run a loop to find the same element adjacent to each other
    // use a hashset.
    public static boolean containsDuplicate(int[] nums) {

        Set<Integer> distinct = new HashSet<Integer>();
        for (int num : nums) {
            //constant time operation
            if (distinct.contains(num)) {
                return true;
            }
            distinct.add(num);
        }
        return false;
    }

    public static boolean containsDuplicate2(int[] nums) {
        Arrays.sort(nums);
        for(int ind = 1; ind < nums.length; ind++) {
            if(nums[ind] == nums[ind - 1]) {
                return true;
            }
        }
        return false;
    }
}
