package binary_search;

import java.util.Arrays;

//Problem: https://leetcode.com/problems/search-in-rotated-sorted-array/
public class searchRotatedArray {
    public static int search(int[] nums, int target){
        // ensure length is > 0
        if(nums.length == 0){
            return -1;
        }

        // init binary search values
        int left = 0; int right = nums.length - 1;
        //run iterative binary search
        while(left <= right){
            // calculate middle
            int middle = left + (right - left) / 2;

            // if target found
            if(nums[middle] == target){
                return middle;
            }
            // if nums > target
            else if(nums[middle] > target){
                right = middle - 1;
            }
            // if nums < target
            else{
                left = middle + 1;
            }
        }

        // not found return -1
        return -1;
    }

    public static void main(String[] args){
        int[] nums = new int[]{4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(search(nums,target));
    }
}
