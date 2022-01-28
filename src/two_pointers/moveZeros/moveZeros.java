package two_pointers.moveZeros;

// https://leetcode.com/problems/move-zeroes/
public class moveZeros {
    // First attempt, not inplace uses a second array
    private static void moveZeros1(int[] nums){
        int n = nums.length;

        // use a solution array with two pointers
        int[] sol = new int[n];
        int left = 0, right = n - 1;

        // for the numbers in the list
        for(int i:nums){
            // if i is 0, add to the end of sol
            if(i == 0){
                sol[right] = i;
                right--;
            }

            // otherwise add to front
            else{
                sol[left] = i;
                left++;
            }
        }

        System.arraycopy(sol, 0, nums, 0, nums.length);
    }

    // attempt to do it without the second array
    private static void moveZeros2(int[] nums){
        int n = nums.length;

        // This solution uses two pointers, the first (non_zero_pointer) marks the location non-zeros should go
        // The second just iterates through the whole list
        int non_zero_pointer = 0, whole_pointer = 0;
        while(whole_pointer < n){
            int value = nums[whole_pointer];
            if(value != 0){
                nums[non_zero_pointer++] = value;
            }
            whole_pointer++;
        }
        while(non_zero_pointer < whole_pointer){
            nums[non_zero_pointer++] = 0;
        }

    }

    public static void moveZeros(int[] nums){
        moveZeros2(nums);
    }
}
