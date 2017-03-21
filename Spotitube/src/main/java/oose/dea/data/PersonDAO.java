package oose.dea.data;

import oose.dea.domain.Person;

import java.util.List;

/**
 * Created by Tyskie on 21-3-2017.
 */
public interface PersonDAO {
    List<Person> findAll();
    void addPerson(String name, int age);
    void deletePerson(String name);
}
