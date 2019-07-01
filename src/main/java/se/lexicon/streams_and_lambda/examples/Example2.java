package se.lexicon.streams_and_lambda.examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;



public class Example2 {
    public static void main(String[] args) {

        List<Person> persons =
                Arrays.asList(
                        new Person("Max", 18),
                        new Person("Peter", 23),
                        new Person("Pamela", 22),
                        new Person("David", 12));


        List<Person> filtered = persons
                        .stream()
                        .filter(p -> p.name.startsWith("P"))
                        .sorted((p1,p2)-> p1.age - p2.age)
                        .collect(Collectors.toList());

        System.out.println(filtered);
        // [Peter, Pamela]
    }
}
