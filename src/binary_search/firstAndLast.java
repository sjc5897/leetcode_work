package binary_search;

//Problem: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/discuss/?currentPage=1&orderBy=hot&query=
//Blog: https://www.geeksforgeeks.org/find-first-and-last-positions-of-an-element-in-a-sorted-array/
public class firstAndLast {
    // Logic: use binary search to find the range, then expand from there
    public static int[] searchRange(int nums[], int target){
        // check array size > 0
        if(nums.length == 0){
            return new int[]{-1,-1};
        }

        // init binary search vars
        int left = 0;  int right = nums.length - 1;
        while(left <= right){
            // calculate middle
            int middle = left + (right - left) / 2;
            // if middle is target
            if(nums[middle] == target){
                // init the left and right searchers
                int left_locker = middle; int right_looker = middle;

                // while left == target and is greater than 0
                while(left_locker > 0 && nums[left_locker] == target){
                    left_locker--;
                }
                while(right_looker < nums.length - 1  && nums[right_looker] == target){
                    right_looker++;
                }
                return new int[]{nums[left_locker] == target ? left_locker : left_locker + 1
                        , nums[right_looker] == target ? right_looker : right_looker - 1};

            }
            // if middle is less than target
            else if(nums[middle] <= target){
                left = middle + 1;
            }
            // if middle is greater than target
            else{
                right = middle - 1;
            }

        }

        // if failed, return -1,-1 array
        return new int[]{-1,-1};
    }

    public static void main(String[] args){
        int[] array = new int[]{2,2};
        int target = 3;
        int[] sol = searchRange(array,target);
        System.out.println(sol[0]);
        System.out.println(sol[1]);

    }
}
