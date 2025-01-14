import model.Student;

import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(Arrays.asList(
                new Student("Alice", 20, 88.5),
                new Student("Bob", 22, 75.0),
                new Student("Charlie", 23, 92.0),
                new Student("David", 21, 84.0),
                new Student("Eve", 22, 90.5)
        ));

        // 3.1
        System.out.println("3.1");
        students.forEach(System.out::println);
        System.out.println();

        // 3.2
        System.out.println("3.2");
        students.stream().map(student -> student.getName().toUpperCase()).forEach(System.out::println);
        System.out.println();

        // 3.3
        System.out.println("3.3");
        students.stream().filter(student -> student.getAge() >= 22).forEach(System.out::println);
        System.out.println();

        // 3.4
        System.out.println("3.4");
        students.stream().sorted(Comparator.comparingDouble(Student::getGrade)).forEach(System.out::println);
        System.out.println();

        // 3.5
        System.out.println("3.5");
        students.stream().map(Student::getName).distinct().forEach(System.out::println);
        System.out.println();

        // 3.6
        System.out.println("3.6");
        System.out.println("Students older than 21: " + students.stream().filter(student -> student.getAge() > 21).count());
        System.out.println();

        // 4.1
        System.out.println("4.1");
        List<String> names = students.stream()
                .filter(student -> student.getGrade() > 80)
                .map(Student::getName)
                .toList();
        System.out.println(names + "\n");

        // 5.1
        System.out.println("5.1");
        System.out.println("Average age of students: " + students.stream().mapToInt(Student::getAge).average().orElse(-1));
        System.out.println();

        // 5.2
        System.out.println("5.2");
        System.out.println("The sum of all student grades: " + students.stream().mapToDouble(Student::getGrade).sum());
        System.out.println();

        // 6.1
        System.out.println("6.1");
        System.out.println("Parallel stream -> The sum of all student grades: " + students.parallelStream().mapToDouble(Student::getGrade).sum());
        System.out.println();

        // 6.2
        System.out.println("6.2");
        List<Student> list = new ArrayList<>();
        for (int i = 1; i < 1_000_000; i++) {
            list.add(new Student("#" + i, (int) (Math.random() * 100) + 18, (Math.random() * 100) + 1));
        }

        long start, end;
        start = System.nanoTime();
        list.stream().mapToDouble(Student::getGrade).sum();
        end = System.nanoTime();
        System.out.printf("Sequential stream processing time: %d milliseconds.\n", TimeUnit.NANOSECONDS.toMillis(end - start));

        start = System.nanoTime();
        list.parallelStream().mapToDouble(Student::getGrade).sum();
        end = System.nanoTime();
        System.out.printf("Parallel stream processing time: %d milliseconds.", TimeUnit.NANOSECONDS.toMillis(end - start));
    }
}
