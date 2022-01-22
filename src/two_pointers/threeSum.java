package two_pointers;

import java.util.*;

// https://leetcode.com/problems/3sum/
public class threeSum {
    public static List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> result = new ArrayList<>();

        // base check ensure that nums.length > 3
        if (nums.length < 3 ){
            return result;
        }
//        // for each i run 2 sum with it
//        for (int i : nums){
////            List<Integer> res = findTwoSum()
//
//
//        }

        return result;
    }

    public static List<Integer> findTwoSum(int[] nums, int target){
        Set<Integer> numMap = new HashSet<>();
        for (int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            if(numMap.contains(complement)){
                return Arrays.asList(complement,nums[i]);
            }
            else{
                numMap.add(nums[i]);
            }
        }
        return null;
    }

    public static void main(String[] args){
        int[] nums = new int[]{-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }
}
