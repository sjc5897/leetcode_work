package sliding_window;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/find-all-anagrams-in-a-string/
public class findAllAnagrams {

    // My first solution
    public static String sortString(String input){
        char temp[] = input.toCharArray();
        Arrays.sort(temp);
        return new String(temp);
    }
    public static List<Integer> findAnagrams(String s, String p){
        List<Integer> res = new ArrayList<>();

        p = sortString(p);
        System.out.println(p);

        int windowStart = 0, windowEnd = p.length() - 1;

        while(windowEnd < s.length()){
            String str = sortString(s.substring(windowStart,windowEnd + 1));

            if(str.equals(p)){
                res.add(windowStart);
            }
            windowStart += 1;
            windowEnd += 1;
        }

        return res;
    }

    //https://www.google.com/search?q=438.+find+all+anagrams+in+a+string&rlz=1C1VDKB_enUS960US960&oq=438.+Find+All+Anagrams+in+a+String&aqs=chrome.0.0i512l3.544j0j4&sourceid=chrome&ie=UTF-8#kpvalbx=_O2HwYailLem1ggfGl4OwCg24
    public static List<Integer> findAnagrams2(String s, String p){
        List<Integer> res = new ArrayList<>();

        // create the p frequency table
        int[] char_count = new int[26];
        for(char c: p.toCharArray()){
            char_count[c - 'a']++;
        }

        int left = 0, right = 0, count = p.length();
        while(right < s.length()){
            // case one (right is a value of the p)
            if(char_count[s.charAt(right++) - 'a']-- >= 1){
                count--;
            }
            // case two (count is 0)
            if (count == 0){
                res.add(left);
            }
            // if window is size of p and the next char is
            if(right - left == p.length() && char_count[s.charAt(left++) -'a']++ >= 0){
                count++;
            }
        }
        return res;
    }



    public static void main(String[] args){
        String s = "abab";
        String p = "ab";
        System.out.println(findAnagrams2(s,p));

    }
}
