package org.algorithms;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import java.util.HashMap;

//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//You can return the answer in any order.
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> temp = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int comp = target-nums[i];
            if(temp.containsKey(comp)){
                return new int[]{temp.get(comp),i};
            }
            temp.put(nums[i],i);
        }
        return null;
    }

    @Test
    public void test() {
        assertArrayEquals(new int[]{0, 1}, twoSum(new int[]{2, 7, 11, 15}, 9));
    }
}
