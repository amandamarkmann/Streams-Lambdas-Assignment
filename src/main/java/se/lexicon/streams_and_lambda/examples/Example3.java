package se.lexicon.streams_and_lambda.examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Example3 {

    public static void main(String[] args) {

        List<Person> persons =
                Arrays.asList(
                        new Person("Max", 18),
                        new Person("Peter", 23),
                        new Person("Pamela", 23),
                        new Person("David", 12));



        String phrase = persons
                .stream()
                .filter(p -> p.age >= 18)
                .map(p -> p.name)
                .collect(Collectors.joining(" and ", "In Germany ", " are of legal age."));

        System.out.println(phrase);
// In Germany Max and Peter and Pamela are of legal age.
    }

}
