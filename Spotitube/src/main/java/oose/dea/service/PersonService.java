package oose.dea.service;

import oose.dea.data.PersonDAO;
import oose.dea.data.PersonDAOImpl;
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
}
