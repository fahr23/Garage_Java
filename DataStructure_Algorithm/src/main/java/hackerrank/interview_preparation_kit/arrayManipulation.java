package hackerrank.interview_preparation_kit;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.stream.LongStream;

public class arrayManipulation {


    public static class Solution {

        // Complete the arrayManipulation function below.
        static long arrayManipulation(int n, int[][] queries) {
            long[] count= new long[n];

            for(int row=0;row<queries.length;row++){

                int first = queries[row][0];
                int second = queries[row][1];
                int added = queries[row][2];


                for(int i=first-1; i<second; i++){
                    count[i]=count[i]+ added;
                }
            }

            return  LongStream.of(count).max().getAsLong();

        }

        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) throws IOException {

            String[] nm = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nm[0]);

            int m = Integer.parseInt(nm[1]);

            int[][] queries = new int[m][3];

            for (int i = 0; i < m; i++) {
                String[] queriesRowItems = scanner.nextLine().split(" ");
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                for (int j = 0; j < 3; j++) {
                    int queriesItem = Integer.parseInt(queriesRowItems[j]);
                    queries[i][j] = queriesItem;
                }
            }

            long result = arrayManipulation(n, queries);
            scanner.close();
        }
    }


}
