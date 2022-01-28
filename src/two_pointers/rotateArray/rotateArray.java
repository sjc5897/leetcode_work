package two_pointers.rotateArray;

// https://leetcode.com/problems/rotate-array/
// https://www.youtube.com/watch?v=BHr381Guz3Y
public class rotateArray {

    // first solution, uses an extra array to get the rotation
    private static void rotate1(int[] nums, int k){
        int n = nums.length;
        k = k % n;
        int[] sol = new int[n];

        for(int i = 0; i < n; i++){
            sol[(i+k)%n] = nums[i];
        }
        System.arraycopy(sol, 0, nums, 0, nums.length);
    }

    // reverses a segment of an array from lower to upper
    private static void reverse(int[] nums, int lower, int upper){
        int i, t;
        for(i = lower; i < (upper+lower)/2; i++){
            t = nums[i];
            nums[i] = nums[(upper+lower)-i-1];
            nums[(upper+lower)-i-1] = t;
        }
    }

    // This solution uses array reversal
    private static void rotate2(int[] nums, int k){
         int n  = nums.length;
         k = k % n;
         reverse(nums,0,n);
         reverse(nums,0,k);
         reverse(nums,k,n);
    }





    public static void rotate(int[] nums, int k){
        rotate2(nums,k);
    }

}
