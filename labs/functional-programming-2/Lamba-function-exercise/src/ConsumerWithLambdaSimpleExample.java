import java.util.ArrayList;
import java.util.Arrays;

public class ConsumerWithLambdaSimpleExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        list.stream().forEach(a -> System.out.println(a));
    }
}
