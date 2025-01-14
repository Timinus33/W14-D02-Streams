
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
        import java.util.function.Predicate;

class BiggerThanFive<E> implements Predicate<Integer> {

    @Override
    public boolean test(Integer v) {
        return v > 5;
    }
}

public class PredicateWithoutLambdaExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        list.stream().filter(new BiggerThanFive<>()).forEach(System.out::println);
    }
}