package hackerrank.datastructure;

import java.awt.image.AreaAveragingScaleFilter;
import java.io.InputStream;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static sun.audio.AudioPlayer.player;

class DataStructure {

    void java1darray(int[] arrayInteger) {
        Arrays.stream(arrayInteger).forEach(System.out::println);
    }


    int java2dArray(int[][] arr) {

        int temp, max = Integer.MIN_VALUE;
        for (int i = 0; i < 4; i++) {
            for (int k = 0; k < 4; k++) {
                temp = arr[i][k] + arr[i][k + 1] + arr[i][k + 2]
                        + arr[i + 1][k + 1]
                        + arr[i + 2][k] + arr[i + 2][k + 1] + arr[i + 2][k + 2];
                max = Math.max(temp, max);
            }
        }

        return max;
    }

    int javasubarray(int length, int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = i; j < array.length; j++) {
                sum += array[j];
                if (sum < 0) {
                    count++;
                }
            }
        }
        return count;
    }

    int javaArrayList() {
        Scanner scan = new Scanner(System.in);

        int numblerOfLine = scan.nextInt();


        for (int i = 0; i < numblerOfLine; i++) {

            List input = new ArrayList<Integer>();

            System.out.println("ffa");


        }

        return 0;
    }


    public static void main3(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scan = new Scanner(System.in);
        int numberOfLine = scan.nextInt();


        List<ArrayList<Integer>> listofList = new ArrayList<>();
        for (int i = 0; i < numberOfLine; i++) {
            int line = scan.nextInt();

            ArrayList<Integer> list = new ArrayList<>();
            for (int col = 0; col < line; col++) {
                list.add(scan.nextInt());
            }

            listofList.add(list);
        }

        int query = scan.nextInt();
        for (int i = 0; i < query; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();

            ArrayList<Integer> list = listofList.get(x - 1);
            if (y <= list.size()) {
                System.out.println(list.get(y - 1));
            } else {
                System.out.println("ERROR!");
            }
        }

        scan.close();
    }


    public static void main1(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scan = new Scanner(System.in);
        int numberOfLine = scan.nextInt();

        List<Integer> list = new ArrayList<>(numberOfLine);

        for (int i = 0; i < numberOfLine; i++) {
            int line = scan.nextInt();
            list.add(line);
        }

        int query = scan.nextInt();
        for (int i = 0; i < query; i++) {

            scan.next();
            String command = scan.nextLine();
            scan.next();

            if (command.equals("Insert")) {
                int index = scan.nextInt();
                int param = scan.nextInt();

                list.add(index, param);

            } else if (command.equals("Delete")) {
                int index = scan.nextInt();
                list.remove(index);
            }

        }

        StringBuilder stringBuilder = new StringBuilder();

        list.forEach(stringBuilder::append);
        System.out.println(stringBuilder);


        String result = list.stream().map(i -> i.toString()).collect(Collectors.joining(" "));

        scan.close();
    }

    public static void main2(String[] argh) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        Map<String, Integer> namePhone = new HashMap();

        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            namePhone.put(name, phone);
            in.nextLine();
        }
        while (in.hasNext()) {
            String s = in.nextLine();
            Integer integer = namePhone.get(s);
            if (integer != null) {
                System.out.println(s + "=" + integer);
            } else {
                System.out.println("Not Found");
            }
        }
    }


    static class Student {
        private int id;
        private String fname;
        private double cgpa;

        public Student(int id, String fname, double cgpa) {
            super();
            this.id = id;
            this.fname = fname;
            this.cgpa = cgpa;
        }

        public int getId() {
            return id;
        }

        public String getFname() {
            return fname;
        }

        public double getCgpa() {
            return cgpa;
        }
    }

    public static void main0(String[] args) {

        List<Student> studentList = new ArrayList<Student>();
        Student student1 = new Student(33, "Rumpa", 3.68);
        Student student2 = new Student(85, "Ashis", 3.85);
        Student student3 = new Student(56, "Samiha", 3.75);
        Student student4 = new Student(19, "Samira", 3.75);
        Student student5 = new Student(22, "Fahim", 3.76);


        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);

        studentList.sort(
                (Student s1, Student s2) -> {
                    if (s1.getCgpa() == s2.getCgpa()) {
                        if (s1.getFname().equals(s2.getFname())) {
                            return s1.getId() - s2.getId();
                        } else {
                            return s1.getFname().compareTo(s2.getFname());
                        }

                    } else {
                        return Double.compare(s1.getCgpa(), s2.getCgpa());
                    }
                });


        for (Student st : studentList) {
            System.out.println(st.getFname());
        }
    }


    class Player {
        String name;
        int score;

        Player(String name, int score) {
            this.name = name;
            this.score = score;
        }
    }

    class Checker implements Comparator<Player> {

        @Override
        public int compare(Player o1, Player o2) {
            if (o1.score == o2.score) {
                return o1.name.compareTo(o2.name);
            } else {
                return Integer.compare(o1.score, o2.score);
            }
        }
    }


    public void compareJava(String[] args) {

        Player[] player = new Player[2];
        Checker checker = new Checker();
        player[0] = new Player("ff", 100);
        player[1] = new Player("ss", 10);


        Arrays.sort(player, checker);

        for (int i = 0; i < player.length; i++) {
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }


}
