package se.lexicon.streams_and_lambda.utility;



import java.util.List;
import java.util.Random;

public class NameService {

    private List<String>maleFirstNames;
    private List<String>femaleFirstNames;
    private List<String>lastNames;
    private static Random random = new Random();


    public NameService(List<String> maleFirstNames, List<String> femaleFirstNames, List<String> lastNames) {
        
        this.maleFirstNames = maleFirstNames;
        this.femaleFirstNames = femaleFirstNames;
        this.lastNames = lastNames;
    }

    public Person getNewRandomPerson(){
        Gender gender = getRandomGender();
        Person person = null;
        switch (gender){
            case MALE:
                person = new Person(getRandomMaleFirstName(),getRandomLastName(),gender);
                break;
            case FEMALE:
                person = new Person(getRandomFemaleFirstName(),getRandomLastName(),gender);
                break;
        }
        return person;
    }


    public String getRandomFemaleFirstName(){
        return femaleFirstNames.get(random.nextInt(femaleFirstNames.size()));
    }

    public String getRandomMaleFirstName(){
        return maleFirstNames.get(random.nextInt(maleFirstNames.size()));
    }

    public String getRandomLastName(){
        return lastNames.get(random.nextInt(lastNames.size()));
    }

    public Gender getRandomGender(){
        return random.nextInt(100) > 50 ? Gender.FEMALE : Gender.MALE;
    }



    }


