package binary_search;

//https://leetcode.com/problems/find-peak-element/solution/
public class findPeakElement {
    public static int findPeak(int[] nums){
        int left = 0, right  = nums.length -1;
        while (left < right){
            int middle = (left + right) / 2;
            if (nums[middle] > nums[middle + 1]) {
                right = middle;
            }
            else{
                left = middle + 1;
            }
        }
        return left;
    }

    public static void main(String[] args){
        int[] array = new int[]{1,2,3,1};
        System.out.println(findPeak(array));

    }
}
