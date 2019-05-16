package codesignals;

import java.util.*;

/**
 * Created by FF on 3/9/17.
 */
class level123 {

    int centuryFromYear(int year) {
        int kalan = (year % 100);
        if (kalan != 0) {
            return (year - kalan) / 100 + 1;
        }
        return (year - kalan) / 100;
    }

    boolean checkPalindrome(String inputString) {

        if (inputString.length() == 1)
            return true;

        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) != inputString.charAt(inputString.length() - i - 1))
                return false;
        }

        return true;
    }

    int adjacentElementsProduct(int[] inputArray) {
        int max = inputArray[0] * inputArray[1];
        for (int i = 0; i < inputArray.length - 1; i++) {
            if (inputArray[i] * inputArray[i + 1] > max)
                max = inputArray[i] * inputArray[i + 1];
        }
        return max;
    }

    int shapeArea(int n) {
        int maxhight = 2 * n - 1;
        int shapeArea = 0;
        for (int i = 0; i < n; i++) {
            shapeArea += 2 * i + 1;
        }
        return 2 * shapeArea - maxhight;
    }

    int makeArrayConsecutive2(int[] inputArray) {

        Arrays.sort(inputArray);
        int min = inputArray[0];
        int max = inputArray[inputArray.length - 1];

        int result = 0;

        for (int m = min; m < max; m++) {
            for (int n : inputArray) {
                if (m == n) {
                    result++;
                }
            }
        }

        return max - min - result;
    }

    boolean almostIncreaseSequence(int[] inputArray) {

        boolean[] resultArray = new boolean[inputArray.length];
        for (int kk = 0; kk < inputArray.length; kk++) {
            resultArray[kk] = true;
        }
        List<Integer> intList = new ArrayList<>();
        for (int i = 0; i < inputArray.length; i++) {
            intList.clear();
            //createing new array
            for (int j = 0; j < inputArray.length; j++) {
                if (j != i) {
                    intList.add(inputArray[j]);
                }
            }
            int[] mm = intList.stream().mapToInt(Integer::intValue).toArray();
            for (int h = 0; h < inputArray.length - 1; h++) {
                for (int m = h + 1; m < inputArray.length - 1; m++) {

                    if (mm[h] >= mm[m]) {
                        resultArray[i] = false;
                    }
                }
            }
        }
        for (int ss = 0; ss < inputArray.length; ss++) {
            if (resultArray[ss])
                return true;
        }
        return false;
    }

    boolean almost8Increase(int[] sequence) {

        int[] diff = new int[sequence.length - 1];
        int neg = 0;
        for (int i = 0; i < sequence.length - 1; i++) {
            diff[i] = sequence[i + 1] - sequence[i];
            if (diff[i] <= 0) neg++;
            if (neg == 2) return false;
        }
        for (int i = 1; i < diff.length - 1; i++) {
            if (diff[i] <= 0) {
                if (diff[i - 1] + diff[i] <= 0 && diff[i] + diff[i + 1] <= 0) {
                    return false;
                }
            }
        }
        return true;
    }

    int matrixElementsSum(int[][] matrix) {
        int result = 0;
        for (int i = 0; i < matrix[0].length; i++) {
            for (int k = 0; k < matrix.length; k++) {
                if (matrix[k][i] != 0)
                    result = result + matrix[k][i];
                else
                    break;
            }
        }
        return result;
    }

    String[] allLongestStrings(String[] inputArray) {
        int maxLength = Arrays.stream(inputArray).mapToInt(String::length).max().getAsInt();
        return Arrays.stream(inputArray).filter(str -> str.length() == maxLength).toArray(String[]::new);
    }

    int commonCharacterCount(String a, String b) {

        StringBuilder aa = new StringBuilder(a);
        StringBuilder bb = new StringBuilder(b);

        int s = 0;
        Set<Integer> set = new HashSet<>();
        if (a.length() > b.length()) {
            for (int i = 0; i < b.length(); i++) {
                char ch = b.charAt(i);
                int indexof = aa.toString().indexOf(ch);
                if (indexof != -1 && !set.contains(indexof)) {
                    s++;
                    aa.setCharAt(indexof, '8');
                    set.add(indexof);
                }
            }
        } else {
            for (int i = 0; i < a.length(); i++) {
                char ch = a.charAt(i);
                int indexof = bb.toString().indexOf(ch);
                if (indexof != -1 && !set.contains(indexof)) {
                    set.add(indexof);
                    bb.setCharAt(indexof, '8');
                    s++;
                }
            }
        }
        return s;
    }

    boolean isLucky(int n) {
        String ss = Integer.toString(n);
        int first = 0, second = 0;
        char[] array = ss.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (i < array.length / 2) {
                first += Character.getNumericValue(array[i]);
            } else {
                second += Character.getNumericValue(array[i]);
            }
        }
        return first == second;

    }

    int[] sortByHeight(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == -1) continue;
            for (int j = 0; j < a.length; j++) {
                if (a[j] == -1) continue;
                if (a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }

    String reverseParentheses(String s) {
        int st = s.lastIndexOf('(');
        while (st != -1) {
            int ed = s.indexOf(')', st);
            String t = s.substring(0, st);
            t += new StringBuffer(s.substring(st + 1, ed)).reverse().toString();
            t += s.substring(ed + 1);
            s = t;
            st = s.lastIndexOf('(');
        }
        return s;
    }
}
