import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class ConsumerWithLambda {
    public static void main(String[] args) {
        Consumer<Integer> consumer = number -> System.out.println(number);
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        list.stream().forEach(consumer);
    }
}
