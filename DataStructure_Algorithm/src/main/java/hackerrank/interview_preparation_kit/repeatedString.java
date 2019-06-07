package hackerrank.interview_preparation_kit;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;

public class repeatedString {


    public static class Solution {

        // Complete the repeatedString function below.
        static long repeatedString(String s, long n) {

            long count = 0;

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'a')
                    count++;
            }

            long repeatCount = n / s.length();
            count = count * repeatCount;
            long remain = n % s.length();

            for (int j = 0; j < remain; j++) {
                if(s.charAt(j)=='a')
                    count++;
            }

            return count;
        }

        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) throws IOException {

            String s = scanner.nextLine();

            long n = scanner.nextLong();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            long result = repeatedString(s, n);
            scanner.close();
        }
    }


}
