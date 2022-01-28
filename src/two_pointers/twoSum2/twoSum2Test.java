package two_pointers.twoSum2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

public class twoSum2Test {
    // Constraints:
    // 2 <= numbers.length <= 3 * 10^4
    // -1000 <= numbers[i] <= 1000
    // numbers is sorted in ascending order
    // -1000 <= target <= 1000
    // Exactly one solution

    private int[] nums;
    private int target;
    private int[] sol;

    @Test
    public void twoSumExample1Test(){
        nums = new int[]{2,7,11,15};
        target = 9;
        sol = new int[]{1,2};
        assertArrayEquals(twoSum2.twoSum(nums,target),sol);
    }

    @Test
    public void twoSumExample2Test(){
        nums = new int[]{2,3,4};
        target = 6;
        sol = new int[]{1,3};
        assertArrayEquals(twoSum2.twoSum(nums,target),sol);
    }

    @Test
    public void twoSumExample3Test(){
        nums = new int[]{-1,0};
        target = -1;
        sol = new int[]{1,2};
        assertArrayEquals(twoSum2.twoSum(nums,target),sol);
    }

    @Test
    public void testSumExample4Test(){
        // This is a failed test case in leetcode (for sol 1)
        // The cause is j in the second iter was set to j = i and not j = i + 1
        nums = new int[]{0,0,3,4};
        target = 0;
        sol = new int[]{1,2};
        assertArrayEquals(twoSum2.twoSum(nums, target),sol);

    }
}
