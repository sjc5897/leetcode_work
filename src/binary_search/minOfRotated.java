package binary_search;

// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/solution/
public class minOfRotated {

    public static int findMin(int[] nums){
        int left = 0, right = nums.length-1;
        while (left <= right){
            int middle = left + (right - left)/2;
            if (middle < right && nums[middle] > nums[middle + 1]){
                return nums[middle + 1];
            }
            if(middle > left && nums[middle] < nums[middle - 1]){
                return nums[middle];
            }
            else if(nums[left] >= nums[middle]){
                right = middle - 1;
            }
            else{
                left = middle + 1;
            }
        }
        return nums[0];
    }

    public static void main(String[] args){
        int[] nums = new int[]{11,13,15,17};
        System.out.println(findMin(nums));

    }
}
