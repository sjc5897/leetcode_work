package two_pointers.moveZeros;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class moveZerosTest {

    // constraints
    // 1 <= nums.length <= 10^4
    // nums[i] is int

    @Test
    public void testMoveZerosValid1(){
        int[] nums = new int[]{0,1,0,3,12};
        int[] sol = new int[]{1,3,12,0,0};
        moveZeros.moveZeros(nums);
        assertArrayEquals(nums,sol);

    }

    @Test
    public void testMoveZerosValid2(){
        int[] nums = new int[]{0};
        int[] sol = new int[]{0};
        moveZeros.moveZeros(nums);
        assertArrayEquals(nums,sol);
    }

}
