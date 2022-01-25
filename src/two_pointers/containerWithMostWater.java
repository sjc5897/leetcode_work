package two_pointers;

// https://leetcode.com/problems/container-with-most-water/
public class containerWithMostWater {
    // This is the first pass naive approach
    public static int maxArea(int[] height){
        int max = 0;
        for(int i = 0; i < height.length -1; i++){
            for(int j = height.length - 1; j >= i; j--) {
                int area = Math.min(height[i], height[j]) * (j - i);
                max = Math.max(max, area);
            }
        }
        return max;
    }
    // https://www.geeksforgeeks.org/container-with-most-water/
    public static int maxArea2(int[] height){
        int left = 0, right = height.length -1;
        int maxArea = 0;
        while (left < right){
            maxArea = Math.max(maxArea, Math.min(height[left],height[right]) * (right - left));

            if(height[left] < height[right]){
                left += 1;
            }
            else{
                right -= 1;
            }
        }


        return maxArea;
    }

    public static void main(String[] args){
        int[] height = new int[]{1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));

    }
}
