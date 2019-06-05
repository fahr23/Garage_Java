package hackerrank.datastructure;

import java.util.*;


class Student {

    private int id;
    private String name;
    private Double cgpa;

    public Student(int id, String name, Double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getCgpa() {
        return cgpa;
    }
}

class Priorities {
    private final PriorityQueue<Student> queue = new PriorityQueue<>(
            Comparator.comparing(Student::getCgpa).reversed()
                    .thenComparing(Student::getName)
                    .thenComparing(Student::getId));

    List<Student> getStudents(List<String> events) {
        for (int i = 0; i < events.size(); i++) {
            if (events.get(i).contains("SERVED")) {
                if (queue.size() > 0) { queue.poll(); }
            } else {
                String[] data = events.get(i).split(" ");
                queue.add(new Student(Integer.parseInt(data[3]), data[1], Double.valueOf(data[2])));
            }
        }

        List<Student> result = new ArrayList<>();
        while (queue.size() > 0) {
            result.add(queue.poll());
        }

        return result;
    }
}

public class DataStructure_PriorityQueue {

    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st : students) {
                System.out.println(st.getName());
            }
        }
    }


}
