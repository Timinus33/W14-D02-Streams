import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierSimpleExampleWithLambda {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>(Arrays.asList(
                new Student(1, "Tom", "male", 20),
                new Student(1, "Rebecca", "female", 25),
                new Student(1, "Helen", "female", 21),
                new Student(1, "John", "male", 27),
                new Student(1, "Bob", "male", 23)
        ));

        Supplier<List<Student>> supplier = () -> list;
        System.out.println(supplier.get());

    }
}
