package two_pointers.rotateArray;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class rotateArrayTest {

    // constraints
    // 1 <= nums.length <= 10^5
    // -2^31 <= nums[i] <= 2&31-1
    // 0 <= k <= 10^5

    @Test
    public void  testRotateArrayValid1(){
        int[] nums = new int[]{1,2,3,4,5,6,7};
        int k = 3;
        int[] sol = new int[]{5,6,7,1,2,3,4};
        rotateArray.rotate(nums,k);
        assertArrayEquals(nums,sol);
    }

    @Test
    public void testRotateArrayValid2(){
        int[] nums = new int[]{-1,-100,3,99};
        int k = 2;
        int[] sol = new int[]{3,99,-1,-100};
        rotateArray.rotate(nums,k);
        assertArrayEquals(nums,sol);
    }

    @Test
    public void testRotateArrayLen1(){
        int[] nums = new int[]{1};
        int k = 3;
        int[] sol = new int[]{1};
        rotateArray.rotate(nums,k);
        assertArrayEquals(nums,sol);
    }

    @Test
    public void testRotateArrayK0(){
        int[] nums = new int[]{1,2,3,4,5,6,7,8,9,10};
        int k = 0;
        int[] sol = new int[]{1,2,3,4,5,6,7,8,9,10};
        rotateArray.rotate(nums,k);
        assertArrayEquals(nums,sol);
    }

    @Test
    public void testRotateArrayKGreaterThanN(){
        int[] nums = new int[]{1,2,3,4,5};
        int k = 6;
        int[] sol = new int[]{5,1,2,3,4};
        rotateArray.rotate(nums,k);
        assertArrayEquals(nums,sol);
    }
}
