package two_pointers.squaresOfASortedArray;

import java.util.*;

//https://leetcode.com/problems/squares-of-a-sorted-array/
public class squaresOfASortedArray {

    // my initial naive approach which works
    private static int[] sol1(int[] nums){
        for(int i = 0; i < nums.length; i++){
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }

    // this is a more  approach using 2 pointers.
    // This solution improves on the previous by removing the need to sort
    // The main challenge with this problem is sorting negatives
    private static int[] sol2(int[] nums){
        int nums_size = nums.length;
        int left = 0, right = nums_size -1;

        int[] result = new int[nums_size];

        for(int i = nums_size-1; i >= 0; i--){
            if(Math.abs(nums[left]) > nums[right]){
                result[i] = nums[left] * nums[left];
                left++;

            }
            else{
                result[i] = nums[right] * nums[right];
                right--;
            }
        }
        return result;
    }

    public static int[] sortedSquares(int[] nums){
        return sol2(nums);
    }



}
