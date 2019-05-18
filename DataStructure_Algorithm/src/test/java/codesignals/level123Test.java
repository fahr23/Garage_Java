package codesignals;

/**
 * Created by FF on 3/9/17.
 */


import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;


public class level123Test {

    private static level123 level123;

    @BeforeClass
    public static void initLevel1() {
        level123 = new level123();
    }

    @Ignore
    public void centuryFromYearTest() {
        //year 1<=year<=2005
        int result = level123.centuryFromYear(1905);
        int result2 = level123.centuryFromYear(1700);

        assertEquals(20, result);
        assertEquals(17, result2);
    }

    @Ignore
    public void checkPalindrome() {
        boolean result1 = level123.checkPalindrome("aabaa");
        boolean result2 = level123.checkPalindrome("abac");
        boolean result3 = level123.checkPalindrome("a");
        assertTrue(result1);
        assertFalse(result2);
        assertTrue(result3);
    }

    @Ignore
    public void adjacentElementsProduct() {
        int[] array = {3, 6, -2, -5, 7, 3};
        int result1 = level123.adjacentElementsProduct(array);
        assertEquals(result1, 21);
    }

    @Ignore
    public void shapeArea() {
        int result1 = level123.shapeArea(2);
        int result2 = level123.shapeArea(3);
        assertEquals(5, result1);
        assertEquals(13, result2);
    }

    @Ignore
    public void makeArrayConsecutive() {
        int[] array = {6, 2, 3, 8};
        int result = level123.makeArrayConsecutive2(array);
        assertEquals(3, result);
    }

    @Ignore
    public void almostIncreaseSequence() {

        int[] mylist1 = {1, 3, 2, 1};
        int[] mylist2 = {1, 2, 1, 2};
        int[] mylist3 = {1, 1, 1, 2, 3};
        int[] mylist4 = {1, 3, 2};
        int[] mylist5 = {1, 2, 3, 4, 5, 3, 5, 6};
        int[] mylist6 = {1, 1};
        int[] mylist7 = {1, 2, 3, 4, 3, 6};

        boolean result1 = level123.almostIncreaseSequence(mylist1);
        boolean result2 = level123.almostIncreaseSequence(mylist2);
        boolean result3 = level123.almostIncreaseSequence(mylist3);
        boolean result4 = level123.almostIncreaseSequence(mylist4);
        boolean result5 = level123.almostIncreaseSequence(mylist5);
        boolean result6 = level123.almostIncreaseSequence(mylist6);
        boolean result7 = level123.almostIncreaseSequence(mylist7);

        assertFalse(result1);
        assertFalse(result2);
        assertFalse(result3);
        assertTrue(result4);
        assertFalse(result5);
        assertTrue(result6);
        assertTrue(result7);

    }

    @Ignore
    public void almost8IncreaseSequence() {

        int[] mylist1 = {1, 3, 2, 1};
        int[] mylist2 = {1, 2, 1, 2};
        int[] mylist3 = {1, 1, 1, 2, 3};
        int[] mylist4 = {1, 3, 2};
        int[] mylist5 = {1, 2, 3, 4, 5, 3, 5, 6};
        int[] mylist6 = {1, 1};
        int[] mylist7 = {1, 2, 3, 4, 3, 6};
        int[] mylist8 = {10, 1, 2, 3, 4, 5};

        boolean result1 = level123.almost8Increase(mylist1);
        boolean result2 = level123.almost8Increase(mylist2);
        boolean result3 = level123.almost8Increase(mylist3);
        boolean result4 = level123.almost8Increase(mylist4);
        boolean result5 = level123.almost8Increase(mylist5);
        boolean result6 = level123.almost8Increase(mylist6);
        boolean result7 = level123.almost8Increase(mylist7);
        boolean result8 = level123.almost8Increase(mylist8);

        assertFalse(result1);
        assertFalse(result2);
        assertFalse(result3);
        assertTrue(result4);
        assertFalse(result5);
        assertTrue(result6);
        assertTrue(result7);
        assertTrue(result8);

    }

    @Ignore
    public void matrixElementsSum() {
        int[][] ss = {{0, 1, 1, 2},
                {0, 5, 0, 0},
                {2, 0, 3, 3}
        };

        int result = level123.matrixElementsSum(ss);
        assertEquals(result, 9);
    }

    @Ignore
    public void testallLongestString() {
        String[] item = {"aba", "aa", "ad", "vcd", "aba"};
        String[] result = level123.allLongestStrings(item);
        assertTrue(Arrays.equals(result, item));
    }

    @Ignore
    public void testcommonCharacterCount() {
        String s1 = "aabcc";
        String s2 = "adcaa";
        assertEquals(level123.commonCharacterCount(s1, s2), 3);

        String s3 = "zzzz";
        String s4 = "zzzzzzz";
        assertEquals(level123.commonCharacterCount(s3, s4), 4);
    }

    @Ignore
    public void testisLucky() {
        int s = 1230;
        assertTrue(level123.isLucky(s));

        int m = 239017;
        assertFalse(level123.isLucky(m));
    }

    @Ignore
    public void testsortByHeight() {
        int[] ss = {-1, 150, 190, 170, -1, -1, 160, 180};
        int[] result = {-1, 150, 160, 170, -1, -1, 180, 190};

        assertTrue(Arrays.equals(level123.sortByHeight(ss), result));
    }

    @Test
    public void testreverseParantes() {
        String s = "a(bc)de";
        String result = "acbde";
        assertEquals(level123.reverseParentheses(s), result);

        String s1 = "a(bcdefghijkl(mno)p)q";
        String result1 = "apmnolkjihgfedcbq";
        assertEquals(level123.reverseParentheses(s1), result1);

        String s2 = "co(de(fight)s)";
        String result2 = "cosfighted";
        assertEquals(level123.reverseParentheses(s2), result2);

        String s3 = "Code(Cha(lle)nge)";
        String result3 = "CodeegnlleahC";
        assertEquals(level123.reverseParentheses(s3), result3);


        String s4 = "Where are the parentheses?";
        String result4 = "Where are the parentheses?";
        assertEquals(level123.reverseParentheses(s4), result4);

        String s5 = "abc(cba)ab(bac)c";
        String result5 = "abcabcabcabc";
        assertEquals(level123.reverseParentheses(s5), result5);

    }

}
