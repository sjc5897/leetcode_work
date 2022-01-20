package binary_search;

// https://leetcode.com/problems/search-a-2d-matrix/
public class search2dMatrix {
    public static boolean searchMatrix(int[][] matrix, int target){
        // logic find the row and binary search the row
        for(int[] row : matrix){
            // if target is less than last value
            if(target <= row[row.length-1]) {
                // run the binary search
                return binarySearch(row, 0, row.length - 1, target);
            }
        }
        // if target not found return false
        return false;
    }
    // Just simply a binarySearch recursive algo
    public static boolean binarySearch(int[] array, int left, int right, int target){
        if(left > right){
            return false;
        }
        int middle  = left + (right - left) / 2;
        if(array[middle] == target){
            return true;
        }
        else if(array[middle] > target){
            return binarySearch(array,left,middle-1,target);
        }
        else{
            return binarySearch(array, middle + 1, right, target);
        }

    }


    public static void main(String[] args){
        int[][] matrix = new int[][] {{1}};
        int target = 1;
        System.out.println(searchMatrix(matrix,target));
    }
}
