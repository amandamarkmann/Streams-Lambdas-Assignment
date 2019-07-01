package se.lexicon.streams_and_lambda.examples;

import java.util.Arrays;
import java.util.List;


public class Example1 {


    public static void main(String[] args) {

        List<String> myList =
                Arrays.asList("a1", "a2", "b1", "c2", "c1");

        myList.stream()
                .filter(s -> s.startsWith("c"))
                .map(s -> s.toUpperCase())
                .sorted()
                .forEach(s -> System.out.println(s));
        

// C1
// C2
    }

}
