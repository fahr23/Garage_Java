package hackerrank.interview_preparation_kit;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

import static hackerrank.interview_preparation_kit.hashTablesRansomNote.Solution.checkMagazine;

public class hashTablesRansomNote {


    public static class Solution {

        // Complete the checkMagazine function below.
        static void checkMagazine(String[] magazine, String[] note) {
            Hashtable<String, Integer> mag = new Hashtable<>();

            for(int i=0; i< magazine.length;i++){
                mag.merge(magazine[i],1, Integer::sum);
            }


            for (int i = 0; i < note.length; i++) {
                if (mag.containsKey(note[i]) && mag.get(note[i]) > 0) {
                    mag.merge(note[i], -1, Integer::sum);
                } else {
                    System.out.println("No");
                    return;
                }
            }
            System.out.println("Yes");
        }



        }

        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            String[] mn = scanner.nextLine().split(" ");

            int m = Integer.parseInt(mn[0]);

            int n = Integer.parseInt(mn[1]);

            String[] magazine = new String[m];

            String[] magazineItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < m; i++) {
                String magazineItem = magazineItems[i];
                magazine[i] = magazineItem;
            }

            String[] note = new String[n];

            String[] noteItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                String noteItem = noteItems[i];
                note[i] = noteItem;
            }

            checkMagazine(magazine, note);

            scanner.close();
        }
    }

