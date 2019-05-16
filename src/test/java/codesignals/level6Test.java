package codesignals; /**
 * Created by FF on 3/9/17.
 */

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;


public class level6Test {

    private static codesignals.level_6 level_6;

    @BeforeClass
    public static void initLevel1() {
        level_6 = new level_6();
    }

    @Ignore
    public void arrayReplacetest() {
        int elemtoReplace = 1;
        int subst = 3;
        int[] inputArray = {1, 2, 1};
        int[] resultArray = {3, 2, 3};
        assertArrayEquals(resultArray, level_6.arrayReplace(inputArray, elemtoReplace, subst));
    }

    @Test
    public void evenDigitsOnly() {
        assertFalse(level_6.evenDigitsOnly(1222));
    }

    @Test
    public void testvariableName() {
        assertTrue(level_6.variableName("var_1__Int"));
    }

    @Test
    public void testalphabeticShift() {
        String input = "crazy";
        String output = level_6.alphabeticShift(input);

        boolean result = "dsbaz".equals(output);
        assertTrue(result);
    }

}
