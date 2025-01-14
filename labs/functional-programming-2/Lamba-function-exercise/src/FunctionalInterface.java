// Java program to demonstrate functional interface

import java.util.ArrayList;
import java.util.Arrays;

class FunctionalInterface {
    public static void main(String args[]) {
        // create anonymous inner class object
        System.out.println(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5)).stream().toList());
    }
}
