package codesignals; /**
 * Created by FF on 3/9/17.
 */

import org.junit.*;

import static org.junit.Assert.assertEquals;


public class level_5_Test {

    private static level5 level_5;

    @BeforeClass
    public static void initLevel1() {
        level_5 = new level5();
    }

    @Before
    public void beforeEachTest() {
        System.out.println("this is executed before each test");
    }

    @After
    public void afterEactTest() {
        System.out.println("this is executed after eacth test");
    }

    @Ignore
    public void areEquallyStrongtest() {
        int yourleft = 10, yourrigh = 15, frleft = 15, friright = 10;
        assertEquals(true, level_5.areEquallyStrong(yourleft, yourrigh, frleft, friright));
    }

    @Ignore
    public void arrayMaximalAdjacentDifference() {
        int[] ss = {2, 4, 1, 0};
        assertEquals(3, level_5.arrayMaximalAdjacentDifference(ss));
    }

    @Test
    public void isIPv4Address() {
        String ss = ".254.255.0";
        assertEquals(false, level_5.isIPv4Address(ss));

        String ff = "1.1.1.1a";
        assertEquals(false, level_5.isIPv4Address(ff));

    }

}
