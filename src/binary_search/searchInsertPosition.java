package binary_search;

// https://leetcode.com/problems/search-insert-position/submissions/
public class searchInsertPosition {
    public static int searchInsert(int[] nums, int target){
        int left = 0, right = nums.length -1;
        while(left <= right){
            int middle = left + (right - left)/2;
            if(nums[middle] == target){
                return middle;
            }
            if(nums[middle] > target){
                right = middle - 1;
            }
            else{
                left  = middle + 1;
            }
        }
        return right + 1;
    }

    public static void main(String[] args){
        int[] nums = new int[]{1,3,5,6};
        int target = 4;
        System.out.println(searchInsert(nums,target));
    }
}
