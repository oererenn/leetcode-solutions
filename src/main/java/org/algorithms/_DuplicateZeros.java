package org.algorithms;
import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

//Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to the right.
//Input: arr = [1,0,2,3,0,4,5,0]
//Output: [1,0,0,2,3,0,0,4]
//Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
public class _DuplicateZeros {
    public int[] duplicateZeros(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0){
                for (int j = arr.length - 1; j > i; j--) {
                    arr[j] = arr[j-1];
                }
                i++;
            }
        }
        return arr;
    }

    @Test
    public void test(){
        assertArrayEquals(new int[]{1,0,0,2,3,0,0,4}, duplicateZeros(new int[]{1,0,2,3,0,4,5,0}));
    }
}
