package codesignals;

/**
 * Created by FF on 3/9/17.
 */
class level4 {

    int[] alternatingSums(int[] a) {
        int[] ret = new int[2];
        for (int i = 0; i < a.length; i++) {
            if ((i % 2) == 0)
                ret[0] += a[i];
            else
                ret[1] += a[i];
        }
        return ret;
    }

    String[] addBorder(String[] picture) {
        String[] ret = new String[picture.length + 2];
        StringBuilder ss = new StringBuilder("");
        for (int j = 0; j < picture[0].length(); j++) {
            ss.append("*");
        }
        ss.append("**");
        ret[0] = ss.toString();

        for (int i = 0; i < picture.length; i++) {
            ret[i + 1] = "*" + picture[i] + "*";
        }

        ret[picture.length + 1] = ret[0];
        return ret;
    }

    int arrayChange(int[] inputArray) {
        int result = 0;
        for (int i = 0; i < inputArray.length - 1; i++) {
            while (inputArray[i + 1] <= inputArray[i]) {
                inputArray[i + 1]++;
                result++;
            }
        }
        return result;
    }

    boolean palindromeRearrenging(String inputString) {
        int[] test = new int[26];
        for (int i = 0; i < inputString.length(); i++) {
            test[inputString.charAt(i) - 97]++;
        }
        int odd = 0;
        for (int i = 0; i < 26; i++) {
            if (test[i] % 2 != 0) {
                odd++;
            }
        }
        return odd <= 1;
    }

}
