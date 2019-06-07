package hackerrank.interview_preparation_kit;

import java.io.IOException;
import java.util.Scanner;

public class CountingValleys {


    public static class Solution {

        // Complete the countingValleys function below.
        static int countingValleys(int n, String s) {

            int sum=0, prevSum=0, valley=0;
            for(int i=0;i<n;i++){

                if(s.charAt(i)=='U'){
                    sum +=1;
                }else{
                    sum -=1;
                }

                if(sum==0 && prevSum<0){
                    valley+=1;
                }

                prevSum=sum;

            }

            return valley;
        }

        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) throws IOException {

            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            String s = scanner.nextLine();

            int result = countingValleys(n, s);


            scanner.close();
        }
    }




}
