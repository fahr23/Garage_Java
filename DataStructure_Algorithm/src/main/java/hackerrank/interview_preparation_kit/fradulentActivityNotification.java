package hackerrank.interview_preparation_kit;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.stream.IntStream;

public class fradulentActivityNotification {


    public static class Solution {

        // Complete the activityNotifications function below.
        static int activityNotifications(int[] expenditure, int d) {


            IntStream intStream = IntStream.rangeClosed(0, d).sorted();

            int median= d%2==0? (int) intStream.skip(d / 2 - 1).limit(2).average().getAsDouble() :intStream.skip(d/2).findFirst().getAsInt();

            IntStream stream=IntStream.rangeClosed(d, expenditure.length);


            return 0;
        }

        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) throws IOException {

            String[] nd = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nd[0]);

            int d = Integer.parseInt(nd[1]);

            int[] expenditure = new int[n];

            String[] expenditureItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int expenditureItem = Integer.parseInt(expenditureItems[i]);
                expenditure[i] = expenditureItem;
            }

            int result = activityNotifications(expenditure, d);

            scanner.close();
        }
    }


}
