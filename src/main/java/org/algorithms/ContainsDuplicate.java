package org.algorithms;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.HashSet;
import java.util.Set;

//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
//Input: nums = [1,2,3,1]
//Output: true
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> uniques = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!uniques.add(nums[i])) {
                return true;
            };
        }
        return false;
    }

    @Test
    public void test(){
        assertEquals(true,containsDuplicate(new int[]{1,2,3,1}));
        assertEquals(false,containsDuplicate(new int[]{1,2,3,4}));
    }
}
