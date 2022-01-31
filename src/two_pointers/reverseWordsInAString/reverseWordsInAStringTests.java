package two_pointers.reverseWordsInAString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class reverseWordsInAStringTests {
    /*
    Constraints
    1 <= s.length <= 5*10^4
    s contains printable ASCII
    s does not contain leading or trailing spaces
    there is at least one word in s
    all the words in s are sperated by a single space
     */

    @Test
    public void testExample1(){
        String s = "Let's take LeetCode contest";
        String sol = "s'teL ekat edoCteeL tsetnoc";

        assertEquals(reverseWordsInAString.reverseWords(s),sol);

    }
    @Test
    public void testExample2(){
        String s = "God Ding";
        String sol = "doG gniD";

        assertEquals(reverseWordsInAString.reverseWords(s),sol);

    }
}
