package two_pointers.squaresOfASortedArray;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class squaresOfASortedTests {

    @Test
    public void testSquareValid1(){
        int[] nums = new int[]{-4,-1,0,3,10};
        int[] sol = new int[]{0,1,9,16,100};
        nums = squaresOfASortedArray.sortedSquares(nums);
        assertArrayEquals(nums,sol);
    }

    @Test
    public void testSquareValid2(){
        int[] nums = new int[]{-7,-3,2,3,11};
        int[] sol = new int[]{4,9,9,49,121};
        nums = squaresOfASortedArray.sortedSquares(nums);
        assertArrayEquals(nums,sol);
    }

    @Test
    public void testSquaresSize0(){
        int[] nums = new int[]{};
        int[] sol  = new int[]{};
        nums = squaresOfASortedArray.sortedSquares(nums);
        assertArrayEquals(nums,sol);
    }

    @Test
    public void testSquaresSize1(){
        int[] nums = new int[]{2};
        int[] sol = new int[]{4};
        nums = squaresOfASortedArray.sortedSquares(nums);
        assertArrayEquals(nums,sol);
    }

}
