package org.algorithms;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

// Given an array nums of integers, return how many of them contain an even number of digits.
//Input: nums = [555,901,482,1771]
//Output: 1
//Explanation:
//Only 1771 contains an even number of digits.
public class FindNumbersWithEvenNumberOfDigits {
    public int findNumbers(int[] nums) {
        int count = 0;
        int digit = 0;
        for (int i = 0; i < nums.length; i++) {
            // Divide to 10 to find digit number -> move the decimal point one place to the left
            while(nums[i] != 0){
                nums[i] /= 10;
                digit++;
            }
            if(digit % 2 == 0){
                count ++;
            }
            digit = 0;
        }
        return count;
    }

    @Test
    public void test(){
        assertEquals(1, findNumbers(new int[]{555,901,482,1771}));
        assertEquals(2, findNumbers(new int[]{555,901,482,1771,1234}));
        assertEquals(3, findNumbers(new int[]{555,901,482,1771,1234,123456}));
    }
}
