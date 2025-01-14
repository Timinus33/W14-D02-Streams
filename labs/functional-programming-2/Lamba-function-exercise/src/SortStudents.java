import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class SortStudents {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>(Arrays.asList(
                new Student(1, "Tom", "male", 20),
                new Student(1, "Rebecca", "female", 25),
                new Student(1, "Helen", "female", 21),
                new Student(1, "John", "male", 27),
                new Student(1, "Bob", "male", 23)
        ));

        // Comparator sorting
        System.out.println(list.stream().sorted(Comparator.comparing(Student::getName)).toList());

        // Lambda expression sorting
        System.out.println(list.stream().sorted((a, b) -> a.getName().compareTo(b.getName())).toList());
    }
}
