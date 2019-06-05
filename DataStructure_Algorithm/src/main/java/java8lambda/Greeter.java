package java8lambda;

import java.awt.*;
import java.util.Arrays;
import java.util.List;

public class Greeter {


    public void greet(Greeting greeting) {
        greeting.perform();

        Greeting ss = () -> {
            System.out.println("fa");
        };
    }


    public void collections(){
        List<Integer> ss = Arrays.asList(1, 2, 4);

        ss.forEach(System.out::println);

        long count = ss.stream().filter(p -> p % 2==0)
                .count();

        System.out.println(count);
    }
}
