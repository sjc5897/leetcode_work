package two_pointers.twoSum2;

// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
public class twoSum2 {
    // First approach, double iteration, this solution very slow
    private static int[] twoSum1(int[] numbers, int target){
        for(int i = 0; i < numbers.length-1; i++){
            for(int j = i+1; j < numbers.length; j++){
                if(numbers[i] + numbers[j] == target){
                    return new int[]{i+1,j+1};
                }
            }
        }

        return new int[2];
    }

    // Second approach, my thought is to use a front and end pointer
    // This solution proved to be way faster than the above solution
    // Not this two pointer solution only works for a sorted input
    public static int[] twoSum2(int[] numbers, int target){
        int n = numbers.length;
        int l = 0, r = n - 1;
        while(l < r){
            int sum = (numbers[l] + numbers[r]);
            if(sum == target){
                return new int[]{l+1,r+1};
            }
            else if(sum > target){
                r--;

            }
            else{
                l++;
            }
        }
        return new int[2];
    }

    public static int[] twoSum(int[] numbers, int target){
        return twoSum2(numbers,target);

    }
}
