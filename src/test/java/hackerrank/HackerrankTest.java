package hackerrank;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class HackerrankTest {

    private static Hackerrank hackerrankjava;

    @BeforeClass
    public static void init() {
        hackerrankjava = new Hackerrank();
    }

    @Test
    public void ifelsetest() {
        hackerrankjava.javaifelse(3);
        hackerrankjava.javaifelse(24);

    }

    @Test
    public void stdinstdouttest() {
        hackerrankjava.javastdinstdoit2(23, 23.2, "fa");
    }

    @Test
    public void testjavadatetime() {
        hackerrankjava.findDay(1, 20, 2019);
    }

    @Test
    public void javacurrencyFormatter() {

        double payment = 12324.134;
        hackerrankjava.javacurrencyFormatter(payment);

    }

    @Test
    public void javastringintoruction() {
        String A = "hello";
        String B = "java";

        hackerrankjava.javastringintoruction(A, B);

    }

    @Test
    public void javasubstring() {
        String s = "Helloworld";
        int start = 3;
        int end = 7;

        String result = hackerrankjava.javasubstring(s, start, end);
        Assert.assertEquals("lowo", result);
    }

    @Test
    public void getSmallestAndLargest() {
        String s = "welcometojava";
        int k = 3;

        String result = hackerrankjava.getSmallestAndLargest(s, k);
        String expected = "ava" + "\n" + "wel";

        Assert.assertEquals(expected, result);
    }

    @Test
    public void deneme() {
        hackerrankjava.denemeStreams();
    }


    @Test
    public void isAnagram() {

        String a = "anagramm";
        String b = "marganaa";
        boolean result = hackerrankjava.isAnagram(a, b);
        assertFalse(result);

        String c = "Hello";
        String d = "hello";
        boolean result2 = hackerrankjava.isAnagram(c, d);
        assertTrue(result2);


    }
}
