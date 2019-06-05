package hackerrank.datastructure;

import java.util.*;

public class DataStructure_Stack {


    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input = sc.next();
            Deque<Character> stacks = new ArrayDeque<>();
            //Complete the code

            Map<Character, Character> map = new HashMap<>();
            map.put('(', ')');
            map.put('[', ']');
            map.put('{', '}');

            if (input.length() % 2 == 1) {
                System.out.println("false");
                continue;
            }

            for (int i = 0; i < input.length(); i++) {

                Character ch = input.charAt(i);

                if (map.containsKey(ch)) {
                    stacks.push(ch);
                } else if (stacks.isEmpty() || ch != map.get(stacks.pop())) {
                    System.out.println("false");
                    break;
                }
            }

        }

    }
}
