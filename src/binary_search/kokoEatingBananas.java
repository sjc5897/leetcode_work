package binary_search;

// https://leetcode.com/problems/koko-eating-bananas/
public class kokoEatingBananas {
    /** This is the brute force solution I tried first, it works in small cases,
     * but is inefficient O(nm)
    public static int minEatingSpeed(int[] piles, int h){
        int k = 1;
        while(!helper(piles,k,h)){
            k+=1;
        }
        return k;
    }
    public static boolean helper(int[] piles, int k, int h){
        long total_time = 0;
        for(int pile: piles){
            total_time += (int)Math.ceil((double) pile/ (double) k);
        }
        return total_time <= h;
    }*/

    /**
     * This is the more optimal solution to the problem, essentially using a binary search tree over the range of 1 to max
     * This is O(n*logm)
     * @param piles     the piles
     * @param h         the time
     * @return          the min eating speed
     */
    public static int minEatingSpeed(int[] piles,int h){
        // initalize the binary search vars
        int left = 1, right = 1;

        // find the max largest pile to get the range
        for(int pile : piles){
            right = Math.max(right,pile);
        }

        // iterative bs
        while(left < right){
            // calculate the middle
            int middle  = left + (right - left) / 2;

            // find the time spent at k
            int time_spent = 0;
            for (int pile : piles){
                time_spent += Math.ceil((double) pile / middle);
            }

            // if it is less than the time, go slower
            if(time_spent <= h){
                right = middle;
            }
            //otherwise go faster
            else{
                left = middle +1;
            }
        }
        return right;
    }

    public static void main(String[] args){
        int[] piles = new int[]{332484035,524908576,855865114,632922376,222257295,690155293,112677673,679580077,337406589,290818316,877337160,901728858,679284947,688210097,692137887,718203285,629455728,941802184};
        int h = 823855818;
        System.out.println(minEatingSpeed(piles,h));

    }
}

