package com.ishaqkhan.grind75;

import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(7);
        nums.add(13);
        nums.add(4);
        System.out.println(Arrays.toString(twoSum(nums, 6)));
    }
    //Hashmap Memory is O(n)
    //T.C is O(n)
    public static int[] twoSum(List<Integer> nums, int target) {
        Map<Integer, Integer> prevMap = new HashMap<>();
        for(int i = 0;i<nums.size();i++) {
            int value = nums.get(i);
            int diff = target - value;
            if(prevMap.get(diff) != null) {
                //this is return the indices
                return new int[]{prevMap.get(diff), i};
            }
            prevMap.put(value, i);
        }
        return new int[]{0,0};
    }
}
