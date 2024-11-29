package com.rrsh.crud;

import java.util.ArrayList;
import java.util.List;

public class PersonService {

    private final List<Person> people = new ArrayList<>();

    public void createPerson(Person person) {
        people.add(person);
    }

    public List<Person> findPersonByName(String name) {
        List<Person> foundPerson = new ArrayList<>();

        for (Person person : people) {
            if (person.getName().equalsIgnoreCase(name)) {
                foundPerson.add(person);
            }
        }

        return foundPerson;
    }

    public List<Person> findAllPerson() {
        return people;
    }

    public void updatePerson(int index, Person person) {
        people.set(index, person);
    }

    public void removePerson(int index) {
        people.remove(index);
    }

}
