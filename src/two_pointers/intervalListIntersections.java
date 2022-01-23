package two_pointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/interval-list-intersections/
public class intervalListIntersections {
    public static int[][] intervalIntersection(int[][] firstList, int[][] secondList){
        List<int[]> res = new ArrayList<>();
        int i = 0, j = 0;
        while (i < firstList.length && j < secondList.length){
            int lo = Math.max(firstList[i][0],secondList[j][0]);
            int hi = Math.min(firstList[i][1],secondList[j][1]);
            if (lo <= hi){
                res.add(new int[]{lo,hi});
            }
            if(firstList[i][1] < secondList[j][1]){
                i++;
            }
            else{
                j++;
            }
        }


        return res.toArray(new int[res.size()][]);

    }

    public static void main(String[] args){
        int[][] f1 = new int[][]{{0,2},{5,10},{13,23},{24,25}};
        int[][] f2 = new int[][]{{1,5},{8,12},{15,24},{24,26}};
        int[][] res =  intervalIntersection(f1,f2);
        System.out.println(Arrays.toString(res));

    }
}
