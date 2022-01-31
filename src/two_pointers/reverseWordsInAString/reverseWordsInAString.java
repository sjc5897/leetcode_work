package two_pointers.reverseWordsInAString;

// https://leetcode.com/problems/reverse-words-in-a-string-iii/
public class reverseWordsInAString {

    // The main difference between SOL 1 and 2:
    // I wrote a reverse function for SOL 1

    // reverses using two pointers
    private static String reverse(String s){
        char[] charArray = s.toCharArray();

        int left = 0, right = charArray.length - 1;
        while(left <= right){
            char temp = charArray[left];
            charArray[left++] = charArray[right];
            charArray[right--] = temp;
        }
        return String.copyValueOf(charArray);
    }

    // Solution 1, split and run revers
    private static String solution1(String s){
        String[] s_array = s.split(" ");

        StringBuffer result = new StringBuffer();


        for (String value : s_array) {
            result.append(reverse(value + " "));
        }
        return result.toString().trim();
    }

    //Solution 2, using StringBuilder and reverse
    public static String solution2(String s){
        String[] words = s.split(" ");
        StringBuilder results = new StringBuilder();

        for (String word : words){
            results.append(new StringBuffer(word).reverse().toString() + " ");
        }

        return results.toString().trim();

    }

    public static String reverseWords(String s){
        return solution1(s);
    }

}
