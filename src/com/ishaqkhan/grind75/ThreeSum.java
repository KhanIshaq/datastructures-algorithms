package com.ishaqkhan.grind75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Given
public class ThreeSum {

    public static void main(String[] args) {
        int[] nums = new int[] {7,4,9,1,5,6};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int len = nums.length;
        Arrays.sort(nums);

        for(int i = 0; i<len;i++) {
            int curr = nums[i];
            if(i>0 && nums[i] == nums[i-1]) {
                continue;
            }

            int l = i + 1;
            int r = len-1;
            while(l<r) {
                int sum = curr + nums[l] + nums[r];
                if(sum > 0) {
                    r--;
                } else if(sum <0) {
                    l++;
                } else {
                    List<Integer> li = Arrays.stream(new int[] {curr, nums[l], nums[r]}).boxed().collect(Collectors.toList());
                    res.add(li);
                    l++;
                    while(nums[l] == nums[l-1] && l<r) {
                        l++;
                    }
                }
            }
        }
        return res;
    }

}
