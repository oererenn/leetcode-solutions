package org.algorithms;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

// Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
//Input: nums = [-4,-1,0,3,10]
//Output: [0,1,9,16,100]
//Explanation: After squaring, the array becomes [16,1,0,9,100].
//After sorting, it becomes [0,1,9,16,100].
public class SquaresOfaSortedArray {

    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[i] * nums[i];
        }
        Arrays.sort(result);
        return result;
    }

    @Test
    public void test(){
        assertArrayEquals(new int[]{0,1,9,16,100} , sortedSquares(new int[]{-4,-1,0,3,10}));
        assertArrayEquals(new int[]{0,1,9,16,100,121}, sortedSquares(new int[]{-4,-1,0,3,10,11}));
        assertArrayEquals(new int[]{0,1,9,16,100,121,144}, sortedSquares(new int[]{-4,-1,0,3,10,11,12}));
    }
}
