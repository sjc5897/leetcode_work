package dfs;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// https://leetcode.com/problems/letter-case-permutation/
public class LetterCasePermutation {
    public static List<String> permute(String s){
        List<String> result = new ArrayList<>();
        dfs(s.toLowerCase(Locale.ROOT).toCharArray(), result, 0, s.length());
        return result;
    }
    public static void dfs(char[] chArr, List ans, int i, int len){
        if(i<len){
            dfs(chArr, ans, i+1, len);
            if (Character.isLetter(chArr[i])){
                chArr[i] = Character.toUpperCase(chArr[i]);
                dfs(chArr, ans, i+1, len);
                chArr[i] = Character.toLowerCase(chArr[i]);
            }
        }else{
            ans.add(new String(chArr));
        }
    }


    public static void main(String[] args){
        System.out.println(permute("ABC"));
    }
}
