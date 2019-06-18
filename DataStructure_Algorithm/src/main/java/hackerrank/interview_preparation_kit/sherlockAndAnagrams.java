package hackerrank.interview_preparation_kit;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.*;

public class sherlockAndAnagrams {


    // Complete the sherlockAndAnagrams function below.
    static int sherlockAndAnagrams(String s) {


        List list= new ArrayList<>();
        int count=0;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                char[] chars = s.substring(i, j).toCharArray();
                Arrays.sort(chars);
                list.add(chars);
            }
        }


        for(int i=0;i<list.size();i++){
            for(int k=i+1; k<list.size();k++){
                if(Arrays.equals((char[]) list.get(i),(char[])list.get(k))){
                    count++;
                }
            }
        }

        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = sherlockAndAnagrams(s);

        }


        scanner.close();
    }

}
