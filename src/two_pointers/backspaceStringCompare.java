package two_pointers;
// https://leetcode.com/problems/backspace-string-compare/
// Note: I saw this problem on the IBM assessment
public class backspaceStringCompare {

    // Sol 1 is a copy of my IBM solution, basically use string builder to build the strings
    public static boolean backspaceCompareSol1(String s, String t){
        return build(s).equals(build(t));
    }

    // The leetcode solution using this style used a stack instead of StringBuilder
    public static String build(String s){
        StringBuilder res = new StringBuilder();
        for(char c : s.toCharArray()){
            if(c != '#'){
                res.append(c);
            }
            else if(res.length() > 0){
                res.deleteCharAt(res.length() -1);
            }
        }
        return res.toString();
    }


    public static void main(String[] args){
        String s = "ab#c";
        String t = "ad#c";
        System.out.println(backspaceCompareSol1(s,t));

    }
}
