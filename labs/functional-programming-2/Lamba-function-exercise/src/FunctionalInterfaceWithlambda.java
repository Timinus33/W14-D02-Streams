// Java program to demonstrate Implementation of
// functional interface using lambda expressions

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

class FunctionalInterfaceWithlambda {
    public static void main(String args[]) {
        // lambda expression to create the object
        var list = new ArrayList<>(Arrays.asList(new Person("Tom"), new Person("Bob"), new Person("Peter")));
        list.stream().sorted(Comparator.comparing(Person::name)).forEach(System.out::println);
    }

    record Person(String name) {
    }
}
