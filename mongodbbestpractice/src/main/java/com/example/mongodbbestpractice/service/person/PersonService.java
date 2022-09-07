package com.example.mongodbbestpractice.service.person;

import com.example.mongodbbestpractice.model.person.Person;

import java.util.List;

public interface PersonService {
    List<Person> findAll();

    Person findByPersontNumber(long idPerson);

    Person savePerson(Person person);

    Person updatePerson(Person person);

    void deletePersonById(String id);
}
