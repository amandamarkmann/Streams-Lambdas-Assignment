package se.lexicon.streams_and_lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import se.lexicon.streams_and_lambda.utility.NameService;
import se.lexicon.streams_and_lambda.utility.Person;
import se.lexicon.streams_and_lambda.utility.data_access.CSVReader;

public class Main 
{
    public static void main( String[] args )
    {
    	 //Getting the names from file
        List<String> femaleFirstNames = CSVReader.getFemaleFirstNames();
        List<String> maleFirstNames = CSVReader.getMaleFirstNames();
        List<String> lastNames = CSVReader.getLastNames();

        //Instantiating a NameService object
        NameService ns = new NameService(maleFirstNames,femaleFirstNames,lastNames);

        List<Person> persons = new ArrayList<>();
        //Creating 500 random persons and adding them to a list
        for(int i=0; i<500;i++){
            persons.add(ns.getNewRandomPerson());
        }

        Lab theLab = new Lab(persons);

        //Run your exercises here
      
        /* Your code here */
        theLab.exercise10();
   
}}