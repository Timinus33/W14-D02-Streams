import java.util.ArrayList;
import java.util.Arrays;

public class PredicateWithLamda {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        list.stream().filter(a -> a > 5).forEach(System.out::println);
    }
}
