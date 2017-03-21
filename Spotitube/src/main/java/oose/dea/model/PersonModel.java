package oose.dea.model;

import oose.dea.domain.Person;
import oose.dea.service.PersonService;

import java.util.List;

/**
 * Created by Tyskie on 21-3-2017.
 */
public class PersonModel {
    private PersonService personService = new PersonService();

    public List<Person> findAll() {
        List<Person> persons = personService.findAll();
        return persons;
    }

    public void addPerson(String name, int age){
        personService.addPerson(name, age);
    }

    public void deletePerson(String name) {
        personService.deletePerson(name);
    }
}
