package hackerrank;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

import static java.lang.Character.MAX_VALUE;

class Hackerrank {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

    }

    void javaifelse(int N) {

        if (N % 2 == 1)
            System.out.println("Weird");
        else {
            if (2 < N && N < 5)
                System.out.println("Not Weird");
            else if (6 < N && N < 20)
                System.out.println("Weird");
            else if (N > 20)
                System.out.println("Not Weird");

        }
    }

    void javastdinstdoit2(Integer i, Double d, String s) {

        StringBuilder stringBuilder = new StringBuilder();
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }

    public void javafor() {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int total = a;
            for (int j = 0; j < n; j++) {
                System.out.print(total + (int) Math.pow(2, j) * b + " ");
                total += (int) (Math.pow(2, j) * b);
            }
            System.out.println();
        }

        scanner.close();
    }

    public void findDay(int month, int day, int year) {

        LocalDate dt = LocalDate.of(year, month, day);
        String ff = String.valueOf(dt);
    }

    public String javasubstring(String s, int start, int end) {

        String substring = s.substring(start, end);
        return substring;
    }

    public String getSmallestAndLargest(String s, int k) {

        SortedSet sets = new TreeSet();

        for (int i = 0; i <= s.length() - k; i++) {
            sets.add(s.substring(i, i + k));
        }

        String first = (String) sets.first();
        String last = (String) sets.last();

        return first + "\n" + last;
    }

    public void denemeStreams() {

        Stream<Integer> stream = Stream.of(1, 2, 3, 5);
        stream.forEach(p -> System.out.println(p));

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            list.add(i);
        }

        Stream<Integer> stream1 = list.stream();
        stream1.forEach(p -> System.out.println(p));

        List<Integer> alist = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            list.add(i);
        }

        Stream stream2 = list.stream();

    }

    public boolean isAnagram(String a, String b) {


        Supplier<Long[]> start = () -> {
            Long[] v = new Long[MAX_VALUE];
            Arrays.fill(v, 0L);
            return v;
        };
        ObjIntConsumer<Long[]> accumulator = (map, number) -> {
            map[number]++;
        };
        BiConsumer<Long[], Long[]> combiner = (map1, map2) -> {
        };

        return Arrays.equals(a.toLowerCase().chars().collect(start, accumulator, combiner),
                b.toLowerCase().chars().collect(start, accumulator, combiner));


    }

    public void javacurrencyFormatter(double payment) {

        Locale myLocale = new Locale("en", "IN");

        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String india = NumberFormat.getCurrencyInstance(myLocale).format(payment);
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }

    public void javastringintoruction(String a, String b) {

        System.out.println(a.length() + b.length());

        int i = a.compareTo(b);
        if (i > 0) {
            System.out.println("YES");
        } else
            System.out.println("NO");

        System.out.println(a.substring(0, 1).toUpperCase() + a.substring(1) + " " + b.substring(0, 1).toUpperCase() + b.substring(1));


    }

    public static class staticInitilalizerBlock_SolutiRon {

        static boolean flag = true;
        static int B, H;

        static {

            Scanner scan = new Scanner(System.in);
            B = scan.nextInt();
            scan.nextLine();
            H = scan.nextInt();
            scan.close();
            if ((B <= 0 || H <= 0)) {
                flag = false;
                System.out.println("java.lang.Exception: Breadth and height must be positive");
            } else {
                flag = true;
            }
        }

        public static void main(String[] args) {
            if (flag) {
                int area = B * H;
                System.out.print(area);
            }

        }//end of main

    }//end of class


}
