package hackerrank.interview_preparation_kit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class countTriplets {


    public static class Solution {


        // Complete the countTriplets function below.
        static long countTriplets(List<Long> arr, long r) {

            int count=0;
            if(r==1){

                //for 1 case does not work

                return count;
            }
            Map<Integer, Double> linkedhashmap = new LinkedHashMap<>();

            for (int i = 0; i < arr.size(); i++) {

                double ss = Math.log(arr.get(i)) / Math.log(r);
                linkedhashmap.put(i, ss);


            }

            Set set = linkedhashmap.entrySet();
            Iterator iterator = set.iterator();

            Integer[] array=new Integer[linkedhashmap.size()];
            Arrays.fill(array,0);

            while (iterator.hasNext()) {
                Map.Entry item = (Map.Entry) iterator.next();
                array[(((Double)item.getKey()).intValue())]= ((Double) item.getValue()).intValue();

            }

            for(int i=0;i<array.length-2;i++){

                count+=array[i]*array[i+1]*array[i+2];
            }


            return count;

        }

        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            String[] nr = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            int n = Integer.parseInt(nr[0]);

            long r = Long.parseLong(nr[1]);

            List<Long> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Long::parseLong)
                    .collect(toList());

            long ans = countTriplets(arr, r);
        }
    }


}
