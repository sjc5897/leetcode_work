package two_pointers;

import java.util.*;

// https://leetcode.com/problems/3sum/
// https://www.callicoder.com/three-sum-problem/
public class threeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        int target = 0;

        // base check ensure that nums.length > 3
        if (nums.length < 3) {
            return result;
        }
        for (int i = 0; i < nums.length; i++) {
            int currentTarget = target - nums[i];
            Set<Integer> existingNums = new HashSet<>();
            for (int j = i + 1; j < nums.length; j++) {
                if (existingNums.contains(currentTarget - nums[j])) {
                    result.add(Arrays.asList(nums[i], nums[j], currentTarget - nums[j]));
                } else {
                    existingNums.add(nums[j]);
                }
            }


        }return result;

    }


    public static void main(String[] args){
        int[] nums = new int[]{-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }
}
