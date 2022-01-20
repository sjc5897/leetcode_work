package binary_search;

import java.util.Arrays;

//Problem: https://leetcode.com/problems/search-in-rotated-sorted-array/
//Blog: https://www.geeksforgeeks.org/search-an-element-in-a-sorted-and-pivoted-array/
public class searchRotatedArray {
    // logic, find pivot point, split the list on that, and run binary on each side
    public static int search(int[] nums, int target){
        // ensure length is > 0
        if(nums.length == 0){
            return -1;
        }

        // find the pivot
        int pivot = findPivot(nums,0,nums.length-1);

        // if pivot is -1, run regular binarySearch
        if(pivot == -1){
            return binarySearch(nums,0,nums.length-1,target);
        }

        // if the pivot is the target, return the pivot
        if(nums[pivot] == target){
            return pivot;
        }
        // if the target is greater than index 1, search the first half
        if(nums[0] <= target){
            return binarySearch(nums,0,pivot-1,target);
        }
        // otherwise, search the second half
        else{
            return binarySearch(nums,pivot+1,nums.length-1,target);
        }
    }

    /**
     * preforms a binary search on an array
     * @param nums      the array being searched
     * @param left      the left index of the search section
     * @param right     the right index of the search section
     * @param target    the target of the search
     * @return          the index of the target
     */
    public static int binarySearch(int[] nums, int left, int right, int target){
        // Base case, if left is greater than right, item not found
        if (left > right){
            return -1;
        }

        // calculate middle
        int middle = left + (right - left) / 2;

        // target found, return middle
        if(nums[middle] == target){
            return middle;
        }
        // if middle index is greater than target, search the left side
        else if(nums[middle] > target){
            return binarySearch(nums,left,middle - 1, target);
        }
        // Otherwise search the right side
        else{
            return binarySearch(nums,middle + 1, right, target);
        }
    }

    /**
     * A modified binary search used to find the pivot point of a rotated array
     * @param nums  the array being searched
     * @param low   the lower index of the search array
     * @param high  the upper index of the search array
     * @return      the index of the pivot
     */
    public static int findPivot(int[] nums, int low, int high){
        // Base case, if low is greater than high, pivot not found
        if(high < low){
            return -1;
        }
        // if they are equal return low
        if (high == low){
            return low;
        }

        //otherwise run modified binary search
        int middle = low + (high - low) / 2;
        if(middle < high && nums[middle] > nums[middle + 1]){
            return middle;
        }
        else if(middle > low && nums[middle] < nums[middle - 1]){
            return (middle - 1);
        }
        else if(nums[low] >= nums[middle]){
            return findPivot(nums,low,middle-1);
        }
        else{
            return findPivot(nums,middle + 1, high);
        }


    }

    public static void main(String[] args){
        int[] nums = new int[]{1,3,5};
        int target = 3;
        System.out.println(search(nums,target));
    }
}
