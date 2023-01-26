package org.algorithms;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

//Given two strings s and t, return true if t is an anagram of s, and false otherwise.
//
//An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
//Input: s = "anagram", t = "nagaram"
//Output: true
public class _ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] counts = new int[26];
        for (int i = 0; i < s.length(); i++) {
            counts[s.charAt(i) - 'a']++;
            counts[t.charAt(i) - 'a']--;
        }

        for (int count : counts) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    @Test
    public void test(){
        assertEquals(true,isAnagram("anagram","nagaram"));
        assertEquals(false,isAnagram("anagram","nagaiam"));
    }
}
