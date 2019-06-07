package hackerrank.interview_preparation_kit;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class jumpingClouds {


    public static class Solution {

        // Complete the jumpingOnClouds function below.
        static int jumpingOnClouds(int[] c) {

            int n = 0;
            for (int i = 0; i < c.length-1; i++) {

                if (i+2<c.length-1 && c[i + 2] == 0 ) {
                    i = i + 1;
                    n++;
                } else {
                    n++;
                }
            }
            return n;

        }

        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) throws IOException {

            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] c = new int[n];

            String[] cItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int cItem = Integer.parseInt(cItems[i]);
                c[i] = cItem;
            }

            int result = jumpingOnClouds(c);

            scanner.close();
        }
    }

}
