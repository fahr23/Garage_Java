package hackerrank.interview_preparation_kit;

import java.io.*;
import java.math.*;
import java.security.*;
import java.sql.Array;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.stream.IntStream;

public class minimumSwap2 {


    public static class Solution {

        // Complete the minimumSwaps function below.
        static int minimumSwaps(int[] arr) {

            int swap=0;
            boolean newarr[]=new boolean[arr.length];

            for(int i=0;i<arr.length;i++){
                int j=i,count=0;

                while(!newarr[j]){
                    newarr[j]=true;
                    j=arr[j]-1;
                    count++;
                }

                if(count!=0)
                    swap+=count-1;
            }
            return swap;


            /*
            ///int[] tmp = Arrays.copyOf(arr, arr.length);
            //Arrays.sort(tmp);
            int[] tmp=Arrays.stream(arr).sorted().toArray();
            int count=0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]==tmp[i]){
                    continue;
                }else{
                    int finalTmp = tmp[i];
                    int index = IntStream.range(0, arr.length).filter(e -> arr[e] == finalTmp).findFirst().getAsInt();
                    int temp=arr[i];
                    arr[i]=arr[index];
                    arr[index]=temp;
                    count++;
                }
            }


            System.out.println(count);
            return 0;
        */
        }

        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) throws IOException {

            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] arr = new int[n];

            String[] arrItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int arrItem = Integer.parseInt(arrItems[i]);
                arr[i] = arrItem;
            }

            int res = minimumSwaps(arr);


            scanner.close();
        }
    }


}
