package codesignals;

import java.util.Arrays;

/**
 * Created by FF on 3/9/17.
 */
public class level_6 {

    public int[] arrayReplace(int[] inputAray, int elemToReplace, int subst) {
        return Arrays.stream(inputAray).map(i -> i == elemToReplace ? subst : i).toArray();
    }

    public boolean evenDigitsOnly(int n) {
        return Integer.toString(n).matches("(0|2|3|4|8)");
    }

    public boolean variableName(String name) {
        return name.matches("[a-zA-Z_][a-zA-Z0-9_]*");
    }

    public String alphabeticShift(String inputString) {

        char[] ss = inputString.toCharArray();

        for (int i = 0; i < ss.length; ++i) {
            ss[i]++;
            if (ss[i] > 'z')
                ss[i] = 'a';
        }
        return new String(ss);

    }
}
