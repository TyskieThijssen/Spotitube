package oose.dea;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Thijs on 18-3-2017.
 */
public class PersonService {
    public List<Person> findAll(){
        List<Person> persons = new ArrayList<Person>();
        persons.add(new Person("Thijs", 20));
        persons.add(new Person("Sanne", 17));
        return persons;
    }
}
