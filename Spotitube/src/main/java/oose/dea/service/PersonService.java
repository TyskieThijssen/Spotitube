package oose.dea.service;

import oose.dea.daos.PersonDAO;
import oose.dea.daos.PersonDAOImpl;
import oose.dea.domain.Person;

import java.util.List;

/**
 * Created by Thijs on 18-3-2017.
 */
public class PersonService {
    PersonDAO personDAOImpl = new PersonDAOImpl();

    public List<Person> findAll() {
        List<Person> persons = personDAOImpl.findAll();
        return persons;
    }

    public void addPerson(String name, int age) {
        personDAOImpl.addPerson(name, age);
    }

    public void deletePerson(String name) {
        personDAOImpl.deletePerson(name);
    }

    public void updatePerson(String name, int age, String oldName) {
        personDAOImpl.updatePerson(name, age, oldName);
    }
}
