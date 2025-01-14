import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaExample {
    public static void main(String[] args) {
        // create the list
        List<String> names = new ArrayList<>();

        //add elements
        names.add("Oliver");
        names.add("Robert");
        names.add("Ben");
        names.add("Sam");
        names.add("Nick");

        // use lambda function to display the list
        System.out.println(names.stream().toList());
    }
}