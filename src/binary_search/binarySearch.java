package binary_search;

// https://leetcode.com/problems/binary-search/
public class binarySearch {
    public static int search(int[] nums, int target){
        int left = 0, right = nums.length -1;
        while(left <= right){
            int middle = left + (right - left) / 2;
            if(nums[middle] == target){
                return middle;
            }
            else if(nums[middle] > target){
                right = middle -1;
            }
            else{
                left = middle +1;
            }
        }

        return -1;
    }

    public static void main(String[] args){
        int[] nums = new int[]{-1,0,3,5,9,12};
        int target = 9;
        System.out.println(search(nums,target));

    }
}
