package sliding_window;

// https://leetcode.com/problems/minimum-size-subarray-sum/
public class minimumSizeSubarraySum {
    public static int minSubArrayLen(int target, int[] nums){
        int minSize = 0;

        int left = 0, sum = 0;
        for(int right = 0; right < nums.length; right++){
            sum += nums[right];
            while(sum >= target){
                minSize = minSize > 0 ? Math.min(minSize,right+1-left) : right - left +1;
                sum -= nums[left++];
            }
        }
        return minSize;
    }

    public static void main(String[] args){
        int target = 7;
        int[] nums = new int[]{2,3,1,2,4,3};
        System.out.println(minSubArrayLen(target,nums));

    }
}
