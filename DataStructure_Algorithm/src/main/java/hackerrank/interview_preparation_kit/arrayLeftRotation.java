package hackerrank.interview_preparation_kit;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.stream.Stream;

public class arrayLeftRotation {


    public static class Solution {

        // Complete the rotLeft function below.
        static int[] rotLeft(int[] a, int d) {

            int[] result = new int[a.length];
            int index = 0;

            for (int i = d; i < a.length; i++) {
                result[index++] = a[i];
            }

            for (int j = 0; j < d; j++) {
                result[index++] = a[j];
            }

            return result;

        }

        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) throws IOException {

            String[] nd = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nd[0]);

            int d = Integer.parseInt(nd[1]);

            int[] a = new int[n];

            String[] aItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int aItem = Integer.parseInt(aItems[i]);
                a[i] = aItem;
            }

            int[] result = rotLeft(a, d);

            scanner.close();
        }
    }


}
