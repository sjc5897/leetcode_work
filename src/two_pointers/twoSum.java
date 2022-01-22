package two_pointers;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/two-sum/
public class twoSum {
    // I've done two sum before but the naive approach
    // I am going to try a different one.
    public static int[] twoSum(int[] nums, int target){
        // Set up the complement map
        Map<Integer,Integer> numMap = new HashMap<>();

        // iterate through the list
        for (int i = 0; i < nums.length; i++){

            // get the complement
            int complement = target - nums[i];

            // check the map
            if (numMap.containsKey(complement)){
                // either return the results
                return new int[]{numMap.get(complement), i };
            }
            else{
                // or add to the map
                numMap.put(nums[i], i);
            }

        }
        return new int[]{};

    }

    public static void main(String[] args){
        int[] nums = new int[]{3,3};
        int target = 6;
        int[] res = twoSum(nums, target);
        System.out.println("[" + res[0] + "," + res[1] + "]");
    }
}
