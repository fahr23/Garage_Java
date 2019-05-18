package codesignals; /**
 * Created by FF on 3/9/17.
 */

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class level4Test {

    private static codesignals.level4 level4;

    @BeforeClass
    public static void initLevel1() {
        level4 = new level4();
    }

    @Ignore
    public void alternatigSums() {
        //year 1<=year<=2005
        int[] ss = {50, 60, 60, 45, 70};
        int[] result = {180, 105};

        assertTrue(Arrays.equals(level4.alternatingSums(ss), result));
    }

    @Ignore
    public void addBorder() {
        String[] picture = {"abc", "ded"};
        String[] result = {"*****", "*abc*", "*ded*", "*****"};

        assertTrue(Arrays.equals(level4.addBorder(picture), result));
    }

    @Ignore
    public void arrayChange() {
        int[] inputArray1 = {1, 1, 1};
        int result1 = 3;
        assertEquals(result1, level4.arrayChange(inputArray1));

        int[] inputArray2 = {-1000, 0, -2, 0};
        int result2 = 5;
        assertEquals(result2, level4.arrayChange(inputArray2));
    }

    @Test
    public void palindromeRearrenging() {
        String in = "aabb";
        assertTrue(level4.palindromeRearrenging(in));
    }

}
