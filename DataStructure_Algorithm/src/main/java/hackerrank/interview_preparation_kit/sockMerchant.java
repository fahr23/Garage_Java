package hackerrank.interview_preparation_kit;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class sockMerchant {


    public static class Solution {

        // Complete the sockMerchant function below.
        public static int sockMerchant(int n, int[] ar) {
            Map<Integer, Integer> integerHashMap= new HashMap<>();
            for(int i=0;i<ar.length;i++){
                if(integerHashMap.containsKey(ar[i])){
                    integerHashMap.put(ar[i],integerHashMap.get(ar[i])+1);
                }else{
                    integerHashMap.put(ar[i],1);
                }

            }

            final int[] result = {0};
            integerHashMap.values().forEach(a-> {
                result[0] +=a/2;
            });

            return result[0];
        }


        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) throws IOException {

            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] ar = new int[n];

            String[] arItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int arItem = Integer.parseInt(arItems[i]);
                ar[i] = arItem;
            }

            int result = sockMerchant(n, ar);

            scanner.close();
        }
    }


}
