package sliding_window;

// https://leetcode.com/problems/subarray-product-less-than-k/
public class subarrayProductLessThanK {
    public static int numSubarrayProductLessThanK(int[] nums, int k){
        int res = 0;

        if(k<=1) return res;
        int left = 0, product = 1;

        for (int right = 0; right < nums.length; right++){
            product *= nums[right];
            while(product >= k){
                product /= nums[left++];
            }
            res += right - left + 1;
        }

        return res;
    }

    public static void main(String[] args){
        int[] nums = new int[]{1,2,3};
        int k = 0;
        System.out.println(numSubarrayProductLessThanK(nums,k));

    }
}
