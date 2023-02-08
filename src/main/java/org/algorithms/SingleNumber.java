package org.algorithms;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
//Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
//
//You must implement a solution with a linear runtime complexity and use only constant extra space.
//Input: nums = [2,2,1]
//Output: 1
public class SingleNumber {

    public int singleNumber(int[] nums) {
        int answer = 0;
        for(int i=0; i<nums.length; i++){
            answer = answer ^ nums[i];
        }
        return answer;
    }

    @Test
    public void test() {
        assertEquals(4, singleNumber(new int[]{4,1,2,1,2}));
    }
}
