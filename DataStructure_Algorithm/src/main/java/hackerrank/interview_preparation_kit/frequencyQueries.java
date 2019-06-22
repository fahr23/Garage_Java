package hackerrank.interview_preparation_kit;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class frequencyQueries {


    public static class Solution {

        // Complete the freqQuery function below.
        static List<Integer> freqQuery(List<List<Integer>> queries) {


            List<Integer> response = new ArrayList();
            List<Integer> result = new ArrayList();

            Map<Integer, Integer> mapfrequency = new HashMap<>();

            queries.stream().forEach(e -> {
                        System.out.println(e.get(0));
                        if (e.get(0) == 1) {
                            //response.add(e.get(1));
                            mapfrequency.merge(e.get(1), 1, Integer::sum);
                        } else if (e.get(0) == 2) {
                            Integer integer = mapfrequency.get(e.get(1));
                            if(integer!=null && integer>0){
                                mapfrequency.merge(e.get(1), -1, Integer::sum);
                            }
                            //if (response.remove(e.get(1))) {
                            //}

                        } else if (e.get(0) == 3) {

                            Optional<Integer> first = mapfrequency.values().stream().filter(v -> v == e.get(1)).findFirst();

                            if (first.isPresent())
                                result.add(1);
                            else
                                result.add(0);
                        }
                    }
            );


            return result;


        }

        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("fa"));

            int q = Integer.parseInt(bufferedReader.readLine().trim());

            List<List<Integer>> queries = new ArrayList<>();

            IntStream.range(0, q).forEach(i -> {
                try {
                    queries.add(
                            Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                    .map(Integer::parseInt)
                                    .collect(toList())
                    );
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            });

            List<Integer> ans = freqQuery(queries);

            bufferedWriter.write(
                    ans.stream()
                            .map(Object::toString)
                            .collect(joining("\n"))
                            + "\n"
            );

            bufferedReader.close();
            bufferedWriter.close();
        }
    }


}
