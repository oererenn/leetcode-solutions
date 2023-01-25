package org.algorithms;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class findMaxConsecutiveOnes {
    public int findMaxConsecutiveOnesExample(int[] nums) {
        int max = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 1) {
                count = 0;
                continue;
            }
            count++;
            max = Math.max(max, count);
        //Or
//            if(count > max){
//                max = count;
//            }
        }
        return max;
    }


    @Test
    public void test() {
        assertEquals(3, findMaxConsecutiveOnesExample(new int[]{1, 1, 0, 1, 1, 1}));
        assertEquals(2, findMaxConsecutiveOnesExample(new int[]{1, 0, 1, 1, 0, 1}));
        assertEquals(1, findMaxConsecutiveOnesExample(new int[]{1, 0, 1, 0, 1, 0}));
    }
}